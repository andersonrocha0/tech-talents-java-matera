package resolucaoExercicios.classes.exercicio.hernca;

public class Animal {

	private String nome;
	private float comprimento;
	private int numeroPatas;
	private String cor;
	private String ambiente;
	private float velocidadeMedia;

	public Animal() {
		
	}

	public Animal(String nome, float comprimento, int numeroPatas, String cor, String ambiente, float velocidadeMedia) {
		this.nome = nome;
		this.comprimento = comprimento;
		this.numeroPatas = numeroPatas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidadeMedia = velocidadeMedia;
	}

	public void dados() {
		System.out.println("Informações do animal: " + this.nome);
		System.out.println("comprimento=" + this.comprimento + ", numeroPatas=" + this.numeroPatas + ", cor=" + this.cor
				+ ", ambiente=" + this.ambiente + ", velocidadeMedia=" + this.velocidadeMedia);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	public int getNumeroPatas() {
		return numeroPatas;
	}

	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public float getVelocidadeMedia() {
		return velocidadeMedia;
	}

	public void setVelocidadeMedia(float velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}
}
