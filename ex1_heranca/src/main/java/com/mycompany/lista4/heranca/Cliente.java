package com.mycompany.lista4.heranca;

/**
 * @author Diegoo
 */
public class Cliente extends Pessoa{
    public String endereco;
    public int cpf;

    public Cliente(String endereco, String nome, int cpf, int rg, String email) {
        this.endereco = endereco;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
}

