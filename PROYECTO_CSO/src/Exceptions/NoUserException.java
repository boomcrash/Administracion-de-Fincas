/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exceptions;

import javax.swing.JOptionPane;

/**
 *clase NoUserException para el inicio de sesion de usuarios no registrados  
 * @author User
 */
public class NoUserException extends RuntimeException{
    /**
     * Excepcion que se lanza al no existir un usuario registrado en el sistema
     * @param mensaje 
     */
    public NoUserException(){
        System.out.println("NO EXISTE ESTE USUARIO REGISTRADO EN LA BASE DE DATOS");
        
    }
    
}
