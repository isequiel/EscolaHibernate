/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controller;

import br.com.modelo.negocio.Laboratorio;
import br.com.modelo.negocio.SalaDeVideo;
import br.com.modelo.negocio.SalaDeVideo;
import br.com.modelo.persistencia.DAO.LaboratorioDAO;
import br.com.modelo.persistencia.DAO.SalaDeVideoDAO;
import br.com.modelo.persistencia.DAO.SalaDeVideoDAO;
import br.com.modelo.persistencia.LaboratorioDAOImpl;
import br.com.modelo.persistencia.SalaDeVideoDAOImpl;
import br.com.modelo.persistencia.SalaDeVideoDAOImpl;
import java.util.List;

/**
 *
 * @author isequiel_borges
 */
public class SalaDeVideoController {
    
   public boolean salvar(SalaDeVideo salaDeVideo) {
        SalaDeVideoDAO dao = new SalaDeVideoDAOImpl();
       return dao.save(salaDeVideo);

    }

    public boolean excluir(int id) {
        SalaDeVideoDAO dao = new SalaDeVideoDAOImpl();
        return dao.remove(SalaDeVideo.class, id);

    }
    
    public List<SalaDeVideo> listarSalaDeVideo() {
        SalaDeVideoDAO dao = new SalaDeVideoDAOImpl();
        return dao.getAll(SalaDeVideo.class);
    }
    
    public SalaDeVideo listarSalaDeVideoById (int id){
        SalaDeVideoDAO dao = new SalaDeVideoDAOImpl();
        return dao.getById(SalaDeVideo.class, id);
    }
    
    public List<SalaDeVideo> listarSalaDeVideoByNome (String Turno){
        SalaDeVideoDAO dao = new SalaDeVideoDAOImpl();
        return dao.getByNome(Turno);
    }
    public SalaDeVideo listarSalaDeVideosByNome (String Turno){
       SalaDeVideoDAO dao = new SalaDeVideoDAOImpl();
       return dao.getSalaDeVideosByNome(Turno);
   }
  }
  
        
    

    
