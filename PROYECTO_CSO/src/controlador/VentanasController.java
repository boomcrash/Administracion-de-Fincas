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
    
    public static Submenu_Consulta ventanaSubmenu_Consulta=new Submenu_Consulta();
    
    public static ConsultarCobrosPropietarios consulta_cobro_propietario=new ConsultarCobrosPropietarios();    
    public static ConsultarPropietario consulta_propietario=new ConsultarPropietario();    
    public static ConsultarPresidente consulta_presidente=new ConsultarPresidente();    
    public static ConsultarBanco consulta_banco=new ConsultarBanco();    
    public static ConsultarCobrosPropietarios consulta_cobros=new ConsultarCobrosPropietarios();  
    public static ConsultarPagosPropietarios consulta_pagos=new ConsultarPagosPropietarios();  
    public static ConsultarGastosComunidad consulta_gastos_comunidad=new ConsultarGastosComunidad(); 
    public static ConsultarGastosPropietarios consulta_gastos_propietario=new ConsultarGastosPropietarios(); 
    public static Reportes reportes=new Reportes(); 
    
    //reportes
    public static void abrirReportes(){reportes.setVisible(true);}
    public static void cerrarReportes(){reportes.setVisible(false);}
    //consultas
    
    public static void abrirSubmenuConsulta(){ventanaSubmenu_Consulta.setVisible(true);}
    public static void cerrarSubmenuConsulta(){ventanaSubmenu_Consulta.setVisible(false);}
    
    public static void abrirConsultarCobrosPropietarios(){consulta_cobro_propietario.setVisible(true);}
    public static void cerrarConsultarCobrosPropietarios(){consulta_cobro_propietario.setVisible(false);}

    
    public static void abrirConsultarPropietarios(){consulta_propietario.setVisible(true);}
    public static void cerrarConsultarPropietarios(){consulta_propietario.setVisible(false);}

    public static void abrirConsultarPresidente(){consulta_presidente.setVisible(true);}
    public static void cerrarConsultarPresidente(){consulta_presidente.setVisible(false);}

    public static void abrirConsultarBanco(){consulta_banco.setVisible(true);}
    public static void cerrarConsultarBanco(){consulta_banco.setVisible(false);}
    
    public static void abrirConsultarCobros(){consulta_cobros.setVisible(true);}
    public static void cerrarConsultarCobros(){consulta_cobros.setVisible(false);}
    
    public static void abrirConsultarPagos(){consulta_pagos.setVisible(true);}
    public static void cerrarConsultarPagos(){consulta_pagos.setVisible(false);}
    
    public static void abrirConsultarGastosComunidad(){consulta_gastos_comunidad.setVisible(true);}
    public static void cerrarConsultarGastosComunidad(){consulta_gastos_comunidad.setVisible(false);}
    
    public static void abrirConsultarGastosPropietario(){consulta_gastos_propietario.setVisible(true);}
    public static void cerrarConsultarGastosPropietario(){consulta_gastos_propietario.setVisible(false);}

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
