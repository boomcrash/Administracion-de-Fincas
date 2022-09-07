/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import Conexion.Conexion;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.WindowConstants;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *clase reporteController que maneja los metodos necesarios para el funcionamiento 
 * de el modulo reportes del sistema
 * @author GAMER
 */
public class ReporteController {
    public void abrirReporteGastosComunidad(){
        try {
            Conexion connect=new Conexion();
            com.mysql.jdbc.Connection conexion=(com.mysql.jdbc.Connection) connect.getconection(); 
            JasperReport reporte=null;
            String path="src/Reportes/gastosCom.jasper";
            reporte=(JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint= JasperFillManager.fillReport(path, null, conexion);
            JasperViewer view = new JasperViewer(jprint,false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(ReporteController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    /**
     * metodo que abre el formulario de reporte pagos presidentes  del  
     * modulo de reportes del sistema aplicando JasperReport
     */
        public void abrirReportePagosPresidentes(){
        try {
            Conexion connect=new Conexion();
            com.mysql.jdbc.Connection conexion=(com.mysql.jdbc.Connection) connect.getconection(); 
            JasperReport reporte=null;
            String path="src/Reportes/pagosPres.jasper";
            reporte=(JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint= JasperFillManager.fillReport(path, null, conexion);
            JasperViewer view = new JasperViewer(jprint,false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(ReporteController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        /**
         * metodo que abre el formulario de reporte de gastos de propietarios del 
         * modulo de reportes del sistema aplicando JasperReport
         */
        public void abrirReporteGastosPropietarios(){
        try {
            Conexion connect=new Conexion();
            com.mysql.jdbc.Connection conexion=(com.mysql.jdbc.Connection) connect.getconection(); 
            JasperReport reporte=null;
            String path="src/Reportes/gastosPro.jasper";
            reporte=(JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint= JasperFillManager.fillReport(path, null, conexion);
            JasperViewer view = new JasperViewer(jprint,false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(ReporteController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
