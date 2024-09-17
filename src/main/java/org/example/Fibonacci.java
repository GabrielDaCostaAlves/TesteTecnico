package org.example;


public abstract class Fibonacci {

    // Função que verifica se um número é quadrado
    private static boolean Quadrado(long n) {
        long raiz = (long) Math.sqrt(n);
        return (raiz * raiz == n);
    }

    // Função que verifica se um número é Fibonacci
    public static boolean eFibonacci(long n) {
        return Quadrado(5 * n * n + 4) || Quadrado(5 * n * n - 4);
    }


}


