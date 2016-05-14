/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unimonito.DAO;

import com.unimonito.Conexion.conexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.unimonito.Beans.empleadoBean;



public class empleadoDAO extends IDAO {

  private Connection conn = null;

  public empleadoDAO() throws SQLException {
    this.conn = conexionBD.obtenerConexion();
  }

  public boolean guardar(empleadoBean empleado) {
    String qEmpleado = "INSERT INTO empleados(codEmpleados, nombres, apellidos, idTipoDocumento, numeroIdentificacion, password, fechaInicioContrato, salario, estado, ultimaActualizacion, codigoTaller, numeroTelefono) VALUES (NULL,?,?,?,?,?,?,?,?,?,?,?)";
    Statement ps = null;
    try {
      PreparedStatement pstmt = conn.prepareStatement(qEmpleado);
      //pstmt.setInt(, empleado.getCodEmpleado());
      pstmt.setString(1, empleado.getNombres());
      pstmt.setString(2, empleado.getApellidos());
      pstmt.setInt(3, empleado.getIdTipoDucomento());
      pstmt.setString(4, empleado.getNumeroIdentificacion());
      pstmt.setString(5, empleado.getPassword());
      pstmt.setString(6, empleado.getFechaInicioContrato());
      pstmt.setString(7, empleado.getSalario());
      pstmt.setInt(8, empleado.getEstado());
      pstmt.setString(9, empleado.getUltimaActualizacion());
      pstmt.setInt(10, empleado.getCodigoTaller());
      pstmt.setInt(11, empleado.getNumeroTelefono());
      pstmt.executeUpdate();
      
    } catch (SQLException e) {      
      System.out.println(e.getMessage());
    } finally {
    }
    return true;
  }
 

  public ArrayList<empleadoBean> getEmpleado() {
    ArrayList<empleadoBean> empleados = new ArrayList<empleadoBean>();
    String qQuery = "SELECT * FROM empleados ";
    try {
      PreparedStatement pstmt = conn.prepareStatement(qQuery);
      ResultSet rs = pstmt.executeQuery();
      while (rs.next()) {
        empleadoBean empleado = new empleadoBean();
        empleado.setCodEmpleado(rs.getInt("codEmpleados"));
        empleado.setNombres(rs.getString("nombres"));
        empleado.setApellidos(rs.getString("apellidos"));
        empleado.setIdTipoDucomento(rs.getInt("idTipoDocumento"));
        empleado.setNumeroIdentificacion(rs.getString("numeroIdentificacion"));
        empleado.setPassword(rs.getString("password"));
        empleado.setFechaInicioContrato(rs.getString("fechaInicioContrato"));
        empleado.setSalario(rs.getString("salario"));
        empleado.setEstado(rs.getInt("estado"));
        empleado.setUltimaActualizacion(rs.getString("ultimaActualizacion"));
        empleado.setCodigoTaller(rs.getInt("codigoTaller"));
        empleado.setNumeroTelefono(rs.getInt("numeroTelefono"));
        empleados.add(empleado);
      }
    } catch (SQLException ex) {
      Logger.getLogger(empleadoDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return empleados;
  }    
}
