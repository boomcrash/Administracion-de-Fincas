/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import static Conexion.Conexion.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author GAMER
 */
public class ConexionController {
    private static String USUARIO = "boomcrash@admfinca";
    private static String CONTRASEÑA = "Camaleon_1";
    private static final String URL="jdbc:mysql://admfinca.mysql.database.azure.com:3306/admFinca?autoReconnet=true&useSSL=true";
    private static Connection  conexion=null;
    
    public static Connection getconection()
    {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            conexion=(Connection) DriverManager.getConnection(URL,USUARIO,CONTRASEÑA);
            System.out.println("CONECTADO");
        } catch (ClassNotFoundException ex) {
            System.err.println("ERROR, "+ex);
        }       
        catch (SQLException ex) 
        {
            System.err.println("ERROR, "+ex);
        }
        return conexion;
    }
}
