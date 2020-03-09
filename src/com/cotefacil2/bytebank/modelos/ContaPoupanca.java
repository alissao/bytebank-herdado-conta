package com.cotefacil2.bytebank.modelos;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public double getValorImposto() {
        return 0.005;
    }

    @Override
    public String toString() {
        return "ContaPoupanca, " + super.toString();
    }
}
