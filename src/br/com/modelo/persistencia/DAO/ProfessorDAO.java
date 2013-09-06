
package br.com.modelo.persistencia.DAO;

import br.com.modelo.negocio.Laboratorio;
import br.com.modelo.negocio.Professor;
import java.util.List;

/**
 *
 * @author rosicleia.souza
 */
public interface ProfessorDAO extends DAO<Professor, Integer>{ 
    
    List<Professor> getByNome (String nome);

    public Professor getByNomeTelefone(String nome, String telefone);
    
    
    
}
