package resolucaoExercicios.sobrescrita;

import java.util.ArrayList;

public class Loja {

	private ArrayList<Produto> produtos;

	public Loja() {
		this.produtos = new ArrayList<>();
	}
	
	public void adicionaProduto(Produto produto) {
		this.produtos.add(produto);
	}
	
	public void mostraProdutos() {
		System.out.println(this.getProdutos());
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
	
}
