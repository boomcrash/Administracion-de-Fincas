
package Modelo;

import java.util.Date;

public class Propietario extends Persona {

    public String getId_comunidad() {
        return id_comunidad;
    }

    public void setId_comunidad(String id_comunidad) {
        this.id_comunidad = id_comunidad;
    }

    String id_comunidad;
    public Propietario(String id_comunidad,String nombre, int edad, String cedula, String sexo, String contacto, String ciudad, String direccion) {
        super(nombre, edad, cedula, sexo, contacto, ciudad, direccion);
        this.id_comunidad = id_comunidad;
    }
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String getCedula() {
        return cedula;
    }

    @Override
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String getSexo() {
        return sexo;
    }

    @Override
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String getContacto() {
        return contacto;
    }

    @Override
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    @Override
    public String getCiudad() {
        return ciudad;
    }

    @Override
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String getDireccion() {
        return direccion;
    }

    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
