package com.cotefacil2.bytebank.testes.util;

import java.util.ArrayList;
import java.util.List;

public class TesteReferenciasPrimitivos {

    public static void main(String[] args) {

        int[] idades = new int[5];
        String[] nomes = new String[5];

        int idade = 29;

        Integer idadeRef = Integer.valueOf(29); //Autoboxing
        int valor = idadeRef.intValue(); // Unboxing

        System.out.println(idadeRef.doubleValue());
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);

        String s = args[0]; //"10"

//        Integer numero = Integer.valueOf(s); //Parsing
        int numero = Integer.parseInt(s);
        System.out.println(numero);

        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29); //Autoboxing


    }

}
