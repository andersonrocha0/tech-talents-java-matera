package br.com.nakedbank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.nakedbank.models.Conta;
import br.com.nakedbank.models.Transacao;

public class TransacaoDao extends AbstractDao implements IDaoNaoPermiteAlteracao<Transacao> {

	private ContaDao contaDao;

	public TransacaoDao(Connection conn) {
		super(conn);
		this.contaDao = new ContaDao(conn);
	}

	@Override
	public Transacao save(Transacao model) throws Exception {
		String query = "insert into contas.tb_transacao (data_transacao, valor, tipo, numero_conta) values (?, ?, ?, ?);";

		PreparedStatement insertTransacao = conn.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
		insertTransacao.setDate(1, model.getDataTransacao());
		insertTransacao.setFloat(2, model.getValor());
		insertTransacao.setString(3, model.getTipo());
		insertTransacao.setString(4, model.getConta().getNumero());

		this.saveSQL(insertTransacao, "numero_identificacao");

		return model;
	}

	@Override
	public Transacao get(Object numeroTransacao) throws Exception {
		String query = "select * from contas.tb_transacao where numero_identificacao = ?";

		PreparedStatement selectTransacao = conn.prepareStatement(query);
		selectTransacao.setString(1, (String) numeroTransacao);

		ResultSet rs = this.getSQL(selectTransacao);

		String numeroConta = rs.getString("numero_conta");

		Conta conta = this.contaDao.get(numeroConta);

		Transacao transacao = new Transacao(conta);

		transacao.setNumeroIdentificacao(rs.getInt("numero_identificacao"));
		transacao.setDataTransacao(rs.getDate("data_transacao"));
		transacao.setValor(rs.getFloat("valor"));
		transacao.setTipo(rs.getString("tipo"));

		rs.close();
		selectTransacao.close();

		return transacao;

	}

}
