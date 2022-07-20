/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exceptions;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class DatosIncompletosException  extends NullPointerException{
    /**
     * Excepcion que se lanza al existir datos incompletos en los registros
     * @param mensaje 
     */
    public  DatosIncompletosException ( ){
        //super(mensaje);

     System.err.println("Existen datos incompletos,Complete todos los campos");
    }
    
}
