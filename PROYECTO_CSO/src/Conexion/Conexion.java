
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexion {
    private final String base = "sql10504199";
    private final String USUARIO = "sql10504199";
    private final String CONTRASEÑA = "5qM3pIlWBc";
    private final String URL = "jdbc:mysql://sql10.freesqldatabase.com:3306" + base;
    Connection conexion=null;
    
    public Conexion() {
       
    }
        
    public Connection getconection()
    {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            conexion=(Connection) DriverManager.getConnection(URL,USUARIO,CONTRASEÑA);
            System.out.println("conectado");
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

