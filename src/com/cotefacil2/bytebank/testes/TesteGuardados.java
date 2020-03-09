package com.cotefacil2.bytebank.testes;

import com.cotefacil2.bytebank.modelos.Conta;
import com.cotefacil2.bytebank.modelos.ContaCorrente;
import com.cotefacil2.bytebank.modelos.GuardadorDeContas;

public class TesteGuardados {

    public static void main(String[] args) {
        GuardadorDeContas guardador = new GuardadorDeContas();

        ContaCorrente cc = new ContaCorrente(22, 11);
        guardador.adiciona(cc);

        ContaCorrente cc2 = new ContaCorrente(22,22);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = guardador.getReferencia(0);
        System.out.println(ref.getNumero());



    }

}
