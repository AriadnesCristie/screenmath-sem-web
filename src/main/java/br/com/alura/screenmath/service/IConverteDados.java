package br.com.alura.screenmath.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
