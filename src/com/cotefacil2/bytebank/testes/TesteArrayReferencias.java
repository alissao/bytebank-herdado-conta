package com.cotefacil2.bytebank.testes;

import com.cotefacil2.bytebank.modelos.Conta;
import com.cotefacil2.bytebank.modelos.ContaCorrente;
import com.cotefacil2.bytebank.modelos.ContaPoupanca;

public class TesteArrayReferencias {

    public static void main(String[] args) {
        //int[] idade = new idade[5];
        Object[] contas = new Object[5];
        ContaCorrente cc1 = new ContaCorrente(22,11);
        contas[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(22, 22);
        contas[1] = cc2;

//        System.out.println(contas[1].getNumero());

        /*
        Aqui abaixo o compilador reclama sobre tipos de dados.
        Não se pode olocar um genérico dentro de um específico.
        Colocamos então um typecast.
         */
        ContaPoupanca ref = (ContaPoupanca) contas[1]; //type cast

        System.out.println(ref.getNumero());
        System.out.println(cc2.getNumero());
//        System.out.println(contas[1].getNumero());

    }

}
