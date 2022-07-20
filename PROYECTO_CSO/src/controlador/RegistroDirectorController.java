/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Conexion.Conexion;
import Modelo.Director;
import Modelo.Usuario;
import com.mysql.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *clase que controla el registro de Director
 * @author GAMER
 */
public class RegistroDirectorController {
    /**
     * metodo encargado de registrar a Director en la base de datos recibiendo como parametros un objeto Director y un objeto Usuario
     * @param director objeto de la clase Director
     * @param user objeto de la clase Usuario
     */
    public static void registrarDirector(Director director,Usuario user){
        
        if(!director.getNombre().isEmpty()&&!String.valueOf(director.getEdad()).isEmpty()&&!director.getCedula().isEmpty() && director.getCedula().length()==10
                &&!director.getSexo().isEmpty()&&!director.getCiudad().isEmpty()
                &&!director.getId_comunidad().isEmpty()&&!director.getContacto().isEmpty()
                &&!director.getDireccion().isEmpty()&&!user.getUsuario().isEmpty()
                &&!user.getContraseña().isEmpty())
         {
            Conexion conect= new Conexion();
            Connection conexion=(Connection) conect.getconection();
            CallableStatement myCall = null;
        
        
        try {
            myCall=(CallableStatement) conexion.prepareCall("{call putDirector(?,?,?,?,?,?,?,?,?)}");
                        int  id=UsuarioController.registrarUsuario(user);
                     
                        myCall.setString(1,director.getNombre());
                        myCall.setInt(2,director.getEdad());
                        myCall.setString(3,director.getCedula());
                        myCall.setString(4,director.getSexo());
                        myCall.setString(5, director.getContacto());
                        myCall.setString(6,director.getCiudad());
                        myCall.setString(7,director.getDireccion());
                        myCall.setInt(8,Integer.parseInt(director.getId_comunidad()));
                        myCall.setInt(9,id);
                        myCall.executeUpdate();
                        JOptionPane.showMessageDialog(null, "REGISTRO DE DIRECTOR EXITOSO !");
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
