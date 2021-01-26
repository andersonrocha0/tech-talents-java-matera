package herança.protegido;

public class Aluno extends Pessoa {

	private double[] notas;
	private String curso;
	
	
	public double calculaMediaAluno() {
		double resultado = 0;
		for (double nota : notas) {
			resultado += nota;
		}
		return resultado / this.notas.length;
	}
	
	public boolean alunoAprovado() {
		return Math.round(this.calculaMediaAluno())  > 7;
	}
	
	public void imprimeInformacoesDoAluno() {
		System.out.println("Informações do Aluno: "+ this.getNome());
		System.out.println("Media do aluno: "+ this.calculaMediaAluno());
		System.out.println("Aluno Aprovado? "+ this.alunoAprovado() );
	}
	
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
