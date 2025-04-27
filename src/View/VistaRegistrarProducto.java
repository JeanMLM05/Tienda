/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author Jeanm
 */
public class VistaRegistrarProducto {
    private String nombreProducto;
    private double precioProducto;
    private String descripcionProducto;
    private int cantidadProducto;
    private String categoria;

    public VistaRegistrarProducto() {
        
    }

    public VistaRegistrarProducto(String nombreProducto, double precioProducto, String descripcionProducto, int cantidadProducto, String categoria) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.descripcionProducto = descripcionProducto;
        this.cantidadProducto = cantidadProducto;
        this.categoria = categoria;
    }
    
    

    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
