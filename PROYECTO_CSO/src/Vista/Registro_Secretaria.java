
package Vista;

import Conexion.Conexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Registro_Secretaria extends javax.swing.JFrame {
    int id_com;
    public Registro_Secretaria() {
        initComponents();
         this.setLocationRelativeTo(null);
        mostrarnombreventana(jblregistrosecretaria);
    }
    public void mostrarnombreventana(JLabel j){
        String formulario = getClass().getSimpleName();
       j.setText(formulario.replace("_", " "));
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
            ps.setString(1,cbmciudadsecretaria.getSelectedItem().toString());
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
  public void limpiar(){
                txtnom_secretaria.setText("");
                txtedadsecretaria.setText("");
                txtci_secretaria.setText("");
                txtiddirector.setText("");
                txtcontactosecretaria.setText("");
                txtDireccion_secretaria.setText("");
                txtusuariosecretaria.setText("");
                txtcontraseñasecretaria.setText("");
     }
     public int consultarUsuario(){
        int id=0;
        Conexion conect= new Conexion();
        com.mysql.jdbc.Connection conexion2=(com.mysql.jdbc.Connection) conect.getconection();
        PreparedStatement buscador = null;
        ResultSet dato = null;
        //JOptionPane.showMessageDialog(null,txtpassword.getText());
        try{
         buscador= (PreparedStatement) conexion2.prepareStatement("select * from Usuario where usuario=? and contraseña=? and tipo_usuario_id=?");
         buscador.setString(1,txtusuariosecretaria.getText().toString());
         buscador.setString(2,txtcontraseñasecretaria.getText().toString());
         buscador.setInt(3,1);
         dato=buscador.executeQuery();
         if(dato.next())
         {
             id=Integer.parseInt(dato.getString("id_usuario"));
         }
        }catch(SQLException ex)
        {
            System.err.println("ERROR EN OBTENER DATOS");
        }finally{
            try{buscador.close();} catch (Exception e){}
             try{dato.close();} catch (Exception e){}
             try{conexion2.close();} catch (Exception e){}
        }
       return id;
        
    }
     public int registrarUsuario(){
         if(!txtusuariosecretaria.getText().isEmpty()&&!txtcontraseñasecretaria.getText().isEmpty())
         {
            Conexion conect= new Conexion();
            Connection conexion=(Connection) conect.getconection();

            PreparedStatement ps2=null;
            ResultSet rs=null;
                try {
                        ps2=(PreparedStatement) conexion.prepareStatement("insert into Usuario (usuario,contraseña,tipo_usuario_id) values(?,?,?)");
                        ps2.setString(1, txtusuariosecretaria.getText().toString());
                        ps2.setString(2, txtcontraseñasecretaria.getText().toString());
                        ps2.setInt(3,1);
                        ps2.executeUpdate();
                        JOptionPane.showMessageDialog(null, "REGISTRO DE USUARIO EXITOSO !");
                        //this.dispose();
                        
             } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO !\nERROR DE CONEXION");
             }finally {
                    try{ps2.close();} catch (Exception e){}
                    try{conexion.close();} catch (Exception e){}
            }
              /*panel.removeAll();
            panel.repaint();
                limpiar();*/
         }else {JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO !\nREVISE QUE LOS CAMPOS ESTEN LLENADOS CORRECTAMENTE.");}
         
        return consultarUsuario();
    }
     public void ingresarSecretario(){
        
        if(!txtnom_secretaria.getText().isEmpty()&&!txtedadsecretaria.getText().isEmpty()&&!txtci_secretaria.getText().isEmpty()
                &&!cmbsexosecretaria.getSelectedItem().toString().isEmpty()&&!cbmciudadsecretaria.getSelectedItem().toString().isEmpty()
                &&!txtiddirector.getText().isEmpty()&&!txtcontactosecretaria.getText().isEmpty()
                &&!txtDireccion_secretaria.getText().isEmpty()&&!txtusuariosecretaria.getText().isEmpty()
                &&!txtcontraseñasecretaria.getText().isEmpty())
         {
            Conexion conect= new Conexion();
            Connection conexion=(Connection) conect.getconection();

            PreparedStatement ps2=null;
            ResultSet rs=null;
                try {

                        int  id=registrarUsuario();
                        int edad= Integer.parseInt(txtedadsecretaria.getText().toString().trim());
                        int id_dire=Integer.parseInt(txtiddirector.getText().toString().trim());
                        ps2=(PreparedStatement) conexion.prepareStatement("insert into Secretario (nombre,edad,cedula,sexo,contacto,ciudad,direccion,comunidad_id,usuario_id) values(?,?,?,?,?,?,?,?,?)");
                        ps2.setString(1, txtnom_secretaria.getText().toString());
                        ps2.setInt(2,edad);
                        ps2.setString(3,txtci_secretaria.getText().toString());
                        ps2.setString(4, cmbsexosecretaria.getSelectedItem().toString());
                        ps2.setString(5, txtcontactosecretaria.getText().toString());
                        ps2.setString(6,cbmciudadsecretaria.getSelectedItem().toString());
                        ps2.setString(7,txtDireccion_secretaria.getText().toString());
                        ps2.setInt(8,id_dire);
                        ps2.setInt(9,id);
                        ps2.executeUpdate();
                        JOptionPane.showMessageDialog(null, "REGISTRO DE SECRETARIO EXITOSO !");
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
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbmciudadsecretaria = new javax.swing.JComboBox<>();
        cmbsexosecretaria = new javax.swing.JComboBox<>();
        txtci_secretaria = new javax.swing.JTextField();
        txtnom_secretaria = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtDireccion_secretaria = new javax.swing.JTextField();
        btnRegistrar_director = new javax.swing.JButton();
        btnCancelar_registro_secretaria = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtedadsecretaria = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtcontactosecretaria = new javax.swing.JTextField();
        txtusuariosecretaria = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtcontraseñasecretaria = new javax.swing.JTextField();
        jblregistrosecretaria = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcomunidad = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtiddirector = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 50));

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel13.setText("Usted se encuentra en:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 200, 20));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("REGISTRO SECRETARIA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 550, 50));

        jLabel5.setText("NOMBRE:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 20));

        jLabel6.setText("C.I. SECRETARIA:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, 20));

        jLabel7.setText("SEXO:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, 20));

        jLabel4.setText("CIUDAD:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, 20));

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
        getContentPane().add(cbmciudadsecretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 140, 20));

        cmbsexosecretaria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "masculino", "femenino" }));
        cmbsexosecretaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cmbsexosecretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbsexosecretariaActionPerformed(evt);
            }
        });
        getContentPane().add(cmbsexosecretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 140, 20));

        txtci_secretaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtci_secretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtci_secretariaActionPerformed(evt);
            }
        });
        getContentPane().add(txtci_secretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 210, 20));

        txtnom_secretaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtnom_secretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnom_secretariaActionPerformed(evt);
            }
        });
        getContentPane().add(txtnom_secretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 210, 20));

        jLabel9.setText("DIRECCIÓN:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 70, 20));

        jLabel11.setText("NOMBRE DE USUARIO:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 130, 20));

        txtDireccion_secretaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDireccion_secretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccion_secretariaActionPerformed(evt);
            }
        });
        getContentPane().add(txtDireccion_secretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, 210, 20));

        btnRegistrar_director.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnRegistrar_director.setForeground(new java.awt.Color(0, 0, 51));
        btnRegistrar_director.setText("REGISTRAR");
        btnRegistrar_director.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnRegistrar_director.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar_directorActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar_director, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 170, 40));

        btnCancelar_registro_secretaria.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelar_registro_secretaria.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnCancelar_registro_secretaria.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar_registro_secretaria.setText("CANCELAR");
        btnCancelar_registro_secretaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnCancelar_registro_secretaria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelar_registro_secretariaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelar_registro_secretariaMouseExited(evt);
            }
        });
        btnCancelar_registro_secretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar_registro_secretariaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar_registro_secretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 400, 160, 40));

        jLabel2.setText("EDAD:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        txtedadsecretaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtedadsecretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtedadsecretariaActionPerformed(evt);
            }
        });
        getContentPane().add(txtedadsecretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 198, 60, 30));

        jLabel12.setText("CONTACTO:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 70, -1));

        txtcontactosecretaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtcontactosecretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, 210, -1));

        txtusuariosecretaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtusuariosecretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, 210, -1));

        jLabel8.setText("CONTRASEÑA:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 90, -1));

        txtcontraseñasecretaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtcontraseñasecretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, 210, -1));

        jblregistrosecretaria.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        getContentPane().add(jblregistrosecretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 220, 20));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 730, 230));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Ellipse 209.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 540, -1, 270));

        txtiddirector.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        txtiddirector.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtiddirector.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtiddirector.setEnabled(false);
        txtiddirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtiddirectorActionPerformed(evt);
            }
        });
        getContentPane().add(txtiddirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 60, 30));

        jLabel10.setText("COMUNIDAD:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

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

    private void cbmciudadsecretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmciudadsecretariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbmciudadsecretariaActionPerformed

    private void cmbsexosecretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbsexosecretariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbsexosecretariaActionPerformed

    private void txtnom_secretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnom_secretariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnom_secretariaActionPerformed

    private void txtDireccion_secretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccion_secretariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccion_secretariaActionPerformed
public void setColor(JButton j){
j.setBackground(new Color(255,51,51));
}
public void resetColor(JButton j1){
j1.setBackground(new Color(153,0,0));
}
    private void btnCancelar_registro_secretariaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelar_registro_secretariaMouseEntered
        setColor(btnCancelar_registro_secretaria);
    }//GEN-LAST:event_btnCancelar_registro_secretariaMouseEntered

    private void btnCancelar_registro_secretariaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelar_registro_secretariaMouseExited
        resetColor(btnCancelar_registro_secretaria);
    }//GEN-LAST:event_btnCancelar_registro_secretariaMouseExited

    private void btnCancelar_registro_secretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar_registro_secretariaActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_btnCancelar_registro_secretariaActionPerformed

    private void txtedadsecretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtedadsecretariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtedadsecretariaActionPerformed

    private void btnRegistrar_directorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar_directorActionPerformed
      ingresarSecretario();  // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrar_directorActionPerformed

    private void txtci_secretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtci_secretariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtci_secretariaActionPerformed

    private void tblcomunidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcomunidadMouseClicked
        int row=tblcomunidad.getSelectedRow();
        if(row!=-1){
            id_com=Integer.parseInt(String.valueOf(tblcomunidad.getModel().getValueAt(row,0)));
            txtiddirector.setText(String.valueOf(id_com));
        }// TODO add your handling code here:
    }//GEN-LAST:event_tblcomunidadMouseClicked

    private void txtiddirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtiddirectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtiddirectorActionPerformed

    private void cbmciudadsecretariaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbmciudadsecretariaItemStateChanged
        llenarTabla();        // TODO add your handling code here:
    }//GEN-LAST:event_cbmciudadsecretariaItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar_registro_secretaria;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnRegistrar_director;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JComboBox<String> cbmciudadsecretaria;
    private javax.swing.JComboBox<String> cmbsexosecretaria;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jblregistrosecretaria;
    private javax.swing.JTable tblcomunidad;
    private javax.swing.JTextField txtDireccion_secretaria;
    private javax.swing.JTextField txtci_secretaria;
    private javax.swing.JTextField txtcontactosecretaria;
    private javax.swing.JTextField txtcontraseñasecretaria;
    private javax.swing.JTextField txtedadsecretaria;
    private javax.swing.JTextField txtiddirector;
    private javax.swing.JTextField txtnom_secretaria;
    private javax.swing.JTextField txtusuariosecretaria;
    // End of variables declaration//GEN-END:variables
}
