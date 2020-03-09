package com.cotefacil2.bytebank.modelos;

/**
 * Classe que representa uma exceção de Saldo.
 *
 * @author Alisson H.
 * @version 0.1
 */


public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException(String msg) {
        super(msg);
    }

}
