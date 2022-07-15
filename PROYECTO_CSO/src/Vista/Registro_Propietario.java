/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Conexion.Conexion;
import com.mysql.jdbc.CallableStatement;
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
public class Registro_Propietario extends javax.swing.JFrame {

    /**
     * Creates new form Registro_Propietario
     */
    int id_com=0;
    public Registro_Propietario() {
        initComponents();
         this.setLocationRelativeTo(null);
        mostrarnombreventana(jblregistropropietario);
        llenarTabla();
    }
     public void mostrarnombreventana(JLabel j){
        String formulario = getClass().getSimpleName();
       j.setText(formulario.replace("_", " "));
     }
     public void limpiar(){
                txtnom_propietario.setText("");
                txtcontactopropietario.setText("");
                txtedadpropietario.setText("");
                txtci_propietario.setText("");
                txtidcomunidad.setText("");
                txtcontactopropietario.setText("");
                txtDireccion_propietario.setText("");
     }
     public void llenarTabla(){
        DefaultTableModel modelo =new DefaultTableModel();
        tblcomunidad.setModel(modelo);
        Conexion connect=new Conexion();
        com.mysql.jdbc.Connection conexion=(com.mysql.jdbc.Connection) connect.getconection();
        CallableStatement myCall = null;
        
        ResultSet rs=null;
        try {
            myCall=(CallableStatement) conexion.prepareCall("{call getPropietariosByCiudad(?)}");
            myCall.setString(1,cbmciudadsecretaria.getSelectedItem().toString());
            rs=myCall.executeQuery();
            modelo.addColumn("id_comunidad");
            modelo.addColumn("nombre");
            modelo.addColumn("ciudad");
            modelo.addColumn("canton");
            modelo.addColumn("fecha_fundacion");
            modelo.addColumn("direccion");
            modelo.addColumn("referencia");
            modelo.addColumn("descripcion");
            modelo.addColumn("estado");     
            
            
            System.out.println("ejecuta");
            while(rs.next()){
                Object fila[]=new Object[9];
                for(int i=0;i<9;i++){
                    fila[i]=rs.getObject(i+1);                    
                }
                modelo.addRow(fila);
            }            
        } catch (SQLException ex) {
            System.err.println("ERROR");
        }finally {try{myCall.close();} catch (Exception e){}
        try{rs.close();} catch (Exception e){}
        try{conexion.close();} catch (Exception e){}
        }     
   }
      public void ingresarPropietario(){
        
        if(!txtnom_propietario.getText().isEmpty()&&!txtcontactopropietario.getText().isEmpty()&&!txtedadpropietario.getText().isEmpty()
                &&!cmbsexopropietario.getSelectedItem().toString().isEmpty()&&!txtci_propietario.getText().isEmpty() && txtci_propietario.getText().length()==10
                &&!txtidcomunidad.getText().isEmpty()&&!cbmciudadsecretaria.getSelectedItem().toString().isEmpty()
                &&!txtcontactopropietario.getText().toString().isEmpty()&&!txtDireccion_propietario.getText().toString().isEmpty())
         {
            Conexion conect= new Conexion();
       Connection conexion=(Connection) conect.getconection();
         
        CallableStatement myCall = null;
        
        try {
                    myCall=(CallableStatement) conexion.prepareCall("{call putPropietario(?,?,?,?,?,?,?,?)}");
                        myCall.setString(1, txtnom_propietario.getText().toString());
                        myCall.setInt(2,Integer.parseInt(txtedadpropietario.getText().toString()));
                        myCall.setString(3,txtci_propietario.getText().toString());
                        myCall.setString(4, cmbsexopropietario.getSelectedItem().toString());
                        myCall.setString(5, txtcontactopropietario.getText().toString());
                        myCall.setString(6,cbmciudadsecretaria.getSelectedItem().toString());
                        myCall.setString(7,txtDireccion_propietario.getText().toString());
                        myCall.setInt(8,Integer.parseInt(txtidcomunidad.getText().toString()));
                        myCall.executeUpdate();
                        JOptionPane.showMessageDialog(null, "REGISTRO DE PROPIETARIO EXITOSO !");
                        //this.dispose();
                        limpiar();   
             } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO !\nERROR DE CONEXION"+ex);
             }finally {
                    try{myCall.close();} catch (Exception e){}
                    try{conexion.close();} catch (Exception e){}
            }
              /*panel.removeAll();
            panel.repaint();
                limpiar();*/
        }else {JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO !\nREVISE QUE LOS CAMPOS ESTEN LLENADOS CORRECTAMENTE.");}

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
        txtcontactopropietario = new javax.swing.JTextField();
        txtDireccion_propietario = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jblregistropropietario = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnom_propietario = new javax.swing.JTextField();
        txtedadpropietario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtci_propietario = new javax.swing.JTextField();
        cmbsexopropietario = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbmciudadsecretaria = new javax.swing.JComboBox<>();
        btnRegistrar_propietario = new javax.swing.JButton();
        btnCancelar_registro_propietario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcomunidad = new javax.swing.JTable();
        txtidcomunidad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 100, 40));

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
        jPanel1.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 100, 40));

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
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 100, 40));

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
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 100, 40));

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
        jPanel1.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 100, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 50));

        jpanelbackground.setBackground(new java.awt.Color(216, 243, 220));
        jpanelbackground.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpanelbackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtcontactopropietario.setBackground(java.awt.Color.white);
        txtcontactopropietario.setForeground(new java.awt.Color(0, 0, 0));
        txtcontactopropietario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpanelbackground.add(txtcontactopropietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 210, -1));

        txtDireccion_propietario.setBackground(java.awt.Color.white);
        txtDireccion_propietario.setForeground(new java.awt.Color(0, 0, 0));
        txtDireccion_propietario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDireccion_propietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccion_propietarioActionPerformed(evt);
            }
        });
        jpanelbackground.add(txtDireccion_propietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 210, 20));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("COMUNIDAD:");
        jpanelbackground.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, 20));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("DIRECCIÓN:");
        jpanelbackground.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, -1, 20));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("CONTACTO:");
        jpanelbackground.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, -1, -1));

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Usted se encuentra en:");
        jpanelbackground.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 20));

        jblregistropropietario.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jpanelbackground.add(jblregistropropietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 220, 20));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("NOMBRE:");
        jpanelbackground.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, 20));

        txtnom_propietario.setBackground(java.awt.Color.white);
        txtnom_propietario.setForeground(new java.awt.Color(0, 0, 0));
        txtnom_propietario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtnom_propietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnom_propietarioActionPerformed(evt);
            }
        });
        txtnom_propietario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnom_propietarioKeyTyped(evt);
            }
        });
        jpanelbackground.add(txtnom_propietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 210, 20));

        txtedadpropietario.setBackground(java.awt.Color.white);
        txtedadpropietario.setForeground(new java.awt.Color(0, 0, 0));
        txtedadpropietario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtedadpropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtedadpropietarioActionPerformed(evt);
            }
        });
        txtedadpropietario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtedadpropietarioKeyTyped(evt);
            }
        });
        jpanelbackground.add(txtedadpropietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 60, 30));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("EDAD:");
        jpanelbackground.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("C.I. PROPIETARIO:");
        jpanelbackground.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, 20));

        txtci_propietario.setBackground(java.awt.Color.white);
        txtci_propietario.setForeground(new java.awt.Color(0, 0, 0));
        txtci_propietario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtci_propietario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtci_propietarioKeyTyped(evt);
            }
        });
        jpanelbackground.add(txtci_propietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 210, 20));

        cmbsexopropietario.setBackground(new java.awt.Color(255, 255, 255));
        cmbsexopropietario.setForeground(new java.awt.Color(0, 0, 0));
        cmbsexopropietario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "masculino", "femenino" }));
        cmbsexopropietario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cmbsexopropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbsexopropietarioActionPerformed(evt);
            }
        });
        jpanelbackground.add(cmbsexopropietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 140, 20));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("SEXO:");
        jpanelbackground.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, 20));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CIUDAD:");
        jpanelbackground.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, -1, 20));

        cbmciudadsecretaria.setBackground(new java.awt.Color(255, 255, 255));
        cbmciudadsecretaria.setForeground(new java.awt.Color(0, 0, 0));
        cbmciudadsecretaria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "guayaquil", "machala", "quevedo" }));
        cbmciudadsecretaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbmciudadsecretaria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbmciudadsecretariaItemStateChanged(evt);
            }
        });
        cbmciudadsecretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmciudadsecretariaActionPerformed(evt);
            }
        });
        jpanelbackground.add(cbmciudadsecretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 140, 30));

        btnRegistrar_propietario.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnRegistrar_propietario.setForeground(new java.awt.Color(0, 0, 51));
        btnRegistrar_propietario.setText("REGISTRAR");
        btnRegistrar_propietario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnRegistrar_propietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar_propietarioActionPerformed(evt);
            }
        });
        jpanelbackground.add(btnRegistrar_propietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 710, 170, 40));

        btnCancelar_registro_propietario.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelar_registro_propietario.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnCancelar_registro_propietario.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar_registro_propietario.setText("CANCELAR");
        btnCancelar_registro_propietario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnCancelar_registro_propietario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelar_registro_propietarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelar_registro_propietarioMouseExited(evt);
            }
        });
        btnCancelar_registro_propietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar_registro_propietarioActionPerformed(evt);
            }
        });
        jpanelbackground.add(btnCancelar_registro_propietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 710, 160, 40));

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

        jpanelbackground.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 730, 230));

        txtidcomunidad.setBackground(java.awt.Color.white);
        txtidcomunidad.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        txtidcomunidad.setForeground(new java.awt.Color(0, 0, 0));
        txtidcomunidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtidcomunidad.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtidcomunidad.setEnabled(false);
        jpanelbackground.add(txtidcomunidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 60, 30));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(8, 28, 21));
        jLabel1.setText("REGISTRO PROPIETARIO");
        jpanelbackground.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 630, 50));

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

    private void txtDireccion_propietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccion_propietarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccion_propietarioActionPerformed

    private void txtnom_propietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnom_propietarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnom_propietarioActionPerformed

    private void txtedadpropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtedadpropietarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtedadpropietarioActionPerformed

    private void cmbsexopropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbsexopropietarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbsexopropietarioActionPerformed

    private void cbmciudadsecretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmciudadsecretariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbmciudadsecretariaActionPerformed

    private void btnRegistrar_propietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar_propietarioActionPerformed
        ingresarPropietario();// TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrar_propietarioActionPerformed
public void setColor(JButton j){
j.setBackground(new Color(255,51,51));
}
public void resetColor(JButton j1){
j1.setBackground(new Color(153,0,0));
}
    private void btnCancelar_registro_propietarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelar_registro_propietarioMouseEntered
        setColor(btnCancelar_registro_propietario);
    }//GEN-LAST:event_btnCancelar_registro_propietarioMouseEntered

    private void btnCancelar_registro_propietarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelar_registro_propietarioMouseExited
        resetColor(btnCancelar_registro_propietario);
    }//GEN-LAST:event_btnCancelar_registro_propietarioMouseExited

    private void btnCancelar_registro_propietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar_registro_propietarioActionPerformed
    VentanasController.cerrarRegistroPropietario();
    VentanasController.abrirInicio();        // TODO add your handling code here
    }//GEN-LAST:event_btnCancelar_registro_propietarioActionPerformed

    private void tblcomunidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcomunidadMouseClicked
        int row=tblcomunidad.getSelectedRow();
        if(row!=-1){
            id_com=Integer.parseInt(String.valueOf(tblcomunidad.getModel().getValueAt(row,0)));
            txtidcomunidad.setText(String.valueOf(id_com));

        }// TODO add your handling code here:
    }//GEN-LAST:event_tblcomunidadMouseClicked

    private void cbmciudadsecretariaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbmciudadsecretariaItemStateChanged
        llenarTabla();// TODO add your handling code here:
    }//GEN-LAST:event_cbmciudadsecretariaItemStateChanged

    private void txtci_propietarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtci_propietarioKeyTyped
  if(txtci_propietario.getText().length() >=10 || !Character.isDigit(evt.getKeyChar())){
         evt.consume();
        }
    }//GEN-LAST:event_txtci_propietarioKeyTyped

    private void txtedadpropietarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtedadpropietarioKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar()) || txtedadpropietario.getText().length()>=3){
            evt.consume();
        }
    }//GEN-LAST:event_txtedadpropietarioKeyTyped

    private void txtnom_propietarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnom_propietarioKeyTyped
        // TODO add your handling code here:
        if(Character.isDigit(evt.getKeyChar())){
        evt.consume();
        }
    }//GEN-LAST:event_txtnom_propietarioKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar_registro_propietario;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnRegistrar_propietario;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JComboBox<String> cbmciudadsecretaria;
    private javax.swing.JComboBox<String> cmbsexopropietario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jblregistropropietario;
    private javax.swing.JPanel jpanelbackground;
    private javax.swing.JTable tblcomunidad;
    private javax.swing.JTextField txtDireccion_propietario;
    private javax.swing.JTextField txtci_propietario;
    private javax.swing.JTextField txtcontactopropietario;
    private javax.swing.JTextField txtedadpropietario;
    private javax.swing.JTextField txtidcomunidad;
    private javax.swing.JTextField txtnom_propietario;
    // End of variables declaration//GEN-END:variables
}
