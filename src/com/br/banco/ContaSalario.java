package com.br.banco;

// Conta salario que extende a ContaBancária (Classe Base)
public class ContaSalario extends ContaBancaria {
    private int saquesRealizados;

    // Construtor
    public ContaSalario(String numeroConta, String titular, double saldoInicial) {
        super(numeroConta, titular, saldoInicial);
        this.saquesRealizados = 0;
    }

    // Método para sacar (limite de 1 saque por mês)
    @Override
    public void sacar(double valor) throws Exception {
        if (saquesRealizados < 1 && valor <= saldo) {
            saldo -= valor;
            saquesRealizados++;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            throw new Exception("Saque não permitido. Limite de um saque por mês já atingido.");
        }
    }
}
