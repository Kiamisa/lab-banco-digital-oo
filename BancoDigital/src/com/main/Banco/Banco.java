package com.main.Banco;

import com.main.Conta.Conta;
import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contasList;

    public Banco(String nome){
        this.nome = nome;
        this.contasList = new ArrayList<>();
    }

    public void adicionarConta(Conta conta){
        this.contasList.add(conta);
    }

    public void removerConta(Conta conta){
        this.contasList.remove(conta);
    }

    public void listarContas(){
        for(Conta conta : this.contasList){
            System.out.println(conta);
        }
    }

    public Conta buscarConta(String cpf){
        for(Conta conta : this.contasList){
            if(conta.getCliente().getCpf().equals(cpf)){
                return conta;
            }
        }
        return null;
    }

}
