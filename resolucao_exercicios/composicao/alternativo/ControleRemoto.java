package resolucaoExercicios.composicao.alternativo;

public class ControleRemoto {

	public int aumentarVolume(int volume) {
		return  volume + 1;
	}
	
	public int diminuirVolume(int volume) {
		return  volume - 1;
	}
	
	public int aumentarCanal(int canal) {
		return canal + 1;
	}
	
	public int diminuirCanal(int canal) {
		return canal - 1;
	}
	
	public int mudarCanal(int canal) {
		return canal;
	}
}
