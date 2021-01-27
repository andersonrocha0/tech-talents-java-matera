package sobrecarga;

public class Garrafa {

	private double capacidadeLitros;
	
	public void encher(int milimetros) {
		System.out.println("Quem foi executado foi o milimetro");
		this.capacidadeLitros = milimetros / 1000;
	}

	public void encher(double litros) {
		System.out.println("Quem foi executado foi o litro");
		this.capacidadeLitros = litros;
	}
	
	public void encher(String milimetros) {
		System.out.println("Quem foi executado foi o milimetro como uma string");
		float milimetrosFloat = Float.parseFloat(milimetros);
		this.capacidadeLitros = milimetrosFloat / 1000;
	}
	
	public double getCapacidadeLitros() {
		return capacidadeLitros;
	}
}
