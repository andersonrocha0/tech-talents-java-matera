package resolucaoExercicios.composicao.alternativo;

public class TestaTelevisao {

	public static void main(String[] args) {
		Televisao samsung = new Televisao();
		Televisao lg = new Televisao();
		
		ControleRemoto controle = new ControleRemoto();
		
		samsung.setControle(controle);
		
		samsung.setCanal(controle.aumentarCanal(samsung.getCanal()));
	}
}
