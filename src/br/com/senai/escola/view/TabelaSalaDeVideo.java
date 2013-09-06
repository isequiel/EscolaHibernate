/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senai.escola.view;


import br.com.controller.LaboratorioController;
import br.com.controller.ProfessorController;
import br.com.controller.SalaDeVideoController;
import br.com.modelo.negocio.Laboratorio;
import br.com.modelo.negocio.Professor;
import br.com.modelo.negocio.SalaDeVideo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuário
 */
public class TabelaSalaDeVideo extends javax.swing.JFrame {
    
    private SalaDeVideoTableModel model;
    
    /**
     * Creates new form TabelaProfessores
     */
     
     public TabelaSalaDeVideo() {
         initComponents();
        List<SalaDeVideo> lista = new ArrayList<SalaDeVideo>();
        SalaDeVideoController a = new SalaDeVideoController();
        lista = a.listarSalaDeVideo();

      
        model = new SalaDeVideoTableModel(lista);

        
        TabelaSalaDeVideo.setModel(model);
    }
     

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LebalNome = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        botaoIserir = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        botaoEditar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaSalaDeVideo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        LebalNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LebalNome.setText("Nome:");
        jPanel1.add(LebalNome);
        LebalNome.setBounds(20, 100, 70, 17);

        campoNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoNome.setToolTipText("");
        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });
        jPanel1.add(campoNome);
        campoNome.setBounds(70, 90, 550, 30);

        botaoIserir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoIserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isequiel/view/imagens/add_user-48.png"))); // NOI18N
        botaoIserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIserirActionPerformed(evt);
            }
        });
        jPanel1.add(botaoIserir);
        botaoIserir.setBounds(50, 520, 90, 70);

        botaoExcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isequiel/view/imagens/RemoveCliente.png"))); // NOI18N
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(botaoExcluir);
        botaoExcluir.setBounds(160, 520, 90, 70);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Inserir");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 600, 90, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Excluir");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(180, 600, 90, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Editar");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(300, 600, 60, 17);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(30, 500, 800, 10);

        jLabel4.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel4.setText("Sala de Video Reservado");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(270, 20, 410, 40);

        botaoEditar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoEditar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isequiel/view/imagens/edit.png"))); // NOI18N
        botaoEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditar1ActionPerformed(evt);
            }
        });
        jPanel1.add(botaoEditar1);
        botaoEditar1.setBounds(270, 520, 100, 70);

        TabelaSalaDeVideo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Reserva", "Turno", "Aula"
            }
        ));
        jScrollPane1.setViewportView(TabelaSalaDeVideo);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 140, 800, 330);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
       efetuaPesquisa();
            
         
    }//GEN-LAST:event_campoNomeActionPerformed
   
    private void botaoIserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIserirActionPerformed
       ReservaSalaDeVideo im = new ReservaSalaDeVideo(model);    
        im.setLocationRelativeTo(null);
        im.setVisible(true);
    }//GEN-LAST:event_botaoIserirActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
       
        int selecionado = -1;
        selecionado = TabelaSalaDeVideo.getSelectedRow();

        if (selecionado >= 0) {
            Integer i = (Integer) model.getValueAt(selecionado, 0);
            SalaDeVideo m = model.getSalaDeVideo(selecionado);
            SalaDeVideoController mc = new SalaDeVideoController();
            mc.excluir(i);
            model.removeSalaDeVideo(selecionado);

        } else {
            JOptionPane.showMessageDialog(null, "É necesário selecionar uma linha");
        }         
          
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoEditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditar1ActionPerformed
      int selecionado = -1;
        selecionado = TabelaSalaDeVideo.getSelectedRow();

        if (selecionado >= 0) {
            Integer cdSalaDeVideo = (Integer) model.getValueAt(selecionado, 0);
            EditarReservaSalaDeVideo am = new EditarReservaSalaDeVideo(selecionado, cdSalaDeVideo, model);
            am.setLocationRelativeTo(null);
            am.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "É necessário selecionar uma tabela");
        }
    }
        private void efetuaPesquisa() {
        String turno = campoNome.getText();
        List<SalaDeVideo> lista = new ArrayList<SalaDeVideo>();
        SalaDeVideoController a = new SalaDeVideoController();
        lista = a.listarSalaDeVideoByNome(turno);
        model.limpar();

        //cria o modelo de Produto      
        model = new SalaDeVideoTableModel(lista);

        //atribui o modelo à tabela
        TabelaSalaDeVideo.setModel(model);
    
          
    }//GEN-LAST:event_botaoEditar1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LebalNome;
    private javax.swing.JTable TabelaSalaDeVideo;
    private javax.swing.JButton botaoEditar1;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoIserir;
    private javax.swing.JTextField campoNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

}