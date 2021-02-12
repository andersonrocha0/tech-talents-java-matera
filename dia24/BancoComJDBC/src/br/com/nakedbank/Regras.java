package br.com.nakedbank;

import java.sql.Connection;

import br.com.nakedbank.dao.ClienteDao;
import br.com.nakedbank.dao.ContaDao;
import br.com.nakedbank.dao.TransacaoDao;
import br.com.nakedbank.models.Cliente;
import br.com.nakedbank.models.Conta;
import br.com.nakedbank.models.Transacao;

public class Regras {

	private ContaDao contaDao;
	private ClienteDao clienteDao;
	private TransacaoDao transacaoDao;

	public Regras(Connection conn) {
		this.contaDao = new ContaDao(conn);
		this.clienteDao = new ClienteDao(conn);
		this.transacaoDao = new TransacaoDao(conn);
	}

	public Conta criarContaCorrente(String nome, String cpf, String rg, Float renda, String telefone, String email,
			String numero) throws Exception {
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setCpf(cpf);
		cliente.setRg(rg);
		cliente.setRenda(renda);
		cliente.setTelefone(telefone);
		cliente.setEmail(email);
		return this.criarContaCorrente(cliente, numero);
	}

	public Conta criarContaCorrente(Cliente cliente, String numero) throws Exception {
		Conta conta = new Conta(cliente);
		conta.setNumero(numero);

		clienteDao.save(cliente);
		return contaDao.save(conta);
	}

	public void adiconarTransacao(Float valor, String numeroConta, String tipo) throws Exception {
		Conta conta = this.contaDao.get(numeroConta);

		Transacao transacao = new Transacao(conta);
		transacao.setValor(valor);
		transacao.setTipo(tipo);
		this.transacaoDao.save(transacao);
		this.contaDao.alterarSaldo(numeroConta, valor);
	}

}
