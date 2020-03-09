package com.cotefacil2.bytebank.testes;

import com.cotefacil2.bytebank.modelos.Conta;
import com.cotefacil2.bytebank.modelos.MinhaExcecao;

public class TestaContaComExcecaoChecked {

    public static void main(String[] args) {

        Conta c = new Conta(321, 564) {
            @Override
            public double getValorImposto() {
                return 0;
            }

            @Override
            public void deposita(double valor) {

            }
        };
        try {
            c.deposita(500.00);
        } catch(MinhaExcecao ex) {
            System.out.println("tratamento ....");
        }

    }

}
