package br.com.nakedbank;

import java.sql.Connection;
import java.util.Scanner;

import br.com.nakedbank.dao.ClienteDao;
import br.com.nakedbank.dao.ContaDao;
import br.com.nakedbank.dao.TransacaoDao;
import br.com.nakedbank.dtos.AberturaDeContaDto;
import br.com.nakedbank.dtos.TransacaoDto;
import br.com.nakedbank.models.Conta;

public class Regras {

	private ContaDao contaDao;
	private ClienteDao clienteDao;
	private TransacaoDao transacaoDao;
	private Connection conn;

	public Regras(Connection conn) {
		this.conn = conn;
		this.contaDao = new ContaDao(conn);
		this.clienteDao = new ClienteDao(conn);
		this.transacaoDao = new TransacaoDao(conn);
	}

	public Conta abrirContaCorrente(AberturaDeContaDto aberturaDeContaDto) throws Exception {
		this.clienteDao.save(aberturaDeContaDto);
		return this.contaDao.save(aberturaDeContaDto);
	}

	public Boolean existeSaldo(Float valor, String numeroConta) throws Exception {
		Conta conta = this.contaDao.get(numeroConta);

		if (valor > conta.getSaldo()) {
			System.out.println("Você não tem saldo suficiente para executar essa operação");
			return false;
		}
		return true;
	}

	public void realizarSaque(Float valor, String numeroConta) throws Exception {

		if (this.existeSaldo(valor, numeroConta)) {
			this.registrarTransacao(-valor, numeroConta, "SAQUE");
		}

	}

	public void registrarTransacao(Float valor, String numeroConta, String tipo) throws Exception {

		TransacaoDto transacaoDto = new TransacaoDto();
		transacaoDto.setValor(valor);
		transacaoDto.setTipo(tipo);
		transacaoDto.setNumeroDaConta(numeroConta);
		this.transacaoDao.save(transacaoDto);
		this.contaDao.alterarSaldo(numeroConta, valor);
	}

	public void transferirEntreContas(Float valor, String numeroContaOrigem, String numeroDeContaDestino)
			throws Exception {
		if (this.existeSaldo(valor, numeroContaOrigem)) {
			this.registrarTransacao(-valor, numeroContaOrigem, "TRANSFERENCIA_SAIDA");
			this.registrarTransacao(valor, numeroDeContaDestino, "TRANSFERENCIA_ENTRADA");
		}
	}

	public void exibirMenu() throws Exception {

		Scanner in = new Scanner(System.in);
		Boolean realizarOperacoes = true;
		while (realizarOperacoes) {
			try {
				System.out.println("Qual operação você deseja realizar?");
				System.out.println("[n] Cadastrar nova conta");
				System.out.println("[s] Saque");
				System.out.println("[d] Depósito");
				System.out.println("[f] Encerrar");
				System.out.println("[c] Alterar limite de cheque especial (gerente)");
				System.out.println("[tc] Transferência entre contas");

				String opcao = in.next();

				switch (opcao) {
				case "n":
					AberturaDeContaDto dto = new AberturaDeContaDto();
					System.out.println("Vamos cadastrar uma nova conta");
					System.out.println("Digite o nome do correntista:");
					dto.setNome(in.next());
					System.out.println("Digite o cpf do correntista:");
					dto.setCpf(in.next());
					System.out.println("Digite o rg do correntista:");
					dto.setRg(in.next());
					System.out.println("Digite a renda do correntista:");
					dto.setRenda(in.nextFloat());
					System.out.println("Digite o telefone do correntista:");
					dto.setTelefone(in.next());
					System.out.println("Digite o email do correntista:");
					dto.setEmail(in.next());
					// Exemplo hipotético onde o gerente gera o número
					System.out.println("Digite o número da conta:");
					dto.setNumeroConta(in.next());
					System.out.println(this.abrirContaCorrente(dto));
					break;
				case "s":
					System.out.println("Valor do saque");
					Float valorSaque = in.nextFloat();
					System.out.println("Numero da conta");
					String numeroDaConta = in.next();
					this.realizarSaque(valorSaque, numeroDaConta);
					break;
				case "d":
					System.out.println("Valor do depósito");
					Float valorDeposito = in.nextFloat();
					System.out.println("Numero da conta");
					numeroDaConta = in.next();
					this.registrarTransacao(valorDeposito, numeroDaConta, "DEPOSITO");
					break;
				case "e":
					// TODO implementar extrato
					break;
				case "f":
					// TODO implementar encerrar conta
					break;
				case "c":
					// TODO implementar alterar limite

					break;
				case "tc":
					System.out.println("Valor da transferência");
					Float valorTransferencia = in.nextFloat();
					System.out.println("Numero da conta de origem");
					String numeroDaContaOrigem = in.next();
					System.out.println("Numero da conta de destino");
					String numeroDaContaDestino = in.next();
					this.transferirEntreContas(valorTransferencia, numeroDaContaOrigem, numeroDaContaDestino);
					break;
				default:
					break;
				}

				this.conn.commit();

			} catch (Exception e) {
				this.conn.rollback();
				throw e;
			}

			System.out.println("Deseja continuar fazendo operações (s)/(n)");
			realizarOperacoes = in.next().equals("s");

		}
		in.close();
	}

}
