package com.mycompany.lista4.heranca;

/**
 * @author Diegoo
 */
public class Funcionario extends Pessoa {
    public int salario;
    public String cargo;
    public int rg; 
    public int cpf;

    public Funcionario(int salario, String cargo, int cpf, String email, int rg, String nome) {
        this.salario = salario;
        this.cargo = cargo;
        this.cpf = cpf;
        this.email = email;
        this.rg = rg;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Funcionario{ nome=" + nome + ", salario=" + salario + ", cargo=" + cargo + ", cpf=" + cpf + ", rg=" + rg + ", email=" + email + '}';
    }
  
    /**
     * @return the salario
     */
    public int getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(int salario) {
        this.salario = salario;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    
}

