package br.com.nakedbank;
import java.sql.Connection;

import br.com.nakedbank.config.DatabaseConnection;
import br.com.nakedbank.dao.ClienteDao;
import br.com.nakedbank.dao.ContaDao;
import br.com.nakedbank.models.Cliente;
import br.com.nakedbank.models.Conta;

public class Main {

	public static void main(String[] args) throws Exception {

		// Criando meu objeto de conexao com o banco de dados
		Connection connection = DatabaseConnection.connect();

		// Vai ter toda a lógico do meu programa

		// Criando meu objeto DAO que fará a interação entre a tabela e o modelo
		ClienteDao clienteDao = new ClienteDao(connection);
		ContaDao contaDao = new ContaDao(connection);
		// Exemplos:

		// Exemplo de insert / create
//		Cliente cliente = new Cliente();
//		cliente.setCpf("25885214797");
//		cliente.setEmail("dinhoOuroPreto@hotmail.com");
//		cliente.setNome("Dinho Ouro Preto");
//		cliente.setRenda(25000f);
//		cliente.setRg("846529955");
//		cliente.setTelefone("1988554411");
//		clienteDao.save(cliente);

		// Exemplo de select / read
//		Cliente clienteGet = clienteDao.get(1);
//		System.out.println(clienteGet);
		
		Conta contaGet = contaDao.get("2000");
		System.out.println(contaGet);

		// Exemplo de update
//		Cliente clienteUpdate = clienteDao.get(12);
//		clienteUpdate.setRenda(2000f);
//		clienteDao.update(12, clienteUpdate);

		// Exemplo de delete
//		clienteDao.delete(1);

		connection.close();
	}

}
