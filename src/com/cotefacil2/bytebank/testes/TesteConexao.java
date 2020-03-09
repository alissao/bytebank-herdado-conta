package com.cotefacil2.bytebank.testes;

import com.cotefacil2.bytebank.modelos.Conexao;

public class TesteConexao {

    public static void main(String[] args) {

        try (Conexao conexao = new Conexao() ) {
            conexao.leDados();
        }catch (IllegalStateException ex) {
            System.out.println("Deu erro na conexao");
        }

        //----------------------------------------------

//        Conexao con = null;
//        try {
//            con = new Conexao();
//            con.leDados();
//        }catch (IllegalStateException ex) {
//            System.out.println("Deu erro na conexaoo");
//        }catch (Exception ex) {
//            System.out.println("Deu erro na conexaoo");
//        }finally { // try-catch é válido sem "catch" tbm, mas usando finally ao invés de catch
//            con.fecha();
//        }

    }

}
