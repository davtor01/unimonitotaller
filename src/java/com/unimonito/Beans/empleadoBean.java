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
public class empleadoBean extends personaBean{
    private int codEmpleado;
    private String salario;
    private int  estado;
    private String ultimaActualizacion;
    private int codigoTaller;
    private int numeroTelefono;
    private String fechaInicioContrato; 

    public empleadoBean(){}
    
        public empleadoBean(int codEmpleado, String nombres, String apellidos, int idTipoDucomento, String numeroIdentificacion, String password, int estado, String ultimaActualizacion, int codigoTaller, int numeroTelefono, String fechaInicioContrato) {
        super(nombres, apellidos, idTipoDucomento, numeroIdentificacion, password);
        this.codEmpleado = codEmpleado;
        this.estado = estado;
        this.ultimaActualizacion = ultimaActualizacion;
        this.codigoTaller = codigoTaller;
        this.numeroTelefono = numeroTelefono;
        this.fechaInicioContrato = fechaInicioContrato;
    }

    public int getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(int codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
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

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getFechaInicioContrato() {
        return fechaInicioContrato;
    }

    public void setFechaInicioContrato(String fechaInicioContrato) {
        this.fechaInicioContrato = fechaInicioContrato;
    }
    
}
