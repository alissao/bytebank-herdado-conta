package com.cotefacil2.bytebank.testes;



public class TesteString {

    public static void main(String[] args) {

        int a = 3;
        String nome = "Alura"; //object literal
        String outro = new String("Alura");

        nome.replace("A", "a");

        nome.toLowerCase();
        String outra = nome.toLowerCase();

        System.out.println(nome.replace("A", "a"));
        System.out.println(nome);
        System.out.println(outra);

    }

}
