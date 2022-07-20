/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Vista.Login;
import static controlador.VentanasController.ventanaInicio;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * clase encargada de los campos de los formularios
 * @author User
 */
public class CamposController {
    VentanasController window = new VentanasController();
    /**
     * metodo que realiza la limpieza de todos los textfield recibiendo como parametros un JPanel
     * @param panel objeto de la clase JPanel
     */
     public static void limpiar(JPanel panel){
        for(Object o : panel.getComponents()) {
            if(o instanceof JTextField){
                 ((JTextField) o).setText(" ");
            }
        }
    }
     /**
      * metodo que muestra en un JLabel el nombre dfe la ventana en la que se encuentra el usuario recibiendo como parametro un JLabel
      * @param j objeto de la clase JLabel
     * @param p
      */
     public  static  void mostrarnombreventana(JLabel j, JPanel p){
         String formulario = p.getClass().getSimpleName();
       j.setText(formulario.replace("_", " "));
     }
     
    /**
     * metodo que cambia el color al colocar el mouse sobre el boton
     * @param j instancia de la clase JLabel
     */  
 public static void setColor(JButton j){
j.setBackground(new Color(255,51,51));
}
/**
 * metodo que cambia el color al quitar el mouse sobre el boton
 * @param j1 instancia de la clase JLabel
 */
public static void resetColor(JButton j1){
j1.setBackground(new Color(153,0,0));
}

}
