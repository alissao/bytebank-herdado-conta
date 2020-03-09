package com.cotefacil2.bytebank.modelos;


/**
 * Representa a especificação de uma conta.
 *
 * @author Alisson H.
 */
public abstract class Conta implements Tributavel {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

//    public Conta() {
//
//    }

    public Conta(int agencia, int numero) {
        //Construtor. Pode-se inicializar alguns atributos neste método.
        this.agencia = agencia;
        this.numero = numero;
//        this.saldo = 100;
        System.out.println("Estou criando uma conta com o número:" + this.numero);
    }

    public abstract void deposita(double valor);


    /**
     * Método para sacar o dinheiro na conta.
     * @param valor
     * @throws SaldoInsuficienteException
     */
    public void saca(double valor) throws SaldoInsuficienteException{

        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        }

        this.saldo -= valor;

    }

    public void transfere(double valor, Conta destino) {
        try {
            this.saca(valor);
        } catch (Exception e) {
            System.out.println();
        }

        destino.deposita(valor);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("O número não pode ser menor/igual a 0.");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("A agência não pode ser menor/igual a 0.");
            return;
        }
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Conta.total;
    }

    public static void setTotal(int total) {
        Conta.total = total;
    }

    @Override
    public boolean equals(Object ref) {

        Conta outra = (Conta) ref;

        if (this.agencia != outra.agencia) {return false;}
        if (this.numero == outra.numero) {return false;}
        return true;
    }

    @Override
    public String toString() {
        return "Número: " + this.getNumero();
    }
}
