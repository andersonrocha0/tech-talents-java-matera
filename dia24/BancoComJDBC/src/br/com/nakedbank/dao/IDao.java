package br.com.nakedbank.dao;

// Interface que representa as nossas consultas genericas em um banco de dados
public interface IDao<T> extends IDaoNaoPermiteAlteracao<T> {

	public T update(Object id, T model) throws Exception;

	public void delete(Object id) throws Exception;

}
