/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobiblioteca;

/**
 *
 * @author Aluno
 */
public class Administrador {
    private int matadm;
    private String nome;
    private String cpf;
    private String telefone;
    private String senha;

    public Administrador(int matadm, String nome, String cpf, String telefone, String senha) {
        this.matadm = matadm;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.senha = senha;
    }

    public int getMatadm() {
        return matadm;
    }

    public void setMatadm(int matadm) {
        this.matadm = matadm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
