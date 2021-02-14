package br.com.nakedbank;

import java.sql.Connection;

import br.com.nakedbank.config.DatabaseConnection;

public class Main {

	public static void main(String[] args) throws Exception {

		// Criando meu objeto de conexao com o banco de dados
		Connection connection = DatabaseConnection.connect();
		connection.setAutoCommit(false);

		Regras regras = new Regras(connection);

		try {
			regras.exibirMenu();
		} finally {
			connection.close();
		}

	}

}
