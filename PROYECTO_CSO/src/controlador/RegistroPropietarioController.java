/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Conexion.Conexion;
import Modelo.Propietario;
import com.mysql.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author GAMER
 */
public class RegistroPropietarioController {
    
    public static void registrarPropietario(Propietario propietario){
        
        if(!propietario.getNombre().isEmpty()&&!propietario.getContacto().isEmpty()&&!String.valueOf(propietario.getEdad()).isEmpty()
                &&!propietario.getSexo().isEmpty()&&!propietario.getCedula().isEmpty() && propietario.getCedula().length()==10
                &&!propietario.getId_comunidad().isEmpty()&&!propietario.getCiudad().isEmpty()
                &&!propietario.getDireccion().isEmpty())
         {
            Conexion conect= new Conexion();
       Connection conexion=(Connection) conect.getconection();
         
        CallableStatement myCall = null;
        
        try {
                    myCall=(CallableStatement) conexion.prepareCall("{call putPropietario(?,?,?,?,?,?,?,?)}");
                        myCall.setString(1, propietario.getNombre());
                        myCall.setInt(2,propietario.getEdad());
                        myCall.setString(3,propietario.getCedula());
                        myCall.setString(4,propietario.getSexo());
                        myCall.setString(5,propietario.getContacto());
                        myCall.setString(6,propietario.getCiudad());
                        myCall.setString(7,propietario.getDireccion());
                        myCall.setInt(8,Integer.parseInt(propietario.getId_comunidad().toString()));
                        myCall.executeUpdate();
                        JOptionPane.showMessageDialog(null, "REGISTRO DE PROPIETARIO EXITOSO !");
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
