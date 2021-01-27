package resolucaoExercicios.classes.exercicio.hernca;

public class Peixe extends Animal {

	private String caracteristicas;

	public Peixe(String nome, float comprimento, int numeroPatas, String cor, String ambiente, float velocidadeMedia, String caracteristicas) {
		this.setNome(nome);
		this.setComprimento(comprimento);
		this.setNumeroPatas(numeroPatas);
		this.setCor(cor);
		this.setAmbiente(ambiente);
		this.setVelocidadeMedia(velocidadeMedia);
		this.setCaracteristicas(caracteristicas);
		this.caracteristicas = caracteristicas;
	}
	
	public void dadosPeixe() {
		System.out.println("Informações do animal: " + this.getNome());
		System.out.println("comprimento=" + this.getComprimento() + ", numeroPatas=" + this.getNumeroPatas() + ", cor=" + this.getCor()
				+ ", ambiente=" + this.getAmbiente() + ", velocidadeMedia=" + this.getVelocidadeMedia() + " caracteristicas="+ this.getCaracteristicas());
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	
}
