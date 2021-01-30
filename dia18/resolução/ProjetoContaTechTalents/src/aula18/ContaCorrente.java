package aula18;

public class ContaCorrente extends Conta {

	private Double limiteChequeEspecial = 0.0;

	public ContaCorrente(Double saldo, Cliente cliente) {
		super(saldo, cliente);
	}

	public void adicionarLimiteChequeEspecial(Double valorLimite, String senhaGerente) {
		this.verificaContaAtiva();

		if (this.contaAtiva) {
			if (senhaGerente.equals("1234")) {
				this.limiteChequeEspecial = valorLimite;
			}
		}
	}

	@Override
	public void listarExtratoComSaldo() {
		super.listarExtratoComSaldo();
		System.out.printf("Limite de cheque especial %f\n", this.limiteChequeEspecial);
		System.out.printf("Saldo e limite: %f\n", this.getSaldo() + this.limiteChequeEspecial);

	}

	@Override
	public void realizarSaque(Double valorSaque) {

		this.verificaContaAtiva();

		if (this.contaAtiva) {
			if (valorSaque <= this.getSaldo()) {
				this.atualizaSaldo(-valorSaque);
				this.addMovimentacao(-valorSaque);
				System.out.printf("Saque no valor %f relizado com sucesso\n", valorSaque);
			} else if (valorSaque <= this.getSaldo() + this.limiteChequeEspecial) {
				this.atualizaSaldo(-valorSaque);
				this.addMovimentacao(-valorSaque);
				System.out.printf("Saque no valor %f relizado com sucesso utilizando o valor do cheque especial\n",
						valorSaque);
			} else {
				System.out.println("Saque não permitido, não há valor disponível na conta");
			}
		}

	}

}
