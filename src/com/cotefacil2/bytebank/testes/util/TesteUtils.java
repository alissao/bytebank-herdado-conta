package com.cotefacil2.bytebank.testes.util;

import com.cotefacil2.bytebank.modelos.Cliente;
import com.cotefacil2.bytebank.modelos.Conta;
import com.cotefacil2.bytebank.modelos.ContaCorrente;
import com.cotefacil2.bytebank.modelos.ContaPoupanca;

import java.util.*;
import java.util.function.Consumer;

public class TesteUtils {

    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        for (Conta conta : lista) {
            System.out.println(conta.toString());
        }

        NumeroDaContaComparator numComp = new NumeroDaContaComparator();
        TitularDaContaComparator tituComp = new TitularDaContaComparator();

        lista.sort(tituComp);
//        lista.sort(new Comparator<Conta>() { //**********ISSO É UMA CLASSE ANÔNIMA.
//            @Override
//            public int compare(Conta c1, Conta c2) {
//                if (c1.getNumero() < c2.getNumero()){
//                    return -1;
//                }
//                if (c1.getNumero() > c2.getNumero()){
//                    return 1;
//                }
//
//                return 0;
//            }
//        });
        lista.
            sort( (Conta c1, Conta c2) -> { //****** ISSO É UMA LAMBDA EXPRESSION
                if (c1.getNumero() < c2.getNumero()){
                    return -1;
                }
                if (c1.getNumero() > c2.getNumero()){
                    return 1;
                }

                return 0;
            }
        );

//        //****** ISSO É UMA LAMBDA EXPRESSION TAMBÉM
//        lista.sort( (c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));
//        lista.sort(numComp);

        Collections.sort(lista, new NumeroDaContaComparator());

        System.out.println("-------------------Após ordenação---------------");

//        for (Conta conta : lista) {
//            System.out.println(conta);
//        }

        lista.forEach((Conta conta) -> System.out.println(conta));

        Collections.rotate(lista, 1);

        System.out.println("-------------------Após rotação---------------");

        lista.forEach((Conta conta) -> System.out.println(conta));
    }

    Integer

}

class NumeroDaContaComparator implements Comparator<Conta> {
    @Override
    public int compare(Conta c1, Conta c2) {
        if (c1.getNumero() < c2.getNumero()){
            return -1;
        }
        if (c1.getNumero() > c2.getNumero()){
            return 1;
        }

        return 0;
    }
}

class TitularDaContaComparator implements Comparator<Conta> {
    @Override
    public int compare(Conta c1, Conta c2) {
        String nomeC1 = c1.getTitular().getNome();
        String nomeC2 = c2.getTitular().getNome();
        return nomeC1.compareTo(nomeC2);
    }
}