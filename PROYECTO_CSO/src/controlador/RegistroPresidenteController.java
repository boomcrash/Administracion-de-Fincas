/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Conexion.Conexion;
import Modelo.Presidente;
import com.mysql.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author GAMER
 */
public class RegistroPresidenteController {
    public static void registrarPresidente(Presidente presidente){
        
        if(!presidente.getNombre().isEmpty()&&!presidente.getCedula().isEmpty() && presidente.getCedula().length()==10 &&!String.valueOf(presidente.getEdad()).isEmpty()
                &&!presidente.getSexo().isEmpty()&&!presidente.getDireccion().isEmpty()
                &&!presidente.getId_comunidad().isEmpty()&&!presidente.getCiudad().isEmpty()&&!presidente.getContacto().isEmpty())
         {
            Conexion conect= new Conexion();
        Connection conexion=(Connection) conect.getconection();
         
        CallableStatement myCall = null;
        
        try {
                    myCall=(CallableStatement) conexion.prepareCall("{call putPresidente(?,?,?,?,?,?,?,?)}");
                    
                        myCall.setString(1, presidente.getNombre());
                        myCall.setInt(2,presidente.getEdad());
                        myCall.setString(3,presidente.getCedula());
                        myCall.setString(4,presidente.getSexo());
                        myCall.setString(5,presidente.getContacto());
                        myCall.setString(6,presidente.getCiudad());
                        myCall.setString(7,presidente.getDireccion());
                        myCall.setInt(8,Integer.parseInt(presidente.getId_comunidad()));
                        myCall.executeUpdate();
                        JOptionPane.showMessageDialog(null, "REGISTRO DE PRESIDENTE EXITOSO !");
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
