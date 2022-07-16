/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Conexion.Conexion;
import Modelo.Finca;
import com.mysql.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author GAMER
 */
public class RegistroFincaController {
    public static void registrarFinca(Finca finca){
        
        if(!finca.getNombre().isEmpty()&&!finca.getDireccion().isEmpty()&&!finca.getId_propietario().isEmpty()
                &&!finca.getCiudad().isEmpty()&&!finca.getAñodefundacion().toString().isEmpty())
         {
            Conexion conect= new Conexion();
        Connection conexion=(Connection) conect.getconection();
         
        CallableStatement myCall = null;
        
        try {
                    myCall=(CallableStatement) conexion.prepareCall("{call putFinca(?,?,?,?,?)}");
                    
                        myCall.setString(1,finca.getNombre());
                        myCall.setString(2,finca.getCiudad());
                        myCall.setString(3,finca.getDireccion());
                        myCall.setString(4,finca.getAñodefundacion().toString());
                        myCall.setInt(5,Integer.parseInt(finca.getId_propietario()));
                        myCall.executeUpdate();
                        JOptionPane.showMessageDialog(null, "REGISTRO DE FINCA EXITOSO !");
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