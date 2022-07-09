
package Vista;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Registro_Comunidad extends javax.swing.JFrame {

    public Registro_Comunidad() {
        initComponents();
            this.setLocationRelativeTo(null);
        mostrarnombreventana(lblregistrocomunidad);
    }
   public void mostrarnombreventana(JLabel j){
        String formulario = getClass().getSimpleName();
       j.setText(formulario.replace("_", " "));
     }
   
   public void limpiar(){
        txtNom_comunidad.setText("");
        txtDir_comunidad.setText("");
        txaRef_comunidad.setText("");
        txaDescripcion_comunidad.setText("");
   }

   public void ingresarComunidad(){
    if(!txtNom_comunidad.getText().isEmpty()&&!txtDir_comunidad.getText().isEmpty()&&!txaRef_comunidad.getText().isEmpty()&&!txaDescripcion_comunidad.getText().isEmpty())
     {
        Conexion conect= new Conexion();
        Connection conexion=(Connection) conect.getconection();
         
        PreparedStatement ps2=null;
        ResultSet rs=null;
            try {
                    

                    ps2=(PreparedStatement) conexion.prepareStatement("insert into Comunidad (nombre,ciudad,canton,fecha_fundacion,direccion,referencia,descripcion,estado) values(?,?,?,?,?,?,?,?)");
                    ps2.setString(1, txtNom_comunidad.getText().toString());
                    ps2.setString(2, cmbCiudad_comunidad.getSelectedItem().toString());
                    ps2.setString(3,cmbCanton_comunidad.getSelectedItem().toString());
                    ps2.setString(4, jcdFundacion_comunidad.getDate().toString());
                    ps2.setString(5, txtDir_comunidad.getText().toString());
                    ps2.setString(6,txaRef_comunidad.getText().toString());
                    ps2.setString(7,txaDescripcion_comunidad.getText().toString());
                    ps2.setString(8,"A".toString());
                    ps2.executeUpdate();
                    JOptionPane.showMessageDialog(null, "REGISTRO DE COMUNIDAD EXITOSO !");
                    //this.dispose();
                    limpiar();   
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
        
   }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRegistro_comunidad = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNom_comunidad = new javax.swing.JTextField();
        cmbCiudad_comunidad = new javax.swing.JComboBox<>();
        cmbCanton_comunidad = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jcdFundacion_comunidad = new com.toedter.calendar.JCalendar();
        jLabel9 = new javax.swing.JLabel();
        txtDir_comunidad = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnRegistrar_finca = new javax.swing.JButton();
        btnCancelar_registro_finca = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaDescripcion_comunidad = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaRef_comunidad = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblregistrocomunidad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegistro_comunidad.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lblRegistro_comunidad.setForeground(new java.awt.Color(0, 102, 102));
        lblRegistro_comunidad.setText("REGISTRO DE COMUNIDAD");
        getContentPane().add(lblRegistro_comunidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 490, 50));

        jLabel4.setText("CANTÓN:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, 20));

        jLabel5.setText("NOMBRE:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 20));

        jLabel7.setText("CIUDAD:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, 20));

        txtNom_comunidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNom_comunidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNom_comunidadActionPerformed(evt);
            }
        });
        getContentPane().add(txtNom_comunidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 210, 20));

        cmbCiudad_comunidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "guayaquil", "machala", "quevedo" }));
        cmbCiudad_comunidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cmbCiudad_comunidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCiudad_comunidadActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCiudad_comunidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 140, 20));

        cmbCanton_comunidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "guayas", "el oro", "los rios" }));
        cmbCanton_comunidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(cmbCanton_comunidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 140, 20));

        jLabel8.setText("FECHA DE FUNDACIÓN:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, 20));

        jcdFundacion_comunidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jcdFundacion_comunidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, 140));

        jLabel9.setText("DIRECCIÓN:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, 20));

        txtDir_comunidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDir_comunidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDir_comunidadActionPerformed(evt);
            }
        });
        getContentPane().add(txtDir_comunidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 150, 210, 20));

        jLabel11.setText("DESCRIPCIÓN :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, -1, 20));

        btnRegistrar_finca.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnRegistrar_finca.setForeground(new java.awt.Color(0, 0, 51));
        btnRegistrar_finca.setText("REGISTRAR");
        btnRegistrar_finca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnRegistrar_finca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar_fincaActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar_finca, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, 170, 40));

        btnCancelar_registro_finca.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnCancelar_registro_finca.setForeground(new java.awt.Color(153, 0, 0));
        btnCancelar_registro_finca.setText("CANCELAR");
        btnCancelar_registro_finca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnCancelar_registro_finca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar_registro_fincaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar_registro_finca, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 510, 160, 40));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jButton1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton1.setText("CONSULTAS");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnInicio.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnInicio.setText("INICIO");
        btnInicio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

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

        jButton4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton4.setText("REPORTES");
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnRegistro.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnRegistro.setText("REGISTROS");
        btnRegistro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 50));

        jLabel2.setText("REFERENCIA:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, -1, -1));

        txaDescripcion_comunidad.setColumns(20);
        txaDescripcion_comunidad.setRows(5);
        txaDescripcion_comunidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setViewportView(txaDescripcion_comunidad);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, -1, -1));

        txaRef_comunidad.setColumns(20);
        txaRef_comunidad.setRows(5);
        txaRef_comunidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(txaRef_comunidad);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 196, -1, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Ellipse 209.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, 350, 270));

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel13.setText("Usted se encuentra en:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 200, 20));

        lblregistrocomunidad.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        getContentPane().add(lblregistrocomunidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 180, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNom_comunidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNom_comunidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNom_comunidadActionPerformed

    private void cmbCiudad_comunidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCiudad_comunidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCiudad_comunidadActionPerformed

    private void txtDir_comunidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDir_comunidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDir_comunidadActionPerformed

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

    private void btnRegistrar_fincaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar_fincaActionPerformed
    ingresarComunidad();        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrar_fincaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar_registro_finca;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnRegistrar_finca;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JComboBox<String> cmbCanton_comunidad;
    private javax.swing.JComboBox<String> cmbCiudad_comunidad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JCalendar jcdFundacion_comunidad;
    private javax.swing.JLabel lblRegistro_comunidad;
    private javax.swing.JLabel lblregistrocomunidad;
    private javax.swing.JTextArea txaDescripcion_comunidad;
    private javax.swing.JTextArea txaRef_comunidad;
    private javax.swing.JTextField txtDir_comunidad;
    private javax.swing.JTextField txtNom_comunidad;
    // End of variables declaration//GEN-END:variables
}
