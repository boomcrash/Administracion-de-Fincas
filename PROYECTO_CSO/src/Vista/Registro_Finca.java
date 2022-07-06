
package Vista;

import javax.swing.JLabel;

public class Registro_Finca extends javax.swing.JFrame {

    public Registro_Finca() {
        initComponents();
          this.setLocationRelativeTo(null);
        mostrarnombreventana(jblregistrofinca);
    }
  public void mostrarnombreventana(JLabel j){
        String formulario = getClass().getSimpleName();
       j.setText(formulario.replace("_", " "));
     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNom_finca = new javax.swing.JTextField();
        cmbCiudad_finca = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jcdFundacion_finca = new com.toedter.calendar.JCalendar();
        jLabel9 = new javax.swing.JLabel();
        txtDir_finca = new javax.swing.JTextField();
        btnRegistrar_finca = new javax.swing.JButton();
        btnCancelar_registro_finca = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jblregistrofinca = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblpropietarios = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("REGISTRO DE FINCA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 380, 50));

        jLabel5.setText("NOMBRE:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, 20));

        jLabel6.setText("PROPIETARIO:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 90, 20));

        jLabel7.setText("CIUDAD:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, -1, 20));

        txtNom_finca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNom_finca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNom_fincaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNom_finca, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 200, 20));

        cmbCiudad_finca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cmbCiudad_finca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCiudad_fincaActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCiudad_finca, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 210, 20));

        jLabel8.setText("AÑO FUNCIONAMIENTO:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, 20));

        jcdFundacion_finca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jcdFundacion_finca, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, 140));

        jLabel9.setText("DIRECCIÓN:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 80, 20));

        txtDir_finca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDir_finca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDir_fincaActionPerformed(evt);
            }
        });
        getContentPane().add(txtDir_finca, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 210, 20));

        btnRegistrar_finca.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnRegistrar_finca.setForeground(new java.awt.Color(0, 0, 51));
        btnRegistrar_finca.setText("REGISTRAR");
        btnRegistrar_finca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(btnRegistrar_finca, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 710, 170, 40));

        btnCancelar_registro_finca.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnCancelar_registro_finca.setForeground(new java.awt.Color(153, 0, 0));
        btnCancelar_registro_finca.setText("CANCELAR");
        btnCancelar_registro_finca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnCancelar_registro_finca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar_registro_fincaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar_registro_finca, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 710, 160, 40));

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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 0, 100, 40));

        btnInicio.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnInicio.setText("INICIO");
        btnInicio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        jPanel1.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(627, 0, 100, 40));

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

        jButton4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton4.setText("REPORTES");
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 0, 100, 40));

        btnRegistro.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnRegistro.setText("REGISTROS");
        btnRegistro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 0, 100, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 50));

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel10.setText("Usted se encuentra en:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 200, 20));

        jblregistrofinca.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        getContentPane().add(jblregistrofinca, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 270, 20));

        tblpropietarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tblpropietarios.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tblpropietarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "NOMBRE", "CIUDAD", "CANTÓN", "FUNDACIÓN", "DIRECCIÓN", "REFERENCIA", "DESCRIPCIÓN"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblpropietarios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 730, 230));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Ellipse 209.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 510, 380, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCiudad_fincaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCiudad_fincaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCiudad_fincaActionPerformed

    private void txtDir_fincaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDir_fincaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDir_fincaActionPerformed

    private void btnCancelar_registro_fincaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar_registro_fincaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelar_registro_fincaActionPerformed

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

    private void txtNom_fincaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNom_fincaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNom_fincaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar_registro_finca;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnRegistrar_finca;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JComboBox<String> cmbCiudad_finca;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jblregistrofinca;
    private com.toedter.calendar.JCalendar jcdFundacion_finca;
    private javax.swing.JTable tblpropietarios;
    private javax.swing.JTextField txtDir_finca;
    private javax.swing.JTextField txtNom_finca;
    // End of variables declaration//GEN-END:variables
}
