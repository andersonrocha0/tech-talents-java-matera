package br.com.nakedbank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.nakedbank.models.Cliente;
import br.com.nakedbank.models.Conta;

public class ContaDao extends AbstractDao implements IDao<Conta> {

	private ClienteDao clienteDao;

	public ContaDao(Connection conn) {
		super(conn);
		this.clienteDao = new ClienteDao(conn);
	}

	@Override
	public Conta save(Conta model) throws Exception {
		String query = "insert into contas.tb_conta (numero, saldo, cheque_especial, status, data_abertura, data_encerramento, codigo_cliente) values (?, ?, ?, ?, ?, ?, ?);";

		PreparedStatement insertConta = conn.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
		insertConta.setString(1, model.getNumero());
		insertConta.setFloat(2, model.getSaldo());
		insertConta.setFloat(3, model.getChequeEspecial());
		insertConta.setBoolean(4, model.getStatus());
		insertConta.setDate(5, model.getDataAbertura());
		insertConta.setDate(6, model.getDataEncerramento());
		insertConta.setInt(7, model.getCliente().getCodigo());

		this.saveSQL(insertConta, "numero");

		return model;
	}

	@Override
	public Conta get(Object numero) throws Exception {
		String query = "select * from contas.tb_conta where numero = ?";

		PreparedStatement selectConta = conn.prepareStatement(query);
		selectConta.setString(1, (String) numero);

		ResultSet rs = this.getSQL(selectConta);

		Integer codigoCliente = rs.getInt("codigo_cliente");

		Cliente cliente = this.clienteDao.get(codigoCliente);

		Conta conta = new Conta(cliente);

		conta.setNumero(rs.getString("numero"));
		conta.setSaldo(rs.getFloat("saldo"));
		conta.setChequeEspecial(rs.getFloat("cheque_especial"));
		conta.setStatus(rs.getBoolean("status"));
		conta.setDataAbertura(rs.getDate("data_abertura"));
		conta.setDataEncerramento(rs.getDate("data_encerramento"));

		rs.close();
		selectConta.close();

		return conta;
	}

	@Override
	public Conta update(Object id, Conta model) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Object id) throws Exception {
		// TODO Auto-generated method stub

	}

}
