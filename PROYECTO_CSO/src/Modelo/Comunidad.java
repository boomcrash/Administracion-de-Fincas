
package Modelo;
import java.util.Date;
/**
*clase Cobros representa los cobros que se van a registrar en el sistema
 * @author User
 */
public class Comunidad {
    /**
     * atributos de la clase comunidad
     */
    String nombre;
    String ciudad;
    String canton;
    Date añodefundacion;
     String direccion;
     String referencia;
     String descripcion;
     String estado;
/**
 * constructor para crear objetos de la clase comunidad 
 * @param nombre
 * @param ciudad
 * @param canton
 * @param añodefundacion
 * @param direccion
 * @param referencia
 * @param descripcion
 * @param estado 
 */
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
/**
 * metodo getNombre que devuelve el atributo nombre de la clase Comunidad
 * @return nombre
 */
    public String getNombre() {
        return nombre;
    }
/**
 * metodo setNombre que recibe como parametro el atributo nombre para poder modificarlo
 * @param nombre 
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * metodo getCiudad que devuelve el atributo ciudad de la clase Comunidad
 * @return ciudad
 */
    public String getCiudad() {
        return ciudad;
    }
/**
 *  * metodo setCiudad que recibe como parametro el atributo ciudad para poder modificarlo
 * @param ciudad 
 */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
/**
 * metodo getCanton que devuelve el atributo canton de la clase Comunidad
 * @return 
 */
    public String getCanton() {
        return canton;
    }
/**
 * metodo setCanton que recibe como parametro el atributo canton para poder modificarlo
 * @param canton 
 */
    public void setCanton(String canton) {
        this.canton = canton;
    }
/**
 * metodo getAñodefundacion que devuelve el atributo añodefundacion de la clase Comunidad
 * @return 
 */
    public Date getAñodefundacion() {
        return añodefundacion;
    }
/**
 * metodo setAñodefundacion que recibe como parametro el atributo añodefundacion para poder modificarlo
 * @param añodefundacion 
 */
    public void setAñodefundacion(Date añodefundacion) {
        this.añodefundacion = añodefundacion;
    }
/**
 * metodo getDireccion que devuelve el atributo direccion de la clase Comunidad
 * @return 
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
 * metodo getReferencia que devuelve el atributo referencia de la clase Comunidad
 * @return 
 */
    public String getReferencia() {
        return referencia;
    }
/**
 *metodo setReferencia que recibe como parametro el atributo referencia para poder modificarlo
 * @param referencia 
 */
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
/**
 * metodo getDescripcion que devuelve el atributo descripcion de la clase Comunidad
 * @return 
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
 *metodo getEstado que devuelve el atributo estado de la clase Comunidad
 * @return 
 */
    public String getEstado() {
        return estado;
    }
/**
 * metodo setEstado que recibe como parametro el atributo estado para poder modificarlo
 * @param estado 
 */
    public void setEstado(String estado) {
        this.estado = estado;
    }

     
    public String getInfoComunidad(String info){
    return info;
    }
}
