package com.main.Conta;

import com.main.DadosCliente.Cliente;

public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(Cliente cliente){
        super(cliente);
        this.taxaRendimento = taxaRendimento;
    }

    public void render(){
        this.saldo += this.saldo * this.taxaRendimento;
        System.out.println("Rendimento aplicado com sucesso!");
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Conta Corrente");
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número: " + this.numero);
        System.out.println("Cliente: " + this.cliente.getNome());
        System.out.println("Saldo: " + this.saldo);
    }
}
