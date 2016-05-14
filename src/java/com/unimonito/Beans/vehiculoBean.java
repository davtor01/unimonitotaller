package com.unimonito.Beans;

/**
 *
 * @author DAVID
 */
public class vehiculoBean {
    private int idvehiculos;
    private String matricula;
    private String fechadeCompra;
    private int numeroPod;
    private int idTipo;
    private String tipoVehiculo;
    private int idCliente;
    
    public vehiculoBean(){

}

    public vehiculoBean(int idvehiculos, String matricula, String fechadeCompra, int numeroPod, int idTipo, String tipoVehiculo, int idCliente) {
        this.idvehiculos = idvehiculos;
        this.matricula = matricula;
        this.fechadeCompra = fechadeCompra;
        this.numeroPod = numeroPod;
        this.idTipo = idTipo;
        this.tipoVehiculo = tipoVehiculo;
        this.idCliente = idCliente;
    }

    /**
     * @return the idvehiculos
     */
    public int getIdvehiculos() {
        return idvehiculos;
    }

    /**
     * @param idvehiculos the idvehiculos to set
     */
    public void setIdvehiculos(int idvehiculos) {
        this.idvehiculos = idvehiculos;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the fechadeCompra
     */
    public String getFechadeCompra() {
        return fechadeCompra;
    }

    /**
     * @param fechadeCompra the fechadeCompra to set
     */
    public void setFechadeCompra(String fechadeCompra) {
        this.fechadeCompra = fechadeCompra;
    }

    /**
     * @return the numeroPod
     */
    public int getNumeroPod() {
        return numeroPod;
    }

    /**
     * @param numeroPod the numeroPod to set
     */
    public void setNumeroPod(int numeroPod) {
        this.numeroPod = numeroPod;
    }

    /**
     * @return the idTipo
     */
    public int getIdTipo() {
        return idTipo;
    }

    /**
     * @param idTipo the idTipo to set
     */
    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    /**
     * @return the tipoVehiculo
     */
    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    /**
     * @param tipoVehiculo the tipoVehiculo to set
     */
    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    /**
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
}