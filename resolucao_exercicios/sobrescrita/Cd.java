package resolucaoExercicios.sobrescrita;

public class Cd extends Produto {

	private int numeroFaixas;
	
	public Cd(String nome, String preco, int numeroFaixas) {
		super(nome, preco);
		this.numeroFaixas =  numeroFaixas;
	}

	public int getNumeroFaixas() {
		return numeroFaixas;
	}

	public void setNumeroFaixas(int numeroFaixas) {
		this.numeroFaixas = numeroFaixas;
	}

	@Override
	public String toString() {
		return "Cd [numeroFaixas=" + numeroFaixas + ", getNome()=" + getNome() + ", getPreco()=" + getPreco() + "]\n";
	}

}
