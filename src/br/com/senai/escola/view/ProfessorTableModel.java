package br.com.senai.escola.view;



import br.com.modelo.negocio.Professor;
import java.util.ArrayList;

import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author 
 */
public class ProfessorTableModel extends AbstractTableModel {

    private static final int COL_CODIGO = 0;
    private static final int COL_NOME = 1;
    private static final int COL_SEXO = 2;
    private static final int COL_TELEFONE = 3;
    private static final int COL_CELULAR = 4;
    private static final int COL_EMAIL = 5;
    private static final int COL_DISCIPLINA = 6;
    
    
    private List<Professor> linhas;
   
    private String[] colunas = new String[]{"Código", "Nome", "Sexo", "Telefone", "Celular", "Email", "Disciplina"};

   
    public ProfessorTableModel() {
        linhas = new ArrayList<Professor>();
    }

    public ProfessorTableModel(List<Professor> professoress) {
        this.linhas = new ArrayList<Professor>(professoress);
    }

    public int getRowCount() {
        return linhas.size();
    }

  
    public int getColumnCount() {
        return colunas.length;
    }

   
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }

    public Class getColumnClass(int columnIndex) {
       
        if (columnIndex == COL_CODIGO) {
            return Integer.class;
        }else if (columnIndex == COL_NOME ){
            return String.class;
        }else if (columnIndex == COL_SEXO){
            return String.class;
        }else if (columnIndex == COL_TELEFONE){
            return Professor.class;
        }
        else if (columnIndex == COL_CELULAR){
            return Professor.class;
        }
        else if (columnIndex == COL_EMAIL){
            return Professor.class;
        }
        else if (columnIndex == COL_DISCIPLINA){
            return Professor.class;
        }
        return null;
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    //Retorna o valor da coluna e o valor da linha
    public Object getValueAt(int row, int column) {
        
        Professor m = linhas.get(row);

        //verifica qual valor deve ser retornado
       if (column == COL_CODIGO) {
            return m.getCodigo();
        }else if (column == COL_NOME ){
            return m.getNome();
        }else if (column == COL_SEXO){
            return m.getSexo();
        }else if (column == COL_TELEFONE){
            return m.getTelefone();
        }
        else if (column == COL_CELULAR){
            return m.getCelular();
        }
        else if (column == COL_EMAIL){
            return m.getEmail();
        }
        else if (column == COL_DISCIPLINA){
            return m.getDisciplina();
        }
        return "";    
    }

    public void setValueAt(Object aValue, int row, int column) {
        //Vamos alterar o valor da coluna columnIndex na linha rowIndex com o valor aValue passado no parâmetro.  
        //Note que vc poderia alterar 2 campos ao invés de um só.  
        Professor u = linhas.get(row);
        if (column == COL_CODIGO) {
            u.setCodigo((Integer) aValue);
        } else if (column == COL_NOME) {
            u.setNome(aValue.toString());
        } else if (column == COL_SEXO) {
            u.setSexo(aValue.toString());
        } else if (column == COL_TELEFONE) {
            u.setTelefone(aValue.toString());
        } else if (column == COL_CELULAR) {
            u.setCelular(aValue.toString());
        } else if (column == COL_EMAIL) {
            u.setEmail(aValue.toString());
        } else if (column == COL_DISCIPLINA) {
            u.setDisciplina(aValue.toString());
        }
    }

    // Retorna a marca referente a linha especificada
    public Professor getProfessor(int indiceLinha) {
        return linhas.get(indiceLinha);
    }


    public void addProfessor(Professor professores) {
        // Adiciona o registro.
        linhas.add(professores);

        // Pega a quantidade de registros e subtrai 1 para
        // achar o último índice. A subtração é necessária
        // porque os índices começam em zero.
        int ultimoIndice = getRowCount() - 1;


        // Notifica a mudança.
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
      

    }
    
        public void updateProfessor(int indiceLinha, Professor professores) {
            linhas.set(indiceLinha, professores);
        // Notifica a mudança.
        fireTableRowsUpdated(indiceLinha, indiceLinha);
       
    }
  
    //Remove o sócio da linha especificada.
    public void removeProfessor(int indiceLinha) {
        // Remove o registro.
        linhas.remove(indiceLinha);

        // Notifica a mudança.
        fireTableRowsDeleted(indiceLinha, indiceLinha);
        
    }

// Remove todos os registros.
    public void limpar() {
        // Remove todos os elementos da lista de sócios.
        linhas.clear();

        // Notifica a mudança.
        fireTableDataChanged();
    }
}
