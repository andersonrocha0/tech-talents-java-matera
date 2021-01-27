package resolucaoExercicios.arrays;

import java.util.Scanner;

/**
 *Escreva um algoritmo que leia numeros, 
 *insira em um array 
 *após mostre a quantidade de numeros pares.
 * @author manoe
 *
 */
public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Escolha a quantidade de numeros a armezenar: ");
		int quantidadeDeNumeros = scanner.nextInt();
		int quantidadeDeNumerosPares = 0;
		int[] numeros = new int[quantidadeDeNumeros];
		
		for (int indiceNumeros = 0; indiceNumeros < numeros.length; indiceNumeros++) {
			System.out.print("Digite o numero "+ (indiceNumeros + 1) + ": ");
			numeros[indiceNumeros] = scanner.nextInt();
		}
		
		for (int indiceNumeros = 0; indiceNumeros < numeros.length; indiceNumeros++) {
			if(numeros[indiceNumeros] % 2 == 0) {
				quantidadeDeNumerosPares += 1;
			}
		}
		
		System.out.println(quantidadeDeNumerosPares + " numeros pares foram armazenados");
		
		scanner.close();
	}
}
