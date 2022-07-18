/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 * clase Usuario que representa los usuarios que se van crear en el sistema
 * @author GAMER
 */
public class Usuario {
    /**
     * atributos de la clase Usuario
     */
    String usuario,contraseña;
    int tipo;
/**
 * metodo constructor de la clase Usuario para crear un objeto Usuario recibiendo los siguientes parametros:
 * @param usuario
 * @param contraseña
 * @param tipo 
 */
    public Usuario(String usuario, String contraseña, int tipo) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.tipo = tipo;
    }
    /**
     * metodo constructor de la clase Usuario para crear un objeto Usuario recibiendo los siguientes parametros:
     * @param usuario
     * @param contraseña 
     */
    public Usuario(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
/**
 * metodo getUsuario que devuelve el atributo usuario de la clase Usuario 
 * @return usuario
 */
    public String getUsuario() {
        return usuario;
    }
/**
 * metodo setUsuario que recibe como parametro el atributo usuario para poder modificarlo
 * @param usuario 
 */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
/**
 * metodo getContraseña que devuelve el atributo contraseña de la clase Usuario 
 * @return contraseña
 */
    public String getContraseña() {
        return contraseña;
    }
/**
 * metodo setContraseña que recibe como parametro el atributo contraseña para poder modificarlo
 * @param contraseña 
 */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
/**
 * metodo getTipo que devuelve el atributo tipo de la clase Usuario 
 * @return tipo
 */
    public int getTipo() {
        return tipo;
    }
/**
 *  metodo setTipo que recibe como parametro el atributo tipo para poder modificarlo
 * @param tipo 
 */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
}
