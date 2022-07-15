/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author GAMER
 */
public class Pago {
     String descripcion,cantidad,id_presidente,id_banco;
     Date fechaPago;

    public Pago(String descripcion, String cantidad, Date fechaPago, String id_presidente, String id_banco) {
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.fechaPago = fechaPago;
        this.id_presidente = id_presidente;
        this.id_banco = id_banco;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getId_presidente() {
        return id_presidente;
    }

    public void setId_presidente(String id_presidente) {
        this.id_presidente = id_presidente;
    }

    public String getId_banco() {
        return id_banco;
    }

    public void setId_banco(String id_banco) {
        this.id_banco = id_banco;
    }
     
}
