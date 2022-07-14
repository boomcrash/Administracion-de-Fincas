/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Conexion.Conexion;
import com.mysql.jdbc.CallableStatement;
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
public class Registro_Cobros extends javax.swing.JFrame {
    int id_pro=0,id_pre=0;
    /**
     * Creates new form Registro_Cobros
     */
    public Registro_Cobros() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(1100, 800);
        mostrarnombreventana(jblregistrocobros);
        llenarTablaPropietario();
        llenarTablaPresidente();
    }
 public void mostrarnombreventana(JLabel j){
        String formulario = getClass().getSimpleName();
       j.setText(formulario.replace("_", " "));
     }
 
     public void llenarTablaPropietario(){
        DefaultTableModel modelo =new DefaultTableModel();
        tblpropietario.setModel(modelo);
        Conexion connect=new Conexion();
        com.mysql.jdbc.Connection conexion=(com.mysql.jdbc.Connection) connect.getconection();      
        ResultSet rs=null;
        CallableStatement myCall = null;
        try {
            myCall=(CallableStatement) conexion.prepareCall("{call getPropietarios()}");    
            rs=myCall.executeQuery();
            modelo.addColumn("id_propietario");
            modelo.addColumn("nombre");
            modelo.addColumn("edad");
            modelo.addColumn("cedula");
            modelo.addColumn("sexo");
            modelo.addColumn("contacto");
            modelo.addColumn("ciudad");
            modelo.addColumn("direccion");
            modelo.addColumn("comunidad_id");
            
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
    public void llenarTablaPresidente(){
        DefaultTableModel modelo =new DefaultTableModel();
        tblpresidentes.setModel(modelo);
        Conexion connect=new Conexion();
        com.mysql.jdbc.Connection conexion=(com.mysql.jdbc.Connection) connect.getconection();
        ResultSet rs=null;
        CallableStatement myCall = null;
        
        
        try {
            myCall=(CallableStatement) conexion.prepareCall("{call getPresidentes()}");
            rs=myCall.executeQuery();
            modelo.addColumn("id_presidente");
            modelo.addColumn("nombre");
            modelo.addColumn("edad");
            modelo.addColumn("cedula");
            modelo.addColumn("sexo");
            modelo.addColumn("contacto");
            modelo.addColumn("ciudad");
            modelo.addColumn("direccion");
            modelo.addColumn("comunidad_id");
            
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
    
     public void ingresarCobro(){
        
        if(!txadescripcion_cobro.getText().isEmpty()&&!txtcantidadcobro.getText().isEmpty()&&!txtidpropietario1.getText().isEmpty()
                &&!txtidpresidente.getText().isEmpty()&&!jdcfechacobro.getDate().toString().isEmpty()&&!jdcfechavence.getDate().toString().isEmpty())
         {
            Conexion conect= new Conexion();
        Connection conexion=(Connection) conect.getconection();
         
        CallableStatement myCall = null;
        
        try {
                    myCall=(CallableStatement) conexion.prepareCall("{call putCobro(?,?,?,?,?,?)}");
                    
                        myCall.setString(1,jdcfechacobro.getDate().toString() );
                        myCall.setString(2,jdcfechavence.getDate().toString() );
                        myCall.setString(3,txadescripcion_cobro.getText().toString());
                        myCall.setString(4, txtcantidadcobro.getText().toString());
                        myCall.setInt(5,Integer.parseInt(txtidpropietario1.getText().toString()));
                        myCall.setInt(6,Integer.parseInt(txtidpresidente.getText().toString()));
                        myCall.executeUpdate();
                        JOptionPane.showMessageDialog(null, "REGISTRO DE COBRO EXITOSO !");
                        //this.dispose();
                        //limpiar();   
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

        jpanelbackground = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jblregistrocobros = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jdcfechacobro = new com.toedter.calendar.JCalendar();
        jdcfechavence = new com.toedter.calendar.JCalendar();
        txtcantidadcobro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txadescripcion_cobro = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblpropietario = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblpresidentes = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtidpresidente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtidpropietario1 = new javax.swing.JTextField();
        btnRegistrar_director = new javax.swing.JButton();
        btnCancelar_registro_director = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpanelbackground.setBackground(new java.awt.Color(216, 243, 220));
        jpanelbackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(8, 28, 21));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 100, 40));

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
        jPanel2.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 100, 40));

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
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 100, 40));

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
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 100, 40));

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
        jPanel2.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 100, 40));

        jpanelbackground.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 50));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(8, 28, 21));
        jLabel1.setText("REGISTRO DE COBROS");
        jpanelbackground.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 570, 50));

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Usted se encuentra en:");
        jpanelbackground.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 210, 20));

        jblregistrocobros.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jpanelbackground.add(jblregistrocobros, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 220, 20));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("FECHA DE COBRO:");
        jpanelbackground.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("FECHA DE VENCIMIENTO:");
        jpanelbackground.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("DESCRIPCIÓN:");
        jpanelbackground.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("CANTIDAD:");
        jpanelbackground.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, -1, -1));

        jdcfechacobro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpanelbackground.add(jdcfechacobro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, 140));

        jdcfechavence.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpanelbackground.add(jdcfechavence, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, -1, 140));

        txtcantidadcobro.setBackground(java.awt.Color.white);
        txtcantidadcobro.setForeground(new java.awt.Color(0, 0, 0));
        txtcantidadcobro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtcantidadcobro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadcobroActionPerformed(evt);
            }
        });
        txtcantidadcobro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcantidadcobroKeyTyped(evt);
            }
        });
        jpanelbackground.add(txtcantidadcobro, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, 70, 40));

        txadescripcion_cobro.setBackground(java.awt.Color.white);
        txadescripcion_cobro.setColumns(20);
        txadescripcion_cobro.setForeground(new java.awt.Color(0, 0, 0));
        txadescripcion_cobro.setRows(5);
        txadescripcion_cobro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(txadescripcion_cobro);

        jpanelbackground.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, -1, 60));

        tblpropietario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblpropietario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblpropietario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblpropietarioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblpropietario);

        jpanelbackground.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 490, 190));

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
        jScrollPane3.setViewportView(tblpresidentes);

        jpanelbackground.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 480, 480, 190));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("PRESIDENTE:");
        jpanelbackground.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, -1, -1));

        txtidpresidente.setBackground(java.awt.Color.white);
        txtidpresidente.setForeground(new java.awt.Color(0, 0, 0));
        txtidpresidente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtidpresidente.setEnabled(false);
        txtidpresidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidpresidenteActionPerformed(evt);
            }
        });
        jpanelbackground.add(txtidpresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, 80, 30));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("PROPIETARIO:");
        jpanelbackground.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        txtidpropietario1.setBackground(java.awt.Color.white);
        txtidpropietario1.setForeground(new java.awt.Color(0, 0, 0));
        txtidpropietario1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtidpropietario1.setEnabled(false);
        txtidpropietario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidpropietario1ActionPerformed(evt);
            }
        });
        jpanelbackground.add(txtidpropietario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 80, 30));

        btnRegistrar_director.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnRegistrar_director.setForeground(new java.awt.Color(0, 0, 51));
        btnRegistrar_director.setText("REGISTRAR");
        btnRegistrar_director.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnRegistrar_director.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar_directorActionPerformed(evt);
            }
        });
        jpanelbackground.add(btnRegistrar_director, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 690, 170, 40));

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
        jpanelbackground.add(btnCancelar_registro_director, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 690, 160, 40));

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

    private void txtidpresidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidpresidenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidpresidenteActionPerformed

    private void txtidpropietario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidpropietario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidpropietario1ActionPerformed

    private void btnRegistrar_directorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar_directorActionPerformed
        ingresarCobro();        // TODO add your handling code here:
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
        // TODO add your handling code here
    }//GEN-LAST:event_btnCancelar_registro_directorActionPerformed

    private void txtcantidadcobroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadcobroActionPerformed

    }//GEN-LAST:event_txtcantidadcobroActionPerformed

    private void txtcantidadcobroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidadcobroKeyTyped
  if(!Character.isDigit(evt.getKeyChar())){
        evt.consume();
        }
    }//GEN-LAST:event_txtcantidadcobroKeyTyped

    private void tblpropietarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblpropietarioMouseClicked
        int row=tblpropietario.getSelectedRow();
        if(row!=-1){
            id_pro=Integer.parseInt(String.valueOf(tblpropietario.getModel().getValueAt(row,0)));
            txtidpropietario1.setText(String.valueOf(id_pro));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tblpropietarioMouseClicked

    private void tblpresidentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblpresidentesMouseClicked
        int row=tblpresidentes.getSelectedRow();
        if(row!=-1){
            id_pre=Integer.parseInt(String.valueOf(tblpresidentes.getModel().getValueAt(row,0)));
            txtidpresidente.setText(String.valueOf(id_pre));
        }      // TODO add your handling code here:
    }//GEN-LAST:event_tblpresidentesMouseClicked

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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel jblregistrocobros;
    private com.toedter.calendar.JCalendar jdcfechacobro;
    private com.toedter.calendar.JCalendar jdcfechavence;
    private javax.swing.JPanel jpanelbackground;
    private javax.swing.JTable tblpresidentes;
    private javax.swing.JTable tblpropietario;
    private javax.swing.JTextArea txadescripcion_cobro;
    private javax.swing.JTextField txtcantidadcobro;
    private javax.swing.JTextField txtidpresidente;
    private javax.swing.JTextField txtidpropietario1;
    // End of variables declaration//GEN-END:variables
}
