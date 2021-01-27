package resolucaoExercicios.classes.exercicio2;

import java.util.ArrayList;

import resolucaoExercicios.classes.exercicio1.Pessoa;


/**
 * Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as seguintes operações:
 * @author manoe
 *
 */
public class Agenda {

	private ArrayList<Pessoa> pessoas;
	
	public Agenda() {
		this.pessoas = new ArrayList<Pessoa>();
	}
	
	public void armazenaPessoa(Pessoa pessoa) {
		this.pessoas.add(pessoa);
	}
	public void removePessoa(String nome) {
		int posicaoAgendaPessoa = this.buscaPessoa(nome);
		this.pessoas.remove(posicaoAgendaPessoa);
	}
	public int buscaPessoa(String nome) {
		// informa em que posição da agenda está a pessoa
		int posicaoAgendaPessoa = 0;
		for (int indicePessoaAgenda = 0; indicePessoaAgenda < this.pessoas.size(); indicePessoaAgenda++) {
			if (this.pessoas.get(indicePessoaAgenda).getNome() == nome) {
				posicaoAgendaPessoa = indicePessoaAgenda;
				break;
			}
		}
		return posicaoAgendaPessoa;
	}
	public void imprimeAgenda() {
		// imprime os dados de todas as pessoas da agenda
		for (int indicePessoaAgenda = 0; indicePessoaAgenda < this.pessoas.size(); indicePessoaAgenda++) {
			this.pessoas.get(indicePessoaAgenda).imprimeDados();
			System.out.println("-------------------------------------------------------------------------");
		}
	}
	public void imprimePessoa(int index) {
		// imprime os dados da pessoa que está na posição “i” da agenda.
		Pessoa pessoa = this.pessoas.get(index);
		pessoa.imprimeDados();
	}
}
