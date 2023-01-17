package Estudo;

public class Conta {



    int agencia;

    int numero;

    double saldo;


    public Conta(int i, int i1, int i2){

    }

    public void deposito(double valor){
        this.saldo += valor;
    }

    public void retirar(double valor){
        this.saldo -= valor;
    }

    public double getSaldo(double saldo){
        return this.saldo;
    }

    //Get numero
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    //Get Agencia
    public int getAgencia(){
        return agencia;
    }


    //Set Agencia
    public void setAgencia(int agencia){
        this.agencia = agencia;
    }

}
