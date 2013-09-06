/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo.persistencia.DAO;

import br.com.modelo.negocio.Laboratorio;
import br.com.modelo.negocio.SalaDeVideo;
import java.util.List;

/**
 *
 * @author isequiel_borges
 */
public interface SalaDeVideoDAO extends DAO<SalaDeVideo, Integer>{ 
    
    List<SalaDeVideo> getByNome (String nome);
    SalaDeVideo getSalaDeVideosByNome(String Turno);
    
}
