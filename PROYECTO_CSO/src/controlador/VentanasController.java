/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import Vista.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *clase que controla el abrir y cerrar de las ventanas
 * @author GAMER
 */
public class VentanasController {
    public static Inicio ventanaInicio=new Inicio();
    public static Login ventanaLogin=new Login();
    public static Registro_Cobros ventanaRegistro_Cobros=new Registro_Cobros();
    public static Registro_Comunidad ventanaRegistro_Comunidad=new Registro_Comunidad();
    public static Registro_Director ventanaRegistro_Director=new Registro_Director();
    public static Registro_Entidad_Bancaria ventanaRegistro_Entidad_Bancaria=new Registro_Entidad_Bancaria();
    public static Registro_Finca ventanaRegistro_Finca=new Registro_Finca();
    public static Registro_Pagos ventanaRegistro_Pagos=new Registro_Pagos();
    public static Registro_Presidente ventanaRegistro_Presidente=new Registro_Presidente();
    public static Registro_Propietario ventanaRegistro_Propietario=new Registro_Propietario();
    public static Registro_Secretaria ventanaRegistro_Secretaria=new Registro_Secretaria();
    public static Restaurar_contraseña ventanaRestaurar_contraseña=new Restaurar_contraseña();
    public static Submenu_Registro ventanaSubmenu_Registro=new Submenu_Registro();
    
    /**
     * abrir y cerrar de la ventana inicio
     */
    public static void abrirInicio(){ventanaInicio.setVisible(true);}
    public static void cerrarInicio(){ventanaInicio.setVisible(false);}
    /**
     * abrir y cerrar de la ventana de login
     */
    public static void abrirLogin(){ventanaLogin.setVisible(true);}
    public static void cerrarLogin(){ventanaLogin.setVisible(false);}
    /**
     * abrir y cerrar de la ventana de Registro_Cobros
     */
    public static void abrirRegistroCobros(){ventanaRegistro_Cobros.setVisible(true);}
    public static void cerrarRegistroCobros(){ventanaRegistro_Cobros.setVisible(false);}
    /**
     * abrir y cerrar de la ventana de Registro_Comunidad
     */
    public static void abrirRegistroComunidad(){ventanaRegistro_Comunidad.setVisible(true);}
    public static void cerrarRegistroComunidad(){ventanaRegistro_Comunidad.setVisible(false);}
    /**
     * abrir y cerrar de la ventana de Registro_Director
     */
    public static void abrirRegistroDirector(){ventanaRegistro_Director.setVisible(true);}
    public static void cerrarRegistroDirector(){ventanaRegistro_Director.setVisible(false);}
    /**
     * abrir y cerrar de la ventana de Registro_Banco
     */
    public static void abrirRegistroBanco(){ventanaRegistro_Entidad_Bancaria.setVisible(true);}
    public static void cerrarRegistroBanco(){ventanaRegistro_Entidad_Bancaria.setVisible(false);}
    /**
     * abrir y cerrar de la ventana de Registro_Finca
     */
    public static void abrirRegistroFinca(){ventanaRegistro_Finca.setVisible(true);}
    public static void cerrarRegistroFinca(){ventanaRegistro_Finca.setVisible(false);}
    /**
     * abrir y cerrar de la ventana de Registro_Pagos
     */
    public static void abrirRegistroPagos(){ventanaRegistro_Pagos.setVisible(true);}
    public static void cerrarRegistroPagos(){ventanaRegistro_Pagos.setVisible(false);}
    /**
     * abrir y cerrar de la ventana de Registro_Presidente
     */
    public static void abrirRegistroPresidente(){ventanaRegistro_Presidente.setVisible(true);}
    public static void cerrarRegistroPresidente(){ventanaRegistro_Presidente.setVisible(false);}
 /**
  * abrir y cerrar de la ventana de Registro_Propietario
  */
    public static void abrirRegistroPropietario(){ventanaRegistro_Propietario.setVisible(true);}
    public static void cerrarRegistroPropietario(){ventanaRegistro_Propietario.setVisible(false);}
/**
 * abrir y cerrar de la ventana de Registro_Secretaria
 */
    public static void abrirRegistro_Secretaria(){ventanaRegistro_Secretaria.setVisible(true);}
    public static void cerrarRegistro_Secretaria(){ventanaRegistro_Secretaria.setVisible(false);}    
/**
 * abrir y cerrar de la ventana de Restaurar_contraseña
 */
    public static void abrirRestaurarContraseña(){ventanaRestaurar_contraseña.setVisible(true);}
    public static void cerrarRestaurarContraseña(){ventanaRestaurar_contraseña.setVisible(false);}
   /**
    * abrir y cerrar de la ventana de Submenu_Registro
    */ 
    public static void abrirSubmenuRegistro(){ventanaSubmenu_Registro.setVisible(true);}
    public static void cerrarSubmenuRegistro(){ventanaSubmenu_Registro.setVisible(false);}
   
}
