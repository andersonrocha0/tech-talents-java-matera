import java.sql.Connection;

import br.com.nakedbank.config.DatabaseConnection;
import br.com.nakedbank.dao.ClienteDao;
import br.com.nakedbank.models.Cliente;

public class Main {

	public static void main(String[] args) throws Exception {

		Connection connection = DatabaseConnection.connect();

		// Vai ter toda a lógico do meu programa

		// ClienteDao clienteDao = new ClienteDao(connection);
		// Cliente cliente = clienteDao.get(1);

		// clienteDao.delete(1);

		// System.out.println(cliente);

		connection.close();
	}

}
