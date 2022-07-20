/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Conexion.Conexion;
import Modelo.Director;
import Modelo.Usuario;
import static Vista.Login.id_Usuario;
import com.mysql.jdbc.CallableStatement;
import controlador.CamposController;
import controlador.RegistroDirectorController;
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
 *Formulario de Registro de Directores
 * @author User
 */
public class Registro_Director extends javax.swing.JFrame {
    int id_com;
    /**
     * Creates new form Registro_Director
     */
    public Registro_Director() {
        initComponents();
        this.setLocationRelativeTo(null);
        CamposController.mostrarnombreventana(jblregistrodirector,jpanelbackground);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        jpanelbackground = new javax.swing.JPanel();
        txtci_director = new javax.swing.JTextField();
        txtcontactodirector = new javax.swing.JTextField();
        txtdireccion_director = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtcontraseñadirector = new javax.swing.JTextField();
        txtusuariodirector = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbmciudaddirector = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbsexodirector = new javax.swing.JComboBox<>();
        txtedaddirector = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnom_director = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jblregistrodirector = new javax.swing.JLabel();
        btnRegistrar_director = new javax.swing.JButton();
        btnCancelar_registro_director = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcomunidad = new javax.swing.JTable();
        txtiddirector = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jpanelbackground.setBackground(new java.awt.Color(255, 255, 255));
        jpanelbackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtci_director.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtci_director.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtci_directorActionPerformed(evt);
            }
        });
        txtci_director.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtci_directorKeyTyped(evt);
            }
        });
        jpanelbackground.add(txtci_director, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 210, 20));

        txtcontactodirector.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtcontactodirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontactodirectorActionPerformed(evt);
            }
        });
        jpanelbackground.add(txtcontactodirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 210, -1));

        txtdireccion_director.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtdireccion_director.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccion_directorActionPerformed(evt);
            }
        });
        jpanelbackground.add(txtdireccion_director, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 210, 20));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setText("DIRECCIÓN:");
        jpanelbackground.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 90, 20));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setText("CONTACTO:");
        jpanelbackground.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 90, -1));

        txtcontraseñadirector.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpanelbackground.add(txtcontraseñadirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 210, 20));

        txtusuariodirector.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpanelbackground.add(txtusuariodirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 210, 20));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setText("NOMBRE DE USUARIO:");
        jpanelbackground.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 160, 20));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setText("CONTRASEÑA:");
        jpanelbackground.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 100, 20));

        cbmciudaddirector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "guayaquil", "machala", "quevedo" }));
        cbmciudaddirector.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbmciudaddirector.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbmciudaddirectorItemStateChanged(evt);
            }
        });
        cbmciudaddirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmciudaddirectorActionPerformed(evt);
            }
        });
        jpanelbackground.add(cbmciudaddirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 140, 20));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("CIUDAD:");
        jpanelbackground.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 60, 20));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setText("SEXO:");
        jpanelbackground.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 50, 20));

        cmbsexodirector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "masculino", "femenino" }));
        cmbsexodirector.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cmbsexodirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbsexodirectorActionPerformed(evt);
            }
        });
        jpanelbackground.add(cmbsexodirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 140, 20));

        txtedaddirector.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtedaddirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtedaddirectorActionPerformed(evt);
            }
        });
        txtedaddirector.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtedaddirectorKeyTyped(evt);
            }
        });
        jpanelbackground.add(txtedaddirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 60, 30));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("EDAD:");
        jpanelbackground.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 50, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setText("NOMBRE:");
        jpanelbackground.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 70, 20));

        txtnom_director.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtnom_director.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnom_directorActionPerformed(evt);
            }
        });
        txtnom_director.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnom_directorKeyTyped(evt);
            }
        });
        jpanelbackground.add(txtnom_director, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 210, 20));

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel13.setText("Usted se encuentra en:");
        jpanelbackground.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 210, 20));

        jblregistrodirector.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jpanelbackground.add(jblregistrodirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 220, 20));

        btnRegistrar_director.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnRegistrar_director.setForeground(new java.awt.Color(0, 0, 51));
        btnRegistrar_director.setText("REGISTRAR");
        btnRegistrar_director.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnRegistrar_director.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar_directorActionPerformed(evt);
            }
        });
        jpanelbackground.add(btnRegistrar_director, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 730, 170, 40));

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
        jpanelbackground.add(btnCancelar_registro_director, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 730, 160, 40));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(8, 28, 21));
        jLabel1.setText("REGISTRO DIRECTOR");
        jpanelbackground.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 550, 50));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("C.I. DIRECTOR:");
        jpanelbackground.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 110, 20));

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

        jpanelbackground.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 730, 230));

        txtiddirector.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        txtiddirector.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtiddirector.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtiddirector.setEnabled(false);
        txtiddirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtiddirectorActionPerformed(evt);
            }
        });
        jpanelbackground.add(txtiddirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 60, 30));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setText("COMUNIDAD:");
        jpanelbackground.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, -1, -1));

        getContentPane().add(jpanelbackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 975, 800));

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

    private void txtdireccion_directorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccion_directorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccion_directorActionPerformed

    private void cbmciudaddirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmciudaddirectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbmciudaddirectorActionPerformed

    private void cmbsexodirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbsexodirectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbsexodirectorActionPerformed

    private void txtedaddirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtedaddirectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtedaddirectorActionPerformed

    private void txtnom_directorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnom_directorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnom_directorActionPerformed

    private void btnRegistrar_directorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar_directorActionPerformed
        RegistroDirectorController.registrarDirector(new Director(txtiddirector.getText(), txtnom_director.getText(), Integer.parseInt(txtedaddirector.getText()), txtci_director.getText(), cmbsexodirector.getSelectedItem().toString(), txtcontactodirector.getText(), cbmciudaddirector.getSelectedItem().toString(), txtdireccion_director.getText()), new Usuario(txtusuariodirector.getText(), txtcontraseñadirector.getText(), 1)); 
       CamposController.limpiar(jpanelbackground);
// TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrar_directorActionPerformed

    private void btnCancelar_registro_directorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelar_registro_directorMouseEntered
        CamposController.setColor(btnCancelar_registro_director);
    }//GEN-LAST:event_btnCancelar_registro_directorMouseEntered

    private void btnCancelar_registro_directorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelar_registro_directorMouseExited
        CamposController.resetColor(btnCancelar_registro_director);
    }//GEN-LAST:event_btnCancelar_registro_directorMouseExited

    private void btnCancelar_registro_directorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar_registro_directorActionPerformed
    VentanasController.cerrarRegistroDirector();
    VentanasController.abrirInicio();        // TODO add your handling code here
    }//GEN-LAST:event_btnCancelar_registro_directorActionPerformed

    private void txtci_directorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtci_directorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtci_directorActionPerformed

    private void txtcontactodirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontactodirectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontactodirectorActionPerformed

    private void txtiddirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtiddirectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtiddirectorActionPerformed

    private void cbmciudaddirectorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbmciudaddirectorItemStateChanged
        TablasRegistroController.llenarTablaComunidadByCiudad(tblcomunidad,cbmciudaddirector);    // TODO add your handling code here:
    }//GEN-LAST:event_cbmciudaddirectorItemStateChanged

    private void tblcomunidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcomunidadMouseClicked
    int row=tblcomunidad.getSelectedRow();
    if(row!=-1){
        id_com=Integer.parseInt(String.valueOf(tblcomunidad.getModel().getValueAt(row,0)));
        txtiddirector.setText(String.valueOf(id_com));
    }// TODO add your handling code here:
    }//GEN-LAST:event_tblcomunidadMouseClicked

    private void txtci_directorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtci_directorKeyTyped
        // TODO add your handling code here:
       if(txtci_director.getText().length() >=10 || !Character.isDigit(evt.getKeyChar())){
         evt.consume();
         
        }
    }//GEN-LAST:event_txtci_directorKeyTyped

    private void txtedaddirectorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtedaddirectorKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar()) || txtedaddirector.getText().length()>=3){
       evt.consume();
        }
    }//GEN-LAST:event_txtedaddirectorKeyTyped

    private void txtnom_directorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnom_directorKeyTyped
        // TODO add your handling code here:
      if(Character.isDigit(evt.getKeyChar())){
        evt.consume();
        }
    }//GEN-LAST:event_txtnom_directorKeyTyped

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar_registro_director;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnRegistrar_director;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JComboBox<String> cbmciudaddirector;
    private javax.swing.JComboBox<String> cmbsexodirector;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jblregistrodirector;
    private javax.swing.JPanel jpanelbackground;
    private javax.swing.JTable tblcomunidad;
    private javax.swing.JTextField txtci_director;
    private javax.swing.JTextField txtcontactodirector;
    private javax.swing.JTextField txtcontraseñadirector;
    private javax.swing.JTextField txtdireccion_director;
    private javax.swing.JTextField txtedaddirector;
    private javax.swing.JTextField txtiddirector;
    private javax.swing.JTextField txtnom_director;
    private javax.swing.JTextField txtusuariodirector;
    // End of variables declaration//GEN-END:variables
}
