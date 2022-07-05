
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class Conexion {
    private final String USUARIO = "sql10504199";
    private final String CONTRASEÑA = "5qM3pIlWBc";
    public static final String URL="jdbc:mysql://sql10.freemysqlhosting.net:3306/sql10504199?autoReconnet=true&useSSL=false";
    Connection conexion=null;
    
    public Conexion() {
       
    }
        
    public Connection getconection()
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

