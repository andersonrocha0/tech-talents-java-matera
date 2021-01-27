package resolucaoExercicios.arrays;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *Escreva um algoritmo que simula um jogo da forca simples. 
 *O usuario precisara adivinhar uma palavra chutando cada letra em no máximo 10 chutes, 
 *caso o usuario acerte a letra o jogo dira que ele acertou, 
 *caso tenha errado, o numero de tentativas vai dinimuindo. 
 *Caso o numero de tentativas chegue a 0 o usuário perde.
 * @author manoe
 *
 */
public class Exercicio5 {

	public void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] palavraSecreta = { 'm', 'a', 'n', 'o', 'e', 'l' };
		boolean acertou = false;
		boolean enforcou = false;
		ArrayList<Character> chutes = new ArrayList<Character>();
		int tentativas = 0;
		System.out.println("Bem vindo ao jogo da Forca");
		do {
			for (int indicePalavra = 0; indicePalavra < palavraSecreta.length; indicePalavra++) {
				boolean achouLetra = false;
				for (int contadorTentativas = 0; contadorTentativas < tentativas; contadorTentativas++) {
					if (chutes.contains(palavraSecreta[indicePalavra])) {
						achouLetra = true;
						break;
					}
				}
				if (achouLetra) {
					System.out.printf("%c ", palavraSecreta[indicePalavra]);
				} else {
					System.out.print("_ ");
				}
			}
			System.out.println();
			System.out.println();
			char chute;
			System.out.print("Qual a letra? ");
			chute = scanner.next().charAt(0);
			chutes.add(chute);
			tentativas++;
			System.out.println();
			for (int indice = 0; indice < palavraSecreta.length; indice++) {
				if (palavraSecreta[indice] == chute) {
					System.out.printf("a posição da %d tem essa letra\n ", indice + 1);
				}
			}
		} while (!acertou && !enforcou);
		scanner.close();
	}
}
