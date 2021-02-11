package br.com.nakedbank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public abstract class AbstractDao {

	protected Connection conn;

	public AbstractDao(Connection conn) {
		super();
		this.conn = conn;
	}

	public Object saveSQL(PreparedStatement insert, String chavePrimaria) throws Exception {

		insert.executeUpdate();

		ResultSet rsCodigo = insert.getGeneratedKeys();
		rsCodigo.next();
		Object obj = rsCodigo.getObject(chavePrimaria);
		rsCodigo.close();
		insert.close();

		return obj;
	}

	public ResultSet getSQL(PreparedStatement get) throws Exception {
		ResultSet rs = get.executeQuery();
		rs.next();
		return rs;
	}

	public void updateSQL(PreparedStatement update) throws Exception {
		update.executeUpdate();
		update.close();
	}

	public void deleteSQL(PreparedStatement delete) throws Exception {
		delete.executeUpdate();
		delete.close();
	}

}
