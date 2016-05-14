/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unimonito.Beans;

/**
 *
 * @author DAVID
 */
public class clienteBean extends personaBean{
    private int idCliente;
    private String ciudadResidencia;
    private String ultimaActualizacion;

    public clienteBean() {
        
    }

    public clienteBean(int idCliente, String nombres, String apellidos, int idTipoDucomento, String numeroIdentificacion, String password, String ciudadResidencia, String ultimaActualizacion) {
        super(nombres, apellidos, idTipoDucomento, numeroIdentificacion, password);
        this.idCliente = idCliente;
        this.ciudadResidencia = ciudadResidencia;
        this.ultimaActualizacion = ultimaActualizacion;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    public String getUltimaActualizacion() {
        return ultimaActualizacion;
    }

    public void setUltimaActualizacion(String ultimaActualizacion) {
        this.ultimaActualizacion = ultimaActualizacion;
    }
    
    
}
