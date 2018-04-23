package main;

@FunctionalInterface
interface Validar<T> {

    boolean valida(T t);
}
