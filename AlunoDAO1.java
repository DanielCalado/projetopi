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
 import Model.Aluno;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Jose Junio
 */
public class AlunoDAO1 implements DAOGenerico<Aluno> {
    public static AlunoDAO1 instance;
    private AlunoDAO1(){
    
} 
    public static AlunoDAO1 getInstance(){
        if(instance == null){
            instance = new AlunoDAO1();
        }
        return instance;
    }
     /*public SessionFactory abrirSession() {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        return factory;
    }*/

    @Override
    public void create(Aluno t) {
        Session session = BancoMysqlDAO.getInstance().abrirSession().openSession();
        session.beginTransaction();
        session.save(t);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void update(Aluno t) {
       Session session = BancoMysqlDAO.getInstance().abrirSession().openSession();
        session.beginTransaction();
        session.update(t);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Aluno read(String consul) {
        Session session = BancoMysqlDAO.getInstance().abrirSession().openSession();
        List<Aluno> alunos = readALL();
        Aluno alu = null;

        for (int i = 0; i < alunos.size(); i++) {

            if (consul.equals(alunos.get(i).getCpf())) {
                alu = alunos.get(i);
            }
        }
        session.close();
        return alu;

    }

    @Override
    public void delete(String consult) {
        Session session = BancoMysqlDAO.getInstance().abrirSession().openSession();
        session.beginTransaction();
        List<Aluno> alunos = readALL();
        Aluno alu = null;

        for (int i = 0; i < alunos.size(); i++) {

            if (consult.equals(alunos.get(i).getCpf())) {
                alu = alunos.get(i);
            }
        }
        session.delete(alu);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<Aluno> readALL() {
        Session session = BancoMysqlDAO.getInstance().abrirSession().openSession();
        Query consulta = session.createQuery("from Aluno");
        List<Aluno> alunos = consulta.list();
        session.close();
        return alunos;
    }

}