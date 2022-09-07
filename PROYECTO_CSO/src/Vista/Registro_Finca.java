
package Vista;

import Conexion.Conexion;
import Modelo.Finca;
import com.mysql.jdbc.CallableStatement;
import controlador.CamposController;
import controlador.RegistroFincaController;
import controlador.TablasRegistroController;
import controlador.VentanasController;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 * Formulario de Registro de Fincas
 * @author User
 */
public class Registro_Finca extends javax.swing.JFrame {
    int id_com=0;
    /**
     * Inicializacion de Formulario de Registro de Finca
     */
    public Registro_Finca() {
        initComponents();
          this.setLocationRelativeTo(null);
        CamposController.mostrarnombreventana(jblregistrofinca,jpanelbackground);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jpanelbackground = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcomunidad = new javax.swing.JTable();
        btnCancelar_registro_finca = new javax.swing.JButton();
        btnRegistrar_finca = new javax.swing.JButton();
        txtidcomunidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jcdFundacion_finca = new com.toedter.calendar.JCalendar();
        jLabel8 = new javax.swing.JLabel();
        txtNom_finca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbCiudad_finca = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDir_finca = new javax.swing.JTextField();
        jblregistrofinca = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 0, 100, 40));

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
        jPanel1.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(627, 0, 100, 40));

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
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 0, 100, 40));

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
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 0, 100, 40));

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
        jPanel1.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 0, 100, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 50));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel10.setText("Usted se encuentra en:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 210, 20));

        jpanelbackground.setBackground(new java.awt.Color(255, 255, 255));
        jpanelbackground.setForeground(new java.awt.Color(0, 0, 0));
        jpanelbackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("REGISTRO DE FINCA");
        jpanelbackground.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 520, 50));

        tblcomunidad.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), null));
        tblcomunidad.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tblcomunidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblcomunidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblcomunidadMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblcomunidad);

        jpanelbackground.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 730, 230));

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
        jpanelbackground.add(btnCancelar_registro_finca, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 720, 160, 40));

        btnRegistrar_finca.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnRegistrar_finca.setForeground(new java.awt.Color(0, 0, 51));
        btnRegistrar_finca.setText("REGISTRAR");
        btnRegistrar_finca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnRegistrar_finca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar_fincaActionPerformed(evt);
            }
        });
        jpanelbackground.add(btnRegistrar_finca, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 720, 170, 40));

        txtidcomunidad.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        txtidcomunidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtidcomunidad.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtidcomunidad.setEnabled(false);
        txtidcomunidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidcomunidadActionPerformed(evt);
            }
        });
        jpanelbackground.add(txtidcomunidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 60, 30));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setText("PROPIETARIO:");
        jpanelbackground.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 100, 20));

        jcdFundacion_finca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpanelbackground.add(jcdFundacion_finca, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, 140));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setText("AÑO FUNCIONAMIENTO:");
        jpanelbackground.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 20));

        txtNom_finca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNom_finca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNom_fincaActionPerformed(evt);
            }
        });
        txtNom_finca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNom_fincaKeyTyped(evt);
            }
        });
        jpanelbackground.add(txtNom_finca, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 200, 20));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setText("NOMBRE:");
        jpanelbackground.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, 20));

        cmbCiudad_finca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "guayaquil", "machala", "quevedo" }));
        cmbCiudad_finca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cmbCiudad_finca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCiudad_fincaItemStateChanged(evt);
            }
        });
        cmbCiudad_finca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCiudad_fincaActionPerformed(evt);
            }
        });
        jpanelbackground.add(cmbCiudad_finca, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 210, 20));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setText("CIUDAD:");
        jpanelbackground.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, 20));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setText("DIRECCIÓN:");
        jpanelbackground.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 90, 20));

        txtDir_finca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDir_finca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDir_fincaActionPerformed(evt);
            }
        });
        jpanelbackground.add(txtDir_finca, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 210, 20));

        jblregistrofinca.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jpanelbackground.add(jblregistrofinca, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 270, 20));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/circulo 200px.png"))); // NOI18N
        jpanelbackground.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 680, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/circulo 300px.png"))); // NOI18N
        jpanelbackground.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 520, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/circulo 100px.png"))); // NOI18N
        jpanelbackground.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 670, 100, 90));

        getContentPane().add(jpanelbackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 975, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCiudad_fincaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCiudad_fincaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCiudad_fincaActionPerformed

    private void txtDir_fincaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDir_fincaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDir_fincaActionPerformed

    private void btnCancelar_registro_fincaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar_registro_fincaActionPerformed
    VentanasController.cerrarRegistroFinca();
    VentanasController.abrirInicio();        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelar_registro_fincaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    VentanasController.abrirSubmenuConsulta();
    VentanasController.cerrarRegistroFinca();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
    VentanasController.abrirInicio();
      VentanasController.cerrarRegistroFinca();

    }//GEN-LAST:event_btnInicioActionPerformed

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered

    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    VentanasController.abrirReportes();
      VentanasController.cerrarRegistroFinca();

// TODO add your handling code here:
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
  VentanasController.abrirSubmenuRegistro();
  VentanasController.cerrarRegistroFinca();

    }//GEN-LAST:event_btnRegistroActionPerformed

    private void txtNom_fincaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNom_fincaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNom_fincaActionPerformed

    private void tblcomunidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcomunidadMouseClicked
        int row=tblcomunidad.getSelectedRow();
        if(row!=-1){
            id_com=Integer.parseInt(String.valueOf(tblcomunidad.getModel().getValueAt(row,0)));
            txtidcomunidad.setText(String.valueOf(id_com));

        }// TODO add your handling code here:
    }//GEN-LAST:event_tblcomunidadMouseClicked

    private void txtidcomunidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidcomunidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidcomunidadActionPerformed

    private void btnRegistrar_fincaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar_fincaActionPerformed
        RegistroFincaController.registrarFinca(new Finca(txtNom_finca.getText(), cmbCiudad_finca.getSelectedItem().toString(), txtDir_finca.getText(), jcdFundacion_finca.getDate(), txtidcomunidad.getText()));
        CamposController.limpiar(jpanelbackground);
// TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrar_fincaActionPerformed

    private void cmbCiudad_fincaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCiudad_fincaItemStateChanged
        TablasRegistroController.llenarTablaPropietarioByCiudad(tblcomunidad,cmbCiudad_finca);     // TODO add your handling code here:
    }//GEN-LAST:event_cmbCiudad_fincaItemStateChanged

    private void btnCancelar_registro_fincaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelar_registro_fincaMouseEntered
CamposController.setColor(btnCancelar_registro_finca);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelar_registro_fincaMouseEntered

    private void btnCancelar_registro_fincaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelar_registro_fincaMouseExited
CamposController.resetColor(btnCancelar_registro_finca);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelar_registro_fincaMouseExited

    private void txtNom_fincaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNom_fincaKeyTyped
       if(!Character.isLetter(evt.getKeyChar())){
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNom_fincaKeyTyped

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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jblregistrofinca;
    private com.toedter.calendar.JCalendar jcdFundacion_finca;
    private javax.swing.JPanel jpanelbackground;
    private javax.swing.JTable tblcomunidad;
    private javax.swing.JTextField txtDir_finca;
    private javax.swing.JTextField txtNom_finca;
    private javax.swing.JTextField txtidcomunidad;
    // End of variables declaration//GEN-END:variables
}
