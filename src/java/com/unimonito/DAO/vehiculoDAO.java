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
import com.unimonito.Beans.vehiculoBean;

public class vehiculoDAO extends IDAO {

    private Connection conn = null;

    public vehiculoDAO() throws SQLException {
        this.conn = conexionBD.obtenerConexion();
    }

    public boolean guardar(vehiculoBean vehiculo) {
        String qVehiculos = "INSERT INTO vehiculos(idvehiculos, matricula, fechadeCompra, numeroPod, idTipo) VALUES (NULL,?,?,?,?)";
        Statement ps = null;
        try {
            PreparedStatement pstmt = conn.prepareStatement(qVehiculos);

            pstmt.setString(1, vehiculo.getMatricula());
            pstmt.setString(2, vehiculo.getFechadeCompra());
            pstmt.setInt(3, vehiculo.getNumeroPod());
            pstmt.setInt(4, vehiculo.getIdTipo());

            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
        }
        return true;
    }

    public ArrayList<vehiculoBean> getEmpleado() {
        ArrayList<vehiculoBean> vehiculos = new ArrayList<vehiculoBean>();
        String qQuery = "SELECT * FROM vehiculos ";
        try {
            PreparedStatement pstmt = conn.prepareStatement(qQuery);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                vehiculoBean vehiculo = new vehiculoBean();
                vehiculo.setMatricula(rs.getString("matricula"));
                vehiculo.setFechadeCompra(rs.getString("fechadeCompra"));
                vehiculo.setTipoVehiculo(rs.getString("numeroPod"));
                vehiculo.setIdTipo(rs.getInt("idTipo"));

                vehiculos.add(vehiculo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(vehiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vehiculos;
    }

    public vehiculoBean getVehiculoPorMatrcicula(String idmatrcula) {
        vehiculoBean mivehiculo = new vehiculoBean();
        String qQuery = "SELECT * FROM vehiculos WHERE matricula = ? ";
        try {
            PreparedStatement pstmt = conn.prepareStatement(qQuery);
            pstmt.setString(1, idmatrcula);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                mivehiculo.setMatricula(rs.getNString("matricula"));
                mivehiculo.setFechadeCompra(rs.getNString("fechadeCompra"));
                mivehiculo.setTipoVehiculo(rs.getString("numeroPod"));
                mivehiculo.setIdTipo(rs.getInt("idTipo"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(empleadoDAO.class.getName()).log(Level.SEVERE, null, ex);

        }
        return mivehiculo;
    }
        public boolean asignarVehiculoaPersona(vehiculoBean vehiculo) {
        String qVehiculos = "INSERT INTO vehiculos_has_clientes(idvehiculos, id, idCliente) VALUES (?,NULL,?)";
        Statement ps = null;
        try {
            PreparedStatement pstmt = conn.prepareStatement(qVehiculos);

            pstmt.setString(1, vehiculo.getMatricula());
            pstmt.setString(2, vehiculo.getNumeroDocumento());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
        }
        return true;
    }

}
