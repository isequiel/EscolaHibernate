/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo.persistencia;

import br.com.modelo.negocio.Laboratorio;
import br.com.modelo.persistencia.DAO.SalaDeVideoDAO;
import br.com.modelo.negocio.SalaDeVideo;
import br.com.modelo.persistencia.DAO.LaboratorioDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author isequiel_borges
 */
public class SalaDeVideoDAOImpl extends DAOImpl<SalaDeVideo, Integer> implements SalaDeVideoDAO{

   
    public List<SalaDeVideo> getByNome(String Turno) {
       
       return getEntityManager().createQuery(" select l from SalaDeVideo l where l.Turno like '%" + Turno + "%'").getResultList();
      
      }  
       public SalaDeVideo getSalaDeVideosByNome(String Turno) {
          Query q = getEntityManager().createQuery("select a from SalaDeVideo a where a.Turno"
                + " like '" + Turno + "'", SalaDeVideo.class);
        List<SalaDeVideo> salaDeVideos = q.getResultList();
        SalaDeVideo ma = new SalaDeVideo();
        for (SalaDeVideo p : salaDeVideos) {
            ma = p;
        }
        return ma;
    
       
}


}