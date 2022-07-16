/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *clase Cobros representa los cobros que se van a registrar en el sistema
 * @author GAMER
 */
public class Cobros {
 /**
 * Atributos de la clase Cobros
 */
    String descripcion,cantidad,fechaCobro,fechaVence,propietario,presidente;
/**
 *constructor para crear un objeto Cobros recibiendo los siguientes parametros:
 * @param descripcion
 * @param cantidad
 * @param fechaCobro
 * @param fechaVence
 * @param propietario
 * @param presidente 
 */
    public Cobros(String descripcion, String cantidad, String fechaCobro, String fechaVence, String propietario, String presidente) {
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.fechaCobro = fechaCobro;
        this.fechaVence = fechaVence;
        this.propietario = propietario;
        this.presidente = presidente;
    }
/**
 * metodo getDescripcion que obtiene  el atributo descripcion de la  clase Cobros
 * @return descripcion
 */
    public String getDescripcion() {
        return descripcion;
    }
/**
 * metodo setDescripcion que recibe como parametro el atributo descripcion para poder modificarlo
 * @param descripcion 
 */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
/**
 * metodo getCantidad que obtiene  el atributo cantidad de la  clase Cobros
 * @return cantidad
 */
    public String getCantidad() {
        return cantidad;
    }
/**
 *metodo setCantidad que recibe como parametro el atributo cantidad para poder modificarlo
 * @param cantidad 
 */
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
/**
 *metodo getFechaCobro que obtiene  el atributo fechaCobro de la  clase Cobros
 * @return fechaCobro
 */
    public String getFechaCobro() {
        return fechaCobro;
    }
/**
 *metodo setFechaCobro que recibe como parametro el atributo fechaCobro para poder modificarlo
 * @param fechaCobro 
 */
    public void setFechaCobro(String fechaCobro) {
        this.fechaCobro = fechaCobro;
    }
/**
 * metodo getFechaVence que obtiene  el atributo fechaVende de la  clase Cobros
 * @return fechaVende
 */
    public String getFechaVence() {
        return fechaVence;
    }
/**
 * metodo setFechaVence que recibe como parametro el atributo fechaVende para poder modificarlo
 * @param fechaVence 
 */
    public void setFechaVence(String fechaVence) {
        this.fechaVence = fechaVence;
    }
/**
 * metodo getPropietario que obtiene  el atributo propietario de la  clase Cobros
 * @return propietario
 */
    public String getPropietario() {
        return propietario;
    }
/**
 * metodo setPropietario que recibe como parametro el atributo propietario para poder modificarlo
 * @param propietario 
 */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
/**
 * metodo getPresidente que obtiene  el atributo presidente de la  clase Cobros
 * @return presidente
 */
    public String getPresidente() {
        return presidente;
    }
/**
 * metodo setPresidente que recibe como parametro el atributo presidente para poder modificarlo
 * @param presidente 
 */
    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }
    
    
}
