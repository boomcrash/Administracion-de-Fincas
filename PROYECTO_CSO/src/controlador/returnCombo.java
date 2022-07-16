/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Vista.Registro_Comunidad;
import javax.swing.JComboBox;

/**
 *
 * @author GAMER
 */
public class returnCombo {
  public JComboBox returnCombo(){
        Registro_Comunidad cm=new Registro_Comunidad();
        return cm.cmbCiudad_comunidad;
  }
}
