import java.util.Scanner;

public class Exercicio1Alternativo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Pais pais = new Pais(null, null, 0, 0);
		Pais pais2 = new Pais(null, null, 0, 0);
		
		System.out.print("Digite o codigo iso do primeiro Pais: ");
		pais.setCodigoISO(scanner.next());
		System.out.print("Digite o nome do primeiro Pais: ");
		pais.setNome(scanner.next());
		System.out.print("Digite o dimensão do primeiro Pais: ");
		pais.setDimensao(scanner.nextDouble());
		System.out.print("Digite o população do primeiro Pais: ");
		pais.setPopulacao(scanner.nextDouble());
		
		System.out.print("Digite o codigo iso do segundo Pais: ");
		pais2.setCodigoISO(scanner.next());
		System.out.print("Digite o nome do segundo Pais: ");
		pais2.setNome(scanner.next());
		System.out.print("Digite o dimensão do segundo Pais: ");
		pais2.setDimensao(scanner.nextDouble());
		System.out.print("Digite o população do segundo Pais: ");
		pais2.setPopulacao(scanner.nextDouble());
		
		System.out.println("Informações do " + pais.getNome() );
		System.out.println("Codigo ISO: " + pais.getCodigoISO());
		System.out.println("Dimensão km2: " + pais.getDimensao());
		System.out.println("População: " + pais.getPopulacao());
		
		System.out.println("Informações do " + pais2.getNome() );
		System.out.println("Codigo ISO: " + pais2.getCodigoISO());
		System.out.println("Dimensão km2: " + pais2.getDimensao());
		System.out.println("População: " + pais2.getPopulacao());
		
		System.out.println("Os paises são iguais? " + pais.verificaIgualdade(pais2));
		System.out.println("Os paises são iguais? " + pais2.verificaIgualdade(pais));
		
		System.out.println("Densidade populacional de "+ pais.getNome() + " é " + pais.calculaDensidadePopulacional());
		System.out.println("Densidade populacional de "+ pais2.getNome() + " é " + pais2.calculaDensidadePopulacional());
		
		scanner.close();
	}
}