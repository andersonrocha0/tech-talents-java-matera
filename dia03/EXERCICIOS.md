# Dia 3

## Resolução exercícios
 

```java
// Exercício 1
import java.util.Scanner;
class Main {
    public static void main(String args[]) {
        // Escreva um algoritmo que leia um número inteiro e diga se ele é par ou ímpar.
        
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
class Main {
    public static void main(String args[]) {
        /*Elabore um algoritmo que dada a idade de um nadador classifique-o em uma das seguintes categorias:

        Infantil A = 5 a 7 anos
        Infantil B = 8 a 11 anos
        Juvenil A = 12 a 13 anos
        Juvenil B = 14 a 17 anos
        Adultos = Maiores de 18 anos*/
        
        Scanner in = new Scanner(System.in);
        int continuarPrograma = 1;
        while (continuarPrograma == 1) {

            System.out.println("Digite a idade do nadador: ");
            int idade = in.nextInt();

            
            boolean infantilA = idade >= 5 && idade <= 7;
            boolean infantilB = idade >= 8 && idade <= 11;
            boolean juvenilA = idade >= 12 && idade <= 13;
            boolean juvenilB = idade >= 14 && idade <= 17;
            boolean adultos = idade >= 18;
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
        } 
        in.close();
    }
}
```

```java
// Exercício 3
import java.util.Scanner;
class Main {
    public static void main(String args[]) {
        /*Escreva um algoritmo em Java que leia dois números inteiros e determine qual é o menor. Escreva um algoritmo que determina o maior também.*/
        
        Scanner in = new Scanner(System.in);
        int continuarPrograma = 1;
        while (continuarPrograma == 1) {

            System.out.println("Digite o primeiro valor: ");
            int primeiroValor = in.nextInt();

            System.out.println("Digite o segundo valor: ");
            int segundoValor = in.nextInt();
            if (primeiroValor < segundoValor) {
                System.out.println("O primeiro valor digitado é menor: " + primeiroValor);
            } else if (segundoValor < primeiroValor) {
                System.out.println("O segundo valor digitado é menor: " + segundoValor);
            } else {
                System.out.println("Os valores digitados são iguais");
            }
            System.out.println("Deseja continuar o programa s(1)/n(0)?");
            continuarPrograma = in.nextInt();

        }

        in.close();

    }
}
```

```java
// Exercício 4
import java.util.Scanner;

class Main {
    public static void main(String[] args) {


        // 4. Construa um algoritmo que leia 10 valores inteiros e positivos e:

        // Encontre o maior valor
        // Encontre o menor valor
        // Calcule a média dos números lidos

        Scanner in = new Scanner(System.in);

        int somaDosValores = 0;

        System.out.println("Informe o 1 num");
        int valor = in.nextInt();

        int menorValor = valor;
        int maiorValor = valor;

        // somaDosValores = somaDosValores + valor1;
        somaDosValores += valor; // Explicar esse novo operador de atribuição


        // Start Num 2
        System.out.println("Informe o 2 num");
        valor = in.nextInt();


        if (valor > maiorValor) {
            maiorValor = valor;
        }

        if (valor < menorValor) {
            menorValor = valor;
        }

        somaDosValores += valor;

        // End Num 2

        // Start Num 3
        System.out.println("Informe o 3 num");
        valor = in.nextInt();


        if (valor > maiorValor) {
            maiorValor = valor;
        }

        if (valor < menorValor) {
            menorValor = valor;
        }

        somaDosValores += valor;

        // End Num 3

        // Start Num 4
        System.out.println("Informe o 4 num");
        valor = in.nextInt();


        if (valor > maiorValor) {
            maiorValor = valor;
        }

        if (valor < menorValor) {
            menorValor = valor;
        }

        somaDosValores += valor;

        // End Num 4

        // Start Num 5
        System.out.println("Informe o 5 num");
        valor = in.nextInt();


        if (valor > maiorValor) {
            maiorValor = valor;
        }

        if (valor < menorValor) {
            menorValor = valor;
        }

        somaDosValores += valor;

        // End Num 5

        // Start Num 6
        System.out.println("Informe o 6 num");
        valor = in.nextInt();


        if (valor > maiorValor) {
            maiorValor = valor;
        }

        if (valor < menorValor) {
            menorValor = valor;
        }

        somaDosValores += valor;

        // End Num 6

        // Start Num 7
        System.out.println("Informe o 7 num");
        valor = in.nextInt();


        if (valor > maiorValor) {
            maiorValor = valor;
        }

        if (valor < menorValor) {
            menorValor = valor;
        }

        somaDosValores += valor;

        // End Num 7

        // Start Num 8
        System.out.println("Informe o 8 num");
        valor = in.nextInt();


        if (valor > maiorValor) {
            maiorValor = valor;
        }

        if (valor < menorValor) {
            menorValor = valor;
        }

        somaDosValores += valor;

        // End Num 8

        // Start Num 9
        System.out.println("Informe o 9 num");
        valor = in.nextInt();


        if (valor > maiorValor) {
            maiorValor = valor;
        }

        if (valor < menorValor) {
            menorValor = valor;
        }

        somaDosValores += valor;

        // End Num 9

        // Start Num 10
        System.out.println("Informe o 10 num");
        valor = in.nextInt();


        if (valor > maiorValor) {
            maiorValor = valor;
        }

        if (valor < menorValor) {
            menorValor = valor;
        }

        somaDosValores += valor;

        // End Num 10

        // Start Resultado

        System.out.println("O maior valor digitado foi: " + maiorValor);
        System.out.println("O menor valor digitado foi: " + menorValor);

        System.out.print("A média dos valores é: " + somaDosValores / 10.0);

        in.close();

        // End Resultado

    }
}
```

```java
// Exercício 5
import java.util.Scanner;

class Main
{
    public static void main(String[] args) {


      // 5. Escreva um algoritmo em Java que seja capaz de fazer as seguintes operações matemáticas (adição, subtração, multiplicação e divisão). Todas as operações serão entre dois valores. No começo do algoritmo pergunte ao usuário qual operação ele deseja fazer e quais são os valores.

      // a, s, m, d

      Scanner in = new Scanner(System.in);

      System.out.println("Digite a operação que deseja fazer (a, s, m, d)");
      String operacao = in.next();

      System.out.println("Digite o primeiro valor");
      int valor1 = in.nextInt();

      System.out.println("Digite o segundo valor");
      int valor2 = in.nextInt();


      switch(operacao) {
        case "a":
          int soma = valor1 + valor2;
          System.out.println("A soma entre os valores é: " + soma);
          break;
        case "s":
          int subtracao = valor1 - valor2;
          System.out.println("A subtração entre os valores é: " + subtracao);
          break;
        case "m":
          int multiplicacao = valor1 * valor2;
          System.out.println("A multiplicação entre os valores é: " + multiplicacao);
          break;
        case "d":
          if (valor2 == 0) {
            System.out.println("Não se pode dividir por 0");
          } else {
            double divisao = valor1 / (double) valor2;
            System.out.println("A divisão entre os valores é: " + divisao);
          }
          break;
        default:
          System.out.println("Operação não encontrada");
      }
      in.close();
    }
}
```

```java
// Exercício 6
// Importar outros pacotes, métodos, etc
import java.util.Scanner;

class Main {
    public static void main(String[] args) {


        // Faça a implementação do Jogo Pedra, Papel e Tesoura (Jokempô). O algoritmo deverá perguntar qual é a escolha do jogador 1 (Pedra [pe], Papel [pa], Tesoura [t]) e deverá fazer o mesmo para o jogador 2. No final da execução o algoritmo deverá dizer qual é o jogador vencedor ou se houve empate.

        Scanner in = new Scanner(System.in);

        final String pedra = "pe";
        final String papel = "pa";
        final String tesoura = "t";



        System.out.println("Vamos jogar pedra (pe), papel (pa), tesoura (t)!");

        System.out.println("Insira a escolha do jogador 1");
        String escolhaJogador1 = in.next();

        if (!(escolhaJogador1.equals(pedra) || escolhaJogador1.equals(papel) || escolhaJogador1.equals(tesoura))) {
            System.out.println("O jogador 1 não escolheu uma opção válida");
            System.exit(0);
        }

        System.out.println("Insira a escolha do jogador 2");
        String escolhaJogador2 = in.next();

        if (!(escolhaJogador2.equals(pedra) || escolhaJogador2.equals(papel) || escolhaJogador2.equals(tesoura))) {
            System.out.println("O jogador 2 não escolheu uma opção válida");
            System.exit(0);
        }

        if (escolhaJogador1.equals(escolhaJogador2)) {
            System.out.println("Houve empate");
            System.exit(0);
        }


        switch (escolhaJogador1) {
            case pedra:
                if (escolhaJogador2.equals(tesoura)) {
                    System.out.println("Vitória do jogador 1, pedra vence tesoura!");
                } else if (escolhaJogador2.equals(papel)) {
                    System.out.println("Vitória do jogador 2, papel vence pedra!");
                }
                break;
            case papel:
                if (escolhaJogador2.equals(pedra)) {
                    System.out.println("Vitória do jogador 1, papel vence pedra!");
                } else if (escolhaJogador2.equals(tesoura)) {
                    System.out.println("Vitória do jogador 2, tesoura vence papel!");
                }
                break;
            case tesoura:
                if (escolhaJogador2.equals(papel)) {
                    System.out.println("Vitória do jogador 1, tesoura vence papel!");
                } else if (escolhaJogador2.equals(pedra)) {
                    System.out.println("Vitória do jogador 2, pedra vence tesoura!");
                }
                break;
        }

        in.close();

    }
}
```
