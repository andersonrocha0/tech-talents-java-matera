# Dia 4 e 5

## 1 - Estrutura de controle/repetição - While, Do While e For

### 1.1 - O que são estruturas de repetição?

* As estruturas de repetição também são conhecidas como laços (loops) e são utilizados para executar, repetidamente, uma instrução ou bloco de instrução enquanto determinada condição estiver sendo satisfeita.

### 1.2 - WHILE

* Nós usamos **while (ENQUANTO)** para repetir um bloco de código **enquanto** uma condição for verdadeira. Antes de começar a executar o código já verificamos se a condição é verdadeira e só vamos executar o while se sim, se ela for verdadeira.

```java
int contagem = 1;

while (contagem <= 10) {
    System.out.println(contagem);
    // contagem = contagem + 1;
    contagem++;
}
/* Saída/Output
1
2
3
4
5
6
7
8
9
10
*/
```

### 1.3 - DO WHILE

* Nós usamos **do while (FAÇA ENQUANTO)** para repetir um bloco de código **enquanto** uma condição for verdadeira. A diferença entre ele e o while, é que vamos executar o código a primeira vez mesmo sem saber se o valor da condição é verdadeira ou não.

```java
int contagem = 11;

do {
    System.out.println(contagem);
    contagem++;
} while (contagem <= 10);
// Saída/Output
// 11
```

#### Cuidado com o Do While

<h1 align="center">
    <img src="whileVsDoWhile.jpg" width="600">
</h1>

### 1.4 - FOR

* Nós usamos **for (PARA)** para repetir um bloco de código **para** um valor inicial até uma condição específica. Por exemplo, podemos fazer uma repetição considerando a variável **inteira** ***i***. Vamos inicializar nossa variável *i* com *0*. *Para (i = 0; i < 10; i++)*. Dessa forma estamos dizendo o seguinte: 
    * Nossa repetição irá iniciar com i sendo o valor 0;
        * (<b>i = 0</b>; i < 10; i++)
    * Nossa repetição ocorrerá até que o valor de i seja menor que 10;
        * i = 0; <b>i < 10</b>; i++)
    * A cada rodada da nossa repetição, o valor de i irá incrementar 1;
        * (i = 0; i < 10; <b>i++</b>)


```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
/* Saída/Output 
0
1
2
3
4
5
6
7
8
9
*/
```

## 3 - Exercícios

1. Construa um algoritmo que leia 10 valores inteiros e positivos e:
    * Encontre o maior valor
    * Encontre o menor valor
    * Calcule a média dos números lidos
Esse exercício foi dado na aula 3 e agora vamos otimizar ele utilizando o while e for.

2. Construa um algoritmo usando uma estrutura de repetição que calcule o fatorial de um número.

## Referências

### Sites na Web

* https://tableless.com.br/java-estruturas-de-repeticao/#:~:text=As%20estruturas%20de%20repeti%C3%A7%C3%A3o%20tamb%C3%A9m,determinada%20condi%C3%A7%C3%A3o%20estiver%20sendo%20satisfeita.&text=O%20corpo%20comp%C3%B5e%2Dse%20de,instru%C3%A7%C3%B5es%20que%20s%C3%A3o%20executadas%20repetidamente.
