package Modelo;
/**
 * clase Banco representa la entidad bancaria que se va a registrar en el sistema
 * @author UserX
 */
public class Banco {
 /**
  * Atributos de la clase Banco
  */
    String nombre;
    String direccion;
    String representante,id;
 /**
             * constructor para crear un objeto banco recibiendo los siguientes parametros:
             * @param nombre
             * @param direccion
             * @param representante
             * @param id 
             */
    public Banco(String nombre, String direccion, String representante, String id) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.representante = representante;
        this.id = id;
    }
/**
 * metodo getNombre que obtiene  el atributo nombre de la  clase Banco
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
 * metodo getDireccion que obtiene  el atributo direccion de la  clase Banco
 * @return direccion
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
 * metodo getRepresentante que obtiene  el atributo representante de la  clase Banco
 * @return representante
 */
    public String getRepresentante() {
        return representante;
    }
/**
 *   metodo setRepresentante que recibe como parametro el atributo representante para poder modificarlo
 * @param representante 
 */
    public void setRepresentante(String representante) {
        this.representante = representante;
    }
/**
 * metodo getId que obtiene el atributo id de la clase Banco
 * @return id
 */
    public String getId() {
        return id;
    }
    /**
     *  *   metodo setId que recibe como parametro el atributo id para poder modificarlo
     * @param id 
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * metodo que devuelve la informacion del Banco recibiendo como parametro un String info y devolviendo info
     * @param info
     * @return 
     */
    public String getInfoBanco(String info){
    return info;
    }
    
    
}
