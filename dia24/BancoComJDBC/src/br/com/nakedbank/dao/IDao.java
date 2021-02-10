package br.com.nakedbank.dao;

// Interface que representa as nossas consultas genericas em um banco de dados
public interface IDao<T> {

	public T save(T model);

	public T get(Object id);

	public T update(Object id, T model);

	public void delete(Object id);

}
