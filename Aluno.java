/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20161d13gr0031
 */
package Model;

import java.io.Serializable;
   import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class Aluno implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    @Column(length = 30)
    private String nome;
    @Column(length = 10)
    private String datanas;
    @Column(length = 1)
    private String sexo;
    @Column(length = 30)
    private String cpf;
    @Column(length = 20)
    private String telefone;
    @Column(length = 30)
    private String email;
    @Column(length = 2)
    private int idada;
    @Column(length = 20)
    private String ensino;
    private String endereço; 

    public Aluno( String nome, String datanas, String sexo, String cpf, String telefone, String email, int idada, String ensino, String endereço) {
        
        this.nome = nome;
        this.datanas = datanas;
        this.sexo = sexo;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.idada = idada;
        this.ensino = ensino;
        this.endereço = endereço;
    }
    public Aluno(){
        
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setDatanas(String datanas) {
        this.datanas = datanas;
    }

    public String getDatanas() {
        return datanas;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEnsino(String ensino) {
        this.ensino = ensino;
    }

    public String getEnsino() {
        return ensino;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setIdada(int idada) {
        this.idada = idada;
    }

    public int getIdada() {
        return idada;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }
    
    

}
