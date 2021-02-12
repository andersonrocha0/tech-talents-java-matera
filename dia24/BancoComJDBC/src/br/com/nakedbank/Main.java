package br.com.nakedbank;

import java.sql.Connection;

import br.com.nakedbank.config.DatabaseConnection;
import br.com.nakedbank.models.Conta;

public class Main {

	public static void main(String[] args) throws Exception {

		// Criando meu objeto de conexao com o banco de dados
		Connection connection = DatabaseConnection.connect();

		Regras regras = new Regras(connection);

		/*Conta conta = regras.criarContaCorrente(
			"Não Sei Gente 2", 
			"85247966687",
			"452142", 
			2800f, 
			"87999985522",
			"nao-sei-gente2@hotmail.com",
			"2002"
		);

		System.out.println(conta);*/
		
		regras.adiconarTransacao(-1000f, "1000", "TRANSFERENCIA_SAIDA");
		regras.adiconarTransacao(1000f, "2002", "TRANSFERENCIA_ENTRADA");

		connection.close();
	}

}
