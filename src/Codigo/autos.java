/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Codigo;

/**
 *
 * @author Santiago Vergara
 */
public class autos {
    private String patente;
    private int duracion;
    private String cliente;
    private int tipo;
    private String entrada;
    private String salida;

    public autos(String patente, int duracion, String cliente, int tipo, String entrada, String salida) {
        this.patente = patente;
        this.duracion = duracion;
        this.cliente = cliente;
        this.tipo = tipo;
        this.entrada=entrada;
        this.salida=salida;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    
}
