
package Vista;

import Conexion.Conexion;
import Modelo.Presidente;
import com.mysql.jdbc.CallableStatement;
import controlador.CamposController;
import controlador.RegistroPresidenteController;
import controlador.TablasRegistroController;
import controlador.VentanasController;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 * Formulario de registro de Presidente
 * @author User
 */
public class Registro_Presidente extends javax.swing.JFrame {
    int id_com=0;
    
    public Registro_Presidente() {
        initComponents();
        TablasRegistroController.llenarTablaComunidadByCiudad(tblcomunidad, cmbCiudad_presidente);
        this.setLocationRelativeTo(null);
        CamposController.mostrarnombreventana(jblRegistropresidente,jpanelbackground);
        
    }
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelbackground = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtnom_presidente = new javax.swing.JTextField();
        txtci_presidente = new javax.swing.JTextField();
        cmbCiudad_presidente = new javax.swing.JComboBox<>();
        cbmsexopresidente = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtDireccion_propietario = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCod_comunidad = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jblRegistropresidente = new javax.swing.JLabel();
        txtedadpresidente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcomunidad = new javax.swing.JTable();
        txtidcomunidad = new javax.swing.JTextField();
        btnRegistrar_presidente = new javax.swing.JButton();
        btnCancelar_registro_presidente = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpanelbackground.setBackground(new java.awt.Color(255, 255, 255));
        jpanelbackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        jLabel1.setText("REGISTRO DEL PRESIDENTE");
        jpanelbackground.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 720, 50));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        jLabel2.setText("DE LA COMUNIDAD");
        jpanelbackground.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 500, 50));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("SEXO:");
        jpanelbackground.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 388, -1, 20));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setText("NOMBRE:");
        jpanelbackground.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 234, -1, 20));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setText("C.I. PRESIDENTE:");
        jpanelbackground.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, 20));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setText("CIUDAD:");
        jpanelbackground.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 330, -1, 20));

        txtnom_presidente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtnom_presidente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnom_presidenteKeyTyped(evt);
            }
        });
        jpanelbackground.add(txtnom_presidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 235, 210, 20));

        txtci_presidente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtci_presidente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtci_presidenteKeyTyped(evt);
            }
        });
        jpanelbackground.add(txtci_presidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 287, 210, 20));

        cmbCiudad_presidente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "guayaquil", "machala", "quevedo" }));
        cmbCiudad_presidente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cmbCiudad_presidente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCiudad_presidenteItemStateChanged(evt);
            }
        });
        jpanelbackground.add(cmbCiudad_presidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 331, 140, 20));

        cbmsexopresidente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "masculino", "femenino" }));
        cbmsexopresidente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpanelbackground.add(cbmsexopresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 389, 140, 20));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setText("DIRECCIÓN:");
        jpanelbackground.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 234, -1, 20));

        txtDireccion_propietario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpanelbackground.add(txtDireccion_propietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 235, 210, 20));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setText("CONTACTO:");
        jpanelbackground.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 286, -1, 20));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setText("COMUNIDAD:");
        jpanelbackground.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 452, -1, 20));

        txtCod_comunidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpanelbackground.add(txtCod_comunidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 287, 210, 20));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setText("EDAD:");
        jpanelbackground.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 325, -1, 30));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 100, 40));

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
        jPanel1.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 100, 40));

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
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 100, 40));

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
        jPanel1.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 100, 40));

        jpanelbackground.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 50));

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel13.setText("Usted se encuentra en:");
        jpanelbackground.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 210, 20));

        jblRegistropresidente.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jpanelbackground.add(jblRegistropresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 60, 260, 20));

        txtedadpresidente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtedadpresidente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtedadpresidenteKeyTyped(evt);
            }
        });
        jpanelbackground.add(txtedadpresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 326, 90, 30));

        tblcomunidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
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

        jpanelbackground.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 489, 730, 198));

        txtidcomunidad.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        txtidcomunidad.setForeground(new java.awt.Color(51, 51, 51));
        txtidcomunidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtidcomunidad.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtidcomunidad.setEnabled(false);
        jpanelbackground.add(txtidcomunidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 447, 60, 30));

        btnRegistrar_presidente.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnRegistrar_presidente.setForeground(new java.awt.Color(0, 0, 51));
        btnRegistrar_presidente.setText("REGISTRAR");
        btnRegistrar_presidente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnRegistrar_presidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar_presidenteActionPerformed(evt);
            }
        });
        jpanelbackground.add(btnRegistrar_presidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 721, 170, 40));

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
        jpanelbackground.add(btnCancelar_registro_presidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(679, 721, 160, 40));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/circulo 300px.png"))); // NOI18N
        jpanelbackground.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 520, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/circulo 100px.png"))); // NOI18N
        jpanelbackground.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 640, 100, 90));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/circulo 200px.png"))); // NOI18N
        jpanelbackground.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 680, -1, -1));

        getContentPane().add(jpanelbackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 975, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelar_registro_presidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar_registro_presidenteActionPerformed
    VentanasController.cerrarRegistroPresidente();
    VentanasController.abrirInicio();        // TODO add your handling code here
    }//GEN-LAST:event_btnCancelar_registro_presidenteActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
   VentanasController.abrirInicio();
    VentanasController.cerrarRegistroPresidente();

    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
  VentanasController.abrirSubmenuRegistro();
    VentanasController.cerrarRegistroPresidente();
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnCancelar_registro_presidenteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelar_registro_presidenteMouseEntered
CamposController.setColor(btnCancelar_registro_presidente);
    }//GEN-LAST:event_btnCancelar_registro_presidenteMouseEntered

    private void btnCancelar_registro_presidenteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelar_registro_presidenteMouseExited
CamposController.resetColor(btnCancelar_registro_presidente);
    }//GEN-LAST:event_btnCancelar_registro_presidenteMouseExited

    private void tblcomunidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcomunidadMouseClicked
        int row=tblcomunidad.getSelectedRow();
        if(row!=-1){
            id_com=Integer.parseInt(String.valueOf(tblcomunidad.getModel().getValueAt(row,0)));
            txtidcomunidad.setText(String.valueOf(id_com));
     
        }// TODO add your handling code here:
    }//GEN-LAST:event_tblcomunidadMouseClicked

    private void btnRegistrar_presidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar_presidenteActionPerformed
     RegistroPresidenteController.registrarPresidente(new Presidente(txtidcomunidad.getText(), txtnom_presidente.getText(), Integer.parseInt(txtci_presidente.getText()), txtci_presidente.getText(), cbmsexopresidente.getSelectedItem().toString(), txtCod_comunidad.getText(), cmbCiudad_presidente.getSelectedItem().toString(), txtDireccion_propietario.getText())); 
     //CamposController.limpiar(jpanelbackground);
// TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrar_presidenteActionPerformed

    private void cmbCiudad_presidenteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCiudad_presidenteItemStateChanged
       TablasRegistroController.llenarTablaComunidadByCiudad(tblcomunidad, cmbCiudad_presidente);  // TODO add your handling code here:
    }//GEN-LAST:event_cmbCiudad_presidenteItemStateChanged

    private void txtci_presidenteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtci_presidenteKeyTyped
        // validacion del campo cedula
          if(txtci_presidente.getText().length() >=10 || !Character.isDigit(evt.getKeyChar())){
         evt.consume();
        }
    }//GEN-LAST:event_txtci_presidenteKeyTyped

    private void txtnom_presidenteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnom_presidenteKeyTyped
        // validacion del campo nombre
          if(Character.isDigit(evt.getKeyChar())){
        evt.consume();
        }
    }//GEN-LAST:event_txtnom_presidenteKeyTyped

    private void txtedadpresidenteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtedadpresidenteKeyTyped
        // validacion del campo edad
        if(!Character.isDigit(evt.getKeyChar()) || txtedadpresidente.getText().length()>=3){
        evt.consume();
        }
    }//GEN-LAST:event_txtedadpresidenteKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    VentanasController.abrirSubmenuConsulta();
    VentanasController.cerrarRegistroPresidente();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        VentanasController.abrirReportes();
        VentanasController.cerrarRegistroPresidente();

    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar_registro_presidente;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnRegistrar_presidente;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JComboBox<String> cbmsexopresidente;
    private javax.swing.JComboBox<String> cmbCiudad_presidente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jblRegistropresidente;
    private javax.swing.JPanel jpanelbackground;
    private javax.swing.JTable tblcomunidad;
    private javax.swing.JTextField txtCod_comunidad;
    private javax.swing.JTextField txtDireccion_propietario;
    private javax.swing.JTextField txtci_presidente;
    private javax.swing.JTextField txtedadpresidente;
    private javax.swing.JTextField txtidcomunidad;
    private javax.swing.JTextField txtnom_presidente;
    // End of variables declaration//GEN-END:variables
}
