package Modelo;
public class Banco {
    String nombre;
    String direccion;
    String representante,id;

    public Banco(String nombre, String direccion, String representante, String id) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.representante = representante;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    public String getInfoBanco(String info){
    return info;
    }
    
    
}
