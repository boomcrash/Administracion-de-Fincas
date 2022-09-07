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
    public static Inicio ventanaInicio;
    public static Login ventanaLogin;
    public static Registro_Cobros ventanaRegistro_Cobros;
    public static Registro_Comunidad ventanaRegistro_Comunidad;
    public static Registro_Director ventanaRegistro_Director;
    public static Registro_Entidad_Bancaria ventanaRegistro_Entidad_Bancaria;
    public static Registro_Finca ventanaRegistro_Finca;
    public static Registro_Pagos ventanaRegistro_Pagos;
    public static Registro_Presidente ventanaRegistro_Presidente;
    public static Registro_Propietario ventanaRegistro_Propietario;
    public static Registro_Secretaria ventanaRegistro_Secretaria;
    public static Submenu_Registro ventanaSubmenu_Registro;
    
    public static Submenu_Consulta ventanaSubmenu_Consulta;
    
    public static ConsultarCobrosPropietarios consulta_cobro_propietario;    
    public static ConsultarPropietario consulta_propietario;    
    public static ConsultarPresidente consulta_presidente;    
    public static ConsultarBanco consulta_banco;    
    public static ConsultarCobrosPropietarios consulta_cobros;  
    public static ConsultarPagosPropietarios consulta_pagos;  
    public static ConsultarGastosComunidad consulta_gastos_comunidad; 
    public static ConsultarGastosPropietarios consulta_gastos_propietario; 
    public static Reportes reportes=new Reportes(); 
    
    /**
     * abrir y cerrar la ventana de reportes
     */
    public static void abrirReportes(){reportes.setVisible(true);}
    public static void cerrarReportes(){try{reportes.setVisible(false);}catch(Exception e){System.out.println("no esta abierta");}}
    /**
     * abrir y cerrar la ventana de submenuconsultas
     */
    public static void abrirSubmenuConsulta(){ventanaSubmenu_Consulta=new Submenu_Consulta(); ventanaSubmenu_Consulta.setVisible(true);}
    public static void cerrarSubmenuConsulta(){try{ventanaSubmenu_Consulta.setVisible(false);}catch(Exception e){System.out.println("no esta abierta");}}
    /**
     * abrir y cerrar la ventana de consultas de cobros a propietarios
     */
    public static void abrirConsultarCobrosPropietarios(){consulta_cobro_propietario=new ConsultarCobrosPropietarios(); consulta_cobro_propietario.setVisible(true);}
    public static void cerrarConsultarCobrosPropietarios(){try{consulta_cobro_propietario.setVisible(false);}catch(Exception e){System.out.println("no esta abierta");}}
    /**
     * abrir y cerrar ventana de consultar propietarios
     */
    public static void abrirConsultarPropietarios(){consulta_propietario=new ConsultarPropietario();  consulta_propietario.setVisible(true);}
    public static void cerrarConsultarPropietarios(){try{consulta_propietario.setVisible(false);}catch(Exception e){System.out.println("no esta abierta");}}
/**
 * abrir y cerrar la ventana de consultar presidentes
 */
    public static void abrirConsultarPresidente(){consulta_presidente=new ConsultarPresidente();  consulta_presidente.setVisible(true);}
    public static void cerrarConsultarPresidente(){try{consulta_presidente.setVisible(false);}catch(Exception e){System.out.println("no esta abierta");}}
/**
 * abrir y cerrar la ventana de consultar bancos
 */
    public static void abrirConsultarBanco(){consulta_banco=new ConsultarBanco();   consulta_banco.setVisible(true);}
    public static void cerrarConsultarBanco(){try{consulta_banco.setVisible(false);}catch(Exception e){System.out.println("no esta abierta");}}
    /**
     * abrir y cerrar la ventana de consultar cobros
     */
    public static void abrirConsultarCobros(){consulta_cobros=new ConsultarCobrosPropietarios();   consulta_cobros.setVisible(true);}
    public static void cerrarConsultarCobros(){try{consulta_cobros.setVisible(false);}catch(Exception e){System.out.println("no esta abierta");}}
    /**
     * abrir y cerrar la ventana de consultar pagos
     */
    public static void abrirConsultarPagos(){consulta_pagos=new ConsultarPagosPropietarios();   consulta_pagos.setVisible(true);}
    public static void cerrarConsultarPagos(){try{consulta_pagos.setVisible(false);}catch(Exception e){System.out.println("no esta abierta");}}
    /**
     * abrir y cerrar la ventana de consultar los gastos de comunidad
     */
    public static void abrirConsultarGastosComunidad(){consulta_gastos_comunidad=new ConsultarGastosComunidad();  consulta_gastos_comunidad.setVisible(true);}
    public static void cerrarConsultarGastosComunidad(){try{consulta_gastos_comunidad.setVisible(false);}catch(Exception e){System.out.println("no esta abierta");}}
    /**
     * abrir y cerrar la ventana de consultar gastos de propietarios
     */
    public static void abrirConsultarGastosPropietario(){consulta_gastos_propietario=new ConsultarGastosPropietarios();  consulta_gastos_propietario.setVisible(true);}
    public static void cerrarConsultarGastosPropietario(){try{consulta_gastos_propietario.setVisible(false);}catch(Exception e){System.out.println("no esta abierta");}}
    /**
     * abrir y cerrar de la ventana inicio
     */
    public static void abrirInicio(){ventanaInicio=new Inicio(); ventanaInicio.setVisible(true);}
    public static void cerrarInicio(){try{ventanaInicio.setVisible(false);}catch(Exception e){System.out.println("no esta abierta");}}
    /**
     * abrir y cerrar de la ventana de login
     */
    public static void abrirLogin(){ventanaLogin=new Login(); ventanaLogin.setVisible(true);}
    public static void cerrarLogin(){try{ventanaLogin.setVisible(false);}catch(Exception e){System.out.println("no esta abierta");}}
    /**
     * abrir y cerrar de la ventana de Registro_Cobros
     */
    public static void abrirRegistroCobros(){ventanaRegistro_Cobros=new Registro_Cobros(); ventanaRegistro_Cobros.setVisible(true);}
    public static void cerrarRegistroCobros(){try{ventanaRegistro_Cobros.setVisible(false);}catch(Exception e){System.out.println("no esta abierta");}}
    /**
     * abrir y cerrar de la ventana de Registro_Comunidad
     */
    public static void abrirRegistroComunidad(){ventanaRegistro_Comunidad=new Registro_Comunidad(); ventanaRegistro_Comunidad.setVisible(true);}
    public static void cerrarRegistroComunidad(){try{ventanaRegistro_Comunidad.setVisible(false);}catch(Exception e){System.out.println("no esta abierta");}}
    /**
     * abrir y cerrar de la ventana de Registro_Director
     */
    public static void abrirRegistroDirector(){ventanaRegistro_Director=new Registro_Director(); ventanaRegistro_Director.setVisible(true);}
    public static void cerrarRegistroDirector(){try{ventanaRegistro_Director.setVisible(false);}catch(Exception e){System.out.println("no esta abierta");}}
    /**
     * abrir y cerrar de la ventana de Registro_Banco
     */
    public static void abrirRegistroBanco(){ventanaRegistro_Entidad_Bancaria=new Registro_Entidad_Bancaria(); ventanaRegistro_Entidad_Bancaria.setVisible(true);}
    public static void cerrarRegistroBanco(){try{ventanaRegistro_Entidad_Bancaria.setVisible(false);}catch(Exception e){System.out.println("no esta abierta");}}
    /**
     * abrir y cerrar de la ventana de Registro_Finca
     */
    public static void abrirRegistroFinca(){ventanaRegistro_Finca=new Registro_Finca(); ventanaRegistro_Finca.setVisible(true);}
    public static void cerrarRegistroFinca(){try{ventanaRegistro_Finca.setVisible(false);}catch(Exception e){System.out.println("no esta abierta");}}
    /**
     * abrir y cerrar de la ventana de Registro_Pagos
     */
    public static void abrirRegistroPagos(){ventanaRegistro_Pagos=new Registro_Pagos(); ventanaRegistro_Pagos.setVisible(true);}
    public static void cerrarRegistroPagos(){try{ventanaRegistro_Pagos.setVisible(false);}catch(Exception e){System.out.println("no esta abierta");}}
    /**
     * abrir y cerrar de la ventana de Registro_Presidente
     */
    public static void abrirRegistroPresidente(){ventanaRegistro_Presidente=new Registro_Presidente(); ventanaRegistro_Presidente.setVisible(true);}
    public static void cerrarRegistroPresidente(){try{ventanaRegistro_Presidente.setVisible(false);}catch(Exception e){System.out.println("no esta abierta");}}
 /**
  * abrir y cerrar de la ventana de Registro_Propietario
  */
    public static void abrirRegistroPropietario(){ventanaRegistro_Propietario=new Registro_Propietario(); ventanaRegistro_Propietario.setVisible(true);}
    public static void cerrarRegistroPropietario(){try{ventanaRegistro_Propietario.setVisible(false);}catch(Exception e){System.out.println("no esta abierta");}}
/**
 * abrir y cerrar de la ventana de Registro_Secretaria
 */
    public static void abrirRegistro_Secretaria(){ventanaRegistro_Secretaria=new Registro_Secretaria(); ventanaRegistro_Secretaria.setVisible(true);}
    public static void cerrarRegistro_Secretaria(){try{ventanaRegistro_Secretaria.setVisible(false);}catch(Exception e){System.out.println("no esta abierta");}}    
   /**
    * abrir y cerrar de la ventana de Submenu_Registro
    */ 
    public static void abrirSubmenuRegistro(){ventanaSubmenu_Registro=new Submenu_Registro(); ventanaSubmenu_Registro.setVisible(true);}
    public static void cerrarSubmenuRegistro(){try{ventanaSubmenu_Registro.setVisible(false);}catch(Exception e){System.out.println("no esta abierta");}}
   
}
