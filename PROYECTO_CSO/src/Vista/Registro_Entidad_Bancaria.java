
package Vista;

import Conexion.Conexion;
import Modelo.Banco;
import com.mysql.jdbc.CallableStatement;
import controlador.CamposController;
import controlador.RegistroBancoController;
import controlador.TablasRegistroController;
import controlador.VentanasController;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 * Formulario de Registro de Bancos
 * @author User
 */
public class Registro_Entidad_Bancaria extends javax.swing.JFrame {
    int id_com=0;
    /**
     * Inicializacion del Formulario de Registro de Banco
     */
    public Registro_Entidad_Bancaria() {
        initComponents();
        this.setLocationRelativeTo(null);
        TablasRegistroController.llenarTablaComunidad(tblcomunidad);
        CamposController.mostrarnombreventana(jblRegistroentbancaria,jpanelbackground);
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
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpanelbackground.setBackground(new java.awt.Color(255, 255, 255));
        jpanelbackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNom_entidadbancaria.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblNom_entidadbancaria.setText("NOMBRE DE LA ENTIDAD BANCARIA:");
        jpanelbackground.add(lblNom_entidadbancaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, 20));

        lblrepresentante_entbancaria.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblrepresentante_entbancaria.setText("REPRESENTANTE DE LA ENTIDAD BANCARIA:");
        jpanelbackground.add(lblrepresentante_entbancaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 323, -1, 20));

        txtNom_EntBancaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNom_EntBancaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNom_EntBancariaActionPerformed(evt);
            }
        });
        txtNom_EntBancaria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNom_EntBancariaKeyTyped(evt);
            }
        });
        jpanelbackground.add(txtNom_EntBancaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 221, 300, 20));

        txtRepresentante_EntBancaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtRepresentante_EntBancaria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRepresentante_EntBancariaKeyTyped(evt);
            }
        });
        jpanelbackground.add(txtRepresentante_EntBancaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 324, 300, 20));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setText("DIRECCIÓN:");
        jpanelbackground.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 268, -1, 20));

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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 100, 40));

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
        jPanel1.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 100, 40));

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
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 100, 40));

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
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 100, 40));

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
        jPanel1.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 100, 40));

        jpanelbackground.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 50));

        txtDir_EntBancaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpanelbackground.add(txtDir_EntBancaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 269, 300, 20));

        btnRegistrar_EntBancaria.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnRegistrar_EntBancaria.setForeground(new java.awt.Color(0, 0, 51));
        btnRegistrar_EntBancaria.setText("REGISTRAR");
        btnRegistrar_EntBancaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnRegistrar_EntBancaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar_EntBancariaActionPerformed(evt);
            }
        });
        jpanelbackground.add(btnRegistrar_EntBancaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 728, 170, 40));

        btnCancelar_registro_EntBancaria.setBackground(new java.awt.Color(204, 0, 0));
        btnCancelar_registro_EntBancaria.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnCancelar_registro_EntBancaria.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar_registro_EntBancaria.setText("CANCELAR");
        btnCancelar_registro_EntBancaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnCancelar_registro_EntBancaria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelar_registro_EntBancariaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelar_registro_EntBancariaMouseExited(evt);
            }
        });
        btnCancelar_registro_EntBancaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar_registro_EntBancariaActionPerformed(evt);
            }
        });
        jpanelbackground.add(btnCancelar_registro_EntBancaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 728, 160, 40));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setText("Usted se encuentra en:");
        jpanelbackground.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 210, 20));

        jblRegistroentbancaria.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jpanelbackground.add(jblRegistroentbancaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 230, 20));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("COMUNIDAD:");
        jpanelbackground.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 392, -1, 20));

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

        jpanelbackground.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 435, 730, 230));

        txtidcomunidad.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        txtidcomunidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtidcomunidad.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtidcomunidad.setEnabled(false);
        txtidcomunidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidcomunidadActionPerformed(evt);
            }
        });
        jpanelbackground.add(txtidcomunidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 387, 60, 30));

        lblRegistro_ent_bancaria.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        lblRegistro_ent_bancaria.setForeground(new java.awt.Color(0, 0, 0));
        lblRegistro_ent_bancaria.setText("REGISTRO ENTIDAD BANCARIA");
        jpanelbackground.add(lblRegistro_ent_bancaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 98, 792, 50));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/circulo 300px.png"))); // NOI18N
        jpanelbackground.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 520, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/circulo 200px.png"))); // NOI18N
        jpanelbackground.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 680, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/circulo 100px.png"))); // NOI18N
        jpanelbackground.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 670, 100, 90));

        getContentPane().add(jpanelbackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 975, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNom_EntBancariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNom_EntBancariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNom_EntBancariaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
VentanasController.abrirSubmenuConsulta();
VentanasController.cerrarRegistroBanco();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
   VentanasController.abrirInicio();
   VentanasController.cerrarRegistroBanco();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered

    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
VentanasController.abrirReportes();
VentanasController.cerrarRegistroBanco();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
   VentanasController.abrirSubmenuRegistro();
   VentanasController.cerrarRegistroBanco();
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnCancelar_registro_EntBancariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar_registro_EntBancariaActionPerformed
    VentanasController.cerrarRegistroBanco();
    VentanasController.abrirInicio();        // TODO add your handling code here:
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
    RegistroBancoController.registrarBanco(new Banco(txtNom_EntBancaria.getText(),txtDir_EntBancaria.getText(),txtRepresentante_EntBancaria.getText(),txtidcomunidad.getText()));   
    CamposController.limpiar(jpanelbackground);
// TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrar_EntBancariaActionPerformed

    private void txtRepresentante_EntBancariaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRepresentante_EntBancariaKeyTyped
        // TODO add your handling code here:
      if(Character.isDigit(evt.getKeyChar())){
        evt.consume();
        }
    }//GEN-LAST:event_txtRepresentante_EntBancariaKeyTyped

    private void btnCancelar_registro_EntBancariaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelar_registro_EntBancariaMouseEntered
CamposController.setColor(btnCancelar_registro_EntBancaria);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelar_registro_EntBancariaMouseEntered

    private void btnCancelar_registro_EntBancariaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelar_registro_EntBancariaMouseExited
CamposController.resetColor(btnCancelar_registro_EntBancaria);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelar_registro_EntBancariaMouseExited

    private void txtNom_EntBancariaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNom_EntBancariaKeyTyped
    if(!Character.isLetter(evt.getKeyChar())){
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNom_EntBancariaKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar_registro_EntBancaria;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnRegistrar_EntBancaria;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
