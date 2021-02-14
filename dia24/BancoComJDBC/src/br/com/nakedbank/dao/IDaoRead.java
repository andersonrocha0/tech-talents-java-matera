package br.com.nakedbank.dao;

public interface IDaoRead<T, V> {

	public T get(V id) throws Exception;

}
