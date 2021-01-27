package sobrescrita;

public class ContaCorrente extends Conta {
	
	private double taxa;
	
	@Override
	protected boolean saca(double valorASacar) {
		this.taxa = 0.03;
		double valorTotalASacar = valorASacar + (valorASacar * this.taxa);
		if (this.getSaldo() > valorASacar) {
			this.setSaldo( this.getSaldo() - valorTotalASacar);
			return true;
		} else {
			return false;
		}
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
}
