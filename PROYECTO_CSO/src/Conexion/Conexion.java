
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class Conexion {
    private final String USUARIO = "boomcrash@admfinca";
    private final String CONTRASEÑA = "Camaleon_1";
    public static final String URL="jdbc:mysql://admfinca.mysql.database.azure.com:3306/admFinca?autoReconnet=true&useSSL=true";
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

