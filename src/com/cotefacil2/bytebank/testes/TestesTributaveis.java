package com.cotefacil2.bytebank.testes;

import com.cotefacil2.bytebank.modelos.CalculadorImposto;
import com.cotefacil2.bytebank.modelos.ContaCorrente;
import com.cotefacil2.bytebank.modelos.SeguroVida;

public class TestesTributaveis {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(100.0);

        SeguroVida seguro = new SeguroVida();

        CalculadorImposto calc = new CalculadorImposto();
        calc.registra(cc);
        calc.registra(seguro);

        System.out.println(calc.getTotalImposto());

    }

}
