# Dia 18

## 1 - Aula prática. Criando um programa que controla uma conta bancária.

### 1.1 - O que é esperado do exercício?

* É esperado que o aluno ou grupo crie um programa capaz de controlar uma conta bancária através das seguintes opções:
    * A equipe deverá definir o nome do seu banco (Usem a caxola para criar um nome bacana).
    * Ao iniciar, o programa irá criar uma nova conta no banco da equipe. Para isso ele deve perguntar qual o nome do cliente, o saldo inicial da conta, o tipo de conta (Corrente ou Poupança) e gerar de forma aleatória (random) um número de 4 dígitos para nossa conta.
    * Ao terminar de preencher os dados de abertura da conta, o nosso programa deverá mostrar um menu com as seguintes opções:
        * Listar extrato;
        * Realizar saque;
        * Depositar;
        * Adicionar limite de cheque especial (Deve pedir a senha do gerente);
        * Encerrar conta (Ao encerrar a conta, o usuário deve realizar o saque de todo o valor restante na conta e não pode estar devendo nada no cheque especial).

### 1.2 Considerações

* Uma conta poupança não tem limite;
* Tem bancos que permitem que o cliente ultrapasse o limite do cheque especial através de um controle interno; (Não é obrigatório);
* Ao terminar a primeira versão do programa vocês tem liberdade para incrementar o mesmo;
* Ideais de incremento:
    * Você pode criar uma classe banco que contém uma lista de contas, tornando assim seu programa capaz de operar sobre várias contas ao mesmo tempo;
    * Você pode criar a opção de transferência entre contas;
    * Você pode modelar a classe perfil e utilizá-la para controle. Os perfis necessários até o momento são (Cliente e Gerente);
    * Você pode dizer qual a data que foi realizado o saque e criar um extrato ordenado por data;
    * Você pode criar opções de extratos rápidos, como por exemplo (7, 15, 30, 60, 90) dias;
    * Você pode oferecer outras linhas de crédito, por exemplo empréstimos;
    * Você pode simular taxas de empréstimos e realizar cálculos de juros (Simples ou Composto);
    * Você pode oferecer cartão de crédito para o cliente e simular a quantidade de crédito ofertado;
    * Com cartão de crédito, acaba-se criando uma outra estrutura muito parecida com a de conta corrente, mas que tem outros detalhes, um deles por exemplo, é o fechamento da fatura (É praticamente um novo sistema);
    * Podem usar a criatividade para criar novas funcionalidades também.


### 1.3 O que é esperado ao final do exercício?

* Ao final do exercício é esperado que os alunos tenham tido a oportunidade de praticar os conceitos de POO aprendidos durante a semana. 

* Além disso, esse exercício será utilizado como modelo inicial da nossa avaliação semanal. Isso significa que cada um deverá implementar novas funcionalidades e entregar o exercício em seu GitHub.


## 2 - Exercícios

* Escolha uma das considerações e adicione no código implementado em aula hoje. Depois disso, suba a solução para o GitHub e compartilhe o link com os professores. Vocês tem até o dia 08/02;2021 para enviar as soluções.