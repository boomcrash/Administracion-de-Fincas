
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 * clase conexion que se usara para crear las conexiones con la base de datos
 * @author User
 */
public class Conexion {
    /**
     * atributos de la clase Conexion
     */
    private final String USUARIO = "boomcrash@admfinca";
    private final String CONTRASEÑA = "Camaleon1";
    public static final String URL="jdbc:mysql://admfinca.mysql.database.azure.com:3306/admFinca?autoReconnet=true&useSSL=false";
    Connection conexion=null;
    /**
     * metodo constructor que permite crear un objeto de la clase Conexion
     */
    public Conexion() {
       
    }
        /**
         * metodo getconection que obtiene el atributo conexion de la clase Conexion
         * @return conexion
         */
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

