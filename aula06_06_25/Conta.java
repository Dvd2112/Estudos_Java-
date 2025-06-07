package aula06_06_25;

import aula08_05_25.Cliente;

public class Conta {
    private double saldo;
    private Cliente cliente;


    public void depositar(double valor) {
        if (valor >= 0 && valor < 1000) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor){
        if(valor <= saldo && valor > 0){
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        }else {
            System.out.println("Valor inválido para saque.");
        }
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(double saldo){
        return saldo;
    }
    
}
