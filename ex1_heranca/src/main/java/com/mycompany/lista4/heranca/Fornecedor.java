package com.mycompany.lista4.heranca;

public class Fornecedor extends Pessoa{
    public String destino;
    public int cnpj;

    public Fornecedor(String destino, int cnpj, String nome) {
        this.destino = destino;
        this.cnpj = cnpj;
        this.nome = nome; 
    }

    @Override
    public String toString() {
        return "Fornecedor{" + "nome=" + nome + "email=" + email + "destino=" + destino + ", cnpj=" + cnpj + '}';
    }
    
    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * @return the cnpj
     */
    public int getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    
}
