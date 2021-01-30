package aula18;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Conta {

	private Double saldo = 0.0;
	private List<Double> movimentacoes = new ArrayList<Double>();
	private int numeroDaConta;
	protected Boolean contaAtiva = true;

	private Cliente cliente;

	public Double getSaldo() {
		return saldo;
	}

	public void addMovimentacao(Double valor) {
		this.movimentacoes.add(valor);
	}
	
	public Conta(Double saldo, Cliente cliente) {
		this.atualizaSaldo(saldo);
		this.movimentacoes.add(saldo);
		this.cliente = cliente;
		this.gerarNumeroDaConta();
	}

	private void gerarNumeroDaConta() {
		Random numero = new Random();
		this.numeroDaConta = numero.nextInt(9999);
	}

	protected void atualizaSaldo(Double saldo) {
		this.saldo = this.saldo + saldo;
	}

	protected void verificaContaAtiva() {
		if (!this.contaAtiva) {
			System.out.println("Não é possível fazer movimentações em um conta inativa");
		}
	}

	public void listarExtrato() {
		System.out.printf("Extrato bancário da conta %s\n", this.numeroDaConta);
		System.out.printf("Nome do cliente: %s\n", this.cliente.getNome());
		System.out.println("--------------------------");
		for (int i = 0; i < this.movimentacoes.size(); i++) {
			System.out.printf("%s ", this.movimentacoes.get(i) < 0 ? "-" : "+");
			System.out.printf("%f \n", this.movimentacoes.get(i));
		}
		System.out.println("--------------------------");
	}
	
	public void listarExtratoComSaldo() {
		this.listarExtrato();
		System.out.printf("Saldo atual: %f\n", this.saldo);
	}
	

	public void realizarSaque(Double valorSaque) {

		this.verificaContaAtiva();

		if (this.contaAtiva) {
			if (valorSaque <= this.saldo) {
				this.atualizaSaldo(-valorSaque);
				this.movimentacoes.add(-valorSaque);
				System.out.printf("Saque no valor %f relizado com sucesso\n", valorSaque);
			} else {
				System.out.println("Saque não permitido, não há valor disponível na conta");
			}
		}

	}

	public void depositar(Double valorDeposito) {

		this.verificaContaAtiva();

		if (this.contaAtiva) {
			this.atualizaSaldo(valorDeposito);
			this.movimentacoes.add(valorDeposito);
			System.out.printf("Deposito no valor %f relizado com sucesso\n", valorDeposito);
		}
	}

	public void encerrarConta() {
		this.verificaContaAtiva();

		if (this.contaAtiva) {
			if (saldo < 0) {
				System.out.println("Você não pode encerrar a sua conta com saldo negativo");
			} else if (saldo > 0) {
				System.out.println("Você deve sacar o dinheiro antes de encerrar sua conta");
			} else {
				this.contaAtiva = false;
				System.out.printf("Você encerrou a conta %s do cliente %s\n", this.numeroDaConta,
						this.cliente.getNome());
			}
		}
	}

}
