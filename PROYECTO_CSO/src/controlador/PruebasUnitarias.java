/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Conexion.Conexion;
import Exceptions.LoginException;
import Exceptions.NoUserException;
import Modelo.Banco;
import Modelo.Cobros;
import Modelo.Comunidad;
import Modelo.Director;
import Modelo.Finca;
import Modelo.Pago;
import Modelo.Presidente;
import Modelo.Propietario;
import Modelo.Secretario;
import Modelo.Usuario;
import Vista.Login;
import Vista.Registro_Comunidad;
import com.mysql.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.Random;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *clase encargada de las Pruebas unitarias de los metodos del modulo registro
 * @author GAMER
 */
public class PruebasUnitarias {
     String num=String.valueOf(new Random().nextInt(1000 + 1) + 1);
     String num2=String.valueOf(new Random().nextInt(9999 + 1000) + 1000);
     Login log=new Login();
        
   /**
    * Metodo que abarca cada una de las pruebas unitarias de los metodos pertenecientes al modulo de Registro.
    */
    public void PruebasUnitarias() throws NoUserException, LoginException {
        
         /**
          * Prueba conexion a base de datos ALOJADA EN " AZURE "
          */
            ConexionController.getconection();
        
         /**
          * Prueba consultas para llenado de tablas
          */
            TablasRegistroController.llenarTablaBanco(new JTable());    
            TablasRegistroController.llenarTablaComunidad(new JTable());    
            TablasRegistroController.llenarTablaComunidadByCiudad(new JTable(),new returnCombo().returnCombo());    
            TablasRegistroController.llenarTablaPresidente(new JTable());    
            TablasRegistroController.llenarTablaPropietario(new JTable());    
            TablasRegistroController.llenarTablaPropietarioByCiudad(new JTable(),new returnCombo().returnCombo());    
         
            /**
             * prueba de metodo registrar Banco
             */
            RegistroBancoController.registrarBanco(new Banco("nombre"+num, "direccion"+num,"repre"+num, "1"));
              /**
               * prueba de metodo registrarCobro
               */
            RegistroCobrosController.registrarCobro(new Cobros("desc"+num,"12"+num, String.valueOf(java.time.LocalDateTime.now()),String.valueOf(java.time.LocalDateTime.now()) , "1", "1"));
                /**
                 * prueba de metodo registrrar Comunidad
                 */
            RegistroComunidadController.registrarComunidad(new Comunidad("name"+num,"city"+num,"canton"+num,new Date(),"dire"+num,"ref"+num,"descri"+num,"A"));
                  /**
                  * prueba de metodo registrar Director
                  */
            RegistroDirectorController.registrarDirector(new Director("1","noma"+num,12,"121212"+num2,"Masculino","0920912","ciudad","direc"+num),new Usuario("hola"+num,"contra"+num,1));
                  /**
                  * prueba de metodo registrar Secretario
                  */
            RegistroSecretariaController.registrarSecretario(new Secretario("1","noma"+num,12,"121212"+num2,"Masculino","0920912","ciudad","direc"+num),new Usuario("hola"+num,"contra"+num,2));
                  /**
                  * prueba de metodo registrar Finca
                  */
            RegistroFincaController.registrarFinca(new Finca("name"+num, "city"+num, "dir"+num, new Date(), "1"));
                   /**
                   * prueba de metodo registrar Pago
                   */
            RegistroPagoController.registrarPago(new Pago("name"+num, "12"+num, new Date() ,"1", "1"));
                   /**
                    * Prueba de metodo registrar Presidente
                    */
            RegistroPresidenteController.registrarPresidente(new Presidente("1","noma"+num,12,"121212"+num2,"Masculino","0920912","ciudad","direc"+num));
                  /**
                   *prueba de metodo registrar Propietario
                   */
            RegistroPropietarioController.registrarPropietario(new Propietario("1","noma"+num,12,"121212"+num2,"Masculino","0920912","ciudad","direc"+num));
        
                  /**
                   *Prueba de Consulta de Usuario
                   */
            UsuarioController.consultarUsuario(new Usuario("dir", "dir",2));
                  /**
                   *Prueba de Registro de usuario
                   */
             UsuarioController.registrarUsuario(new Usuario("dirV", "dirV",2));
                  /**
                   * Prueba de ingreso de usuario
                   */
            LoginController.iniciarSesion(new Usuario("dir", "dir"),log.txtUser,log.txtpassword);
        
        
    }
  
}
