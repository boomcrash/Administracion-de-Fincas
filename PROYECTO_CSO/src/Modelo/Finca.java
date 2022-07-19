package Modelo;
import java.util.Date;
/**
 * clase Finca
 * @author User
 */
public class Finca {
   /**
    * atributos de la clase Finca
    */
    String nombre;
    String ciudad;
    String direccion;
    Date añodefundacion;
    String id_propietario;
/**
 * metodo constructor que permite crear objetos de la clase Finca recibiendo los parametros de nombre, ciudad, direccion, añodefundacion, id_propietario
 * @param nombre atributo nombre de la clase Finca
 * @param ciudad atributo ciudad de la clase Finca
 * @param direccion atributo direccion de la clase Finca
 * @param añodefundacion atributo añodefundacion de la clase Finca
 * @param id_propietario  atributo id_propietario de la clase Finca
 */
    public Finca(String nombre, String ciudad, String direccion, Date añodefundacion, String id_propietario) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.añodefundacion = añodefundacion;
        this.id_propietario = id_propietario;
    }
/**
 * metodo getNombre que devuelve el atributo nombre de la clase Finca 
 * @return atributo nombre de la clase Finca
 */
    public String getNombre() {
        return nombre;
    }
/**
 * metodo setNombre  que recibe como parametro el atributo nombre para poder modificarlo
 * @param nombre 
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * metodo getCiudad que devuelve el atributo ciudad de la clase Finca
 * @return atributo ciudad de la clase Finca
 */
    
    public String getCiudad() {
        return ciudad;
    }
/**
 * metodo setCiudad que recibe como parametro el atributo ciudad para poder modificarlo
 * @param ciudad 
 */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
/**
 * metodo getDireccion que devuelve el atributo direccion de la clase Finca
 * @return atributo direccion de la clase Finca
 */
    public String getDireccion() {
        return direccion;
    }
/**
 * metodo setDireccion que recibe como parametro el atributo direccion para poder modificarlo
 * @param direccion 
 */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
/**
 *  metodo getAñodefundacion que devuelve el atributo añodefundacion de la clase Finca
 * @return atributo añodefundacion de la clase Finca
 */
    public Date getAñodefundacion() {
        return añodefundacion;
    }
/**
 *  metodo setAñodefundacion que recibe como parametro el atributo añodefundacion para poder modificarlo
 * @param añodefundacion 
 */
    public void setAñodefundacion(Date añodefundacion) {
        this.añodefundacion = añodefundacion;
    }
/**
 * metodo getId_propietario que devuelve el atributo id_propietario de la clase Finca
 * @return id_propietario
 */
    public String getId_propietario() {
        return id_propietario;
    }
/**
 * metodo setId_propietario que recibe como parametro el atributo id_propietario para poder modificarlo
 * @param id_propietario 
 */
    public void setId_propietario(String id_propietario) {
        this.id_propietario = id_propietario;
    }

    public String getInfoFinca(String info){
        
    return info;
    }
}
