/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Conexion.Conexion;
import Modelo.Usuario;
import com.mysql.jdbc.CallableStatement;
import controlador.LoginController;
import controlador.VentanasController;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Login extends javax.swing.JFrame {
    public static int id_Usuario;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void validarIngreso(){
        if(txtUser.getText().isEmpty()){
            txtUser.setBackground(Color.red);
        }
        if(txtpassword.getText().isEmpty()){
             txtpassword.setBackground(Color.red);
        }
        if(!txtUser.getText().isEmpty()&&!txtpassword.getText().isEmpty()){
        Conexion conect= new Conexion();
        com.mysql.jdbc.Connection conexion2=(com.mysql.jdbc.Connection) conect.getconection();
        CallableStatement myCall = null;
        
        ResultSet dato=null;
        try {
            myCall=(CallableStatement) conexion2.prepareCall("{call getUserByUserAndPassword(?,?)}");
            myCall.setString(1,txtUser.getText());
            myCall.setString(2,txtpassword.getText());
            dato=myCall.executeQuery();
         if(dato.next())
         {
             String id=dato.getString("id_usuario");

             if(txtUser.getText().equalsIgnoreCase(dato.getString("usuario"))&&txtpassword.getText().equalsIgnoreCase(dato.getString("contraseña")))
             {
                 try{
                    if(dato.getString("tipo_usuario_id").equalsIgnoreCase("1")){
                             System.out.println(id);
                             id_Usuario=Integer.parseInt(id);
                    }else if(dato.getString("tipo_usuario_id").equalsIgnoreCase("2")){
                             System.out.println(id);
                             id_Usuario=Integer.parseInt(id);
                    }
                    dispose();
                    new Inicio().setVisible(true);
                 }catch(Exception e){
                     System.out.println("error de obtener id");
                 }
             }
          }
        }catch(SQLException ex)
        {
            System.err.println("ERROR EN OBTENER DATOS");
        }finally{
            try{myCall.close();} catch (Exception e){}
             try{dato.close();} catch (Exception e){}
             try{conexion2.close();} catch (Exception e){}
        }
        }
        
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
        jblUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        jblpassword = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        btnrestaurarpwd = new javax.swing.JButton();
        jbliconlogin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpanelbackground.setBackground(new java.awt.Color(27, 67, 50));
        jpanelbackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(216, 243, 220));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jblUser.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jblUser.setForeground(new java.awt.Color(8, 28, 21));
        jblUser.setText("Usuario");
        jPanel2.add(jblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        txtUser.setBackground(new java.awt.Color(255, 255, 255));
        txtUser.setForeground(new java.awt.Color(0, 0, 0));
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        jPanel2.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 390, 40));

        btnLogin.setBackground(new java.awt.Color(204, 255, 255));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(0, 0, 0));
        btnLogin.setText("INICIAR SESIÓN");
        btnLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginMouseExited(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 390, 40));

        jblpassword.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jblpassword.setForeground(new java.awt.Color(8, 28, 21));
        jblpassword.setText("Contraseña");
        jPanel2.add(jblpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        txtpassword.setBackground(new java.awt.Color(255, 255, 255));
        txtpassword.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 390, 40));

        btnrestaurarpwd.setBackground(new java.awt.Color(204, 255, 255));
        btnrestaurarpwd.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnrestaurarpwd.setForeground(new java.awt.Color(0, 0, 0));
        btnrestaurarpwd.setText("Restaurar contraseña");
        btnrestaurarpwd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnrestaurarpwd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnrestaurarpwdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnrestaurarpwdMouseExited(evt);
            }
        });
        btnrestaurarpwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestaurarpwdActionPerformed(evt);
            }
        });
        jPanel2.add(btnrestaurarpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 200, 40));

        jbliconlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iniciar-sesion (1).png"))); // NOI18N
        jPanel2.add(jbliconlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 70, 120));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(8, 28, 21));
        jLabel2.setText("INICIAR SESIÓN");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 310, 50));

        jpanelbackground.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 450, 490));

        getContentPane().add(jpanelbackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 599));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        LoginController.iniciarSesion(new Usuario(txtUser.getText(),txtpassword.getText()),txtUser,txtpassword);
        //validarIngreso();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnrestaurarpwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestaurarpwdActionPerformed
    VentanasController.cerrarLogin();
    VentanasController.abrirRestaurarContraseña();
    }//GEN-LAST:event_btnrestaurarpwdActionPerformed
public void setColor(JButton j){
j.setBackground(new Color(102,255,255));
}
public void resetColor(JButton j1){
j1.setBackground(new Color(204,255,255));
}
    private void btnrestaurarpwdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnrestaurarpwdMouseEntered
        setColor(btnrestaurarpwd);
    }//GEN-LAST:event_btnrestaurarpwdMouseEntered

    private void btnrestaurarpwdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnrestaurarpwdMouseExited
        resetColor(btnrestaurarpwd);
    }//GEN-LAST:event_btnrestaurarpwdMouseExited

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
        setColor(btnLogin);
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
        resetColor(btnLogin);
    }//GEN-LAST:event_btnLoginMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnrestaurarpwd;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jblUser;
    private javax.swing.JLabel jbliconlogin;
    private javax.swing.JLabel jblpassword;
    private javax.swing.JPanel jpanelbackground;
    private javax.swing.JTextField txtUser;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables
}
