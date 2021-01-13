# Dia 2

## Resolução exercícios
 

```java
// Exercício 1
class Main {  
  public static void main(String args[]) { 
    int y = 99;
    int z = 11;
    System.out.println("O valor inicial da minha variável Y é: " + y);
    System.out.println("O valor inicial da minha variável Z é: " + z);
    int aux = 0;
    aux = y;
    y = z;
    z = aux;
    System.out.println("O valor depois da troca da minha variável Y é: " + y);
    System.out.println("O valor depois da troca da minha variável Z é: " + z);
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
        System.out.println("Por favor digite um valor inteiro para que digamos qual é o seu antecessor");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int antecessor = a - 1;
        System.out.println("O antecessor de " + a + " é: " + antecessor);
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
        // Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo.
​
        Scanner scanner = new Scanner(System.in);
​
        System.out.println("Esse algoritimo calcula a área de um retângulo");
        
        System.out.println("Por favor digite a base do retângulo");
        float base = scanner.nextFloat();
        
        System.out.println("Por favor digite a altura do retângulo");
        float altura = scanner.nextFloat();
​
        float area = base * altura;
​
        System.out.println("A área do retângulo é: " + area);
        
        scanner.close();
    }
}
```

```java
// Exercício 4
import java.util.Scanner;
class Main
{
    public static double calculaPercentualX(double tDeElei, double totalX) {

      double percentual = totalX * 100 / tDeElei;
      return percentual;

    }

    public static void main(String args[])
    {
        // Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores..

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o total de votos");
        int totalVotos = scanner.nextInt();
        System.out.println("Digite o total de votos em branco");
        int totalVotosBrancos = scanner.nextInt();
        System.out.println("Digite o total de votos nulos");
        int totalVotosNulos = scanner.nextInt();
        System.out.println("Digite o total de votos validos");
        int totalVotosValidos = scanner.nextInt();

        System.out.println("A quantidade total de votos é: " + totalVotos);

        System.out.println("A quantidade total de votos em branco é: " + totalVotosBrancos);

        System.out.println("A quantidade total de votos nulos é: " + totalVotosNulos);

        System.out.println("A quantidade total de votos validos é: " + totalVotosValidos);

        double percentualVotosBrancos = Main.calculaPercentualX(totalVotos, totalVotosBrancos);

        double percentualVotosNulos = Main.calculaPercentualX(totalVotos, totalVotosNulos);

        double percentualVotosValidos = Main.calculaPercentualX(totalVotos, totalVotosValidos);

        System.out.println("-----------");

        System.out.println("O percentual total de votos em branco é: " + String.format("%.2f", percentualVotosBrancos));

        System.out.println("O percentual total de votos nulos é: " + String.format("%.2f", percentualVotosNulos));

        System.out.println("O percentual total de votos validos é: " + String.format("%.2f", percentualVotosValidos));

        scanner.close();

        
    }
}
```