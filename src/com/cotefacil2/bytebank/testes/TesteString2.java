package com.cotefacil2.bytebank.testes;

import com.cotefacil2.bytebank.modelos.Cliente;
import com.cotefacil2.bytebank.modelos.Conta;
import com.cotefacil2.bytebank.modelos.ContaCorrente;
import com.cotefacil2.bytebank.modelos.ContaPoupanca;

public class TesteString2 {

    public static void main(String[] args) {

        System.out.println("x");
        System.out.println(3);
        System.out.println(false);


        ContaCorrente cc = new ContaCorrente(22,33);
        ContaPoupanca cp = new ContaPoupanca(33,22);
        Cliente cli = new Cliente();

        System.out.println(cc);
        System.out.println(cp);

        println(cp);

//        println(cli);

    }

    static void println () {};

    static void println (int a) {};

    static void println (boolean valor) {};

    //A classe conta foi eu quem criei. Logo, o método println não suporta o argumento da minha classe.
    //Mas é fácil de resolver isso através de uma sobrecarga, como mostrado abaixo.
    static void println (Conta conta) {};




}
