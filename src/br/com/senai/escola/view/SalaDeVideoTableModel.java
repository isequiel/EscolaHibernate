package br.com.senai.escola.view;



import br.com.modelo.negocio.SalaDeVideo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author 
 */
public class SalaDeVideoTableModel extends AbstractTableModel {

    private static final int COL_CODIGO = 0;
    private static final int COL_NOME = 1;
    private static final int COL_RESERVA = 2;
    private static final int COL_TURNO = 3;
    private static final int COL_AULA = 4;
 
    
    
    private List<SalaDeVideo> linhas;
   
    private String[] colunas = new String[]{"Código", "Nome", "Reserva", "Turno", "Aula"};

   
    public SalaDeVideoTableModel() {
        linhas = new ArrayList<SalaDeVideo>();
    }

    public SalaDeVideoTableModel(List<SalaDeVideo> professoress) {
        this.linhas = new ArrayList<SalaDeVideo>(professoress);
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
        }else if (columnIndex == COL_RESERVA){
            return String.class;
        }else if (columnIndex == COL_TURNO){
            return SalaDeVideo.class;
        }
        else if (columnIndex == COL_AULA){
            return SalaDeVideo.class;
        }
        return null;
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    //Retorna o valor da coluna e o valor da linha
    public Object getValueAt(int row, int column) {
        
        SalaDeVideo m = linhas.get(row);

        //verifica qual valor deve ser retornado
       if (column == COL_CODIGO) {
            return m.getCodigo();
        }else if (column == COL_NOME ){
            return m.getProfessor();
        }else if (column == COL_RESERVA){
            return m.getReserva();
        }else if (column == COL_TURNO){
            return m.getTurno();
        }
        else if (column == COL_AULA){
            return m.getAula();
        }
        return "";    
    }

    public void setValueAt(Object aValue, int row, int column) {
        //Vamos alterar o valor da coluna columnIndex na linha rowIndex com o valor aValue passado no parâmetro.  
        //Note que vc poderia alterar 2 campos ao invés de um só.  
//      SalaDeVideo u = linhas.get(row);
//        if (column == COL_CODIGO) {
//            u.setCodigo((Integer) aValue);
//        } else if (column == COL_NOME) {
//            u.setNome(aValue.toString());
//        } else if (column == COL_RESERVA) {
//            u.setReserva(aValue.toString());
//        } else if (column == COL_TURNO) {
//            u.setTurno(aValue.toString());
//        } else if (column == COL_AULA) {
//            u.setAula(aValue.toString());
//        }
    }

    // Retorna a marca referente a linha especificada
    public SalaDeVideo getSalaDeVideo(int indiceLinha) {
        return linhas.get(indiceLinha);
    }


    public void addSalaDeVideo(SalaDeVideo salaDeVideo) {
        // Adiciona o registro.
        linhas.add(salaDeVideo);

        // Pega a quantidade de registros e subtrai 1 para
        // achar o último índice. A subtração é necessária
        // porque os índices começam em zero.
        int ultimoIndice = getRowCount() - 1;


        // Notifica a mudança.
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
      

    }
    
        public void updateSalaDeVideo(int indiceLinha, SalaDeVideo salaDeVideo) {
            linhas.set(indiceLinha, salaDeVideo);
        // Notifica a mudança.
        fireTableRowsUpdated(indiceLinha, indiceLinha);
       
    }
  
    //Remove o sócio da linha especificada.
    public void removeSalaDeVideo(int indiceLinha) {
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
