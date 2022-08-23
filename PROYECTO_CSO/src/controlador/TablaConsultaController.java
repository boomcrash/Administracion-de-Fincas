/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Conexion.Conexion;
import com.mysql.jdbc.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GAMER
 */
public class TablaConsultaController {
     public static void llenarTablaCobroPropietarios(JTable tablita){
        DefaultTableModel modelo =new DefaultTableModel();
        tablita.setModel(modelo);
        Conexion connect=new Conexion();
        com.mysql.jdbc.Connection conexion=(com.mysql.jdbc.Connection) connect.getconection();
        ResultSet rs=null;
        CallableStatement myCall = null;
        
        
        try {
            myCall=(CallableStatement) conexion.prepareCall("{call getCobrosPropietarios()}");
            rs=myCall.executeQuery();
            modelo.addColumn("id_cobro");
            modelo.addColumn("propietario");
            modelo.addColumn("cedula");
            modelo.addColumn("presidente");
            modelo.addColumn("cedula");
            modelo.addColumn("cantidad");
            
            System.out.println("ejecuta");
            while(rs.next()){
                Object fila[]=new Object[6];
                for(int i=0;i<6;i++){
                    fila[i]=rs.getObject(i+1);                    
                }
                modelo.addRow(fila);
            }            
        } catch (SQLException ex) {
            System.err.println("ERROR");
        }finally {try{myCall.close();} catch (Exception e){}
        try{rs.close();} catch (Exception e){}
        try{conexion.close();} catch (Exception e){}
        }     
    }
     
    public static void llenarTablaPagosPropietarios(JTable tablita){
        DefaultTableModel modelo =new DefaultTableModel();
        tablita.setModel(modelo);
        Conexion connect=new Conexion();
        com.mysql.jdbc.Connection conexion=(com.mysql.jdbc.Connection) connect.getconection();
        ResultSet rs=null;
        CallableStatement myCall = null;
        
        
        try {
            myCall=(CallableStatement) conexion.prepareCall("{call getPagosPropietarios()}");
            rs=myCall.executeQuery();
            modelo.addColumn("id_pago");
            modelo.addColumn("banco");
            modelo.addColumn("representante");
            modelo.addColumn("presidente");
            modelo.addColumn("cedula");
            modelo.addColumn("cantidad");
            
            System.out.println("ejecuta");
            while(rs.next()){
                Object fila[]=new Object[6];
                for(int i=0;i<6;i++){
                    fila[i]=rs.getObject(i+1);                    
                }
                modelo.addRow(fila);
            }            
        } catch (SQLException ex) {
            System.err.println("ERROR");
        }finally {try{myCall.close();} catch (Exception e){}
        try{rs.close();} catch (Exception e){}
        try{conexion.close();} catch (Exception e){}
        }     
   }
    
    public static void llenarTablaGastosComunidad(JTable tablita){
        DefaultTableModel modelo =new DefaultTableModel();
        tablita.setModel(modelo);
        Conexion connect=new Conexion();
        com.mysql.jdbc.Connection conexion=(com.mysql.jdbc.Connection) connect.getconection();
        ResultSet rs=null;
        CallableStatement myCall = null;
        
        
        try {
            myCall=(CallableStatement) conexion.prepareCall("{call getGastosComunidad()}");
            rs=myCall.executeQuery();
            modelo.addColumn("comunidad");
            modelo.addColumn("banco");
            modelo.addColumn("gasto_total");
            
            System.out.println("ejecuta");
            while(rs.next()){
                Object fila[]=new Object[3];
                for(int i=0;i<3;i++){
                    fila[i]=rs.getObject(i+1);                    
                }
                modelo.addRow(fila);
            }            
        } catch (SQLException ex) {
            System.err.println("ERROR");
        }finally {try{myCall.close();} catch (Exception e){}
        try{rs.close();} catch (Exception e){}
        try{conexion.close();} catch (Exception e){}
        }     
   }
    
    
      public static void llenarTablaGastosPropietarios(JTable tablita){
        DefaultTableModel modelo =new DefaultTableModel();
        tablita.setModel(modelo);
        Conexion connect=new Conexion();
        com.mysql.jdbc.Connection conexion=(com.mysql.jdbc.Connection) connect.getconection();
        ResultSet rs=null;
        CallableStatement myCall = null;
        
        
        try {
            myCall=(CallableStatement) conexion.prepareCall("{call getGastosPropietarios()}");
            rs=myCall.executeQuery();
            modelo.addColumn("propietario");
            modelo.addColumn("ciudad");
            modelo.addColumn("gasto_total");
            
            System.out.println("ejecuta");
            while(rs.next()){
                Object fila[]=new Object[3];
                for(int i=0;i<3;i++){
                    fila[i]=rs.getObject(i+1);                    
                }
                modelo.addRow(fila);
            }            
        } catch (SQLException ex) {
            System.err.println("ERROR");
        }finally {try{myCall.close();} catch (Exception e){}
        try{rs.close();} catch (Exception e){}
        try{conexion.close();} catch (Exception e){}
        }     
   }
}
