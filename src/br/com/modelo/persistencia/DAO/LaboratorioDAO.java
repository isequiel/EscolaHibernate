/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo.persistencia.DAO;

import br.com.modelo.negocio.Laboratorio;
import java.util.Date;
import java.util.List;

/**
 *
 * @author isequiel_borges
 */
public interface LaboratorioDAO extends DAO<Laboratorio, Integer>{ 
    
    List<Laboratorio> getByNome (String Turno);
    Laboratorio getLaboratoriosByNome(String Turno);
 
    
    
}
