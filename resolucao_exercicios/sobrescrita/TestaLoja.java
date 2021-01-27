package resolucaoExercicios.sobrescrita;

public class TestaLoja {

	public static void main(String[] args) {
		Cd cd = new Cd("Cd do barulho", "12.5", 11);
		Dvd dvd = new Dvd("DVD do barulho", "50.0", 120.5);
		Livro livro = new Livro("O programador apaixonado", "29.9", "Um programador");
		Loja loja = new Loja();
		loja.adicionaProduto(livro);
		loja.adicionaProduto(dvd);
		loja.adicionaProduto(cd);
		loja.mostraProdutos();
		
	}
}
