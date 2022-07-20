/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Conexion.Conexion;
import Exceptions.DatosIncompletosException;
import Modelo.Pago;
import com.mysql.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *clase que controla el registro de los pagos
 * @author GAMER
 */
public class RegistroPagoController {
    /**
     * metodo que se encarga de registrar Pago en la base de datos recibiendo como parametro un objeto de Pago
     * @param pago objeto de la clase Pago
     */
    public static void registrarPago(Pago pago){
        
        if(!pago.getCantidad().isEmpty()&&!pago.getDescripcion().isEmpty()&&!pago.getId_presidente().isEmpty()
                &&!pago.getId_banco().isEmpty()&&!pago.getFechaPago().toString().isEmpty())
         {
            Conexion conect= new Conexion();
        Connection conexion=(Connection) conect.getconection();
         
        CallableStatement myCall = null;
        
        try {
                    myCall=(CallableStatement) conexion.prepareCall("{call putPago(?,?,?,?,?)}");
                    
                        myCall.setString(1,pago.getFechaPago().toString() );
                        myCall.setString(2,pago.getDescripcion());
                        myCall.setString(3,pago.getCantidad());
                        myCall.setString(4, pago.getId_presidente());
                        myCall.setInt(5,Integer.parseInt(pago.getId_banco()));
                        myCall.executeUpdate();
                        JOptionPane.showMessageDialog(null, "REGISTRO DE PAGO EXITOSO !");
             } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO !\nERROR DE CONEXION"+ex);
             }finally {
                    try{myCall.close();} catch (Exception e){}
                    try{conexion.close();} catch (Exception e){}
            }
        }else{
            /**
             * Excepcion que se lanza al no estar los datos de Pago completos
             */
            throw new DatosIncompletosException();
            //JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO !\nREVISE QUE LOS CAMPOS ESTEN LLENADOS CORRECTAMENTE.");
            }

    }
}
