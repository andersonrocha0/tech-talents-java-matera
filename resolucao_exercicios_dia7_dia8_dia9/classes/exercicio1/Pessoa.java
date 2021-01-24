package resolucaoExercicios.classes.exercicio1;

import java.time.LocalDate;

/**
 * Crie uma classe para representar uma pessoa, com os atributos de nome, data de nascimento e altura.
 * Crie e também um método para imprimir todos dados de uma pessoa. 
 * Crie um método para calcular a idade da pessoa.
 * @author manoe
 *
 */

public class Pessoa {

	private String nome;
	private double altura;
	private int diaNascimento;
	private int mesNascimento;
	private int anoNascimento;

	public Pessoa(String nome, double altura, int diaNascimento, int mesNascimento, int anoNascimento) {
		this.nome = nome;
		this.altura = altura;
		this.diaNascimento = diaNascimento;
		this.mesNascimento = mesNascimento;
		this.anoNascimento = anoNascimento;
	}

	public void imprimeDados() {
		System.out.println(
				"Nome: " + this.nome + "\nAltura: " + this.altura + "\nData de nascimento: " + this.diaNascimento + "/"
						+ this.mesNascimento + "/" + this.anoNascimento + "\nIdade: " + this.calculaIdade());
	}


	public int calculaIdade() {
		int anoAtual = LocalDate.now().getYear();
		int mesAtual = LocalDate.now().getMonthValue();
		int diaAtual = LocalDate.now().getDayOfMonth();
		
		if (this.diaNascimento < diaAtual && this.mesNascimento <= mesAtual) {
			return anoAtual - this.anoNascimento;
		} else {
			return anoAtual - this.anoNascimento - 1;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getDiaNascimento() {
		return diaNascimento;
	}

	public void setDiaNascimento(int diaNascimento) {
		this.diaNascimento = diaNascimento;
	}

	public int getMesNascimento() {
		return mesNascimento;
	}

	public void setMesNascimento(int mesNascimento) {
		this.mesNascimento = mesNascimento;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	
}
