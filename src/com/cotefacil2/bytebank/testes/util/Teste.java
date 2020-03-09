package com.cotefacil2.bytebank.testes.util;

import com.cotefacil2.bytebank.modelos.Cliente;
import com.cotefacil2.bytebank.modelos.Conta;
import com.cotefacil2.bytebank.modelos.ContaCorrente;

import java.util.ArrayList;
import java.util.LinkedList;

public class Teste {

    public static void main(String[] args) {

        LinkedList<Conta> lista = new LinkedList<Conta>();

        ArrayList<String> nomes = new ArrayList<String>();

        ContaCorrente cc = new ContaCorrente(22, 11);
//        Cliente cliente = new Cliente();
//        lista.add(cliente);
        lista.add(cc);

        ContaCorrente cc2 = new ContaCorrente(22,22);
        lista.add(cc2);

        System.out.println(lista.size());

        Conta ref = (Conta) lista.get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);

        System.out.println("Tamanho: " + lista.size());

        ContaCorrente cc3 = new ContaCorrente(22, 33);
        lista.add(cc3);

        ContaCorrente cc4 = new ContaCorrente(22,44);
        lista.add(cc4);

        for (int i = 0; i < lista.size(); i++) {
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }

        System.out.println("---------------------------");

        for (Conta conta : lista) {
            System.out.println(conta);
        }
    }

}
