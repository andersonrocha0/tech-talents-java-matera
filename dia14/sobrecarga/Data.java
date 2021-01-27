package sobrecarga;

import java.time.LocalDate;

public class Data {

	private String data;
	
	public Data() {
		this(LocalDate.now().getDayOfMonth(), LocalDate.now().getMonthValue(), LocalDate.now().getYear());
//		this(26, 12);
		System.out.println("Construtor sem nada");
//		this.data = LocalDate.now().getDayOfMonth() + "/" + LocalDate.now().getMonthValue() + "/" + LocalDate.now().getYear();
	}
	
	public Data(int dia) {
		this(dia, LocalDate.now().getMonthValue(), LocalDate.now().getYear());
		System.out.println("Construtor com um dia");
//		this.data = dia + "/" + LocalDate.now().getMonthValue() + "/" + LocalDate.now().getYear();

	}

	public Data(int dia, int mes) {
		this(dia, mes, LocalDate.now().getYear());
		System.out.println("Construtor com um dia e um mes");
//		this.data = dia + "/" + mes + "/" + LocalDate.now().getYear();
	}

	public Data(int dia, int mes, int ano) {
		System.out.println("Construtor com um dia um mes e um ano");
	    this.data = dia + "/" + mes + "/" + ano;
	}

	public String getData() {
		return data;
	}

	
}
