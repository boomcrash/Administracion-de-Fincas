
package Vista;

import javax.swing.JLabel;

public class Registro_Entidad_Bancaria extends javax.swing.JFrame {
    public Registro_Entidad_Bancaria() {
        initComponents();
        this.setLocationRelativeTo(null);
        mostrarnombreventana(jblRegistroentbancaria);
    }
     public void mostrarnombreventana(JLabel j){
        String formulario = getClass().getSimpleName();
       j.setText(formulario.replace("_", " "));
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRegistro_ent_bancaria = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblNom_entidadbancaria = new javax.swing.JLabel();
        lblrepresentante_entbancaria = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNom_EntBancaria = new javax.swing.JTextField();
        txtRepresentante_EntBancaria = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        txtCant_comun_EntBancaria = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDescripcion_EntBancaria = new javax.swing.JTextArea();
        txtDir_EntBancaria = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cmbCiudad_EntBancaria = new javax.swing.JComboBox<>();
        btnRegistrar_EntBancaria = new javax.swing.JButton();
        btnCancelar_registro_EntBancaria = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jblRegistroentbancaria = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegistro_ent_bancaria.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lblRegistro_ent_bancaria.setForeground(new java.awt.Color(0, 102, 102));
        lblRegistro_ent_bancaria.setText("REGISTRO ENTIDAD BANCARIA");
        getContentPane().add(lblRegistro_ent_bancaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 560, 50));

        jLabel4.setText("DESCRIPCIÓN:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, 20));

        lblNom_entidadbancaria.setText("NOMBRE DE LA ENTIDAD BANCARIA:");
        getContentPane().add(lblNom_entidadbancaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 20));

        lblrepresentante_entbancaria.setText("REPRESENTANTE DE LA ENTIDAD BANCARIA:");
        getContentPane().add(lblrepresentante_entbancaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 20));

        jLabel7.setText("CANTIDAD DE COMUNIDADES:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, 20));

        txtNom_EntBancaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNom_EntBancaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNom_EntBancariaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNom_EntBancaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 300, 20));

        txtRepresentante_EntBancaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtRepresentante_EntBancaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 300, 20));

        jLabel8.setText("DIRECCIÓN:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, 20));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton1.setText("CONSULTAS");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 100, 40));

        btnInicio.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnInicio.setText("INICIO");
        btnInicio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        jPanel1.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 100, 40));

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
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 0, 100, 40));

        jButton4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton4.setText("REPORTES");
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 0, 100, 40));

        btnRegistro.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnRegistro.setText("REGISTROS");
        btnRegistro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 100, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 50));

        txtCant_comun_EntBancaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtCant_comun_EntBancaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 300, 20));

        txaDescripcion_EntBancaria.setColumns(20);
        txaDescripcion_EntBancaria.setRows(5);
        txaDescripcion_EntBancaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(txaDescripcion_EntBancaria);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 300, 60));

        txtDir_EntBancaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtDir_EntBancaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 300, 20));

        jLabel1.setText("CIUDAD:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, -1, -1));

        cmbCiudad_EntBancaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(cmbCiudad_EntBancaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, -1, -1));

        btnRegistrar_EntBancaria.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnRegistrar_EntBancaria.setForeground(new java.awt.Color(0, 0, 51));
        btnRegistrar_EntBancaria.setText("REGISTRAR");
        btnRegistrar_EntBancaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(btnRegistrar_EntBancaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 550, 170, 40));

        btnCancelar_registro_EntBancaria.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnCancelar_registro_EntBancaria.setForeground(new java.awt.Color(153, 0, 0));
        btnCancelar_registro_EntBancaria.setText("CANCELAR");
        btnCancelar_registro_EntBancaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnCancelar_registro_EntBancaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar_registro_EntBancariaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar_registro_EntBancaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 550, 160, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Ellipse 209.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 350, 270));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setText("Usted se encuentra en:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 200, 20));

        jblRegistroentbancaria.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        getContentPane().add(jblRegistroentbancaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 230, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNom_EntBancariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNom_EntBancariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNom_EntBancariaActionPerformed

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

    private void btnCancelar_registro_EntBancariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar_registro_EntBancariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelar_registro_EntBancariaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar_registro_EntBancaria;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnRegistrar_EntBancaria;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JComboBox<String> cmbCiudad_EntBancaria;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jblRegistroentbancaria;
    private javax.swing.JLabel lblNom_entidadbancaria;
    private javax.swing.JLabel lblRegistro_ent_bancaria;
    private javax.swing.JLabel lblrepresentante_entbancaria;
    private javax.swing.JTextArea txaDescripcion_EntBancaria;
    private javax.swing.JTextField txtCant_comun_EntBancaria;
    private javax.swing.JTextField txtDir_EntBancaria;
    private javax.swing.JTextField txtNom_EntBancaria;
    private javax.swing.JTextField txtRepresentante_EntBancaria;
    // End of variables declaration//GEN-END:variables
}