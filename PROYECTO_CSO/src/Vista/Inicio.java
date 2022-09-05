
package Vista;
import controlador.CamposController;
import controlador.VentanasController;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;


import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {
    public Inicio() {
        /**
         * Inicialización de componentes
         */
        initComponents();
        this.setLocationRelativeTo(null);
       CamposController.mostrarnombreventana(jblWindow, jpanelbackground);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnConsultas = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        jpanelbackground = new javax.swing.JPanel();
        jblWindow = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnClose_Sesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConsultas.setBackground(new java.awt.Color(255, 255, 255));
        btnConsultas.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnConsultas.setForeground(new java.awt.Color(0, 0, 0));
        btnConsultas.setText("CONSULTAS");
        btnConsultas.setBorder(null);
        btnConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultasActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 100, 40));

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
        jPanel1.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 100, 40));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("PERFIL\n");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 100, 40));

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
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 100, 40));

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
        jPanel1.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 100, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 50));

        jpanelbackground.setBackground(new java.awt.Color(255, 255, 255));
        jpanelbackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jblWindow.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jpanelbackground.add(jblWindow, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 80, 20));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setText("Usted se encuentra en:");
        jpanelbackground.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 210, 20));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("BIENVENIDO!.");
        jpanelbackground.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 470, 70));

        btnClose_Sesion.setBackground(new java.awt.Color(255, 0, 0));
        btnClose_Sesion.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnClose_Sesion.setForeground(new java.awt.Color(255, 255, 255));
        btnClose_Sesion.setText("CERRAR SESIÓN");
        btnClose_Sesion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnClose_Sesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClose_SesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClose_SesionMouseExited(evt);
            }
        });
        btnClose_Sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClose_SesionActionPerformed(evt);
            }
        });
        jpanelbackground.add(btnClose_Sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 690, 160, 40));

        getContentPane().add(jpanelbackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 975, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        VentanasController.abrirReportes();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        try{VentanasController.cerrarInicio();}catch(Exception e){}
        VentanasController.abrirInicio();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasActionPerformed
        VentanasController.cerrarInicio();
        VentanasController.abrirSubmenuConsulta();
    }//GEN-LAST:event_btnConsultasActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
     VentanasController.cerrarInicio();
        VentanasController.abrirSubmenuRegistro();
    }//GEN-LAST:event_btnRegistroActionPerformed
 
    private void btnClose_SesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClose_SesionActionPerformed
/**
 * proceso del boton cerrar sesion
 */
String botones[] = {"cerrar", "cancelar"};
int eleccion = JOptionPane.showOptionDialog(this,"¿DESEA CERRAR LA SESIÓN?", null, 0,0,null, botones, this);
if(eleccion ==JOptionPane.YES_OPTION){
Login login = new Login();
login.setVisible(true);
this.setVisible(false);
}else if(eleccion==JOptionPane.NO_OPTION){
this.setVisible(true);
}
    }//GEN-LAST:event_btnClose_SesionActionPerformed

    private void btnClose_SesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClose_SesionMouseEntered
   CamposController.setColor(btnClose_Sesion);
    }//GEN-LAST:event_btnClose_SesionMouseEntered

    private void btnClose_SesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClose_SesionMouseExited
    CamposController.resetColor(btnClose_Sesion);
    }//GEN-LAST:event_btnClose_SesionMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose_Sesion;
    private javax.swing.JButton btnConsultas;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jblWindow;
    private javax.swing.JPanel jpanelbackground;
    // End of variables declaration//GEN-END:variables
}
