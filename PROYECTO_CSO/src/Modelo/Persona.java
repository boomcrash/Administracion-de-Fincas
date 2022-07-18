package Modelo;
import java.util.Date;
/**
 * clase Persona
 * @author User
 */
public class Persona {
    /**
     * atributos de la clase Persona
     */
    public String nombre;
    public int edad;
    public String cedula;
    public String sexo;
    public String contacto;
    public String ciudad;
    public String direccion;
/**
 * metodo contructor que permite crear instancias de la  clase Persona
 * @param nombre
 * @param edad
 * @param cedula
 * @param sexo
 * @param contacto
 * @param ciudad
 * @param direccion 
 */
    public Persona(String nombre, int edad, String cedula, String sexo, String contacto, String ciudad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.sexo = sexo;
        this.contacto = contacto;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    /**
     *  metodo getNombre que devuelve el atributo nombre de la clase persona    
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
 * metodo getEdad que devuelve el atributo edad de la clase persona
 * @return edad
 */
    public int getEdad() {
        return edad;
    }
/**
 * metodo setEdad que recibe como parametro el atributo edad para poder modificarlo
 * @param edad 
 */
    public void setEdad(int edad) {
        this.edad = edad;
    }
/**
 * metodo getCedula que devuelve el atributo cedula de la clase persona
 * @return cedula
 */
    public String getCedula() {
        return cedula;
    }
/**
 * metodo setEdad que recibe como parametro el atributo edad para poder modificarlo
 * @param cedula 
 */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
/**
 * metodo getSexo que devuelve el atributo sexo de la clase persona
 * @return sexo
 */
    public String getSexo() {
        return sexo;
    }
/**
 * metodo setSexo que recibe como parametro el atributo sexo para poder modificarlo
 * @param sexo 
 */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
/**
 * metodo getContacto que devuelve el atributo contacto de la clase persona
 * @return contacto
 */
    public String getContacto() {
        return contacto;
    }
/**
 * metodo setContacto que recibe como parametro el atributo contacto para poder modificarlo
 * @param contacto 
 */
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
/**
 * metodo getCiudad que devuelve el atributo ciudad de la clase persona
 * @return ciudad
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
 * metodo getDireccion que devuelve el atributo direccion de la clase persona
 * @return direccion
 */
    public String getDireccion() {
        return direccion;
    }
/**
 * metodo getDireccion que recibe como parametro el atributo direccion para poder modificarlo
 * @param direccion 
 */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

 
 
}
