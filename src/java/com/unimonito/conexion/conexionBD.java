/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unimonito.Conexion;
 
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
 
import java.sql.Connection;
import java.sql.SQLException;
   
/** 
 *
 * @author david
 */
public class conexionBD {

  private static MysqlDataSource ds = null;
  private static conexionBD conexion = null;

  static {
    conexion = new conexionBD();
  }

  private conexionBD() {
    ds = new MysqlDataSource();
    ds.setServerName("127.0.0.1");
    ds.setUser("root");
    ds.setPassword("");
    ds.setDatabaseName("dbunimonito");
  }

  public static Connection obtenerConexion() throws SQLException {
    return conexion.ds.getConnection();
  }

}
