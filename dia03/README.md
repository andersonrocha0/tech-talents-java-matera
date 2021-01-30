# Dia 3

## 1 - Estruturas de controle/decisão - IF Else (Switch caso todos entendam)

### 1.1 - O que são estruturas de decisão?

* Os comandos de decisão ou desvio fazem parte das técnicas de programação que conduzem a estruturas de programas que não são totalmente seqüenciais. Com as instruções de SALTO ou DESVIO pode-se fazer com que o programa proceda de uma ou outra maneira, de acordo com as decisões lógicas tomadas em função dos dados ou resultados anteriores. As principais estruturas de decisão são: “IF”, “IF/ELSE” e “SWITCH CASE”

### 1.2 - IF/ELSE

* Nós usamos **if (SE)** e **else (SENÃO)** para tomar uma decisão no código. Vamos fazer uma pergunta para o nosso algoritmo e dependendo da resposta, iremos executar um fluxo diferente:

```java
int idade = 17;
if (idade > 18) {
    System.out.println("Você tem idade para acessar esse conteúdo");
} else {
    System.out.println("Você não tem idade para acessar esse conteúdo");
}
```

### 1.3 - SWITCH-CASE

* Nós usamos **SWITCH (ESCOLHA)** para tomar uma decisão no código assim como o **IF (SE)**. Utilizamos o switch em blocos grandes onde seriam necessários vários IFs, por exemplo:

```java
int dia = 4;
switch (dia) {
  case 1:
    System.out.println("Segunda");
    break;
  case 2:
    System.out.println("Terça");
    break;
  case 3:
    System.out.println("Quarta");
    break;
  case 4:
    System.out.println("Quinta");
    break;
  case 5:
    System.out.println("Sexta");
    break;
  case 6:
    System.out.println("Sábado");
    break;
  case 7:
    System.out.println("Domingo");
    break;
}
// Mostrará "Quinta" (dia 4)
```

No último link das referência você encontra um link bem legal explicando onde usar if e onde usar switch.

## 2 - Operadores

### 2.1 Operadores de atribuição:

* Estes operadores são utilizados para expressar o armazenamento de um valor em uma variável.

```java
int idade = 20; // O símbolo de igual "=" é o nosso operador de armazenamento. Com ele podemos atribuir valores a uma variável.
```

### 2.2 Operadores Aritméticos:

* Os operadores aritméticos são os utilizados para obter resultados numéricos. Além da adição, subtração, multiplicação e divisão, podem utilizar também o operador para módulo.

```java
// O símbolo de "+" é o nosso operador de adição.
int i = 1 + 1;
System.out.println(i);
// 2*
```

```java
// O símbolo de "-" é o nosso operador de subtração.
int i = 10 - 6;
System.out.println(i);
// 4
```

```java
// O símbolo de "*" é o nosso operador de multiplicação.
int i = 5 * 5;
System.out.println(i);
// 25
```

```java
// O símbolo de "/" é o nosso operador de divisão.
int i = 6 / 2;
System.out.println(i);
// 3
```

```java
// O símbolo de "++" é o nosso operador de incremento.
int i = 99;
i++;
System.out.println(i);
// 100
```

```java
// O símbolo de "--" é o nosso operador de decremento.
int i = 301;
i--;
System.out.println(i);
// 300
```

```java
// O símbolo de "%" é o nosso operador de módulo.
double i = 59 % 6;
System.out.println(i);
// 5
```

### 2.3 Operadores Relacionais:

* Os operadores relacionais são utilizados para comparar valores e sempre retornam um valor boolean.

```java
// O símbolo de "==" é o nosso operador que verifica se um valor é igual ao outro.
System.out.println(1 == 1);
// true
System.out.println(1 == 2);
// false
```

```java
// O símbolo de "!=" é o nosso operador que verifica se um valor é diferente do outro.
System.out.println(1 != 1);
// false
System.out.println(1 != 2);
// true
```

```java
// O símbolo de ">" é o nosso operador que verifica se um valor é maior que outro.
System.out.println(1 > 1);
// false
System.out.println(2 > 1);
// true
```

```java
// O símbolo de "<" é o nosso operador que verifica se um valor é menor que outro.
System.out.println(1 < 5);
// true
System.out.println(5 < 1);
// false
```

```java
// O símbolo de ">=" é o nosso operador que verifica se um valor é maior ou igual a outro.
System.out.println(1 >= 1);
// true
System.out.println(2 >= 1);
// true
System.out.println(2 >= 3);
// false
```

```java
// O símbolo de "<=" é o nosso operador que verifica se um valor é menor ou igual a outro.
System.out.println(1 <= 1);
// true
System.out.println(1 <= 5);
// true
System.out.println(5 <= 1);
// false
```

### 2.4 Operadores Lógicos:

* Os operadores lógicos servem para combinar resultados de expressões, retornando se o resultado final é verdadeiro ou falso.

```java
// O símbolo de "&&" (AND) é o nosso operador que verifica se duas ou mais expressões são verdadeiras.
System.out.println(1 == 1 && 2 == 2);
// true
System.out.println(1 == 1 && 2 == 1);
// false
```

```java
// O símbolo de "||" (OR) é o nosso operador que verifica se uma das expressões são verdadeiras.
System.out.println(1 == 1 || 2 == 1);
// true
System.out.println(1 == 2 || 2 == 2);
//true
System.out.println(1 == 2 || 2 == 1);
// false
```

```java
// O símbolo de "!" (NOT) inverte o valor da expressão ou condição, se verdadeira inverte para false e vice-versa.
System.out.println(!1 == 1);
// false
System.out.println(!1 == 2);
// true
```

## 3 - Exercícios

1. Escreva um algoritmo que leia um número inteiro e diga se ele é par ou ímpar.

2. Elabore um algoritmo que dada a idade de um nadador classifique-o em uma das seguintes categorias:
    * Infantil A = 5 a 7 anos
    * Infantil B = 8 a 11 anos
    * Juvenil A = 12 a 13 anos
    * Juvenil B = 14 a 17 anos
    * Adultos = Maiores de 18 anos

3. Escreva um algoritmo em Java que leia dois números inteiros e determine qual é o menor. Escreva um algoritmo que determina o maior também. 

4. Construa um algoritmo que leia 10 valores inteiros e positivos e:
    * Encontre o maior valor
    * Encontre o menor valor
    * Calcule a média dos números lidos

5. Escreva um algoritmo em Java que seja capaz de fazer as seguintes operações matemáticas (adição, subtração, multiplicação e divisão). Todas as operações serão entre dois valores. No começo do algoritmo pergunte ao usuário qual operação ele deseja fazer e quais são os valores.

6. Faça a implementação do Jogo Pedra, Papel e Tesoura (Jokempô). O algoritmo deverá perguntar qual é a escolha do jogador 1 (Pedra [pe], Papel [pa], Tesoura [t]) e deverá fazer o mesmo para o jogador 2. No final da execução o algoritmo deverá dizer qual é o jogador vencedor ou se houve empate.

## Referências

### Livros

* Lógica de programação - Crie seus primeiros programas usando JavaScript e HTML - Casa do Código - Paulo Silveira, Adriano Almeida

* Desbravando Java e Orientação a Objetos - Um guia para o iniciante da linguagem - Casa do Código - Rodrigo Turini

### Sites na Web

* http://ftp.unicamp.br/pub/apoio/treinamentos/logica/logica.pdf

* https://pt.slideshare.net/kuatelina/estruturas-condicionais-e-de-repetio

* http://professor.unisinos.br/ltonietto/inf/pg1/exerc_IF_Java.pdf

* http://www.universidadejava.com.br/materiais/java-operadores-relacionais/

* https://www.seduc.ce.gov.br/wp-content/uploads/sites/37/2012/06/informatica_logica_de_programacao.pdf

* https://dicasdeprogramacao.com.br/operadores-logicos/

* https://www.geeksforgeeks.org/switch-vs-else/#:~:text=if%2Delse%20better%20for%20boolean,number%20of%20cases%20are%20good.
