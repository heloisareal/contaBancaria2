package com.br.banco;

public class Main {
    public static void main(String[] args) {
        try {
            // Testando a Conta Corrente
            System.out.println("Operações na Conta Corrente:");
            ContaCorrente cc = new ContaCorrente("12345", "João", 500, 100, 10);
            cc.depositar(200);
            cc.sacar(100);
            cc.sacar(700); // Excede saldo e limite
            cc.cobrarTaxaManutencao();
            cc.exibirSaldo();

            // Testando a Conta Poupança
            System.out.println("\nOperações na Conta Poupança:");
            ContaPoupanca cp = new ContaPoupanca("67890", "Maria", 1000, 5);
            cp.depositar(500);
            cp.sacar(300);
            cp.aplicarRendimento();
            cp.exibirSaldo();

            // Testando a Conta Salário
            System.out.println("\nOperações na Conta Salário:");
            ContaSalario cs = new ContaSalario("54321", "Carlos", 1000);
            cs.depositar(1000);
            cs.sacar(500);
            cs.sacar(200); // Não permitido
            cs.exibirSaldo();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
