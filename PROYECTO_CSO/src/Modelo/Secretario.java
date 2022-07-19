
package Modelo;

import java.util.Date;
/**
 * clase Secretario que representa los secretarios que se van crear en el sistema y hereda de la clase Persona
 * @author User
 */
public class Secretario extends Persona {
    /**
     * atributos de la clase Secretario
     */
    String id_comunidad;
    /**
     * constructor para crear un objeto Secretario recibiendo los siguientes parametros:
     * @param id_comunidad
     * @param nombre
     * @param edad
     * @param cedula
     * @param sexo
     * @param contacto
     * @param ciudad
     * @param direccion 
     */
    public Secretario(String id_comunidad,String nombre, int edad, String cedula, String sexo, String contacto, String ciudad, String direccion) {
        super(nombre, edad, cedula, sexo, contacto, ciudad, direccion);
        this.id_comunidad = id_comunidad;
    }
/**
 * metodo getId_comunidad que devuelve el atributo id_comunidad de la clase Secretario 
 * @return id_secretario
 */
    public String getId_comunidad() {
        return id_comunidad;
    }
/**
 * metodo setId_comunidad que recibe como parametro el atributo id_comunidad para poder modificarlo
 * @param id_comunidad 
 */
    public void setId_comunidad(String id_comunidad) {
        this.id_comunidad = id_comunidad;
    }
    /**
     * metodo getNombre que devuelve el atributo nombre de la clase Secretario 
     * @return nombre
     */
    @Override
    public String getNombre() {
        return nombre;
    }
/**
 * metodo setNombre que recibe como parametro el atributo nombre para poder modificarlo
 * @param nombre 
 */
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * metodo getEdad que devuelve el atributo edad de la clase Secretario 
 * @return edad
 */
    @Override
    public int getEdad() {
        return edad;
    }
/**
 * metodo setEdad que recibe como parametro el atributo edad para poder modificarlo
 * @param edad 
 */
    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }
/**
 *  metodo getCedula que devuelve el atributo cedula de la clase Secretario 
 * @return cedula
 */
    @Override
    public String getCedula() {
        return cedula;
    }
/**
 * metodo setCedula que recibe como parametro el atributo cedula para poder modificarlo
 * @param cedula 
 */
    @Override
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
/**
 * metodo getSexo que devuelve el atributo sexo de la clase Secretario 
 * @return sexo
 */
    @Override
    public String getSexo() {
        return sexo;
    }
/**
 * metodo setSexo que recibe como parametro el atributo sexo para poder modificarlo
 * @param sexo 
 */
    @Override
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
/**
 * metodo getContacto que devuelve el atributo contacto de la clase Secretario 
 * @return contacto
 */
    @Override
    public String getContacto() {
        return contacto;
    }
/**
 * metodo setContacto que recibe como parametro el atributo contacto para poder modificarlo
 * @param contacto 
 */
    @Override
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
/**
 * metodo getCiudad que devuelve el atributo ciudad de la clase Secretario 
 * @return ciudad
 */
    @Override
    public String getCiudad() {
        return ciudad;
    }
/**
 * metodo setCiudad que recibe como parametro el atributo ciudad para poder modificarlo
 * @param ciudad 
 */
    @Override
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
/**
 * metodo getDireccion que devuelve el atributo direccion de la clase Secretario 
 * @return direccion
 */
    @Override
    public String getDireccion() {
        return direccion;
    }
/**
 * metodo setDireccion que recibe como parametro el atributo direccion para poder modificarlo
 * @param direccion 
 */
    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


}
