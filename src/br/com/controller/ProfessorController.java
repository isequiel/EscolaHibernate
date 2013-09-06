/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controller;

import br.com.modelo.negocio.Professor;
import br.com.modelo.negocio.Professor;
import br.com.modelo.persistencia.DAO.ProfessorDAO;
import br.com.modelo.persistencia.DAO.ProfessorDAO;
import br.com.modelo.persistencia.ProfessorDAOImpl;
import br.com.modelo.persistencia.ProfessorDAOImpl;
import java.util.List;

/**
 *
 * @author Usuário
 */
public class ProfessorController {
    
     public boolean salvar(Professor professor) {
        ProfessorDAO dao = new ProfessorDAOImpl();
       return dao.save(professor);

    }

    public boolean excluir(int id) {
        ProfessorDAO dao = new ProfessorDAOImpl();
        return dao.remove(Professor.class, id);

    }
    
    public List<Professor> listarProfessor() {
        ProfessorDAO dao = new ProfessorDAOImpl();
        return dao.getAll(Professor.class);
    }
    
    public Professor listarProfessorById (int id){
        ProfessorDAO dao = new ProfessorDAOImpl();
        return dao.getById(Professor.class, id);
    }
    
   public List<Professor> listarProfessorByNome (String nome){
        ProfessorDAO dao = new ProfessorDAOImpl();
        return dao.getByNome(nome);
    }
   
     public Professor listarProfessorByNomeTelefone (String nome, String telefone){
        ProfessorDAO dao = new ProfessorDAOImpl();
        return dao.getByNomeTelefone(nome, telefone);
    }
   }
  
        
    

    

