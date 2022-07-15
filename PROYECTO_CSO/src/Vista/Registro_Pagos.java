/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Conexion.Conexion;
import Modelo.Pago;
import com.mysql.jdbc.CallableStatement;
import controlador.RegistroPagoController;
import controlador.TablasRegistroController;
import controlador.VentanasController;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Registro_Pagos extends javax.swing.JFrame {
    int id_com=0,id_bank=0;
    /**
     * Creates new form Registro_Pagos
     */
    public Registro_Pagos() {
        initComponents();
        this.setLocationRelativeTo(null);
          mostrarnombreventana(jblregistropago);
          this.setSize(1100, 800);
          TablasRegistroController.llenarTablaPresidente(tblpresidentes);
          TablasRegistroController.llenarTablaBanco(tblbancos);
    }
    
  public void mostrarnombreventana(JLabel j){
        String formulario = getClass().getSimpleName();
       j.setText(formulario.replace("_", " "));
     }
    
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelbackground = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jcdfecha_pago = new com.toedter.calendar.JCalendar();
        jScrollPane1 = new javax.swing.JScrollPane();
        txadescripcion_pago = new javax.swing.JTextArea();
        txtcantidad = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jblregistropago = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblpresidentes = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblbancos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtidbanco = new javax.swing.JTextField();
        txtidpresidente1 = new javax.swing.JTextField();
        btnRegistrar_director = new javax.swing.JButton();
        btnCancelar_registro_director = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpanelbackground.setBackground(new java.awt.Color(216, 243, 220));
        jpanelbackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(8, 28, 21));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(45, 106, 79));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CONSULTAS");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 100, 40));

        btnInicio.setBackground(new java.awt.Color(45, 106, 79));
        btnInicio.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setText("INICIO");
        btnInicio.setBorder(null);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        jPanel1.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 100, 40));

        jButton3.setBackground(new java.awt.Color(45, 106, 79));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
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
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 100, 40));

        jButton4.setBackground(new java.awt.Color(45, 106, 79));
        jButton4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("REPORTES");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 100, 40));

        btnRegistro.setBackground(new java.awt.Color(45, 106, 79));
        btnRegistro.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistro.setText("REGISTROS");
        btnRegistro.setBorder(null);
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 100, 40));

        jpanelbackground.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 50));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(8, 28, 21));
        jLabel1.setText("REGISTRO DE PAGOS");
        jpanelbackground.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 530, 50));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("FECHA DE PAGO:");
        jpanelbackground.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 120, 20));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("DESCRIPCIÓN:");
        jpanelbackground.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 100, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CANTIDAD:");
        jpanelbackground.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, -1, -1));
        jpanelbackground.add(jcdfecha_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        txadescripcion_pago.setBackground(java.awt.Color.white);
        txadescripcion_pago.setColumns(20);
        txadescripcion_pago.setForeground(new java.awt.Color(0, 0, 0));
        txadescripcion_pago.setRows(5);
        txadescripcion_pago.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(txadescripcion_pago);

        jpanelbackground.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, -1, -1));

        txtcantidad.setBackground(java.awt.Color.white);
        txtcantidad.setForeground(new java.awt.Color(0, 0, 0));
        txtcantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadActionPerformed(evt);
            }
        });
        txtcantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcantidadKeyTyped(evt);
            }
        });
        jpanelbackground.add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 160, 90, 40));

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Usted se encuentra en:");
        jpanelbackground.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 210, 20));

        jblregistropago.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jpanelbackground.add(jblregistropago, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 220, 20));

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

        jpanelbackground.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 410, 180));

        tblbancos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblbancos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblbancos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblbancosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblbancos);

        jpanelbackground.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 470, 410, 180));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("PRESIDENTE ");
        jpanelbackground.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, -1, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("ENTIDAD BANCARIA");
        jpanelbackground.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, -1, -1));

        txtidbanco.setBackground(java.awt.Color.white);
        txtidbanco.setForeground(new java.awt.Color(0, 0, 0));
        txtidbanco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtidbanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidbancoActionPerformed(evt);
            }
        });
        txtidbanco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidbancoKeyTyped(evt);
            }
        });
        jpanelbackground.add(txtidbanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 430, 160, 30));

        txtidpresidente1.setBackground(java.awt.Color.white);
        txtidpresidente1.setForeground(new java.awt.Color(0, 0, 0));
        txtidpresidente1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtidpresidente1.setEnabled(false);
        txtidpresidente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidpresidente1ActionPerformed(evt);
            }
        });
        txtidpresidente1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidpresidente1KeyTyped(evt);
            }
        });
        jpanelbackground.add(txtidpresidente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 150, 30));

        btnRegistrar_director.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnRegistrar_director.setForeground(new java.awt.Color(0, 0, 51));
        btnRegistrar_director.setText("REGISTRAR");
        btnRegistrar_director.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnRegistrar_director.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar_directorActionPerformed(evt);
            }
        });
        jpanelbackground.add(btnRegistrar_director, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 670, 170, 40));

        btnCancelar_registro_director.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelar_registro_director.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnCancelar_registro_director.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar_registro_director.setText("CANCELAR");
        btnCancelar_registro_director.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnCancelar_registro_director.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelar_registro_directorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelar_registro_directorMouseExited(evt);
            }
        });
        btnCancelar_registro_director.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar_registro_directorActionPerformed(evt);
            }
        });
        jpanelbackground.add(btnCancelar_registro_director, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 670, 160, 40));

        getContentPane().add(jpanelbackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void txtidbancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidbancoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidbancoActionPerformed

    private void txtidpresidente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidpresidente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidpresidente1ActionPerformed

    private void btnRegistrar_directorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar_directorActionPerformed
        RegistroPagoController.registrarPago(new Pago(txadescripcion_pago.getText(), txtcantidad.getText(), jcdfecha_pago.getDate(), txtidpresidente1.getText(), txtidbanco.getText()));        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrar_directorActionPerformed
public void setColor(JButton j){
j.setBackground(new Color(255,51,51));
}
public void resetColor(JButton j1){
j1.setBackground(new Color(153,0,0));
}
    private void btnCancelar_registro_directorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelar_registro_directorMouseEntered
        setColor(btnCancelar_registro_director);
    }//GEN-LAST:event_btnCancelar_registro_directorMouseEntered

    private void btnCancelar_registro_directorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelar_registro_directorMouseExited
        resetColor(btnCancelar_registro_director);
    }//GEN-LAST:event_btnCancelar_registro_directorMouseExited

    private void btnCancelar_registro_directorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar_registro_directorActionPerformed
    VentanasController.cerrarRegistroPagos();
    VentanasController.abrirInicio();        // TODO add your handling code here
    }//GEN-LAST:event_btnCancelar_registro_directorActionPerformed

    private void txtcantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidadKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar())){
        evt.consume();
        }
    }//GEN-LAST:event_txtcantidadKeyTyped

    private void txtcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidadActionPerformed

    private void txtidpresidente1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidpresidente1KeyTyped
    if(txtidpresidente1.getText().length() >= 10 && !Character.isDigit(evt.getKeyChar())){
    evt.consume();
}

        // TODO add your handling code here:
    }//GEN-LAST:event_txtidpresidente1KeyTyped

    private void txtidbancoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidbancoKeyTyped
        // TODO add your handling code here:
        if(txtidbanco.getText().length() >= 13 && !Character.isDigit(evt.getKeyChar())){
        evt.consume();
        }
    }//GEN-LAST:event_txtidbancoKeyTyped

    private void tblpresidentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblpresidentesMouseClicked
        int row=tblpresidentes.getSelectedRow();
        if(row!=-1){
            id_com=Integer.parseInt(String.valueOf(tblpresidentes.getModel().getValueAt(row,0)));
            txtidpresidente1.setText(String.valueOf(id_com));
        }       // TODO add your handling code here:
    }//GEN-LAST:event_tblpresidentesMouseClicked

    private void tblbancosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblbancosMouseClicked
        int row=tblbancos.getSelectedRow();
        if(row!=-1){
            id_bank=Integer.parseInt(String.valueOf(tblbancos.getModel().getValueAt(row,0)));
            txtidbanco.setText(String.valueOf(id_bank));
        }      // TODO add your handling code here:
    }//GEN-LAST:event_tblbancosMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar_registro_director;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnRegistrar_director;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel jblregistropago;
    private com.toedter.calendar.JCalendar jcdfecha_pago;
    private javax.swing.JPanel jpanelbackground;
    private javax.swing.JTable tblbancos;
    private javax.swing.JTable tblpresidentes;
    private javax.swing.JTextArea txadescripcion_pago;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtidbanco;
    private javax.swing.JTextField txtidpresidente1;
    // End of variables declaration//GEN-END:variables
}
