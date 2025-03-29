package com.br.banco;

// Conta corrente extendendo para Conta Bancária (Classe Base)
public class ContaCorrente extends ContaBancaria {
    // Definindo Limite e taxa de Manutenção
    private double limite;
    private double taxaManutencao;

    // Construtor
    public ContaCorrente(String numeroConta, String titular, double saldoInicial, double limite, double taxaManutencao) {
        super(numeroConta, titular, saldoInicial);
        this.limite = limite;
        this.taxaManutencao = taxaManutencao;
    }

    // Método para sacar (com limite)
    @Override
    public void sacar(double valor) throws Exception {
        if (valor > 0 && (saldo + limite) >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            throw new Exception("Saque excede o saldo e o limite disponível!");
        }
    }

    // Método para cobrar taxa de manutenção
    public void cobrarTaxaManutencao() {
        saldo -= taxaManutencao;
        System.out.println("Taxa de manutenção de R$" + taxaManutencao + " cobrada.");
    }
}
