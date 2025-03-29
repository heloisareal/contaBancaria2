package com.br.banco;

// Classe Base
public class ContaBancaria {
    protected String numeroConta;
    protected String titular;
    protected double saldo;

    // Construtor
    public ContaBancaria(String numeroConta, String titular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método para depositar valor
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para sacar valor
    public void sacar(double valor) throws Exception {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            throw new Exception("Saldo insuficiente ou valor inválido.");
        }
    }

    // Método para exibir o saldo
    public void exibirSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }
}
