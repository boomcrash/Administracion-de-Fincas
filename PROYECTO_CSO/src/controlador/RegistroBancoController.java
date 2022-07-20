/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import Conexion.Conexion;
import Modelo.Banco;
import com.mysql.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *clase que controla el registro de Banco
 * @author GAMER
 */
public class RegistroBancoController {
    /**
     * metodo encargado de registrar Banco en la base de datos recibiendo como parametro banco
     * @param banco objeto de la clase Banco
     */
    public static void registrarBanco(Banco banco){
        
        if(!banco.getNombre().isEmpty()&&!banco.getDireccion().isEmpty()&&!banco.getRepresentante().isEmpty()
                &&!banco.getId().isEmpty())
         {
            Conexion conect= new Conexion();
        Connection conexion=(Connection) conect.getconection();
         
        CallableStatement myCall = null;
        try {
                    myCall=(CallableStatement) conexion.prepareCall("{call putBanco(?,?,?,?)}");
                    
                        myCall.setString(1, banco.getNombre());
                        myCall.setString(2,banco.getDireccion());
                        myCall.setString(3, banco.getRepresentante());
                        myCall.setInt(4,Integer.parseInt(banco.getId()));
                        myCall.executeUpdate();
                        JOptionPane.showMessageDialog(null, "REGISTRO DE BANCO EXITOSO !");
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
}
