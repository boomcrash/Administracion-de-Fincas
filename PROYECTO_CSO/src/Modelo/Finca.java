package Modelo;
import java.util.Date;
public class Finca {
    String nombre;
    String ciudad;
    String direccion;
    Date añodefundacion;
    String id_propietario;

    public Finca(String nombre, String ciudad, String direccion, Date añodefundacion, String id_propietario) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.añodefundacion = añodefundacion;
        this.id_propietario = id_propietario;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getAñodefundacion() {
        return añodefundacion;
    }

    public void setAñodefundacion(Date añodefundacion) {
        this.añodefundacion = añodefundacion;
    }

    public String getId_propietario() {
        return id_propietario;
    }

    public void setId_propietario(String id_propietario) {
        this.id_propietario = id_propietario;
    }

    
    
    public String getInfoFinca(String info){
        
    return info;
    }
}
