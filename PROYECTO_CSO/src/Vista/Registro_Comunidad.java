
package Vista;

import Conexion.Conexion;
import Modelo.Comunidad;
import com.mysql.jdbc.CallableStatement;
import controlador.CamposController;
import controlador.RegistroCobrosController;
import controlador.RegistroComunidadController;
import controlador.VentanasController;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Registro_Comunidad extends javax.swing.JFrame {
    public Registro_Comunidad() {
        initComponents();
            this.setLocationRelativeTo(null);
        CamposController.mostrarnombreventana(lblregistrocomunidad, jpanelbackground);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        jpanelbackground = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNom_comunidad = new javax.swing.JTextField();
        cmbCiudad_comunidad = new javax.swing.JComboBox<>();
        cmbCanton_comunidad = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jcdFundacion_comunidad = new com.toedter.calendar.JCalendar();
        jLabel9 = new javax.swing.JLabel();
        txtDir_comunidad = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnRegistrar_finca = new javax.swing.JButton();
        btnCancelar_registro_finca = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaDescripcion_comunidad = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaRef_comunidad = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        lblregistrocomunidad = new javax.swing.JLabel();
        lblRegistro_comunidad = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("PERFIL\n");
        jButton3.setBorder(null);
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
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 100, 40));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("REPORTES");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 100, 40));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("CONSULTAS");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 100, 40));

        btnRegistro.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistro.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistro.setText("REGISTROS");
        btnRegistro.setBorder(null);
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 100, 40));

        btnInicio.setBackground(new java.awt.Color(255, 255, 255));
        btnInicio.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(0, 0, 0));
        btnInicio.setText("INICIO");
        btnInicio.setBorder(null);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        jPanel1.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 100, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 50));

        jpanelbackground.setBackground(new java.awt.Color(255, 255, 255));
        jpanelbackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("CANTÓN:");
        jpanelbackground.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 310, -1, 20));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setText("NOMBRE:");
        jpanelbackground.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 149, -1, 20));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setText("CIUDAD:");
        jpanelbackground.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 232, -1, 20));

        txtNom_comunidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNom_comunidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNom_comunidadActionPerformed(evt);
            }
        });
        txtNom_comunidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNom_comunidadKeyTyped(evt);
            }
        });
        jpanelbackground.add(txtNom_comunidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 210, 20));

        cmbCiudad_comunidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "guayaquil", "machala", "quevedo" }));
        cmbCiudad_comunidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cmbCiudad_comunidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCiudad_comunidadActionPerformed(evt);
            }
        });
        jpanelbackground.add(cmbCiudad_comunidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 233, 140, 20));

        cmbCanton_comunidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "guayas", "el oro", "los rios" }));
        cmbCanton_comunidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpanelbackground.add(cmbCanton_comunidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 311, 140, 20));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setText("FECHA DE FUNDACIÓN:");
        jpanelbackground.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 407, -1, 20));

        jcdFundacion_comunidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpanelbackground.add(jcdFundacion_comunidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 418, -1, 140));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setText("DIRECCIÓN:");
        jpanelbackground.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 149, -1, 20));

        txtDir_comunidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDir_comunidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDir_comunidadActionPerformed(evt);
            }
        });
        jpanelbackground.add(txtDir_comunidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, 210, 20));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setText("DESCRIPCIÓN :");
        jpanelbackground.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, -1, 20));

        btnRegistrar_finca.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnRegistrar_finca.setForeground(new java.awt.Color(0, 0, 51));
        btnRegistrar_finca.setText("REGISTRAR");
        btnRegistrar_finca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnRegistrar_finca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar_fincaActionPerformed(evt);
            }
        });
        jpanelbackground.add(btnRegistrar_finca, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 729, 170, 40));

        btnCancelar_registro_finca.setBackground(new java.awt.Color(204, 0, 0));
        btnCancelar_registro_finca.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnCancelar_registro_finca.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar_registro_finca.setText("CANCELAR");
        btnCancelar_registro_finca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnCancelar_registro_finca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelar_registro_fincaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelar_registro_fincaMouseExited(evt);
            }
        });
        btnCancelar_registro_finca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar_registro_fincaActionPerformed(evt);
            }
        });
        jpanelbackground.add(btnCancelar_registro_finca, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 729, 160, 40));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("REFERENCIA:");
        jpanelbackground.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 233, -1, -1));

        txaDescripcion_comunidad.setColumns(20);
        txaDescripcion_comunidad.setRows(5);
        txaDescripcion_comunidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setViewportView(txaDescripcion_comunidad);

        jpanelbackground.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 310, -1, -1));

        txaRef_comunidad.setColumns(20);
        txaRef_comunidad.setRows(5);
        txaRef_comunidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(txaRef_comunidad);

        jpanelbackground.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 232, -1, 50));

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel13.setText("Usted se encuentra en:");
        jpanelbackground.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 200, 20));

        lblregistrocomunidad.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jpanelbackground.add(lblregistrocomunidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 180, 20));

        lblRegistro_comunidad.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        lblRegistro_comunidad.setForeground(new java.awt.Color(0, 0, 0));
        lblRegistro_comunidad.setText("REGISTRO DE COMUNIDAD");
        jpanelbackground.add(lblRegistro_comunidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 81, 690, 50));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/circulo 100px.png"))); // NOI18N
        jpanelbackground.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 600, 100, 90));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/circulo 300px.png"))); // NOI18N
        jpanelbackground.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 520, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/circulo 200px.png"))); // NOI18N
        jpanelbackground.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 680, -1, -1));

        getContentPane().add(jpanelbackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNom_comunidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNom_comunidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNom_comunidadActionPerformed

    private void cmbCiudad_comunidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCiudad_comunidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCiudad_comunidadActionPerformed

    private void txtDir_comunidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDir_comunidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDir_comunidadActionPerformed

    private void btnCancelar_registro_fincaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar_registro_fincaActionPerformed
    VentanasController.cerrarRegistroComunidad();
    VentanasController.abrirInicio();        // TODO add your handling code here:
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

    private void btnRegistrar_fincaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar_fincaActionPerformed
        RegistroComunidadController.registrarComunidad(new Comunidad(txtNom_comunidad.getText(),cmbCiudad_comunidad.getSelectedItem().toString(),cmbCanton_comunidad.getSelectedItem().toString(),jcdFundacion_comunidad.getDate(),txtDir_comunidad.getText(),txaRef_comunidad.getText(),txaDescripcion_comunidad.getText(),"A")); 
      //campo.limpiar(jpanelbackground);
    }//GEN-LAST:event_btnRegistrar_fincaActionPerformed

    private void txtNom_comunidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNom_comunidadKeyTyped
        // TODO add your handling code here:
        if(!Character.isLetter(evt.getKeyChar())){
            evt.consume();
        
        }
    }//GEN-LAST:event_txtNom_comunidadKeyTyped

    private void btnCancelar_registro_fincaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelar_registro_fincaMouseEntered
CamposController.setColor(btnCancelar_registro_finca);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelar_registro_fincaMouseEntered

    private void btnCancelar_registro_fincaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelar_registro_fincaMouseExited
CamposController.resetColor(btnCancelar_registro_finca);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelar_registro_fincaMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar_registro_finca;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnRegistrar_finca;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JComboBox<String> cmbCanton_comunidad;
    public javax.swing.JComboBox<String> cmbCiudad_comunidad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JCalendar jcdFundacion_comunidad;
    private javax.swing.JPanel jpanelbackground;
    private javax.swing.JLabel lblRegistro_comunidad;
    private javax.swing.JLabel lblregistrocomunidad;
    private javax.swing.JTextArea txaDescripcion_comunidad;
    private javax.swing.JTextArea txaRef_comunidad;
    private javax.swing.JTextField txtDir_comunidad;
    private javax.swing.JTextField txtNom_comunidad;
    // End of variables declaration//GEN-END:variables
}
