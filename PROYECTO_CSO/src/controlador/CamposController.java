/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * clase encargada de los campos de los formularios
 * @author User
 */
public class CamposController {
    /**
     * metodo que realiza la limpieza de todos los textfield recibiendo como parametros un JPanel
     * @param panel 
     */
     public void limpiar(JPanel panel){
        for(Object o : panel.getComponents()) {
            if(o instanceof JTextField){
                 ((JTextField) o).setText(" ");
            }
        }
    }
     /**
      * metodo que muestra en un JLabel el nombre dfe la ventana en la que se encuentra el usuario recibiendo como parametro un JLabel
      * @param j 
      */
     public void mostrarnombreventana(JLabel j){
        String formulario = getClass().getSimpleName();
       j.setText(formulario.replace("_", " "));
     }
}
