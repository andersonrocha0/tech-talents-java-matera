package resolucaoExercicios.sobrescrita;

public class Dvd extends Produto {

	private double duracao;
	
	public Dvd(String nome, String preco, double duracao) {
		super(nome, preco);
		this.duracao = duracao;
	}

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		return "Dvd [duracao=" + duracao + ", getPreco()=" + getPreco() + ", getNome()=" + getNome() + "]\n";
	}
	
	

}
