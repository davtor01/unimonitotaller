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
public class reparacionBean {
    private int idReparacion;
    private String tipoReparacion;
    private String fecha;
    private String observaciones;
    private float precio;
    private int estado;
    private String ultimaActualizacion;
    private int codigoTaller;
    private int idvehiculos;

    public reparacionBean(){
        
    }
    public reparacionBean(int idReparacion, String tipoReparacion, String fecha, String observaciones, float precio, int estado, String ultimaActualizacion, int codigoTaller, int idvehiculos) {
        this.idReparacion = idReparacion;
        this.tipoReparacion = tipoReparacion;
        this.fecha = fecha;
        this.observaciones = observaciones;
        this.precio = precio;
        this.estado = estado;
        this.ultimaActualizacion = ultimaActualizacion;
        this.codigoTaller = codigoTaller;
        this.idvehiculos = idvehiculos;
    }

    public int getIdReparacion() {
        return idReparacion;
    }

    public void setIdReparacion(int idReparacion) {
        this.idReparacion = idReparacion;
    }

    public String getTipoReparacion() {
        return tipoReparacion;
    }

    public void setTipoReparacion(String tipoReparacion) {
        this.tipoReparacion = tipoReparacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getUltimaActualizacion() {
        return ultimaActualizacion;
    }

    public void setUltimaActualizacion(String ultimaActualizacion) {
        this.ultimaActualizacion = ultimaActualizacion;
    }

    public int getCodigoTaller() {
        return codigoTaller;
    }

    public void setCodigoTaller(int codigoTaller) {
        this.codigoTaller = codigoTaller;
    }

    public int getIdvehiculos() {
        return idvehiculos;
    }

    public void setIdvehiculos(int idvehiculos) {
        this.idvehiculos = idvehiculos;
    }
      
}
