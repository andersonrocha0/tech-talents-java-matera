package resolucaoExercicios.classes.exercicio3;

/**
 * Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um prédio. 
 * A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o térreo), 
 * capacidade do elevador e quantas pessoas estão presentes nele. 
 * A classe deve também disponibilizar os seguintes métodos:
 * 
 * 	Inicializa : que deve receber como parâmetros a capacidade do elevador e o total de andares no prédio (os elevadores sempre começam no térreo e vazio);
	Entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
	Sai : para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
	Sobe : para subir um andar (não deve subir se já estiver no último andar);
	Desce : para descer um andar (não deve descer se já estiver no térreo);
 * @author manoe
 *
 */
public class Elevador {

	private int andarAtual;
	private int totalDeAndares;
	private int capacidade;
	private int totalPessoasPresente;
	
	public Elevador(int totalDeAndares, int capacidadeElevador) {
		this.andarAtual = 0;
		this.totalPessoasPresente = 0;
		this.totalDeAndares = totalDeAndares - 1;
		this.capacidade = capacidadeElevador;
	}
	
	public void entrar() {
		if (this.totalPessoasPresente < this.capacidade) {
			this.totalPessoasPresente += 1;
			System.out.println("Entrando");
		} else {
			System.out.println("Capacidade alcançada "+this.capacidade+", não pode mais entrar");
		}
	}
	
	public void sair() {
		if (this.totalPessoasPresente > 0) {
			this.totalPessoasPresente -= 1;
			System.out.println("Saindo");
		} else {
			System.out.println("Não há nenhuma pessoa presente para remover");
		}
	}
	
	public void sobe() {
		if (this.andarAtual <= this.totalDeAndares) {
			this.andarAtual +=1;
			System.out.println("Subindo");
		} else {
			System.out.println("Elevador está no ultimo andar");
		}
	}
	
	public void desce() {
		if (this.andarAtual > 0) {
			this.andarAtual -= 1;
			System.out.println("Descendo");
		} else {
			System.out.println("Elevador está no terreo");
		}
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public int getTotalDeAndares() {
		return totalDeAndares;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public int getTotalPessoasPresente() {
		return totalPessoasPresente;
	}
}
