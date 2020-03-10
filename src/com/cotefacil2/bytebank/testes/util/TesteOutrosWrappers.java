package com.cotefacil2.bytebank.testes.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

    public static void main(String[] args) {

        Integer idadeRef = Integer.valueOf(29); //autoboxing
        System.out.println(idadeRef.doubleValue()); //unboxing

        Double dRef = Double.valueOf(3.2); //autoboxing
        System.out.println(dRef.doubleValue()); //unboxing

        Boolean bRef = Boolean.TRUE; //autoboxing
//        Boolean bRef = true; //valor primitivo do boolean
        System.out.println(bRef.booleanValue()); //unboxing

        Number refNumero = Float.valueOf(29.9f);
        refNumero.byteValue();

        List<Number> lista = new ArrayList<>();
        lista.add(10);
        lista.add(32.6);
        lista.add(25.6f);

    }

}
