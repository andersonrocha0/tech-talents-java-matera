package resolucaoExercicios.composicao.alternativo;

public class Televisao {

	private int volume;
	private int canal;
	private ControleRemoto controle;
	
	
	public void setCanal(int canal) {
		this.canal = canal;
	}


	public int getVolume() {
		return volume;
	}


	public void setVolume(int volume) {
		this.volume = volume;
	}


	public ControleRemoto getControle() {
		return controle;
	}


	public void setControle(ControleRemoto controle) {
		this.controle = controle;
	}


	public int getCanal() {
		return canal;
	}
}
