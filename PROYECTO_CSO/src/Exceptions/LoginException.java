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
public class LoginException extends Exception {
/**
 * Excepcion que se lanza al existir datos incompletos en los registros
 * @param mensaje 
 */
    public  LoginException() {

         System.err.println("DEBE RELLENAR TODOS LOS CAMPOS");
         JOptionPane.showMessageDialog(null, "DEBE RELLENAR TODOS LOS CAMPOS");
    
    }
    
}
