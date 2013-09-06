/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controller;

import br.com.modelo.negocio.Laboratorio;
import br.com.modelo.negocio.Laboratorio;
import br.com.modelo.negocio.Professor;
import br.com.modelo.persistencia.DAO.LaboratorioDAO;
import br.com.modelo.persistencia.DAO.LaboratorioDAO;
import br.com.modelo.persistencia.DAO.ProfessorDAO;
import br.com.modelo.persistencia.LaboratorioDAOImpl;
import br.com.modelo.persistencia.LaboratorioDAOImpl;
import br.com.modelo.persistencia.ProfessorDAOImpl;
import java.util.Date;

import java.util.List;

/**
 *
 * @author isequiel_borges
 */
public class LaboratorioController {
    
     public boolean salvar(Laboratorio laboratorio) {
        LaboratorioDAO dao = new LaboratorioDAOImpl();
       return dao.save(laboratorio);

    }

    public boolean excluir(int id) {
        LaboratorioDAO dao = new LaboratorioDAOImpl();
        return dao.remove(Laboratorio.class, id);

    }
    
    public List<Laboratorio> listarLaboratorio() {
        LaboratorioDAO dao = new LaboratorioDAOImpl();
        return dao.getAll(Laboratorio.class);
    }
    
    public Laboratorio listarLaboratorioById (int id){
        LaboratorioDAO dao = new LaboratorioDAOImpl();
        return dao.getById(Laboratorio.class, id);
    }
    
   public List<Laboratorio> listarLaboratorioByNome (String Turno){
        LaboratorioDAO dao = new LaboratorioDAOImpl();
        return dao.getByNome(Turno);
    }
    public Laboratorio listarLaboratoriosByNome (String Turno){
       LaboratorioDAO dao = new LaboratorioDAOImpl();
       return dao.getLaboratoriosByNome(Turno);
   }
     
}
