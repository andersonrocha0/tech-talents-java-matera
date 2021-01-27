package sobrescrita;

import java.time.LocalDate;

public class DataComSobrescrita {

	private String data;
	
	public DataComSobrescrita() {
		this(LocalDate.now().getDayOfMonth(), LocalDate.now().getMonthValue(), LocalDate.now().getYear());
	}
	
	public DataComSobrescrita(int dia) {
		this(dia, LocalDate.now().getMonthValue(), LocalDate.now().getYear());
	}

	public DataComSobrescrita(int dia, int mes) {
		this(dia, mes, LocalDate.now().getYear());
	}

	public DataComSobrescrita(int dia, int mes, int ano) {
	    this.data = dia + "/" + mes + "/" + ano;
	}

	public String getData() {
		return data;
	}

	@Override
	public String toString() {
		return "A data gravada é: " + this.data;
	}
	
}
