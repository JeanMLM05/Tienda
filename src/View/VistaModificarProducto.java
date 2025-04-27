/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author Jeanm
 */
public class VistaModificarProducto {
    private String nombreProductoMod;
    private double precioProductoMod;
    private String descripcionProductoMod;
    private int cantidadProductoMod;
    private String categoriaMod;

    public VistaModificarProducto() {
        
    }

    public VistaModificarProducto(String nombreProductoMod, double precioProductoMod, String descripcionProductoMod, int cantidadProductoMod, String categoriaMod) {
        this.nombreProductoMod = nombreProductoMod;
        this.precioProductoMod = precioProductoMod;
        this.descripcionProductoMod = descripcionProductoMod;
        this.cantidadProductoMod = cantidadProductoMod;
        this.categoriaMod = categoriaMod;
    }

    public String getNombreProductoMod() {
        return nombreProductoMod;
    }

    public double getPrecioProductoMod() {
        return precioProductoMod;
    }

    public String getDescripcionProductoMod() {
        return descripcionProductoMod;
    }

    public int getCantidadProductoMod() {
        return cantidadProductoMod;
    }

    public String getCategoriaMod() {
        return categoriaMod;
    }

    public void setNombreProductoMod(String nombreProductoMod) {
        this.nombreProductoMod = nombreProductoMod;
    }

    public void setPrecioProductoMod(double precioProductoMod) {
        this.precioProductoMod = precioProductoMod;
    }

    public void setDescripcionProductoMod(String descripcionProductoMod) {
        this.descripcionProductoMod = descripcionProductoMod;
    }

    public void setCantidadProductoMod(int cantidadProductoMod) {
        this.cantidadProductoMod = cantidadProductoMod;
    }

    public void setCategoriaMod(String categoriaMod) {
        this.categoriaMod = categoriaMod;
    }
}