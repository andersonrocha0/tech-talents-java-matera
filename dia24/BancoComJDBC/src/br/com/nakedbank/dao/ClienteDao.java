package br.com.nakedbank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.nakedbank.dtos.AberturaDeContaDto;
import br.com.nakedbank.models.Cliente;

public class ClienteDao extends AbstractDao<Integer>
		implements IDaoCreate<Cliente, AberturaDeContaDto>, IDaoRead<Cliente, Integer> {

	public ClienteDao(Connection conn) {
		super(conn);
	}

	@Override
	public Cliente save(AberturaDeContaDto aberturaDeContaDto) throws Exception {
		String query = "insert into contas.tb_cliente (nome, cpf, rg, renda, telefone, email) values (?, ?, ?, ?, ?, ?);";

		int i = 1;

		PreparedStatement insertCliente = conn.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
		insertCliente.setString(i++, aberturaDeContaDto.getNome());
		insertCliente.setString(i++, aberturaDeContaDto.getCpf());
		insertCliente.setString(i++, aberturaDeContaDto.getRg());
		insertCliente.setFloat(i++, aberturaDeContaDto.getRenda());
		insertCliente.setString(i++, aberturaDeContaDto.getTelefone());
		insertCliente.setString(i++, aberturaDeContaDto.getEmail());

		int codigo = this.saveSQL(insertCliente, "codigo");

		aberturaDeContaDto.setCodigoCliente(codigo);

		return this.get(codigo);

	}

	@Override
	public Cliente get(Integer codigo) throws Exception {
		String query = "select * from contas.tb_cliente where codigo = ?";

		PreparedStatement selectCliente = conn.prepareStatement(query);
		selectCliente.setInt(1, codigo);

		ResultSet rs = this.getSQL(selectCliente);

		Cliente cliente = new Cliente();

		cliente.setCodigo(rs.getInt("codigo"));
		cliente.setNome(rs.getString("nome"));
		cliente.setCpf(rs.getString("cpf"));
		cliente.setRg(rs.getString("rg"));
		cliente.setRenda(rs.getFloat("renda"));
		cliente.setTelefone(rs.getString("telefone"));
		cliente.setEmail(rs.getString("email"));

		rs.close();
		selectCliente.close();

		return cliente;
	}

}
