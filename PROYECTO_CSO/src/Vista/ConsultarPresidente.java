/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import controlador.TablasRegistroController;

/**
 *
 * @author GAMER
 */
public class ConsultarPresidente extends javax.swing.JFrame {
    int id_com;
    /**
     * Creates new form ConsultarPresidente
     */
    public ConsultarPresidente() {
        initComponents();
        TablasRegistroController.llenarTablaPresidente(tblpresidentes);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblpresidentes = new javax.swing.JTable();
        txtidpresidente1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblpresidentes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblpresidentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblpresidentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblpresidentesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblpresidentes);

        txtidpresidente1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtidpresidente1.setEnabled(false);
        txtidpresidente1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidpresidente1KeyTyped(evt);
            }
        });

        jPanel1.setBackground(java.awt.Color.black);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton1.setText("CONSULTAS");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 0, 100, 40));

        btnInicio.setBackground(new java.awt.Color(255, 255, 255));
        btnInicio.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnInicio.setText("INICIO");
        btnInicio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        jPanel1.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(627, 0, 100, 40));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton3.setText("PERFIL\n");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 0, 100, 40));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton4.setText("REPORTES");
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 0, 100, 40));

        btnRegistro.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistro.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnRegistro.setText("REGISTROS");
        btnRegistro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 0, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(txtidpresidente1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtidpresidente1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblpresidentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblpresidentesMouseClicked
        int row=tblpresidentes.getSelectedRow();
        if(row!=-1){
            id_com=Integer.parseInt(String.valueOf(tblpresidentes.getModel().getValueAt(row,0)));
            txtidpresidente1.setText(String.valueOf(id_com));
        }       // TODO add your handling code here:
    }//GEN-LAST:event_tblpresidentesMouseClicked

    private void txtidpresidente1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidpresidente1KeyTyped
        if(txtidpresidente1.getText().length() >= 10 && !Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidpresidente1KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered

    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        this.setVisible(true);
        Submenu_Registro submenuregistro = new Submenu_Registro();
        submenuregistro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegistroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultarPresidente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarPresidente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarPresidente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarPresidente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarPresidente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblpresidentes;
    private javax.swing.JTextField txtidpresidente1;
    // End of variables declaration//GEN-END:variables
}
