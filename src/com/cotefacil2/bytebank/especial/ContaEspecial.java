package com.cotefacil2.bytebank.especial;

import com.cotefacil2.bytebank.modelos.Conta;

/**
 *
 */

public class ContaEspecial extends Conta {

    public ContaEspecial(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        this.saldo += valor;
    }

    @Override
    public double getValorImposto() {
        return 0;
    }
}
