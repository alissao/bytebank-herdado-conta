package com.cotefacil2.bytebank.testes;

import com.cotefacil2.bytebank.modelos.Conta;
import com.cotefacil2.bytebank.modelos.ContaCorrente;
import com.cotefacil2.bytebank.modelos.SaldoInsuficienteException;

public class TesteSaca {

    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123, 321);

        conta.deposita(200.0);

        try {
            conta.saca(210.0);
        } catch (SaldoInsuficienteException ex) {
            System.out.println("Ex: " + ex.getMessage());
        }

        System.out.println(conta.getSaldo());

    }

}
