package br.com.nakedbank.dao;

public interface IDaoUpdate<T, U> {

	public T update(U dto) throws Exception;

}
