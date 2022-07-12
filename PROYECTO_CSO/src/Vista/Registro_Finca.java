
package Vista;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Registro_Finca extends javax.swing.JFrame {
    int id_com=0;
    public Registro_Finca() {
        initComponents();
          this.setLocationRelativeTo(null);
        mostrarnombreventana(jblregistrofinca);
    }
  public void mostrarnombreventana(JLabel j){
        String formulario = getClass().getSimpleName();
       j.setText(formulario.replace("_", " "));
     }
         public void limpiar(){
                txtNom_finca.setText("");
                txtDir_finca.setText("");
                txtidcomunidad.setText("");
     }
     public void llenarTabla(){
        DefaultTableModel modelo =new DefaultTableModel();
        tblcomunidad.setModel(modelo);
        Conexion connect=new Conexion();
        com.mysql.jdbc.Connection conexion=(com.mysql.jdbc.Connection) connect.getconection();
        PreparedStatement ps=null,ps2=null;
        ResultSet rs=null;
        try {
            ps=(com.mysql.jdbc.PreparedStatement) conexion.prepareStatement("select id_propietario,nombre,edad,cedula,sexo,contacto,ciudad,direccion,comunidad_id from Propietario where ciudad=?");
             ps.setString(1,cmbCiudad_finca.getSelectedItem().toString());
            rs=ps.executeQuery();
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
        }finally {try{ps.close();} catch (Exception e){}
        try{rs.close();} catch (Exception e){}
        try{conexion.close();} catch (Exception e){}
        }     
   }
      public void ingresarFinca(){
        
        if(!txtNom_finca.getText().isEmpty()&&!txtDir_finca.getText().isEmpty()&&!txtidcomunidad.getText().isEmpty()
                &&!cmbCiudad_finca.getSelectedItem().toString().isEmpty()&&!jcdFundacion_finca.getDate().toString().isEmpty())
         {
            Conexion conect= new Conexion();
            Connection conexion=(Connection) conect.getconection();

            PreparedStatement ps2=null;
            ResultSet rs=null;
                try {

                        ps2=(PreparedStatement) conexion.prepareStatement("insert into Finca (nombre,ciudad,direccion,AnioFuncionamiento,propietario_id) values(?,?,?,?,?)");
                        ps2.setString(1, txtNom_finca.getText().toString());
                        ps2.setString(2,cmbCiudad_finca.getSelectedItem().toString());
                        ps2.setString(3,txtDir_finca.getText().toString());
                        ps2.setString(4, jcdFundacion_finca.getDate().toString());
                        ps2.setInt(5,Integer.parseInt(txtidcomunidad.getText().toString()));
                        ps2.executeUpdate();
                        JOptionPane.showMessageDialog(null, "REGISTRO DE FINCA EXITOSO !");
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

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 50));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Usted se encuentra en:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 210, 20));

        jPanel2.setBackground(new java.awt.Color(216, 243, 220));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(8, 28, 21));
        jLabel1.setText("REGISTRO DE FINCA");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 520, 50));

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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 730, 230));

        btnCancelar_registro_finca.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnCancelar_registro_finca.setForeground(new java.awt.Color(153, 0, 0));
        btnCancelar_registro_finca.setText("CANCELAR");
        btnCancelar_registro_finca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnCancelar_registro_finca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar_registro_fincaActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelar_registro_finca, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 720, 160, 40));

        btnRegistrar_finca.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnRegistrar_finca.setForeground(new java.awt.Color(0, 0, 51));
        btnRegistrar_finca.setText("REGISTRAR");
        btnRegistrar_finca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnRegistrar_finca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar_fincaActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistrar_finca, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 720, 170, 40));

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
        jPanel2.add(txtidcomunidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 60, 30));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("PROPIETARIO:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 100, 20));

        jcdFundacion_finca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jcdFundacion_finca, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, 140));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("AÑO FUNCIONAMIENTO:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 20));

        txtNom_finca.setBackground(java.awt.Color.white);
        txtNom_finca.setForeground(new java.awt.Color(0, 0, 0));
        txtNom_finca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNom_finca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNom_fincaActionPerformed(evt);
            }
        });
        jPanel2.add(txtNom_finca, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 200, 20));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("NOMBRE:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, 20));

        cmbCiudad_finca.setBackground(java.awt.Color.white);
        cmbCiudad_finca.setForeground(new java.awt.Color(0, 0, 0));
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
        jPanel2.add(cmbCiudad_finca, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 210, 20));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("CIUDAD:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, 20));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("DIRECCIÓN:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 90, 20));

        txtDir_finca.setBackground(java.awt.Color.white);
        txtDir_finca.setForeground(new java.awt.Color(0, 0, 0));
        txtDir_finca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDir_finca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDir_fincaActionPerformed(evt);
            }
        });
        jPanel2.add(txtDir_finca, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 210, 20));

        jblregistrofinca.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jPanel2.add(jblregistrofinca, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 270, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 975, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCiudad_fincaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCiudad_fincaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCiudad_fincaActionPerformed

    private void txtDir_fincaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDir_fincaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDir_fincaActionPerformed

    private void btnCancelar_registro_fincaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar_registro_fincaActionPerformed
        // TODO add your handling code here:
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
        ingresarFinca();// TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrar_fincaActionPerformed

    private void cmbCiudad_fincaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCiudad_fincaItemStateChanged
        llenarTabla();        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCiudad_fincaItemStateChanged

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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jblregistrofinca;
    private com.toedter.calendar.JCalendar jcdFundacion_finca;
    private javax.swing.JTable tblcomunidad;
    private javax.swing.JTextField txtDir_finca;
    private javax.swing.JTextField txtNom_finca;
    private javax.swing.JTextField txtidcomunidad;
    // End of variables declaration//GEN-END:variables
}
