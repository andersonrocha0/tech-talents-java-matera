# Dias 4 e 5

## Resolução exercícios
 

```java
// Exercício 1 While
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // 4. Construa um algoritmo que leia 10 valores inteiros e positivos e:

        // Encontre o maior valor
        // Encontre o menor valor
        // Calcule a média dos números lidos

        Scanner in = new Scanner(System.in);

        int somaDosValores = 0;

        int menorValor = Integer.MAX_VALUE;
        int maiorValor = Integer.MIN_VALUE;

        System.out.println(menorValor);
        System.out.println(maiorValor);

        int contador = 1;

        while (contador <= 10) {
            System.out.printf("Informe o %d num: ", contador);
            int valor = in.nextInt();

            if (valor > maiorValor) {
                maiorValor = valor;
            }

            if (valor < menorValor) {
                menorValor = valor;
            }

            somaDosValores += valor;

            contador++;
        }

        System.out.println("O maior valor digitado foi: " + maiorValor);
        System.out.println("O menor valor digitado foi: " + menorValor);
        System.out.print("A média dos valores é: " + somaDosValores / 10.0);

        in.close();
    }
}
```

```java
// Exercício 1 For
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // 4. Construa um algoritmo que leia 10 valores inteiros e positivos e:

        // Encontre o maior valor
        // Encontre o menor valor
        // Calcule a média dos números lidos

        Scanner in = new Scanner(System.in);

        int somaDosValores = 0;

        int menorValor = Integer.MAX_VALUE;
        int maiorValor = Integer.MIN_VALUE;

        System.out.println(menorValor);
        System.out.println(maiorValor);

        for (int contador = 1; contador <= 10; contador++) {
            System.out.printf("Informe o %d num: ", contador);
            int valor = in.nextInt();

            if (valor > maiorValor) {
                maiorValor = valor;
            }

            if (valor < menorValor) {
                menorValor = valor;
            }

            somaDosValores += valor;
        }

        System.out.println("O maior valor digitado foi: " + maiorValor);
        System.out.println("O menor valor digitado foi: " + menorValor);
        System.out.print("A média dos valores é: " + somaDosValores / 10.0);

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
// Importar outros pacotes, métodos, etc
import java.util.Scanner;

class Main
{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o número que você deseja saber o fatorial");
        int valor = in.nextInt();
        int resultado = 1;

        while (valor > 1) {
            resultado = resultado * valor;
            valor--;
        }

        System.out.println(resultado);

        in.close();
      
    }
}
```
