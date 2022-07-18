/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *clase pagos que representa los pagos que se van  aregistrar en el sistema
 * @author GAMER
 */
public class Pago {
    /**
     * atributos de la clase Pago
     */
     String descripcion,cantidad,id_presidente,id_banco;
     Date fechaPago;
/**
 * metodo constructor para crear objetos de la clase Pago
 * @param descripcion 
 * @param cantidad
 * @param fechaPago
 * @param id_presidente
 * @param id_banco 
 */
    public Pago(String descripcion, String cantidad, Date fechaPago, String id_presidente, String id_banco) {
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.fechaPago = fechaPago;
        this.id_presidente = id_presidente;
        this.id_banco = id_banco;
    }
/**
 * metodo getDescripcion que devuelve el atributo descripcion de la clase Pago 
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
 * metodo getCantidad que devuelve el atributo cantidad de la clase Pago 
 * @return cantidad
 */
    public String getCantidad() {
        return cantidad;
    }
/**
 * metodo setCantidad que recibe como parametro el atributo cantidad para poder modificarlo
 * @param cantidad 
 */
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
/**
 * metodo getFechaPago que devuelve el atributo fechaPago de la clase Pago 
 * @return fechaPago
 */
    public Date getFechaPago() {
        return fechaPago;
    }
/**
 * metodo setFechaPago que recibe como parametro el atributo fechaPago para poder modificarlo
 * @param fechaPago 
 */
    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }
/**
 * metodo getId_presidente que devuelve el atributo id_presidente de la clase Pago 
 * @return id_presidente
 */
    public String getId_presidente() {
        return id_presidente;
    }
/**
 *  metodo setId_presidente que recibe como parametro el atributo id_presidente para poder modificarlo
 * @param id_presidente 
 */
    public void setId_presidente(String id_presidente) {
        this.id_presidente = id_presidente;
    }
/**
 * metodo getId_banco que devuelve el atributo id_banco de la clase Pago 
 * @return id_banco
 */
    public String getId_banco() {
        return id_banco;
    }
/**
 * metodo setId_banco que recibe como parametro el atributo id_banco para poder modificarlo
 * @param id_banco 
 */
    public void setId_banco(String id_banco) {
        this.id_banco = id_banco;
    }
     
}
