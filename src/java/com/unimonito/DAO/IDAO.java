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
