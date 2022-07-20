/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Conexion.Conexion;
import Modelo.Cobros;
import com.mysql.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *clase que controla el registro de los Cobros
 * @author GAMER
 */
public class RegistroCobrosController {
    /**
     * metodo que registra los Cobros en la base de datos recibiendo como parametro cobro
     * @param cobro objeto de la clase Cobro
     */
     public static void registrarCobro(Cobros cobro){
        
        if(!cobro.getDescripcion().isEmpty()&&!cobro.getCantidad().isEmpty()&&!cobro.getPropietario().isEmpty()
        &&!cobro.getPresidente().isEmpty()&&!cobro.getFechaCobro().isEmpty()&&!cobro.getFechaVence().isEmpty())
         {
            Conexion conect= new Conexion();
        Connection conexion=(Connection) conect.getconection();
         
        CallableStatement myCall = null;
       
        try {
                    myCall=(CallableStatement) conexion.prepareCall("{call putCobro(?,?,?,?,?,?)}");
               
                        myCall.setString(1,cobro.getFechaCobro() );
                        myCall.setString(2,cobro.getFechaVence().toString() );
                        myCall.setString(3,cobro.getDescripcion());
                        myCall.setString(4, cobro.getCantidad());
                        myCall.setInt(5,Integer.parseInt(cobro.getPropietario()));
                        myCall.setInt(6,Integer.parseInt(cobro.getPresidente()));
                        myCall.executeUpdate();
                        JOptionPane.showMessageDialog(null, "REGISTRO DE COBRO EXITOSO !");
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
