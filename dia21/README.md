# Dia 21

## 1 - Algebra relacional

* A Álgebra Relacional é uma linguagem de consulta formal, porém procedimental, ou seja, o usuário dá as instruções ao sistema para que o mesmo realize uma seqüência de operações na base de dados para calcular o resultado desejado.

* Na terminologia formal de modelo relacional temos os seguintes conceitos:

    1. Uma linha é chamada de tupla;
    2. O cabeçalho da coluna é chamado de atributo;
    3. Tabela é chamada de relação;
    4. O tipo de dados que descreve os tipos de valores que podem aparecer em cada coluna é chamado de domínio;
    5. A álgebra relacional é uma forma de cálculo sobre conjuntos ou relações.

* Para mais detalhes sugiro a leitura do material encontrado nesse link: http://www.macoratti.net/13/06/sql_arcb.htm


## 2 - Relacionando tabelas

* Para relacionar tabelas através de queries, podemos utilizar duas técnicas:
    * Realizar uma consulta com múltiplas tabelas através do **from** e do **where**
    * Realizar uma consulta utilizando o comando **join**

* Antes de vermos os exemplos práticos escritos em SQL, vamos criar algumas tabelas e inserir alguns registros.

```sql
-- Script necessário antes de rodar os exemplos
create table produtos (
	codigo serial primary key,
	descricao varchar,
	preco decimal
)

insert into produtos (descricao, preco) values 
('Pastel de carne', 5.3),
('Pastel de palmito', 8.0),
('Pastel de queijo', 4.9),
('Pastel de pizza', 5.5),
('Pastel de camarão', 12.2),
('Pastel de jaca', 11.9),
('Pastel de banana', 9.5);

---
create table vendas (
	codigo serial primary key,
	data_venda date
)

insert into vendas (data_venda) values 
('2021-02-01'),
('2021-02-02');

---
create table itens_da_venda (
	codigo_venda integer,
	codigo_produto integer,
	preco decimal
)


insert into itens_da_venda (codigo_venda, codigo_produto) values 
(1, 1),
(1, 2),
(1, 7),
(2, 3),
(2, 4),
(2, 8);
```

### 2.1 Através do where

```sql
-- Exemplo com from
select
	*
from
	vendas,
	itens_da_venda,
	produtos
where
	vendas.codigo = itens_da_venda.codigo_venda
	and itens_da_venda.codigo_produto = produtos.codigo;
```

### 2.2 Através de joins

```sql
-- Exemplo com join
select
	*
from 
	vendas v
join
	itens_da_venda iv
	on v.codigo = iv.codigo_venda
join
	produtos p 
	on p.codigo = iv.codigo_produto;
```

### 2.3 Tipos de joins

* Esse link contém tudo o que vocês precisam saber sobre joins. https://www.devmedia.com.br/sql-join-entenda-como-funciona-o-retorno-dos-dados/31006


## 3 Tipos de dados no PostgreSQL

* https://www.postgresql.org/docs/9.6/datatype.html


## 4 Tipos de relacionamentos no PostgreSQL

* https://sites.google.com/site/uniplibancodedados1/aulas/aula-7---tipos-de-relacionamento


## 5 Constraints e Foreign Keys

### 5.1 Constraints / Restrições

* Os tipos de dado são uma forma de limitar os dados que podem ser armazenados na tabela. Entretanto, para muitos aplicativos a restrição obtida não possui o refinamento necessário. Por exemplo, uma coluna contendo preços de produtos provavelmente só pode aceitar valores positivos, mas não existe nenhum tipo de dado que aceite apenas números positivos. Um outro problema é que pode ser necessário restringir os dados de uma coluna com relação a outras colunas ou linhas. Por exemplo, em uma tabela contendo informações sobre produtos deve haver apenas uma linha para cada código de produto.

* Para esta finalidade, a linguagem SQL permite definir restrições em colunas e tabelas. As restrições permitem o nível de controle sobre os dados da tabela que for desejado. Se o usuário tentar armazenar dados em uma coluna da tabela violando a restrição, ocorrerá um erro. Isto se aplica até quando o erro é originado pela definição do valor padrão.

#### 5.1.1 Restrições de verificação

* Uma restrição de verificação é o tipo mais genérico de restrição. Permite especificar que os valores de uma determinada coluna devem estar de acordo com uma expressão booleana (valor-verdade [1] ). Por exemplo, para permitir apenas preços com valores positivos utiliza-se:

```sql
CREATE TABLE produtos (
    cod_prod   integer,
    nome       text,
    preco      numeric CHECK (preco > 0)
);
```


#### 5.1.2 Restrições de não nulo

* Uma restrição de não-nulo simplesmente especifica que uma coluna não pode assumir o valor nulo. Um exemplo da sintaxe:

```sql
CREATE TABLE produtos (
    cod_prod   integer NOT NULL,
    nome       text    NOT NULL,
    preco      numeric
);
```

#### 5.1.3 Restrições de unicidade

* A restrição de unicidade garante que os dados contidos na coluna, ou no grupo de colunas, é único em relação a todas as outras linhas da tabela. A sintaxe é:

```sql
CREATE TABLE produtos (
    cod_prod   integer UNIQUE,
    nome       text,
    preco      numeric
);
```

#### 5.1.4 Chaves primárias

* Tecnicamente a restrição de chave primária é simplesmente a combinação da restrição de unicidade com a restrição de não-nulo. Portanto, as duas definições de tabela abaixo aceitam os mesmos dados:

```sql
CREATE TABLE produtos (
    cod_prod   integer UNIQUE NOT NULL,
    nome       text,
    preco      numeric
);

CREATE TABLE produtos (
    cod_prod   integer PRIMARY KEY,
    nome       text,
    preco      numeric
);
```

### 5.2 Chaves Estrangeiras

* A restrição de chave estrangeira especifica que o valor da coluna (ou grupo de colunas) deve corresponder a algum valor existente em uma linha de outra tabela. Diz-se que a chave estrangeira mantém a integridade referencial entre duas tabelas relacionadas.

* Supondo que já temos a tabela de produtos utilizada diversas vezes anteriormente:

```
CREATE TABLE produtos (
    cod_prod   integer PRIMARY KEY,
    nome       text,
    preco      numeric
);
```

* Agora vamos assumir a existência de uma tabela armazenando os pedidos destes produtos. Desejamos garantir que a tabela de pedidos contenha somente pedidos de produtos que realmente existem. Para isso é definida uma restrição de chave estrangeira na tabela de pedidos fazendo referência à tabela de produtos:

```
CREATE TABLE pedidos (
    cod_pedido  integer PRIMARY KEY,
    cod_prod    integer REFERENCES produtos (cod_prod),
    quantidade  integer
);
```

* Isto torna impossível criar um pedido com cod_prod não existente na tabela de produtos.

* Nesta situação é dito que a tabela de pedidos é a tabela que faz referência, e a tabela de produtos é a tabela referenciada. Da mesma forma existem colunas fazendo referência e sendo referenciadas.

**Para verificar mais exemplos acesse: http://pgdocptbr.sourceforge.net/pg80/ddl-constraints.html**


<hr>

## Exercícios

* Modelem um banco de dados relacional capaz de armazenar dados para uma empresa que controla várias academias.

* Iremos começar somente com algumas tabelas:
    * Academia
    * Aluno
    * Personal
    * Localização da Academia


## Referências e links para estudo

* https://www.devmedia.com.br/algebra-relacional-parte-i/2663

* http://www.bosontreinamentos.com.br/postgresql-banco-dados/criando-chave-estrangeira-em-postgresql/

* http://pgdocptbr.sourceforge.net/pg82/tutorial-join.html

* https://www.devmedia.com.br/sql-join-entenda-como-funciona-o-retorno-dos-dados/31006

* http://studentsql.blogspot.com/2012/05/inner-join.html

* http://www.bosontreinamentos.com.br/postgresql-banco-dados/criando-chave-estrangeira-em-postgresql/

* http://pgdocptbr.sourceforge.net/pg82/tutorial-join.html

* https://www.devmedia.com.br/sql-join-entenda-como-funciona-o-retorno-dos-dados/31006

* http://pgdocptbr.sourceforge.net/pg80/ddl-constraints.html