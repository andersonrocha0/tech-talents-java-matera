package br.com.nakedbank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;

import br.com.nakedbank.dtos.TransacaoDto;
import br.com.nakedbank.models.Conta;
import br.com.nakedbank.models.Transacao;

public class TransacaoDao extends AbstractDao<Integer>
		implements IDaoCreate<Transacao, TransacaoDto>, IDaoRead<Transacao, Integer> {

	private ContaDao contaDao;

	public TransacaoDao(Connection conn) {
		super(conn);
		this.contaDao = new ContaDao(conn);
	}

	@Override
	public Transacao save(TransacaoDto dto) throws Exception {
		String query = "insert into contas.tb_transacao (data_transacao, valor, tipo, numero_conta) values (?, ?, ?, ?);";

		int i = 1;

		java.sql.Date dataAtual = java.sql.Date.valueOf(LocalDate.now());

		PreparedStatement insertTransacao = conn.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
		insertTransacao.setDate(i++, dataAtual);
		insertTransacao.setFloat(i++, dto.getValor());
		insertTransacao.setString(i++, dto.getTipo());
		insertTransacao.setString(i++, dto.getNumeroDaConta());

		int numeroIdentificacao = this.saveSQL(insertTransacao, "numero_identificacao");

		return this.get(numeroIdentificacao);
	}

	@Override
	public Transacao get(Integer numeroIdentificacao) throws Exception {
		String query = "select * from contas.tb_transacao where numero_identificacao = ?";

		PreparedStatement selectTransacao = conn.prepareStatement(query);
		selectTransacao.setInt(1, numeroIdentificacao);

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
