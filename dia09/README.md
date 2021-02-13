# Dia 9

## Classes e Objetos

### 1 - Classe

* Embora Programação orientada a objetos (POO) tenha objeto em seu nome, tudo começa com a definição de uma classe.

* È com ela que pe possível manipular objetos,  pois é a unidade minima e inicial da orientação a objetos.

* A definição de classe segue como: *Classe é uma estrutura que abstrai um conjunto de objetos com características  similares.  Uma  classe  define  o  comportamento  de seus objetos através de métodos e os estados possíveis destes objetos através  de  atributos.  Em  outros  termos,  uma  classe  descreve  os serviços  providos  por  seus  objetos  e  quais  informações  eles  podem armazenar.*

* O objetivo de uma classe tem como objetivo servir de base para que irá ser um objeto. Através dela, criamos um "molde", com que os objetos deverão seguir, definindo quais informações, serão trabalhadas e como elas serão manipuladas.

````java
class Vaga {

}
````

### 2 - Atributos

* Após identificar a entidade (classe) que irão ser manipuladas, surgi a hora de começar a detalha-las: quais informações devem ser manipuladas? através desta classe? A partir disto começa o trabalho de caracteriza-las. Tais características é que vão definir quais informações podemos armazenar e manipular.

* A definição de atributos segue como: *Atributo é o elemento de uma classe responsável por definir sua estrutura  de  dados.  O  conjunto  destes  será  responsável  por representar  suas  características  e  fará  parte  dos  objetos  criados a partir da classe.*

* Essa definição deixa bem claro que os atributos devem ser definidos dentro da classe. Desta forma, eles são responsáveis por definir sua estrutura de dados.

* È a partir do uso de atributos que será possível representar fielmente uma entidade do mundo real.

* Devemos pensar em criar atributos a partir de substantivos, ou até mesmo, adjetivos, pensar em ambos pode facilitar a identificação.

````java
class Vaga {
    String setor;
    int numero;
    boolean ocupada;
    float largura;
    Cliente cliente;
}
````

### 3 - Método

* Tendo identificado a classe e seus atributos, a seguinte pergunta que fica é: o que posso fazer com eles? Como utilizar a classe e estes atributos ?

* Entra em cena então: métodos. Responsáveis por identificar e executar as operações que a classe fornecerá. Operações que por, via de regra, têm como finalidade manipular os atributos.

* A definição de um método  segue como: *Método é uma porção de código (sub-rotina) que é disponibilizada pela classe. Esta é executado quando é feita uma requisição a ela. Um método serve para identificar quais serviços,
ações, que a classe oferece. Eles são responsáveis por definir e
realizar um determinado comportamento.*

* Para facilitar a identificação de métodos de uma classe, podemos pensar em verbos. Isso ocorre por conta de sua própria definição: ações. 

````java
class Vaga {
    String setor;
    int numero;
    boolean ocupada;
    float largura;
    Cliente cliente;

    void setSetor(String setor) {
        this.setor = setor;
    }

    String getSetor() {
        return this.setor;
    }

    boolean estaOcupada() {

    }

    void ocupar(Cliente cliente) {

    }

    Cliente qualCliente() {

    }

    String getNomeCompleto() {

    }

    
}
````

### 4 - Método especial

* Podemos ter quantos métodos forem necessários para representar os comportamentos de uma classe. Cada um possui uma determinada operação que a classe deve oferecer.

* Muitas vezes métodos trabalham entre si para realizar seus comportamentos.

* Além destes métodos, independente da quantidade e da finalidade dos métodos de uma classe, existe um especial que toda classe possui: **o construtor**.

* É a partir do construtor que é possível criar objetos. A partir da classe em questão. Ou seja, sempre que for necessário criar objetos de uma determinada classe. seu construtor deverá ser utilizado. È através dele que é possível instanciar um objeto.

* Além disto, é possível prover valores iniciais para o objeto em questão.

````java
 class Vaga {
    String setor;
    int numero;
    boolean ocupada;
    float largura;
    Cliente cliente;

     // construtor
    Vaga() {
         // implementação desejada
     }

    void setSetor(String setor) {
        this.setor = setor;
    }

    String getSetor() {
        return this.setor;
    }

    boolean estaOcupada() {

    }

    void ocupar(Cliente cliente) {

    }

    Cliente qualCliente() {

    }

    String getNomeCompleto() {

    }

 }
````

### 5 - Objeto

* Foi visto aqui que, embora o paradigma tenha objeto em seu nome. Tudo começa com uma classe. Então o que é um objeto? È a instanciação de uma classe.

* A definição de um objeto segue como: *Um objeto é a representação de um conceito/entidade do mundo real,  que  pode  ser  física  (bola,  carro,  árvore  etc.)  ou  conceitual (viagem, estoque, compra etc.) e possui um significado bem definido para  um  determinado  software.  Para  esse  conceito/entidade,  deve ser definida inicialmente uma classe a partir da qual posteriormente serão instanciados objetos distintos.*

* Para a criação de um objeto devemos seguir o mesmo principio das classes: pensar em substantivos.

````java
Vaga vaga = new Vaga();
````

* Com a ajuda do operador new, um objeto do tipo da classe definida, é instanciado e armazenado numa variável.

### 6 - Exercícios

1. Crie uma classe para representar uma pessoa, com os atributos  de nome, data de nascimento e altura. Crie e também um método para imprimir todos dados de uma pessoa. Crie um método para calcular a idade da pessoa.

2. Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as seguintes operações:

   * void armazenaPessoa(String nome, int idade, float altura);
   * void removePessoa(String nome);
   * int buscaPessoa(String nome); // informa em que posição da agenda está a pessoa
   * void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda
   * void imprimePessoa(int index); // imprime os dados da pessoa que está na posição “i” da agenda.

3. Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o térreo), capacidade do elevador e quantas pessoas estão presentes nele. A classe deve também disponibilizar os seguintes métodos:

   * Inicializa : que deve receber como parâmetros a capacidade do elevador e o total de andares no prédio (os elevadores sempre começam no térreo e vazio);
   * Entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
   * Sai : para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
   * Sobe : para subir um andar (não deve subir se já estiver no último andar);
   * Desce : para descer um andar (não deve descer se já estiver no térreo);
   

4. Crie uma classe Televisão e uma classe ControleRemoto que pode controlar o volume e trocar os canais da televisão. O controle de volume permite:

   * aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
   * aumentar e diminuir o número do canal em uma unidade
   * trocar para um canal indicado;
   * consultar o valor do volume de som e o canal selecionado.
