# Dia 2

## 1 - Lógica

### 1.1 - O que é lógica de programação?

* Lógica de programação é a técnica de encadear pensamentos para atingir determinado objetivo.

### 1.2 - O que é sequência lógica?

* Seqüência Lógica são passos executados até atingir um objetivo ou solução de um problema.

### 1.3 - O que são instruções?

* Na linguagem comum, entende-se por instruções **“um conjunto de regras ou normas definidas para a realização ou emprego de algo”.**

### 1.4 - O que é algoritmo?

* Um algoritmo é formalmente uma seqüência finita de passos que levam a execução de uma tarefa. Podemos pensar em algoritmo como uma receita, uma seqüência de instruções que dão cabo de uma meta específica. Estas tarefas não podem ser redundantes nem subjetivas na sua definição, devem ser claras e precisas.

### 1.5 - O que é um programa?

* Os programas de computadores nada mais são do que algoritmos escritos numa linguagem de computador (Java, Python, JavaScript, PHP, C entre outras) e que são interpretados e executados por uma máquina, no caso um computador. Notem que dada esta interpretação rigorosa, um programa é por natureza muito específico e rígido em relação aos algoritmos da vida real.

<hr/>

## 2 - Variáveis

### 2.1 - O que são variáveis?

* Uma variável é um espaço reservado na memória do computador para armazenar um tipo de dado determinado.

### 2.2 - Quais os tipos de variáveis que temos no Java?

* É importante entender que no Java, temos variáveis de tipos primitivos e tipos por referências.
    * Os tipos primitivos correspondem a dados mais simples ou escalares e serão abordados em detalhe no que segue ([link com detalhes](https://www.dm.ufscar.br/~waldeck/curso/java/part22.html)):
        * boolean
        * char
        * byte
        * short
        * int
        * long
        * float
        * double
    * Os tipos por referência são arrays, classes e interfaces, veremos mais detalhes durante o curso.

## 3 - Exercícios

1. Escreva um algoritmo que armazene o valor 99 em uma variável Y e o valor 11 em uma variável Z. A seguir (utilizando apenas atribuições entre variáveis) troque os seus conteúdos fazendo com que o valor que está em Y passe para Z e vice-versa. Ao final, escrever os valores que ficaram armazenados nas variáveis.

2. Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.
    1. Vamos aprender a recuperar valores nos nossos programas Java?

    ```java
    import java.util.Scanner;
    class Main
    {
        public static void main(String args[])
        {
            Scanner in = new Scanner(System.in);
            String s = in.nextLine();
            System.out.println("Você inseriu uma string de valor  "+s);
            int a = in.nextInt();
            System.out.println("Você inseriu um integer de valor  "+a);
            float b = in.nextFloat();
            System.out.println("Você inseriu um float de valor "+b);
        }
    }
    ```

3. Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo.
    1. [Como calcular a área de um retângulo](https://www.todamateria.com.br/area-do-retangulo/).

4. Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.

<hr/>

## Referências

### Livros

* Lógica de programação - Crie seus primeiros programas usando JavaScript e HTML - Casa do Código - Paulo Silveira, Adriano Almeida

* Desbravando Java e Orientação a Objetos - Um guia para o iniciante da linguagem - Casa do Código - Rodrigo Turini

### Sites na Web

* http://ftp.unicamp.br/pub/apoio/treinamentos/logica/logica.pdf

* https://www.dm.ufscar.br/~waldeck/curso/java/part22.html

* https://www.dicio.com.br/escalares/#:~:text=Significado%20de%20escalar&text=Matem%C3%A1tica%20Diz%2Dse%20do%20que,envolve%20nenhum%20conceito%20de%20dire%C3%A7%C3%A3o.

* https://data-flair.training/blogs/read-java-console-input/

* https://www.todamateria.com.br/area-do-retangulo/