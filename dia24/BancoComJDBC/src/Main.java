import java.sql.Connection;

import br.com.nakedbank.config.DatabaseConnection;
import br.com.nakedbank.dao.ClienteDao;
import br.com.nakedbank.models.Cliente;

public class Main {

	public static void main(String[] args) throws Exception {

		Connection connection = DatabaseConnection.connect();

		// Vai ter toda a lógico do meu programa
		
		
		// Criando meu objeto de conexao com o banco de dados
		ClienteDao clienteDao = new ClienteDao(connection);
		
		// Exemplo de insert / create
		Cliente cliente = new Cliente();
		cliente.setCpf("25885214799");
		cliente.setEmail("dejairNaoEhJoao@hotmail.com");
		cliente.setNome("Dejair Nao Joao");
		cliente.setRenda(9000f);
		cliente.setRg("846529977");
		cliente.setTelefone("1988554477");
		clienteDao.save(cliente);

		// Exemplo de select / read
		Cliente clienteGet = clienteDao.get(1);
		System.out.println(clienteGet);

		// Exemplo de delete
		clienteDao.delete(1);

		

		// Exemplo de update
		Cliente clienteUpdate = clienteDao.get(12);
		clienteUpdate.setRenda(2000f);
		clienteDao.update(12, clienteUpdate);

		connection.close();
	}

}
