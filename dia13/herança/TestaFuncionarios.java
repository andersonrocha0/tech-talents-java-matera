package herança;

public class TestaFuncionarios {

	public static void main(String[] args) {
		Gerente carlos = new Gerente();
		carlos.setNome("Carlos Oliveira");
		carlos.setSalario(5000.0);
		carlos.setUsuario("coliveira");
		carlos.setSenha("xico@Bento123");
		
		System.out.println("Informações do Gerente: "+ carlos.getNome());
		System.out.println("Salario: " + carlos.getSalario());
		System.out.println("Usuario: "+ carlos.getUsuario());
		System.out.println("Senha: "+ carlos.getSenha());
		System.out.println("Bonificação: " + carlos.calculaBonificacao());
		
		Secretaria regina = new Secretaria();
		regina.setNome("Regina Silva");
		regina.setSalario(4500.0);
		regina.setRamal(2);
		
		System.out.println("Informações da Secretaria: "+ regina.getNome());
		System.out.println("Salario: " + regina.getSalario());
		System.out.println("Ramal: "+ regina.getRamal());
		
		Telefonista mercedez = new Telefonista();
		mercedez.setNome("Mercedez Gonzales");
		mercedez.setSalario(4000.0);
		mercedez.setEstacaoDeTrabalho(25);
		
		System.out.println("Informações da Telefonista: "+ mercedez.getNome());
		System.out.println("Salario: " + mercedez.getSalario());
		System.out.println("Estação de Trabalho: "+ mercedez.getEstacaoDeTrabalho());
		
	}
}
