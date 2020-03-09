package com.cotefacil2.bytebank.testes;

import com.cotefacil2.bytebank.modelos.Conta;

public class GuardadorDeReferencias {

    private Object[] referencias;
    private int posicaoLivre;

    public GuardadorDeReferencias() {
        this.referencias = new Object[10];
        this.posicaoLivre = 0;
    }

    public void adiciona(Conta ref) {
        this.referencias[this.posicaoLivre] = ref;
        posicaoLivre++;
    }

    public int getQuantidadeDeElementos() {
        return this.posicaoLivre;
    }

    public Object getReferencia(int position) {
        return this.referencias[position];
    }

}
