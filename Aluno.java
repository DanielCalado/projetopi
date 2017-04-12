/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

/**
 *
 * @author Aluno
 */
public class Aluno {
    private int matusuario;
    private String nome;
    private String datanas;
    private String sexo;
    private String nomemae;
    private String cpf;
    private int telefone;
    private String email;
    private int idade;
    private String endereço;
    private String ensino;
    public Aluno(String nome, String datanas, String sexo, String nomemae, String cpf, int telefone, String email, int idade, String endereço, String ensino) {
        this.nome = nome;
        this.datanas = datanas;
        this.sexo = sexo;
        this.nomemae = nomemae;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.idade = idade;
        this.endereço = endereço;
        this.ensino = ensino;
    }

    public int getMatusuario() {
        return matusuario;
    }

    public void setMatusuario(int matusuario) {
        this.matusuario = matusuario;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatanas() {
        return datanas;
    }

    public void setDatanas(String datanas) {
        this.datanas = datanas;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNomemae() {
        return nomemae;
    }

    public void setNomemae(String nomemae) {
        this.nomemae = nomemae;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getEnsino() {
        return ensino;
    }

    public void setEnsino(String ensino) {
        this.ensino = ensino;
    }
    
}
