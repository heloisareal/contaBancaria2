# Relatório do Projeto: Sistema Bancário com Herança
- Heloísa Real - 554535 - 2ESR - Java 

## 1. Introdução
O presente relatório tem como objetivo descrever o desenvolvimento de um projeto de Sistema Bancário utilizando Java. Esse projeto tem como foco a aplicação do conceito de **herança**, um dos pilares da Programação Orientada a Objetos (POO). Através da herança, criamos uma classe base `ContaBancaria` que é reutilizada pelas classes derivadas, como `ContaCorrente`, `ContaPoupanca` e `ContaSalario`, para modelar diferentes tipos de contas bancárias e suas funcionalidades específicas.

## 2. Objetivo do Projeto
Criar um sistema bancário que simula operações em diferentes tipos de contas bancárias, permitindo:
- Criar uma conta bancária com um titular e saldo inicial.
- Realizar depósitos e saques, com regras específicas para cada tipo de conta.
- Consultar o saldo da conta.
- Aplicar funcionalidades específicas para cada tipo de conta (como taxa de manutenção, rendimento, ou limite de saques).

## 3. Implementação
O sistema foi desenvolvido em **Java** e dividido em duas partes principais:

### 3.1. Classe `ContaBancaria`
A classe `ContaBancaria` representa a estrutura básica de uma conta bancária e contém os seguintes atributos e métodos:
- **Atributos (privados)**:
  - `numeroConta` (do tipo `String`): Armazena o número da conta bancária.
  - `titular` (do tipo `String`): Armazena o nome do titular da conta.
  - `saldo` (do tipo `double`): Armazena o saldo atual da conta.

- **Métodos:**
  - `depositar(double valor)`: Permite adicionar um valor ao saldo.
  - `sacar(double valor)`: Realiza um saque, desde que haja saldo suficiente.
  - `exibirSaldo()`: Exibe o saldo atual da conta.

### 3.2. Classes Derivadas
- **`ContaCorrente`**:
  - Herda de `ContaBancaria`.
  - Permite saques com limite adicional e cobra uma taxa de manutenção.
  
- **`ContaPoupanca`**:
  - Herda de `ContaBancaria`.
  - Aplica rendimento mensal ao saldo.
  
- **`ContaSalario`**:
  - Herda de `ContaBancaria`.
  - Permite apenas um saque por mês e não cobra taxa.

### 3.3. Classe `Main`
A classe `Main` é responsável por testar o funcionamento do sistema. Ela executa as seguintes operações:
1. Cria uma conta bancária para um titular.
2. Realiza operações de depósito e saque nas contas.
3. Exibe o saldo atual após as operações.
4. Demonstra o comportamento específico de cada tipo de conta.

## 4. Herança Aplicada
A herança foi utilizada para reutilizar o código da classe `ContaBancaria` e estender suas funcionalidades nas classes derivadas. A implementação seguiu os seguintes princípios:

- **Reutilização de Código:**
  - A classe `ContaBancaria` possui métodos comuns a todas as contas, como `depositar()`, `sacar()` e `exibirSaldo()`. As classes derivadas reutilizam esses métodos e acrescentam funcionalidades específicas.
  
- **Polimorfismo:**
  - O método `sacar()` foi sobrescrito nas classes derivadas para comportamentos específicos de cada tipo de conta, como a aplicação de limites ou restrições de saques.

- **Regras de Negócio Implementadas:**
  - A `ContaCorrente` implementa o limite de saque e cobra uma taxa de manutenção.
  - A `ContaPoupanca` aplica um rendimento mensal.
  - A `ContaSalario` limita os saques a um por mês.

## 5. Conclusão
O projeto permitiu a aplicação prática do conceito de **herança** e **polimorfismo** em Java, utilizando a Programação Orientada a Objetos (POO) para criar um sistema bancário que simula operações de contas correntes, poupanças e salários. 

A herança garantiu a reutilização de código e a especialização de comportamentos através das classes derivadas, enquanto o polimorfismo permitiu a personalização das operações bancárias. Esse modelo torna o sistema mais modular e fácil de manter.

Além disso, o uso de boas práticas de codificação e o tratamento de exceções garantiram que o sistema seja robusto, evitando falhas em operações bancárias.

## 6. Exemplos de Execução

### Operações na Conta Corrente:
- Depósito de R$200.0 realizado com sucesso.
- Saque de R$100.0 realizado com sucesso.
- Saque excede o saldo e o limite disponível!
- Taxa de manutenção de R$10.0 cobrada.
- Saldo atual: R$590.0

### Operações na Conta Poupança:
- Depósito de R$500.0 realizado com sucesso.
- Saque de R$300.0 realizado com sucesso.
- Rendimento de 5.0% aplicado. Novo saldo: R$1260.0
- Saldo atual: R$1260.0

### Operações na Conta Salário:
- Depósito de R$1000.0 realizado com sucesso.
- Saque de R$500.0 realizado com sucesso.
- Saque não permitido. Limite de um saque por mês já atingido.
- Saldo atual: R$2500.0
