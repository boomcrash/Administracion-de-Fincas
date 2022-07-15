package Vista;

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

        jPanel1 = new javax.swing.JPanel();
        jblrest_pwd = new javax.swing.JLabel();
        jblcorreo = new javax.swing.JLabel();
        txtemail1 = new javax.swing.JTextField();
        jblusuario = new javax.swing.JLabel();
        txtuser1 = new javax.swing.JTextField();
        btncontinue1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jblrest_pwd.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jblrest_pwd.setForeground(new java.awt.Color(0, 102, 102));
        jblrest_pwd.setText("RESTAURAR CONTRASEÑA");
        jPanel1.add(jblrest_pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 504, 144));

        jblcorreo.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jblcorreo.setText("CORREO ELECTRONICO:");
        jPanel1.add(jblcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 162, -1, 45));
        jPanel1.add(txtemail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 174, 203, -1));

        jblusuario.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jblusuario.setText("NOMBRE DE USUARIO:");
        jPanel1.add(jblusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 225, 169, 39));

        txtuser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuser1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtuser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 234, 203, -1));

        btncontinue1.setBackground(new java.awt.Color(0, 102, 102));
        btncontinue1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btncontinue1.setText("CONTINUAR");
        btncontinue1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btncontinue1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinue1ActionPerformed(evt);
            }
        });
        jPanel1.add(btncontinue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 160, 60));

        jButton1.setText("CANCELAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Union.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtuser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuser1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuser1ActionPerformed

    private void btncontinue1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinue1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncontinue1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    VentanasController.cerrarRestaurarContraseña();
    VentanasController.abrirLogin();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncontinue1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jblcorreo;
    private javax.swing.JLabel jblrest_pwd;
    private javax.swing.JLabel jblusuario;
    private javax.swing.JTextField txtemail1;
    private javax.swing.JTextField txtuser1;
    // End of variables declaration//GEN-END:variables
}
