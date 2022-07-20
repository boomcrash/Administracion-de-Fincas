/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import Conexion.Conexion;
import Exceptions.DatosIncompletosException;
import Modelo.Finca;
import com.mysql.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 clase que controla el registro de las fincas
 * @author GAMER
 */
public class RegistroFincaController {
    /**
     * metodo que se encarga de registrar a Finca en la base de datos recibiendo como parametro un objeto Finca
     * @param finca objeto de la clase Finca
     */
    public static void registrarFinca(Finca finca){
        
        if(!finca.getNombre().isEmpty()&&!finca.getDireccion().isEmpty()&&!finca.getId_propietario().isEmpty()
                &&!finca.getCiudad().isEmpty()&&!finca.getAñodefundacion().toString().isEmpty())
         {
            Conexion conect= new Conexion();
        Connection conexion=(Connection) conect.getconection();
         
        CallableStatement myCall = null;
        
        try {
                    myCall=(CallableStatement) conexion.prepareCall("{call putFinca(?,?,?,?,?)}");
                    
                        myCall.setString(1,finca.getNombre());
                        myCall.setString(2,finca.getCiudad());
                        myCall.setString(3,finca.getDireccion());
                        myCall.setString(4,finca.getAñodefundacion().toString());
                        myCall.setInt(5,Integer.parseInt(finca.getId_propietario()));
                        myCall.executeUpdate();
                        JOptionPane.showMessageDialog(null, "REGISTRO DE FINCA EXITOSO !");
             } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO !\nERROR DE CONEXION"+ex);
             }finally {
                    try{myCall.close();} catch (Exception e){}
                    try{conexion.close();} catch (Exception e){}
            }
        }else {
            /**
             * Excepcion que se lanza al no estar los datos de Finca completos
             */
            throw new DatosIncompletosException();            
//JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO !\nREVISE QUE LOS CAMPOS ESTEN LLENADOS CORRECTAMENTE.");
        }

    }
}
