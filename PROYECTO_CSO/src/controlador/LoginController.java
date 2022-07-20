/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Conexion.Conexion;
import Exceptions.LoginException;
import Exceptions.NoUserException;
import Modelo.Usuario;
import Vista.Inicio;
import static Vista.Login.id_Usuario;
import com.mysql.jdbc.CallableStatement;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTextField;

/**
 *clase LoginController que controla el ingreso de los usuarios al sistema
 * @author GAMER
 */
public class LoginController {
    /**
     * metodo iniciarSesion que recibe como parametros user, user2 que es el nombre de usuario y pass que es la contraseña del usuario de los textfield del formulario login
     * @param user objeto de la clase usuario
     * @param user2 objeto de la clase JTextField
     * @param pass objeto de la clase JTextField
     */
     public static void iniciarSesion(Usuario user,JTextField user2,JTextField pass){
        if(user.getUsuario().isEmpty()){
            user2.setBackground(Color.red);
        }
        if(user.getContraseña().isEmpty()){
             pass.setBackground(Color.red);
        }
        if(!user.getUsuario().isEmpty()&&!user.getContraseña().isEmpty()){
            Conexion conect= new Conexion();
            com.mysql.jdbc.Connection conexion2=(com.mysql.jdbc.Connection) conect.getconection();
            CallableStatement myCall = null;
            
            ResultSet dato=null;
            try {
                myCall=(CallableStatement) conexion2.prepareCall("{call getUserByUserAndPassword(?,?)}");
                myCall.setString(1,user.getUsuario());
                myCall.setString(2,user.getContraseña());
                dato=myCall.executeQuery();
             if(dato.next())
             {
                 String id=dato.getString("id_usuario");

                 if(user.getContraseña().equalsIgnoreCase(dato.getString("usuario"))&&user.getContraseña().equalsIgnoreCase(dato.getString("contraseña")))
                 {
                     try{
                        if(dato.getString("tipo_usuario_id").equalsIgnoreCase("1")){
                                 System.out.println(id);
                                 id_Usuario=Integer.parseInt(id);
                        }else if(dato.getString("tipo_usuario_id").equalsIgnoreCase("2")){
                                 System.out.println(id);
                                 id_Usuario=Integer.parseInt(id);
                        }
                        VentanasController.cerrarLogin();
                        VentanasController.abrirInicio();
                        
                     }catch(Exception e){
                         System.out.println("ERROR DE CONSULTA");
                     }
                 }else{
                     throw new NoUserException();
//System.out.println("NO EXISTE ESTE USUARIO");
                 }
              }
            }catch(SQLException ex)
            {
                System.err.println("UPS ! PARECE QUE TU BASE DE DATOS NO ESTA FUNCIONANDO.");
            }finally{
                try{myCall.close();} catch (Exception e){}
                 try{dato.close();} catch (Exception e){}
                 try{conexion2.close();} catch (Exception e){}
            }
        }else{
            throw new LoginException();
            //System.out.println("DATOS INCOMPLETOS !!");
        }
        
    }
}
