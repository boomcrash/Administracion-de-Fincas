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
public class LoginException extends RuntimeException {
/**
 * Excepcion que se lanza al existir datos incompletos en los registros
 * @param mensaje 
 */
    public  LoginException() {

         System.err.println("Existen campos vacios, ingrese los datos de Inicio de Sesión correctamente");
    
    }
    
}
