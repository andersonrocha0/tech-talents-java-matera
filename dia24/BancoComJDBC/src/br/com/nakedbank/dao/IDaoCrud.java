package br.com.nakedbank.dao;

// T será o objeto que iremos retornar do banco, o nosso modelo
// S será o tipo de dto usado no save
// U será o tipo de dto usado no update
// V será o tipo da nossa chave primária

public interface IDaoCrud<T, S, U, V> extends IDaoCreate<T, S>, IDaoRead<T, V>, IDaoUpdate<T, U>, IDaoDelete<V> {

}
