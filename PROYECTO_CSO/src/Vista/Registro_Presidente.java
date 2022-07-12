
package Vista;

import Conexion.Conexion;
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

public class Registro_Presidente extends javax.swing.JFrame {
    int id_com=0;
    public Registro_Presidente() {
        initComponents();
        llenarTabla();
        this.setLocationRelativeTo(null);
        mostrarnombreventana(jblRegistropresidente);
    }
     public void mostrarnombreventana(JLabel j){
        String formulario = getClass().getSimpleName();
       j.setText(formulario.replace("_", " "));
     }
     
     public void limpiar(){
                txtnom_propietario.setText("");
                txtci_propietario.setText("");
                txtDireccion_propietario.setText("");
                txtedadpresidente.setText("");
                txtCod_comunidad.setText("");
     }
     public void llenarTabla(){
        DefaultTableModel modelo =new DefaultTableModel();
        tblcomunidad.setModel(modelo);
        Conexion connect=new Conexion();
        com.mysql.jdbc.Connection conexion=(com.mysql.jdbc.Connection) connect.getconection();
        PreparedStatement ps=null,ps2=null;
        ResultSet rs=null;
        try {
            ps=(com.mysql.jdbc.PreparedStatement) conexion.prepareStatement("select id_comunidad,nombre,ciudad,canton,fecha_fundacion,direccion,referencia,descripcion,estado from Comunidad where ciudad=?");
             ps.setString(1,cmbCiudad_presidente.getSelectedItem().toString());
            rs=ps.executeQuery();
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
        }finally {try{ps.close();} catch (Exception e){}
        try{rs.close();} catch (Exception e){}
        try{conexion.close();} catch (Exception e){}
        }     
   }
      public void ingresarPresidente(){
        
        if(!txtnom_propietario.getText().isEmpty()&&!txtci_propietario.getText().isEmpty()&&!txtedadpresidente.getText().isEmpty()
                &&!cbmsexopresidente.getSelectedItem().toString().isEmpty()&&!txtDireccion_propietario.getText().isEmpty()
                &&!txtCod_comunidad.getText().isEmpty()&&!cmbCiudad_presidente.getSelectedItem().toString().isEmpty()
                &&!txtidcomunidad.getText().toString().isEmpty())
         {
            Conexion conect= new Conexion();
            Connection conexion=(Connection) conect.getconection();

            PreparedStatement ps2=null;
            ResultSet rs=null;
                try {

                        ps2=(PreparedStatement) conexion.prepareStatement("insert into Presidente (nombre,edad,cedula,sexo,contacto,ciudad,direccion,comunidad_id) values(?,?,?,?,?,?,?,?)");
                        ps2.setString(1, txtnom_propietario.getText().toString());
                        ps2.setInt(2,Integer.parseInt(txtedadpresidente.getText().toString()));
                        ps2.setString(3,txtci_propietario.getText().toString());
                        ps2.setString(4, cbmsexopresidente.getSelectedItem().toString());
                        ps2.setString(5, txtCod_comunidad.getText().toString());
                        ps2.setString(6,cmbCiudad_presidente.getSelectedItem().toString());
                        ps2.setString(7,txtDireccion_propietario.getText().toString());
                        ps2.setInt(8,Integer.parseInt(txtidcomunidad.getText().toString()));
                        ps2.executeUpdate();
                        JOptionPane.showMessageDialog(null, "REGISTRO DE PRESIDENTE EXITOSO !");
                        //this.dispose();
                        limpiar();   
             } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO !\nERROR DE CONEXION"+ex);
             }finally {
                    try{ps2.close();} catch (Exception e){}
                    try{conexion.close();} catch (Exception e){}
            }
              /*panel.removeAll();
            panel.repaint();
                limpiar();*/
        }else {JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO !\nREVISE QUE LOS CAMPOS ESTEN LLENADOS CORRECTAMENTE.");}

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
        txtidcomunidad = new javax.swing.JTextField();
        btnRegistrar_presidente = new javax.swing.JButton();
        btnCancelar_registro_presidente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpanelbackground.setBackground(new java.awt.Color(216, 243, 220));
        jpanelbackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(8, 28, 21));
        jLabel1.setText("REGISTRO DEL PRESIDENTE");
        jpanelbackground.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 720, 50));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(8, 28, 21));
        jLabel2.setText("DE LA COMUNIDAD");
        jpanelbackground.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 500, 50));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("SEXO:");
        jpanelbackground.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 388, -1, 20));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("NOMBRE:");
        jpanelbackground.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 234, -1, 20));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("C.I. PROPIETARIO:");
        jpanelbackground.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 286, -1, 20));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("CIUDAD:");
        jpanelbackground.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 330, -1, 20));

        txtnom_propietario.setBackground(java.awt.Color.white);
        txtnom_propietario.setForeground(new java.awt.Color(0, 0, 0));
        txtnom_propietario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtnom_propietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnom_propietarioActionPerformed(evt);
            }
        });
        jpanelbackground.add(txtnom_propietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 235, 210, 20));

        txtci_propietario.setBackground(java.awt.Color.white);
        txtci_propietario.setForeground(new java.awt.Color(0, 0, 0));
        txtci_propietario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtci_propietario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtci_propietarioKeyTyped(evt);
            }
        });
        jpanelbackground.add(txtci_propietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 287, 210, 20));

        cmbCiudad_presidente.setBackground(new java.awt.Color(255, 255, 255));
        cmbCiudad_presidente.setForeground(new java.awt.Color(0, 0, 0));
        cmbCiudad_presidente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "guayaquil", "machala", "quevedo" }));
        cmbCiudad_presidente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cmbCiudad_presidente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCiudad_presidenteItemStateChanged(evt);
            }
        });
        cmbCiudad_presidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCiudad_presidenteActionPerformed(evt);
            }
        });
        jpanelbackground.add(cmbCiudad_presidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 331, 140, 20));

        cbmsexopresidente.setBackground(new java.awt.Color(255, 255, 255));
        cbmsexopresidente.setForeground(new java.awt.Color(0, 0, 0));
        cbmsexopresidente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "masculino", "femenino" }));
        cbmsexopresidente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbmsexopresidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmsexopresidenteActionPerformed(evt);
            }
        });
        jpanelbackground.add(cbmsexopresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 389, 140, 20));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("DIRECCIÓN:");
        jpanelbackground.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 234, -1, 20));

        txtDireccion_propietario.setBackground(java.awt.Color.white);
        txtDireccion_propietario.setForeground(new java.awt.Color(0, 0, 0));
        txtDireccion_propietario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDireccion_propietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccion_propietarioActionPerformed(evt);
            }
        });
        jpanelbackground.add(txtDireccion_propietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 235, 210, 20));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("CONTACTO:");
        jpanelbackground.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 286, -1, 20));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("COMUNIDAD:");
        jpanelbackground.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 452, -1, 20));

        txtCod_comunidad.setBackground(java.awt.Color.white);
        txtCod_comunidad.setForeground(new java.awt.Color(0, 0, 0));
        txtCod_comunidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpanelbackground.add(txtCod_comunidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 287, 210, 20));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("EDAD:");
        jpanelbackground.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 325, -1, 30));

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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 0, 100, 40));

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
        jPanel1.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(627, 0, 100, 40));

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
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 0, 100, 40));

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
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 0, 100, 40));

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
        jPanel1.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 0, 100, 40));

        jpanelbackground.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 50));

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Usted se encuentra en:");
        jpanelbackground.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 210, 20));

        jblRegistropresidente.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jpanelbackground.add(jblRegistropresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 60, 260, 20));

        txtedadpresidente.setBackground(java.awt.Color.white);
        txtedadpresidente.setForeground(new java.awt.Color(0, 0, 0));
        txtedadpresidente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtedadpresidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtedadpresidenteActionPerformed(evt);
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

        txtidcomunidad.setBackground(java.awt.Color.white);
        txtidcomunidad.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        txtidcomunidad.setForeground(new java.awt.Color(0, 0, 0));
        txtidcomunidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtidcomunidad.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtidcomunidad.setEnabled(false);
        txtidcomunidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidcomunidadActionPerformed(evt);
            }
        });
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

        getContentPane().add(jpanelbackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 975, 800));

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

    private void btnRegistrar_presidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar_presidenteActionPerformed
     ingresarPresidente();   // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrar_presidenteActionPerformed

    private void cmbCiudad_presidenteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCiudad_presidenteItemStateChanged
            llenarTabla();   // TODO add your handling code here:
    }//GEN-LAST:event_cmbCiudad_presidenteItemStateChanged

    private void txtci_propietarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtci_propietarioKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar()) && txtci_propietario.getText().length() !=10 ){
        evt.consume();
        }
    }//GEN-LAST:event_txtci_propietarioKeyTyped

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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jblRegistropresidente;
    private javax.swing.JPanel jpanelbackground;
    private javax.swing.JTable tblcomunidad;
    private javax.swing.JTextField txtCod_comunidad;
    private javax.swing.JTextField txtDireccion_propietario;
    private javax.swing.JTextField txtci_propietario;
    private javax.swing.JTextField txtedadpresidente;
    private javax.swing.JTextField txtidcomunidad;
    private javax.swing.JTextField txtnom_propietario;
    // End of variables declaration//GEN-END:variables
}
