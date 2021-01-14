# Dia 2

## Resolução exercícios
 

```java
// Exercício 1
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      // Escreva um algoritmo que leia um número inteiro e diga se ele é par ou ímpar.
​
      System.out.println("Por favor digite um número");
      Scanner in = new Scanner(System.in);
      int numero = in.nextInt();
      
      if (numero % 2 == 0) {
        System.out.println("É um número par");
      } else {
        System.out.println("É um número ímpar");
      }
      in.close();
    }
}
```

```java
// Exercício 2
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      /*Elabore um algoritmo que dada a idade de um nadador classifique-o em uma das seguintes categorias:
​
      Infantil A = 5 a 7 anos
      Infantil B = 8 a 11 anos
      Juvenil A = 12 a 13 anos
      Juvenil B = 14 a 17 anos
      Adultos = Maiores de 18 anos*/
​
      Scanner in = new Scanner(System.in);
      int continuarPrograma = 1;
​
      while (continuarPrograma == 1) {
      
        System.out.println("Digite a idade do nadador: ");
​
        int idade = in.nextInt();
        
​
        boolean infantilA = idade >= 5 && idade <= 7;
        boolean infantilB = idade >= 8 && idade <= 11;
        boolean juvenilA = idade >= 12 && idade <= 13;
        boolean juvenilB = idade >= 14 && idade <= 17;
        boolean adultos = idade >= 18;
​
        if (infantilA) {
          System.out.println("Categoria infantil A");
        } else if (infantilB) {
          System.out.println("Categoria infantil B");
        } else if (juvenilA) {
          System.out.println("Categoria juvenil A");
        } else if (juvenilB) {
          System.out.println("Categoria juvenil B");
        } else if (adultos) {
          System.out.println("Categoria Adultos");
        } else {
          System.out.println("Categoria não encontrada para a idade: " + idade);
        }
          
        System.out.println("Deseja continuar o programa s(1)/n(0)?");
        continuarPrograma = in.nextInt();
​
      }
      in.close();
    }
}
```

```java
// Exercício 3
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      /*Escreva um algoritmo em Java que leia dois números inteiros e determine qual é o menor. Escreva um algoritmo que determina o maior também.*/
​
      Scanner in = new Scanner(System.in);
      int continuarPrograma = 1;
​
      while (continuarPrograma == 1) {
      
        System.out.println("Digite o primeiro valor: ");
​
        int primeiroValor = in.nextInt();
        
        System.out.println("Digite o segundo valor: ");
​
        int segundoValor = in.nextInt();
​
        if (primeiroValor < segundoValor) {
          System.out.println("O primeiro valor digitado é menor: " + primeiroValor);
        } else if (segundoValor < primeiroValor) {
          System.out.println("O segundo valor digitado é menor: " + segundoValor);
        } else {
          System.out.println("Os valores digitados são iguais");
        }
​
        System.out.println("Deseja continuar o programa s(1)/n(0)?");
        continuarPrograma = in.nextInt();
​
        
      }
      in.close();
    }
}
```
