package br.com.nakedbank.dao;

// Interface que representa as nossas consultas genericas em um banco de dados
public interface IDao<T> {

	public T save(T model) throws Exception;

	public T get(Object id) throws Exception;

	public T update(Object id, T model) throws Exception;

	public void delete(Object id) throws Exception;

}
