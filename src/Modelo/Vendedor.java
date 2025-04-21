/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author cristina
 */
public class Vendedor {
    private String nombreVendedor;
    private String ubicacion;
    private String emailContacto;
    private String numeroContacto;
    
    public Vendedor(){
        this.nombreVendedor = "";
        this.ubicacion = "";
        this.emailContacto = "";
        this.numeroContacto = "";
    }

    public Vendedor(String nombreVendedor, String ubicacion, String emailContacto, String numeroContacto) {
        this.nombreVendedor = nombreVendedor;
        this.ubicacion = ubicacion;
        this.emailContacto = emailContacto;
        this.numeroContacto = numeroContacto;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getEmailContacto() {
        return emailContacto;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setEmailContacto(String emailContacto) {
        this.emailContacto = emailContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "nombreVendedor=" + nombreVendedor + ", ubicacion=" + ubicacion + ", emailContacto=" + emailContacto + ", numeroContacto=" + numeroContacto + '}';
    }
}
