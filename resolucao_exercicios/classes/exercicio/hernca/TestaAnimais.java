package resolucaoExercicios.classes.exercicio.hernca;

public class TestaAnimais {

	public static void main(String[] args) {
		Animal animal = new Animal("Peixe sem herança", 2.0f, 0, "azul", "agua", 0.5f);
		animal.dados();
		Peixe peixe = new Peixe("Peixe com herança", 2.0f, 0, "azul", "agua", 0.5f, "fofinho");
		peixe.dadosPeixe();
	}
}
