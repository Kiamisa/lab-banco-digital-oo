package com.main.Conta;

import com.main.DadosCliente.Cliente;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(Cliente cliente){
        super(cliente);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if(this.saldo + this.limite >= valor){
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        if(this.saldo + this.limite >= valor){
            this.saldo -= valor;
            contaDestino.depositar(valor);
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Conta Corrente");
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número: " + this.numero);
        System.out.println("Cliente: " + this.cliente.getNome());
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Limite: " + this.limite);
    }

}
