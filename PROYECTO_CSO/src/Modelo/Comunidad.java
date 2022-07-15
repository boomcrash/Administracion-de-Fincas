
package Modelo;
import java.util.Date;
public class Comunidad {
    String nombre;
    String ciudad;
    String canton;
    Date añodefundacion;
     String direccion;
     String referencia;
     String descripcion;
     String estado;

    public Comunidad(String nombre, String ciudad, String canton, Date añodefundacion, String direccion, String referencia, String descripcion, String estado) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.canton = canton;
        this.añodefundacion = añodefundacion;
        this.direccion = direccion;
        this.referencia = referencia;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public Date getAñodefundacion() {
        return añodefundacion;
    }

    public void setAñodefundacion(Date añodefundacion) {
        this.añodefundacion = añodefundacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

     
    public String getInfoComunidad(String info){
    return info;
    }
}
