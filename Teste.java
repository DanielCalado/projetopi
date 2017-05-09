/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aluno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Teste {
    
    public static void main(String[] ags){
    
        AlunoBean aluno = new AlunoBean();
        Aluno alu = null;
        List<Aluno> alunos = new ArrayList<Aluno>();
        Aluno a, b, c, d;
        a = new Aluno("daniel","12/09/99","m","123.432.167-33","981572591","aluno@gmail.com",10,"fundamental",null);
     aluno.salvar(a);
     b = new Aluno("alan","23/12/01","m",null,"981572591","aluno@gmail.com",10,"medio",null);
     aluno.salvar(b);
     c = new Aluno("carlos","15/06/95","m","123.432.167-43","981572591","aluno@gmail.com",10,"superior",null);
     aluno.salvar(c);
    d = new Aluno("ana","09/07/09","f",null,"981572591","aluno@gmail.com",10,"superior",null);
     aluno.salvar(d);
    }  
}
