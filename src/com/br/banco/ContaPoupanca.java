package com.br.banco;

// Conta poupança que se extende a Conta Bancária (Classe Base)
public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    // Construtor
    public ContaPoupanca(String numeroConta, String titular, double saldoInicial, double taxaRendimento) {
        super(numeroConta, titular, saldoInicial);
        this.taxaRendimento = taxaRendimento;
    }

    // Método para aplicar rendimento
    public void aplicarRendimento() {
        double rendimento = saldo * (taxaRendimento / 100);
        saldo += rendimento;
        System.out.println("Rendimento de " + taxaRendimento + "% aplicado. Novo saldo: R$" + saldo);
    }
}
