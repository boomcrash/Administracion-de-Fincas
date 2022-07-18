
package Modelo;
import java.util.Date;
/**
*clase Cobros representa al Director que se va a registrar en el sistema y hereda de la clase persona
 * @author User
 */
public class Director extends Persona{
    /*¨*
    atributos de la clase Director
    */
    String id_comunidad;
    /**
     *metodo  constructor para crear objetos de la clase Director
     * @param id_comunidad
     * @param nombre
     * @param edad
     * @param cedula
     * @param sexo
     * @param contacto
     * @param ciudad
     * @param direccion 
     */
    public Director(String id_comunidad,String nombre, int edad, String cedula, String sexo, String contacto, String ciudad, String direccion) {
        super(nombre, edad, cedula, sexo, contacto, ciudad, direccion);
        this.id_comunidad = id_comunidad;
    }
/**
 * metodo getId_comunidad que devuelve el atributo id_comunidad de la clase Director
 * @return id_comunidad
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
     * metodo getNombre que devuelve el atributo nombre de la clase Director
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
 * metodo getEdad que devuelve el atributo edad de la clase Director
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
 * metodo getCedula que devvuelve el atributo cedula de la clase Director
 * @return cedula
 */
    @Override
    public String getCedula() {
        return cedula;
    }
/**
 * metodo setCedula que recibe como parametro el atributo cedula de la clase Director
 * @param cedula 
 */
    @Override
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
/**
 * metodo getSexo que obtiene el atributo sexo de la clase Director
 * @return sexo
 */
    @Override
    public String getSexo() {
        return sexo;
    }
/**
 * metodo setSexo que recibe como parametro el atributo sexo de la clase Director
 * @param sexo 
 */
    @Override
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
/**
 * metodo getContacto que obtiene el atributo contacto de la clase Director
 * @return 
 */
    @Override
    public String getContacto() {
        return contacto;
    }
/**
 * metodo setContacto que recibe como parametro el atributo contacto de la clase Director
 * @param contacto 
 */
    @Override
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
/**
 * metodo getCiudad que obtiene el atributo ciudad de la clase Director
 * @return ciudad
 */
    @Override
    public String getCiudad() {
        return ciudad;
    }
/**
 * metodo setCiudad que recibe como parametro el atributo ciudad de la clase Director
 * @param ciudad 
 */
    @Override
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
/**
 * metodo getDireccion que obtiene el atributo direccion de la clase Director
 * @return direccion
 */
    @Override
    public String getDireccion() {
        return direccion;
    }
/**
 * metodo setDireccion que recibe como parametro el atributo direccion de la clase Director
 * @param direccion 
 */
    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


}
