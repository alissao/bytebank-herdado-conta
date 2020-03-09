package com.cotefacil2.bytebank.testes;



public class TesteString {

    public static void main(String[] args) {

        int a = 3;
        String nome = "Alura"; //object literal
        String outro = new String("Alura");

        nome.replace("A", "a");

        nome.toLowerCase();
        String outra = nome.toLowerCase();

        char c = nome.charAt(0);
        int pos = nome.indexOf("ur");

        String vazio = "";
        String outroVazio = vazio.trim();

        String trimExemplo = "          Alura               ";
        String mostrandoTrim = trimExemplo.trim();

        //-------------------------------Impressões abaixo------------------------------------------------

        System.out.println(nome.replace("A", "a"));
        System.out.println(nome);
        System.out.println(outra);

        System.out.println("Imprimindo char atribuindo através do 'charAt()': " + c);
        System.out.println("Imprimindo index de 'ur' em 'Alura': " + pos);

        for (int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }

        System.out.println(vazio.isEmpty());
        System.out.println(outroVazio.isEmpty());
        System.out.println(outroVazio.isBlank());

        System.out.println(trimExemplo);
        System.out.println(mostrandoTrim);

    }

}
