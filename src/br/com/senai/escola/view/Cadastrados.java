/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senai.escola.view;

/**
 *
 * @author Usuário
 */
public class Cadastrados extends javax.swing.JFrame {
   
    /**
     * Creates new form Pricipal
     */
    public Cadastrados() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BotaoCadastroProfessor = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        BotaoReservaLaboratorio = new javax.swing.JButton();
        BotaoReservaSalaVideo1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrados");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Vrinda", 3, 36)); // NOI18N
        jLabel5.setText("Reserva de Laboratório e Sala de Video");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(110, 10, 860, 70);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 850, 80);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 80, 70, 530);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(780, 80, 70, 530);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Professores Cadastrados");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(420, 270, 170, 15);

        BotaoCadastroProfessor.setBackground(new java.awt.Color(255, 255, 255));
        BotaoCadastroProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isequiel/view/imagens/User_1.png"))); // NOI18N
        BotaoCadastroProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastroProfessorActionPerformed(evt);
            }
        });
        jPanel1.add(BotaoCadastroProfessor);
        BotaoCadastroProfessor.setBounds(430, 150, 110, 100);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Laboratório reservado");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(590, 270, 150, 15);

        BotaoReservaLaboratorio.setBackground(new java.awt.Color(255, 255, 255));
        BotaoReservaLaboratorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isequiel/view/imagens/monitor-48.png"))); // NOI18N
        BotaoReservaLaboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoReservaLaboratorioActionPerformed(evt);
            }
        });
        jPanel1.add(BotaoReservaLaboratorio);
        BotaoReservaLaboratorio.setBounds(600, 150, 110, 100);

        BotaoReservaSalaVideo1.setBackground(new java.awt.Color(255, 255, 255));
        BotaoReservaSalaVideo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isequiel/view/imagens/clapperboard-48.png"))); // NOI18N
        BotaoReservaSalaVideo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoReservaSalaVideo1ActionPerformed(evt);
            }
        });
        jPanel1.add(BotaoReservaSalaVideo1);
        BotaoReservaSalaVideo1.setBounds(430, 340, 110, 100);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Sala de Video Reservada");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(410, 460, 180, 14);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/isequiel/view/imagens/onlinelogomaker-080113-1625080113-1628.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 150, 410, 320);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 844, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCadastroProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastroProfessorActionPerformed
        TabelaProfessores ma = new TabelaProfessores();
        ma.setLocationRelativeTo(null);
        ma.setVisible(true);
    }//GEN-LAST:event_BotaoCadastroProfessorActionPerformed

    private void BotaoReservaLaboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoReservaLaboratorioActionPerformed
        TabelaLaboratorio ma = new TabelaLaboratorio();
        ma.setLocationRelativeTo(null);
        ma.setVisible(true);
    }//GEN-LAST:event_BotaoReservaLaboratorioActionPerformed

    private void BotaoReservaSalaVideo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoReservaSalaVideo1ActionPerformed
        TabelaSalaDeVideo ma = new TabelaSalaDeVideo();
       ma.setLocationRelativeTo(null);
        ma.setVisible(true);
    }//GEN-LAST:event_BotaoReservaSalaVideo1ActionPerformed
 
    /**
     * @param args the command line arguments
     */
  
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadastroProfessor;
    private javax.swing.JButton BotaoReservaLaboratorio;
    private javax.swing.JButton BotaoReservaSalaVideo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}