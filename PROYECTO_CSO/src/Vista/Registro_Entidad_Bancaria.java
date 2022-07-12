
package Vista;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Registro_Entidad_Bancaria extends javax.swing.JFrame {
    int id_com=0;
    public Registro_Entidad_Bancaria() {
        initComponents();
        this.setLocationRelativeTo(null);
        llenarTabla();
        mostrarnombreventana(jblRegistroentbancaria);
    }
     public void mostrarnombreventana(JLabel j){
        String formulario = getClass().getSimpleName();
       j.setText(formulario.replace("_", " "));
     }
     public void limpiar(){
                txtNom_EntBancaria.setText("");
                txtDir_EntBancaria.setText("");
                txtRepresentante_EntBancaria.setText("");
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
            ps=(com.mysql.jdbc.PreparedStatement) conexion.prepareStatement("select id_comunidad,nombre,ciudad,canton,fecha_fundacion,direccion,referencia,descripcion,estado from Comunidad");
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
      public void ingresarBanco(){
        
        if(!txtNom_EntBancaria.getText().isEmpty()&&!txtDir_EntBancaria.getText().isEmpty()&&!txtRepresentante_EntBancaria.getText().isEmpty()
                &&!txtidcomunidad.getText().isEmpty())
         {
            Conexion conect= new Conexion();
            Connection conexion=(Connection) conect.getconection();

            PreparedStatement ps2=null;
            ResultSet rs=null;
                try {

                        ps2=(PreparedStatement) conexion.prepareStatement("insert into Banco (nombre,direccion,representante,comunidad_id) values(?,?,?,?)");
                        ps2.setString(1, txtNom_EntBancaria.getText().toString());
                        ps2.setString(2,txtDir_EntBancaria.getText().toString());
                        ps2.setString(3, txtRepresentante_EntBancaria.getText().toString());
                        ps2.setInt(4,Integer.parseInt(txtidcomunidad.getText().toString()));
                        ps2.executeUpdate();
                        JOptionPane.showMessageDialog(null, "REGISTRO DE BANCO EXITOSO !");
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
        lblNom_entidadbancaria = new javax.swing.JLabel();
        lblrepresentante_entbancaria = new javax.swing.JLabel();
        txtNom_EntBancaria = new javax.swing.JTextField();
        txtRepresentante_EntBancaria = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        txtDir_EntBancaria = new javax.swing.JTextField();
        btnRegistrar_EntBancaria = new javax.swing.JButton();
        btnCancelar_registro_EntBancaria = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jblRegistroentbancaria = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcomunidad = new javax.swing.JTable();
        txtidcomunidad = new javax.swing.JTextField();
        lblRegistro_ent_bancaria = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpanelbackground.setBackground(new java.awt.Color(216, 243, 220));

        lblNom_entidadbancaria.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblNom_entidadbancaria.setForeground(new java.awt.Color(0, 0, 0));
        lblNom_entidadbancaria.setText("NOMBRE DE LA ENTIDAD BANCARIA:");

        lblrepresentante_entbancaria.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblrepresentante_entbancaria.setForeground(new java.awt.Color(0, 0, 0));
        lblrepresentante_entbancaria.setText("REPRESENTANTE DE LA ENTIDAD BANCARIA:");

        txtNom_EntBancaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNom_EntBancaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNom_EntBancariaActionPerformed(evt);
            }
        });

        txtRepresentante_EntBancaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("DIRECCIÓN:");

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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 100, 40));

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
        jPanel1.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 100, 40));

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
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 100, 40));

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
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 100, 40));

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
        jPanel1.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 100, 40));

        txtDir_EntBancaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnRegistrar_EntBancaria.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnRegistrar_EntBancaria.setForeground(new java.awt.Color(0, 0, 51));
        btnRegistrar_EntBancaria.setText("REGISTRAR");
        btnRegistrar_EntBancaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnRegistrar_EntBancaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar_EntBancariaActionPerformed(evt);
            }
        });

        btnCancelar_registro_EntBancaria.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnCancelar_registro_EntBancaria.setForeground(new java.awt.Color(153, 0, 0));
        btnCancelar_registro_EntBancaria.setText("CANCELAR");
        btnCancelar_registro_EntBancaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnCancelar_registro_EntBancaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar_registro_EntBancariaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Usted se encuentra en:");

        jblRegistroentbancaria.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("COMUNIDAD:");

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

        txtidcomunidad.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        txtidcomunidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtidcomunidad.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtidcomunidad.setEnabled(false);
        txtidcomunidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidcomunidadActionPerformed(evt);
            }
        });

        lblRegistro_ent_bancaria.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        lblRegistro_ent_bancaria.setForeground(new java.awt.Color(8, 28, 21));
        lblRegistro_ent_bancaria.setText("REGISTRO ENTIDAD BANCARIA");

        javax.swing.GroupLayout jpanelbackgroundLayout = new javax.swing.GroupLayout(jpanelbackground);
        jpanelbackground.setLayout(jpanelbackgroundLayout);
        jpanelbackgroundLayout.setHorizontalGroup(
            jpanelbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jpanelbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpanelbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelbackgroundLayout.createSequentialGroup()
                        .addGroup(jpanelbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpanelbackgroundLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(jpanelbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addGroup(jpanelbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblrepresentante_entbancaria)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelbackgroundLayout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(26, 26, 26)
                                            .addComponent(txtidcomunidad, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lblNom_entidadbancaria)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpanelbackgroundLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jblRegistroentbancaria, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelbackgroundLayout.createSequentialGroup()
                        .addComponent(btnRegistrar_EntBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar_registro_EntBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap()))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpanelbackgroundLayout.createSequentialGroup()
                    .addGap(94, 94, 94)
                    .addComponent(lblRegistro_ent_bancaria, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jpanelbackgroundLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jpanelbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNom_EntBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDir_EntBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRepresentante_EntBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jpanelbackgroundLayout.setVerticalGroup(
            jpanelbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelbackgroundLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jpanelbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblRegistroentbancaria, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblRegistro_ent_bancaria, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(jpanelbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNom_entidadbancaria, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNom_EntBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jpanelbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDir_EntBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jpanelbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblrepresentante_entbancaria, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRepresentante_EntBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jpanelbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidcomunidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jpanelbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar_registro_EntBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar_EntBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        getContentPane().add(jpanelbackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 975, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNom_EntBancariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNom_EntBancariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNom_EntBancariaActionPerformed

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

    private void btnCancelar_registro_EntBancariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar_registro_EntBancariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelar_registro_EntBancariaActionPerformed

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

    private void btnRegistrar_EntBancariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar_EntBancariaActionPerformed
    ingresarBanco();        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrar_EntBancariaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar_registro_EntBancaria;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnRegistrar_EntBancaria;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jblRegistroentbancaria;
    private javax.swing.JPanel jpanelbackground;
    private javax.swing.JLabel lblNom_entidadbancaria;
    private javax.swing.JLabel lblRegistro_ent_bancaria;
    private javax.swing.JLabel lblrepresentante_entbancaria;
    private javax.swing.JTable tblcomunidad;
    private javax.swing.JTextField txtDir_EntBancaria;
    private javax.swing.JTextField txtNom_EntBancaria;
    private javax.swing.JTextField txtRepresentante_EntBancaria;
    private javax.swing.JTextField txtidcomunidad;
    // End of variables declaration//GEN-END:variables
}
