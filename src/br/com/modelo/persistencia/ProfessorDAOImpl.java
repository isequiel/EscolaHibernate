package br.com.modelo.persistencia;



import br.com.modelo.negocio.Laboratorio;
import br.com.modelo.persistencia.DAO.ProfessorDAO;
import br.com.modelo.negocio.Professor;
import br.com.modelo.persistencia.DAO.LaboratorioDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class ProfessorDAOImpl extends DAOImpl<Professor, Integer> implements ProfessorDAO{

   
    public List<Professor> getByNome(String nome) {
        return getEntityManager().createQuery("select m from Professor m where m.Nome like '%" + nome + "%'").getResultList();
    }

 
    public Professor getByNomeTelefone(String nome, String telefone) {
          Query q = getEntityManager().createQuery("select a from Professor a where a.Nome"
                + " like '" + nome + "' and a.Telefone like '" + telefone +
                "'", Professor.class);
        List<Professor> professores = q.getResultList();
        Professor ma = new Professor();
        for (Professor p : professores) {
            ma = p;
        }
        return ma;
    }
 }
