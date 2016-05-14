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
public class personaBean {
    private String nombres;
    private String apellidos;
    private int idTipoDucomento;
    private String numeroIdentificacion;
    private String password;
      

    public personaBean(){}
            
    public personaBean(String nombres, String apellidos, int idTipoDucomento, String numeroIdentificacion, String password) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.idTipoDucomento = idTipoDucomento;
        this.numeroIdentificacion = numeroIdentificacion;
        this.password = password;
        
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getIdTipoDucomento() {
        return idTipoDucomento;
    }

    public void setIdTipoDucomento(int idTipoDucomento) {
        this.idTipoDucomento = idTipoDucomento;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   
    
    
}
