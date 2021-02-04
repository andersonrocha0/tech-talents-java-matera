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

* TODO

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