package br.com.nakedbank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// V é o tipo da chave primária

public abstract class AbstractDao<V> {

	protected Connection conn;

	public AbstractDao(Connection conn) {
		this.conn = conn;
	}

	public V saveSQL(PreparedStatement insert, String chavePrimaria) throws Exception {

		insert.executeUpdate();

		ResultSet rsCodigo = insert.getGeneratedKeys();
		rsCodigo.next();
		V obj = (V) rsCodigo.getObject(chavePrimaria);
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
