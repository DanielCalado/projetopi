 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aluno;
import Model.AlunoDAO1;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
/**
*
* @author Jose Junio
*/
@RequestScoped
@ManagedBean
public class AlunoBean {
    
private Aluno aluno = new Aluno();
public void salvar(Aluno alu) {
AlunoDAO1.getInstance().create(alu);
aluno = new Aluno();
}
public void excluir(String txt) {
AlunoDAO1.getInstance().delete(txt);
aluno = new Aluno();
}
public void alterar(Aluno c) {
AlunoDAO1.getInstance().update(c);
aluno = new Aluno();
}
public void consultar(String c) {
this.aluno = AlunoDAO1.getInstance().read(c);
aluno = new Aluno();
}
public List<Aluno> consultarTodos() {
return AlunoDAO1.getInstance().readALL();
}
public Aluno getAluno() {
return aluno;
}
public void setCliente(Aluno aluno) {
this.aluno = aluno;
}
}
