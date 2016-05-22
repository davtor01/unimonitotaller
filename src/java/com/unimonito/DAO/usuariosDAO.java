/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unimonito.DAO;

import com.unimonito.Conexion.conexionBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Sebastian Rojas - David Toro open12
 */
public class usuariosDAO extends IDAO {

  private Connection conn = null;

  public usuariosDAO() throws SQLException {
    this.conn = conexionBD.obtenerConexion();
  }

  public ArrayList<String> consultar() {
    ArrayList lista = new ArrayList();
    String sql = "select nombre from usuarios ";
    Statement ps = null;
    try {
      ps = conn.createStatement();
      ResultSet rs = ps.executeQuery(sql);
      while (rs.next()) {
        System.out.println("mire: " + rs.getNString("nombre"));
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    } finally {
    }
    return null;
  }
}
