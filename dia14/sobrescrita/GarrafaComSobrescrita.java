package sobrescrita;

public class GarrafaComSobrescrita {

	private double capacidadeLitros;
	private String codigoBarras;
	
	
	public void encher(int milimetros) {
		this.capacidadeLitros = milimetros / 1000;
	}

	public void encher(double litros) {
		this.capacidadeLitros = litros;
	}
	
	public void encher(float milimetros) {
		this.capacidadeLitros = milimetros / 1000;
	}
	
	public double getCapacidadeLitros() {
		return capacidadeLitros;
	}
	
	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	@Override
	public boolean equals(Object obj) {
		GarrafaComSobrescrita outraGarrafa = (GarrafaComSobrescrita) obj;
		return this.codigoBarras == outraGarrafa.codigoBarras;
	}
	
}
