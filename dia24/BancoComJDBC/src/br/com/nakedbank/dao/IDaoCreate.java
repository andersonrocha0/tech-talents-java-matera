package br.com.nakedbank.dao;

public interface IDaoCreate<T, S> {

	public T save(S dto) throws Exception;

}
