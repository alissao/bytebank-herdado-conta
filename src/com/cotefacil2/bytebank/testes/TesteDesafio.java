package com.cotefacil2.bytebank.testes;

public class TesteDesafio {

    public static void main(String[] args) {

        String x = "762";

//        char c = '3';
//        int i = c - '0';

        int f = (x.charAt(x.length()-1)) - '0' + (((x.charAt(x.length()-2)) - '0') * 10) +
                (((x.charAt(x.length()-3)) - '0') * 100);

        System.out.println(f);

    }

}
