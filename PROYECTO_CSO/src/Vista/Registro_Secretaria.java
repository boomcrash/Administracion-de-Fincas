
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
        llenarTabla();
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
        
        if(!txtnom_secretaria.getText().isEmpty()&&!txtedadsecretaria.getText().isEmpty()&&!txtci_secretaria.getText().isEmpty() && txtci_secretaria.getText().length()==10
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
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
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
        txtiddirector = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(8, 28, 21));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(45, 106, 79));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CONSULTAS");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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
        btnInicio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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

        jButton4.setBackground(new java.awt.Color(45, 106, 79));
        jButton4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("REPORTES");
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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
        btnRegistro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 0, 100, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 50));

        jPanel2.setBackground(new java.awt.Color(216, 243, 220));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Usted se encuentra en:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 200, 20));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("NOMBRE:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 195, -1, 20));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("C.I. SECRETARIA:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 302, -1, 20));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("SEXO:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 356, -1, 20));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CIUDAD:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 423, -1, 20));

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
        jPanel2.add(cbmciudadsecretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 424, 140, 20));

        cmbsexosecretaria.setBackground(new java.awt.Color(255, 255, 255));
        cmbsexosecretaria.setForeground(new java.awt.Color(0, 0, 0));
        cmbsexosecretaria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "masculino", "femenino" }));
        cmbsexosecretaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cmbsexosecretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbsexosecretariaActionPerformed(evt);
            }
        });
        jPanel2.add(cmbsexosecretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 357, 140, 20));

        txtci_secretaria.setBackground(java.awt.Color.white);
        txtci_secretaria.setForeground(new java.awt.Color(0, 0, 0));
        txtci_secretaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtci_secretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtci_secretariaActionPerformed(evt);
            }
        });
        txtci_secretaria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtci_secretariaKeyTyped(evt);
            }
        });
        jPanel2.add(txtci_secretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 303, 210, 20));

        txtnom_secretaria.setBackground(java.awt.Color.white);
        txtnom_secretaria.setForeground(new java.awt.Color(0, 0, 0));
        txtnom_secretaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtnom_secretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnom_secretariaActionPerformed(evt);
            }
        });
        txtnom_secretaria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnom_secretariaKeyTyped(evt);
            }
        });
        jPanel2.add(txtnom_secretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 196, 210, 20));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("DIRECCIÓN:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 248, -1, 20));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("NOMBRE DE USUARIO:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 302, -1, 20));

        txtDireccion_secretaria.setBackground(java.awt.Color.white);
        txtDireccion_secretaria.setForeground(new java.awt.Color(0, 0, 0));
        txtDireccion_secretaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDireccion_secretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccion_secretariaActionPerformed(evt);
            }
        });
        jPanel2.add(txtDireccion_secretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 249, 210, 20));

        btnRegistrar_director.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnRegistrar_director.setForeground(new java.awt.Color(0, 0, 51));
        btnRegistrar_director.setText("REGISTRAR");
        btnRegistrar_director.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnRegistrar_director.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar_directorActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistrar_director, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 730, 170, 40));

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
        jPanel2.add(btnCancelar_registro_secretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 730, 160, 40));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("EDAD:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 249, -1, -1));

        txtedadsecretaria.setBackground(java.awt.Color.white);
        txtedadsecretaria.setForeground(new java.awt.Color(0, 0, 0));
        txtedadsecretaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtedadsecretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtedadsecretariaActionPerformed(evt);
            }
        });
        txtedadsecretaria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtedadsecretariaKeyTyped(evt);
            }
        });
        jPanel2.add(txtedadsecretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 244, 60, 30));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("CONTACTO:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 196, -1, -1));

        txtcontactosecretaria.setBackground(java.awt.Color.white);
        txtcontactosecretaria.setForeground(new java.awt.Color(0, 0, 0));
        txtcontactosecretaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtcontactosecretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 197, 210, -1));

        txtusuariosecretaria.setBackground(java.awt.Color.white);
        txtusuariosecretaria.setForeground(new java.awt.Color(0, 0, 0));
        txtusuariosecretaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtusuariosecretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 304, 210, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("CONTRASEÑA:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 357, -1, -1));

        txtcontraseñasecretaria.setBackground(java.awt.Color.white);
        txtcontraseñasecretaria.setForeground(new java.awt.Color(0, 0, 0));
        txtcontraseñasecretaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtcontraseñasecretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 358, 210, -1));

        jblregistrosecretaria.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jPanel2.add(jblregistrosecretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 220, 20));

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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 820, 191));

        txtiddirector.setBackground(java.awt.Color.white);
        txtiddirector.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        txtiddirector.setForeground(new java.awt.Color(0, 0, 0));
        txtiddirector.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtiddirector.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtiddirector.setEnabled(false);
        txtiddirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtiddirectorActionPerformed(evt);
            }
        });
        jPanel2.add(txtiddirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 473, 60, 30));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("COMUNIDAD:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 479, -1, -1));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(8, 28, 21));
        jLabel1.setText("REGISTRO SECRETARIO/A");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 86, 660, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 975, 800));

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

    private void txtci_secretariaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtci_secretariaKeyTyped
 if(txtci_secretaria.getText().length() >=10 || !Character.isDigit(evt.getKeyChar())){
         evt.consume();
        }        
    }//GEN-LAST:event_txtci_secretariaKeyTyped

    private void txtedadsecretariaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtedadsecretariaKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar()) || txtedadsecretaria.getText().length()>=3){
        evt.consume();
        }
    }//GEN-LAST:event_txtedadsecretariaKeyTyped

    private void txtnom_secretariaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnom_secretariaKeyTyped
          if(Character.isDigit(evt.getKeyChar())){
        evt.consume();
        }
    }//GEN-LAST:event_txtnom_secretariaKeyTyped

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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
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
