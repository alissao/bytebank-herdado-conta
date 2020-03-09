package com.cotefacil2.bytebank.testes.util;

import com.cotefacil2.bytebank.modelos.Conta;
import com.cotefacil2.bytebank.modelos.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {

    public static void main(String[] args) {

        //Generics

        ArrayList<Conta> lista = new ArrayList<Conta>();

        ArrayList<String> nomes = new ArrayList<String>();

        ContaCorrente cc = new ContaCorrente(22, 11);
//        Cliente cliente = new Cliente();
//        lista.add(cliente);
        lista.add(cc);

        ContaCorrente cc2 = new ContaCorrente(22,22);
        lista.add(cc2);

        ContaCorrente cc3 = new ContaCorrente(22,33);

        boolean existe = lista.contains(cc3);

        boolean igual = cc.equals(cc2);

        System.out.println("Já existe? " + existe);

        for (Conta conta : lista) {
            System.out.println(conta);
        }
        for (Conta conta : lista) {
            System.out.println(conta);
        }

    }

}
