package resolucaoExercicios.sobrescrita;

public class Livro extends Produto {

	private String autor;

	public Livro(String nome, String preco, String autor) {
		super(nome, preco);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Livro [autor=" + autor + ", getNome()=" + getNome() + ", getPreco()=" + getPreco() + "]\n";
	}
	
	
}
