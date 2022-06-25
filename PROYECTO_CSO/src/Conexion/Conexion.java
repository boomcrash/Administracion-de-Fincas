
package Conexion;

import java.sql.Connection;
public class Conexion {
    private final String base = "adm_fincas";
    private final String user = "root";
    private final String password = "root";
    private final String url = "jdbc:mysql://localhost:3306" + base;
    private Connection con = null;
    
}

