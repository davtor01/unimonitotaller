/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unimonito.DAO;

import com.unimonito.Beans.clienteBean;
import com.unimonito.Conexion.conexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DAVID
 */
public class clienteDAO extends IDAO{
     private Connection conn = null;

  public clienteDAO() throws SQLException {
    this.conn = conexionBD.obtenerConexion();
  }
public boolean guardar(clienteBean cliente) {
    String qCliente = "INSERT INTO clientes(idCliente, nombres, apellidos, idTipoDocumento, numeroDocumento, password, ciudadResidencia, ultimaActualizacion) VALUES (null,?,?,?,?,?,?,?)";
    Statement ps = null;
    try {
      PreparedStatement pstmt = conn.prepareStatement(qCliente);
    //  pstmt.setInt(1, cliente.getIdCliente());
      pstmt.setString(1, cliente.getNombres());
      pstmt.setString(2, cliente.getApellidos());
      pstmt.setInt(3, cliente.getIdTipoDucomento());
      pstmt.setString(4, cliente.getNumeroIdentificacion());
      pstmt.setString(5, cliente.getPassword());
      pstmt.setString(6, cliente.getCiudadResidencia());
      pstmt.setString(7, cliente.getUltimaActualizacion());
         
      pstmt.executeUpdate();
      
    } catch (SQLException e) {      
      System.out.println(e.getMessage());
    } finally {
    }
    return true;
  }
 

  public ArrayList<clienteBean> getCliente() {
    ArrayList<clienteBean> clientes = new ArrayList<clienteBean>();
    String qQuery = "SELECT * FROM cliente ";
    try {
      PreparedStatement pstmt = conn.prepareStatement(qQuery);
      ResultSet rs = pstmt.executeQuery();
      while (rs.next()) {
        clienteBean cliente = new clienteBean();
        cliente.setIdCliente(rs.getInt("idCliente"));
        cliente.setNombres(rs.getString("nombres"));
        cliente.setApellidos(rs.getString("apellidos"));
        cliente.setIdTipoDucomento(rs.getInt("idTipoDocumento"));
        cliente.setNumeroIdentificacion(rs.getString("numeroIdentificacion"));
        cliente.setPassword(rs.getString("password"));
        cliente.setCiudadResidencia(rs.getString("ciudadResidencia"));
        cliente.setUltimaActualizacion(rs.getString("ultimaActualizacion"));
        
        clientes.add(cliente);
      }
    } catch (SQLException ex) {
      Logger.getLogger(clienteDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return clientes;
  }    
}
