package sobrescrita;

public class Conta {

	private String numero;
	private double saldo;
	
	
	protected boolean saca(double valorASacar) {
		if (this.saldo > valorASacar) {
			this.saldo = this.saldo - valorASacar;
			return true;
		} else {
			System.out.println("Não pude sacar nada");
			return false;
		}
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
