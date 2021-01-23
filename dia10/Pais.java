import java.util.ArrayList;

public class Pais {

	private String codigoISO;
	private String nome;
	private double populacao;
	private double dimensao;
	private ArrayList<Pais> fronteiras;
	
	public Pais(String codigoISO, String nome, double dimensao, double populacao) {
		this.codigoISO = codigoISO;
		this.nome = nome;
		this.dimensao = dimensao;
		this.populacao = populacao;
		this.fronteiras = new ArrayList<>();
	}
	
	public boolean verificaIgualdade(Pais pais) {
		if (this.codigoISO == pais.getCodigoISO()) {
			return true;
		} else {
			return false;
		}
//		return this.codigoISO == pais.getCodigoISO();
	}
	
	public double calculaDensidadePopulacional() {
		double resultado = this.populacao / this.dimensao; 
		return resultado;
//		return this.populacao / this.dimensao;
	}
	
	
	
	public void setCodigoISO(String codigoISO) {
		this.codigoISO = codigoISO;
	}
	public String getCodigoISO() {
		return this.codigoISO;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}

	public void setPopulacao(double populacao) {
		this.populacao = populacao;
	}
	public double getPopulacao() {
		return this.populacao;
	}
	
	public void setDimensao(double dimensao) {
		this.dimensao = dimensao;
	}
	public double getDimensao() {
		return this.dimensao;
	}
	
	
	
}
