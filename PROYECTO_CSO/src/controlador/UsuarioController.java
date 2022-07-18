/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Conexion.Conexion;
import Modelo.Usuario;
import com.mysql.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *clase que controla el registro y consulta de Usuario
 * @author GAMER
 */
public class UsuarioController {
    /**
     * metodo que se encarga de consultar a los usuarios recibiendo como parametro un objeto de Usuario y retornando el id de  usuario
     * @param user objeto de Usuario
     * @return id de usuario
     */
        public static int consultarUsuario(Usuario user){
            int id=0;
            Conexion conect= new Conexion();
            com.mysql.jdbc.Connection conexion2=(com.mysql.jdbc.Connection) conect.getconection();
            CallableStatement myCall = null;

            ResultSet dato=null;
            try {
                myCall=(CallableStatement) conexion2.prepareCall("{call getUsuarioByTipo(?,?,?)}");
                myCall.setString(1,user.getUsuario());
                myCall.setString(2,user.getContraseña());
                myCall.setInt(3,user.getTipo());
                dato=myCall.executeQuery();
             if(dato.next())
             {
                 id=Integer.parseInt(dato.getString("id_usuario"));
             }
            }catch(SQLException ex)
            {
                System.err.println("ERROR EN OBTENER DATOS");
            }finally{
                try{myCall.close();} catch (Exception e){}
                 try{dato.close();} catch (Exception e){}
                 try{conexion2.close();} catch (Exception e){}
            }
           return id;

        }
        /**
         * metodo que registra a los usuarios en la base de datos recibiendo como parametro un objeto de Usuario y retornando user de consultar usuario
         * @param user objeto de Usuario
         * @return  consultar usuario (user)
         */
        public static int registrarUsuario(Usuario user){
            if(!user.getUsuario().isEmpty()&&!user.getContraseña().isEmpty())
            {
               Conexion conect= new Conexion();
               Connection conexion=(Connection) conect.getconection();
               CallableStatement myCall = null;


           try {
                           myCall=(CallableStatement) conexion.prepareCall("{call putUsuario(?,?,?)}");

                           myCall.setString(1, user.getUsuario());
                           myCall.setString(2, user.getContraseña());
                           myCall.setInt(3,user.getTipo());
                           myCall.executeUpdate();
                           JOptionPane.showMessageDialog(null, "REGISTRO DE USUARIO EXITOSO !");
                           //this.dispose();

                } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO !\nERROR DE CONEXION");
                }finally {
                       try{myCall.close();} catch (Exception e){}
                       try{conexion.close();} catch (Exception e){}
               }
                 /*panel.removeAll();
               panel.repaint();
                   limpiar();*/
            }else {JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO !\nREVISE QUE LOS CAMPOS ESTEN LLENADOS CORRECTAMENTE.");}

           return consultarUsuario(user);
        }
}
