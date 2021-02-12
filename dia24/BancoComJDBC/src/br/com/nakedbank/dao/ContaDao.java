package br.com.nakedbank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;

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
		String query = "update contas.tb_conta set cheque_especial = ?, status = ?, data_encerramento = ? where numero = ?;";

		PreparedStatement updateConta = conn.prepareStatement(query);
		updateConta.setFloat(1, model.getChequeEspecial());
		updateConta.setBoolean(2, model.getStatus());
		updateConta.setDate(3, model.getDataEncerramento());
		updateConta.setString(4, model.getNumero());

		this.updateSQL(updateConta);

		return model;
	}

	@Override
	public void delete(Object numero) throws Exception {
		String query = "delete from contas.tb_conta where codigo = ?;";

		PreparedStatement deleteConta = conn.prepareStatement(query);
		deleteConta.setString(1, (String) numero);

		this.deleteSQL(deleteConta);

	}

	public void encerraConta(String numeroConta, java.sql.Date dataEncerramento) throws Exception {
		String query = "update contas.tb_conta set status = ?, data_encerramento = ? where numero = ?;";

		java.sql.Date dataAtual = java.sql.Date.valueOf(LocalDate.now());

		PreparedStatement updateConta = conn.prepareStatement(query);
		updateConta.setBoolean(1, false);
		updateConta.setDate(2, dataAtual);
		updateConta.setString(3, numeroConta);

		this.updateSQL(updateConta);

	}

	public void alterarChequeEspecial(String numeroConta, Float novoChequeEspecial) throws Exception {
		String query = "update contas.tb_conta set cheque_especial = ? where numero = ?;";

		PreparedStatement updateConta = conn.prepareStatement(query);
		updateConta.setFloat(1, novoChequeEspecial);
		updateConta.setString(2, numeroConta);

		this.updateSQL(updateConta);

	}
	
	public void alterarSaldo(String numeroConta, Float valorTransacao) throws Exception {
		String query = "update contas.tb_conta set saldo = saldo + ? where numero = ?;";

		PreparedStatement updateConta = conn.prepareStatement(query);
		updateConta.setFloat(1, valorTransacao);
		updateConta.setString(2, numeroConta);

		this.updateSQL(updateConta);

	}

}
