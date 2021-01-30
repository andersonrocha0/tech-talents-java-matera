# Dia 7

## 1- Arrays e ArrayList

### 1.1 - Listas e Arrays, o que são? o que comem? por onde andam?
* A definição de arrays( ou vetores em pt-br) segue como: 
 &nbsp; &nbsp; &nbsp; Estrutura de programação que armazena uma coleção de elementos. onde cada elemento pode ser identificado por pelo menos uma chave;
* Basicamente arrays são variáveis compostas, ou seja, podem armazenar não apenas um mas vários valores, em Java contanto que todos sejam do mesmo tipo.
* Arrays são também por definição Listas computacionais, que podem ser ordenados ou não. 
* A definição de lista segue como: 
 &nbsp; &nbsp; &nbsp; Uma **lista** ou **sequência** é uma [estrutura de dados abstrata](https://pt.wikipedia.org/wiki/Tipo_Abstrato_de_Dado "Tipo Abstrato de Dado") que implementa uma coleção ordenada de [valores](https://pt.wikipedia.org/wiki/Valor_(computa%C3%A7%C3%A3o) "Valor (computação)"), onde o mesmo valor pode ocorrer mais de uma vez.

### 1.2 - Para que serve um array?
* Vez ou outra precisamos lidar com diversos dados do mesmo tipo ou dados que aparecem de forma sequencial como uma lista. Pode ser que precisemos saber quais alunos estão numa classe, organizar vagas em um estacionamento, dentre outras coisas. Listas estão por toda parte, e fica muito inviável ter que criar varias e varias variáveis para cada problema. 
* Afinal teria um custo computacional muito grande criar 5 10 100 300 ... variáveis em memoria, não pensando apenas em custo computacional, mas seria inviável ter que cuidar de cada uma destas variáveis individualmente. Por isto surgiram os arrays. 

### 1.3 - Arrays na pratica
* Em Java arrays são estruturas fixas, ou seja eles podem ter um único tamanho definido. Se criamos um array e dissermos que ele vai ter um tamanho de 10, ele irá ser criado e futuramente irá ser destruído  este tamanho. Isso significa que ele somente poderá armazenar ate 10 valores.

   ```java
   // Criando array de dias da semana
   String[] diasDaSemana = new String[7];
   // Outra forma de criarmos um array é
   // Desta forma criamos o array ja inicializando com valores.
   String[] diasDaSemana = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado" }
   ```
* Arrays armazenam esses valores juntamente com sua posição. Que sempre começa 0. Ou seja, o array de dias da semana sera lido como 0,1,2,3,4,5,6. 
* Arrays são inicializados assim que o criamos com uma valor default baseado em seu tipo. 
 ```java
System.out.println(diasDaSemana[0]);
System.out.println(diasDaSemana[1]);
System.out.println(diasDaSemana[2]);
System.out.println(diasDaSemana[3]);
System.out.println(diasDaSemana[4]);
System.out.println(diasDaSemana[5]);
System.out.println(diasDaSemana[6]);
// Resultado (dependendo da forma como o array foi criado): 
null ou Domingo
null ou Segunda
null ou Terça
null ou Quarta
null ou Quinta
null ou Sexta
null ou Sábado
   ```

* Para preenchermos um array devemos dizer em qual posição iremos preencher o valor;
````java
// caso o array tenha sido criado ja inicializando os valores não é necessário este passo
diasDaSemana[0] = "Domingo";
diasDaSemana[1] = "Segunda";
diasDaSemana[2] = "Terça";
diasDaSemana[3] = "Quarta";
diasDaSemana[4] = "Quinta";
diasDaSemana[5] = "Sexta";
diasDaSemana[6] = "Sábado";
````

* Caso tente acessar ou preencher um indice de array que não existe, ou seja, maior que seu tamanho, irá ser lançado uma exceção. Falaremos sobre exceção em aulas futuras.
````java
diasDaSemana[7] = "Sextou";
// Resultado
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
	at br.com.ctt.TesteArray.main(TesteArray.java:16)
````

 * Podemos usar a estrutura For para percorrer um array. Ao utilizarmos o for, usamos o tamanho do array com a propriedade length e um contador que comece com 0
````java
for (int indiceArray = 0; indiceArray < diasDaSemana.length; indiceArray++) {
    System.out.println(diasDaSemana[indiceArray]);
}
// Resultado
Domingo
Segunda
Terça
Quarta
Quinta
Sexta
Sabado
````
* Existe também uma instrução chamada foreach que é um for mais simplificado, que percorre todo o array.
````java
for (String dia : diasDaSemana) {
    System.out.println(dia);
}
// Resultado
Domingo
Segunda
Terça
Quarta
Quinta
Sexta
Sabado
````


### 2.1 - ArrayList o que é? para que serve? o que come?
* Diferentemente de arrays que são estruturas primitivas de dados,  ArrayList é uma classe, muito utilizada em java. A classe ArrayList implementa uma estrutura chamada Lista Encadeada, onde diferente de arrays não são finitas e como temos uma classe a implementando, podemos nos utilizar de diversos métodos uteis que ela nos fornece.

### 2.2 - ArrayList na pratica
* Para criamos um ArrayList precisamos instancia-lo e darmos a ele um tipo (que não pode ser primitivo). 
````java
ArrayList<String> diasDaSemana = new ArrayList<>();
// ou
ArrayList<String> diasDaSemana = new ArrayList<>({"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado" });
````
 * Para adicionarmos valores em um ArrayList é bem simples, basta utilzar um dos seus métodos.
 ````java
diasDaSemana.add("Domingo");
diasDaSemana.add("Segunda");
diasDaSemana.add("Terça");
diasDaSemana.add("Quarta");
diasDaSemana.add("Quinta");
diasDaSemana.add("Sexta");
diasDaSemana.add("Sábado");
 ````
 * Diferentemente de arrays, ArrayList não é fixo. Ou seja, voce pode adicionar quantos valores necessário.
 ````java
diasDaSemana.add("Domingou"); 
diasDaSemana.add("Segundou"); 
diasDaSemana.add("Terçou"); 
diasDaSemana.add("Quartou"); 
diasDaSemana.add("Quintou");
diasDaSemana.add("Sextou");
diasDaSemana.add("Sabadou"); 
 ````
 * Para percorrer um ArrayList, utilizamos seu metodo size.
````java
for (int indiceArray = 0; indiceArray < diasDaSemana.size(); indiceArray++) {
    System.out.println(diasDaSemana[indiceArray]);
}
// Resultado
Domingo
Segunda
Terça
Quarta
Quinta
Sexta
Sabado
````

### 3 - Exercícios
1. Escreva um algoritmo que leia números insira em um array e após mostre os números informados na tela.
2. Escreva um algoritmo que leia números, insira em um array e após mostre a quantidade de números negativos.
3. Escreva um algoritmo que leia números, insira em um array e após mostre a quantidade de números pares.
4. Escreva um algoritmo que leia números, insira em um array e após mostre o maior valor.
5. Escreva um algoritmo que simula um jogo da forca simples. o usuario precisara adivinhar uma palavra chutando cada letra em no máximo 10 chutes, caso o usuario acerte a letra o jogo dirá que ele acertou, caso tenha errado, o numero de tentativas vai diminuindo. Caso o numero de tentativas chegue a 0 o usuário perde.
