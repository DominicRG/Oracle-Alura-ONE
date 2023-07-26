package com.bytebank.modelo;

/**
 * Cuenta va crear nuevas instancias de cuenta corriente
 * @version 1.0
 * @author user
 */
public abstract class Cuenta {
    
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();
    private static int total = 0;
    
    /**
     * Instancia una cuenta usando agencia y numero.
     * @param agencia
     * @param numero 
     */
    public Cuenta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estoy creando una cuenta");
        
        Cuenta.total++;
    }
    
    public Cuenta(int agencia){
        
        if(agencia <= 0){
            System.out.println("No se permite 0");
            this.agencia = 1;
        }else{
            this.agencia =  agencia;
        }
        total++;
        System.out.println("Se van crendo: "+total+" cuentas");
    }
    
    public abstract void depositar(double saldo);
    
    /**
     * Este metodo retira dinero de la cuenta.
     * @param valor
     * @return 
     */
    public boolean retirar(double valor){
        if(this.saldo >=  valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean transferir(double valor, Cuenta cuenta){
        if(this.saldo >=  valor){
            this.retirar(valor);
            cuenta.depositar(valor);
            return true;
        }else{
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return total;
    }

    @Override
    public String toString() {
        String cuenta = "Numero: " + this.numero + ", Agencia: " + this.agencia;
        return cuenta;
    }
       
}
