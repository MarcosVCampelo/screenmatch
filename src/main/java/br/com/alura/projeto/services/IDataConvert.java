package br.com.alura.projeto.services;

public interface IDataConvert {

     <T> T getData(String json, Class<T> tClass);
}
