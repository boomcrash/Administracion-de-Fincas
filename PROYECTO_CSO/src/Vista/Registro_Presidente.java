
package Vista;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Registro_Presidente extends javax.swing.JFrame {
    public Registro_Presidente() {
        initComponents();
        this.setLocationRelativeTo(null);
        mostrarnombreventana(jblRegistropresidente);
    }
     public void mostrarnombreventana(JLabel j){
        String formulario = getClass().getSimpleName();
       j.setText(formulario.replace("_", " "));
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtnom_propietario = new javax.swing.JTextField();
        txtci_propietario = new javax.swing.JTextField();
        cmbCiudad_presidente = new javax.swing.JComboBox<>();
        cbmsexopresidente = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtDireccion_propietario = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCod_comunidad = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnRegistrar_presidente = new javax.swing.JButton();
        btnCancelar_registro_presidente = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jblRegistropresidente = new javax.swing.JLabel();
        txtedadpresidente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcomunidad = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("REGISTRO DEL PRESIDENTE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 550, 50));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("DE LA COMUNIDAD");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 400, 50));

        jLabel4.setText("SEXO:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, 20));

        jLabel5.setText("NOMBRE:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, 20));

        jLabel6.setText("C.I. PROPIETARIO:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, 20));

        jLabel7.setText("CIUDAD:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, -1, 20));

        txtnom_propietario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtnom_propietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnom_propietarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtnom_propietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 210, 20));

        txtci_propietario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtci_propietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 210, 20));

        cmbCiudad_presidente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cmbCiudad_presidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCiudad_presidenteActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCiudad_presidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, 140, 20));

        cbmsexopresidente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbmsexopresidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmsexopresidenteActionPerformed(evt);
            }
        });
        getContentPane().add(cbmsexopresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 140, 20));

        jLabel9.setText("DIRECCIÓN:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, -1, 20));

        txtDireccion_propietario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDireccion_propietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccion_propietarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtDireccion_propietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, 210, 20));

        jLabel10.setText("CONTACTO:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, -1, 20));

        jLabel11.setText("COMUNIDAD:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, 20));

        txtCod_comunidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtCod_comunidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, 210, 20));

        jLabel12.setText("EDAD:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 40, 30));

        btnRegistrar_presidente.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnRegistrar_presidente.setForeground(new java.awt.Color(0, 0, 51));
        btnRegistrar_presidente.setText("REGISTRAR");
        btnRegistrar_presidente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(btnRegistrar_presidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 790, 170, 40));

        btnCancelar_registro_presidente.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelar_registro_presidente.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnCancelar_registro_presidente.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar_registro_presidente.setText("CANCELAR");
        btnCancelar_registro_presidente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnCancelar_registro_presidente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelar_registro_presidenteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelar_registro_presidenteMouseExited(evt);
            }
        });
        btnCancelar_registro_presidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar_registro_presidenteActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar_registro_presidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 790, 160, 40));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 50));

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel13.setText("Usted se encuentra en:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 200, 20));

        jblRegistropresidente.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        getContentPane().add(jblRegistropresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 230, 20));

        txtedadpresidente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtedadpresidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtedadpresidenteActionPerformed(evt);
            }
        });
        getContentPane().add(txtedadpresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 282, 90, 30));

        tblcomunidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tblcomunidad.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tblcomunidad.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblcomunidad);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 730, 230));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Ellipse 209.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 600, 390, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCiudad_presidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCiudad_presidenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCiudad_presidenteActionPerformed

    private void btnCancelar_registro_presidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar_registro_presidenteActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_btnCancelar_registro_presidenteActionPerformed

    private void txtDireccion_propietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccion_propietarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccion_propietarioActionPerformed

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

    private void txtnom_propietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnom_propietarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnom_propietarioActionPerformed

    private void cbmsexopresidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmsexopresidenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbmsexopresidenteActionPerformed
public void setColor(JButton j){
j.setBackground(new Color(255,51,51));
}
public void resetColor(JButton j1){
j1.setBackground(new Color(153,0,0));
}
    private void btnCancelar_registro_presidenteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelar_registro_presidenteMouseEntered
setColor(btnCancelar_registro_presidente);
    }//GEN-LAST:event_btnCancelar_registro_presidenteMouseEntered

    private void btnCancelar_registro_presidenteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelar_registro_presidenteMouseExited
resetColor(btnCancelar_registro_presidente);
    }//GEN-LAST:event_btnCancelar_registro_presidenteMouseExited

    private void txtedadpresidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtedadpresidenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtedadpresidenteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar_registro_presidente;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnRegistrar_presidente;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JComboBox<String> cbmsexopresidente;
    private javax.swing.JComboBox<String> cmbCiudad_presidente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jblRegistropresidente;
    private javax.swing.JTable tblcomunidad;
    private javax.swing.JTextField txtCod_comunidad;
    private javax.swing.JTextField txtDireccion_propietario;
    private javax.swing.JTextField txtci_propietario;
    private javax.swing.JTextField txtedadpresidente;
    private javax.swing.JTextField txtnom_propietario;
    // End of variables declaration//GEN-END:variables
}
