package com.main;

import com.main.Banco.Banco;
import com.main.Conta.Conta;
import com.main.Conta.ContaCorrente;
import com.main.Conta.ContaPoupanca;
import com.main.DadosCliente.Cliente;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Exemplo");

        Cliente cliente1 = new Cliente("João Silva", "111.111.111-11");
        Cliente cliente2 = new Cliente("Maria Souza", "222.222.222-22");

        Conta contaCorrente = new ContaCorrente(cliente1);
        Conta contaPoupanca = new ContaPoupanca(cliente2);

        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);

        contaCorrente.depositar(1000);
        contaCorrente.sacar(200);
        contaCorrente.transferir(300, contaPoupanca);

        System.out.println("Saldo da conta corrente: R$" + contaCorrente.getSaldo());
        System.out.println("Saldo da conta poupança: R$" + contaPoupanca.getSaldo());
    }
}
