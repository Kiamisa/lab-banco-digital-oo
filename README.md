## Banco digital

Este projeto é uma implementação simples de um sistema bancário que gerencia dois tipos de contas: Conta Corrente e Conta Poupança. O sistema permite que clientes realizem operações básicas como depósito, saque e transferência entre contas. A arquitetura do sistema segue os princípios da Programação Orientada a Objetos (POO) em Java.

Funcionalidades
Depósito: Permite adicionar fundos a uma conta.
Saque: Permite retirar fundos de uma conta, respeitando o saldo disponível.
Transferência: Permite transferir fundos entre contas da mesma instituição.
Criação de Clientes e Contas: Os clientes podem ter tanto uma conta corrente quanto uma conta poupança.
Estrutura do Projeto
O projeto é composto pelas seguintes classes:

IConta: Interface que define as operações básicas que uma conta deve implementar (depositar, sacar, transferir).

Conta: Classe abstrata que implementa a interface IConta. Serve como base para as classes ContaCorrente e ContaPoupanca. Contém os métodos e atributos comuns, como saldo e cliente.

ContaCorrente: Subclasse de Conta que representa uma conta corrente.

ContaPoupanca: Subclasse de Conta que representa uma conta poupança.

Cliente: Classe que representa um cliente do banco, contendo informações como nome e CPF.

Banco: Classe que gerencia as contas dos clientes, permitindo adicionar novas contas e buscar contas pelo CPF do cliente.

Main: Classe principal que executa o programa, demonstrando a criação de clientes e contas, além de realizar operações de depósito, saque e transferência.
