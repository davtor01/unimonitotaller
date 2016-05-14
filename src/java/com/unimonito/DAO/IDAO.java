/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unimonito.DAO;

import java.util.ArrayList;

/**
 *
 * @author Sebastian Rojas - David Toro Administrador
 */
public abstract class IDAO {

  public ArrayList<String> consulta() {
    ArrayList<String> algo = new ArrayList<String>();
    return algo;
  }

  public boolean actualizar() {
    boolean bandera = true;
    return bandera;
  }

  public boolean crear() {
    boolean bandera = true;
    return bandera;
  }

  public boolean borrar() {
    boolean bandera = true;
    return bandera;
  }

}
