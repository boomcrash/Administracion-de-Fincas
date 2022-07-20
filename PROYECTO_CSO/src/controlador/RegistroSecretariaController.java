/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Conexion.Conexion;
import Exceptions.DatosIncompletosException;
import Modelo.Secretario;
import Modelo.Usuario;
import com.mysql.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 clase que controla el registro de Secretaria
 * @author GAMER
 */
public class RegistroSecretariaController {
    /**
     * metodo encargado de registrar a las secretarias en la base de datos recibiendo como parametro un objeto de la clase Secretario y un objeto de la clase Usuario 
     * @param secretario objeto de la clase Secretario
     * @param user objeto de la clase Usuario
     */
    public static void registrarSecretario(Secretario secretario,Usuario user){
        
        if(!secretario.getNombre().isEmpty()&&!String.valueOf(secretario.getEdad()).isEmpty()&&!secretario.getCedula().isEmpty() && secretario.getCedula().length()==10
                &&!secretario.getSexo().isEmpty()&&!secretario.getCiudad().isEmpty()
                &&!secretario.getId_comunidad().isEmpty()&&!secretario.getContacto().isEmpty()
                &&!secretario.getDireccion().isEmpty()&&!user.getUsuario().isEmpty()
                &&!user.getContraseña().isEmpty())
         {

            Conexion conect= new Conexion();
            Connection conexion=(Connection) conect.getconection();
            CallableStatement myCall = null;
        
        
        try {
                        myCall=(CallableStatement) conexion.prepareCall("{call putSecretario(?,?,?,?,?,?,?,?,?)}");
                        
                        int  id=UsuarioController.registrarUsuario(user);
                        int edad= secretario.getEdad();
                        int id_dire=Integer.parseInt(secretario.getId_comunidad());
                        myCall.setString(1,secretario.getNombre());
                        myCall.setInt(2,edad);
                        myCall.setString(3,secretario.getCedula());
                        myCall.setString(4,secretario.getSexo());
                        myCall.setString(5, secretario.getContacto());
                        myCall.setString(6,secretario.getCiudad());
                        myCall.setString(7,secretario.getDireccion());
                        myCall.setInt(8,id_dire);
                        myCall.setInt(9,id);
                        myCall.executeUpdate();
                        JOptionPane.showMessageDialog(null, "REGISTRO DE SECRETARIO EXITOSO !");
             } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO !\nERROR DE CONEXION"+ex);
             }finally {
                    try{myCall.close();} catch (Exception e){}
                    try{conexion.close();} catch (Exception e){}
            }
        }else {
            /**
             * Excepcion que se lanza al no estar los datos de Secretario completos
             */
             throw new DatosIncompletosException();
            //JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO !\nREVISE QUE LOS CAMPOS ESTEN LLENADOS CORRECTAMENTE.");
        }

    }
}
