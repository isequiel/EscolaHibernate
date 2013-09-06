/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo.persistencia;

import br.com.modelo.persistencia.DAO.LaboratorioDAO;
import br.com.modelo.negocio.Laboratorio;
import br.com.modelo.negocio.Professor;
import br.com.modelo.persistencia.DAO.ProfessorDAO;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;

import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author isequiel_borges
 */
public class LaboratorioDAOImpl extends DAOImpl<Laboratorio, Integer> implements LaboratorioDAO{

   
    public List<Laboratorio> getByNome(String Turno) {
       
       return getEntityManager().createQuery(" select l from Laboratorio l where l.Turno like '%" + Turno + "%'").getResultList();
      
      }  
       public Laboratorio getLaboratoriosByNome(String Turno) {
          Query q = getEntityManager().createQuery("select a from Laboratorio a where a.Turno"
                + " like '" + Turno + "'", Laboratorio.class);
        List<Laboratorio> laboratorios = q.getResultList();
        Laboratorio ma = new Laboratorio();
        for (Laboratorio p : laboratorios) {
            ma = p;
        }
        return ma;
    

}

}
   
