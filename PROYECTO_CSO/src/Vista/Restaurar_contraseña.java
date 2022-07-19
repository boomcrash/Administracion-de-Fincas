package Vista;

import controlador.CamposController;
import controlador.VentanasController;

/**
 *
 * @author User
 */
public class Restaurar_contraseña extends javax.swing.JFrame {
    public Restaurar_contraseña() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelbackground = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jblrest_pwd = new javax.swing.JLabel();
        jblcorreo = new javax.swing.JLabel();
        txtemail1 = new javax.swing.JTextField();
        jblusuario = new javax.swing.JLabel();
        txtuser1 = new javax.swing.JTextField();
        btncontinue1 = new javax.swing.JButton();
        btn_cancelar_rest = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpanelbackground.setBackground(new java.awt.Color(255, 255, 255));
        jpanelbackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jblrest_pwd.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jblrest_pwd.setForeground(new java.awt.Color(0, 0, 0));
        jblrest_pwd.setText("RESTAURAR CONTRASEÑA");
        jPanel1.add(jblrest_pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 504, 144));

        jblcorreo.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jblcorreo.setForeground(new java.awt.Color(0, 0, 0));
        jblcorreo.setText("CORREO ELECTRONICO:");
        jPanel1.add(jblcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 162, -1, 45));

        txtemail1.setBackground(new java.awt.Color(255, 255, 255));
        txtemail1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtemail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 174, 203, -1));

        jblusuario.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jblusuario.setForeground(new java.awt.Color(0, 0, 0));
        jblusuario.setText("NOMBRE DE USUARIO:");
        jPanel1.add(jblusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 225, 169, 39));

        txtuser1.setBackground(new java.awt.Color(255, 255, 255));
        txtuser1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtuser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuser1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtuser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 234, 203, -1));

        btncontinue1.setBackground(new java.awt.Color(0, 0, 0));
        btncontinue1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btncontinue1.setForeground(new java.awt.Color(255, 255, 255));
        btncontinue1.setText("CONTINUAR");
        btncontinue1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btncontinue1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinue1ActionPerformed(evt);
            }
        });
        jPanel1.add(btncontinue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 160, 60));

        btn_cancelar_rest.setBackground(new java.awt.Color(255, 0, 0));
        btn_cancelar_rest.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_cancelar_rest.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelar_rest.setText("CANCELAR");
        btn_cancelar_rest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cancelar_restMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_cancelar_restMouseExited(evt);
            }
        });
        btn_cancelar_rest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar_restActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancelar_rest, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 295, 120, 50));

        jpanelbackground.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/circulo.png"))); // NOI18N
        jpanelbackground.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, -40, 510, 490));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/circulo.png"))); // NOI18N
        jpanelbackground.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 510, 490));

        getContentPane().add(jpanelbackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtuser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuser1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuser1ActionPerformed

    private void btncontinue1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinue1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncontinue1ActionPerformed

    private void btn_cancelar_restActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar_restActionPerformed
    VentanasController.cerrarRestaurarContraseña();
    VentanasController.abrirLogin();// TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelar_restActionPerformed

    private void btn_cancelar_restMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelar_restMouseEntered
CamposController.setColor(btn_cancelar_rest);
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelar_restMouseEntered

    private void btn_cancelar_restMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelar_restMouseExited
CamposController.resetColor(btn_cancelar_rest);
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelar_restMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar_rest;
    private javax.swing.JButton btncontinue1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jblcorreo;
    private javax.swing.JLabel jblrest_pwd;
    private javax.swing.JLabel jblusuario;
    private javax.swing.JPanel jpanelbackground;
    private javax.swing.JTextField txtemail1;
    private javax.swing.JTextField txtuser1;
    // End of variables declaration//GEN-END:variables
}
