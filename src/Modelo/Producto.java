/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.io.File;

/**
 *
 * @author cristina
 */
public class Producto {
    private String nombreProducto;
    private String categoriaProducto;
    private double precioProducto;
    private double pesoProducto;
    private String dimensionesProducto;
    // No necesito una clase extra, solo agregar strings con los src de las imagenes.
    private ArrayList<String> imagenesProducto;
    private Vendedor vendedor;
    private File descripcion;
    private int inventarioDisponible;

    public Producto() {
        this.nombreProducto = "";
        this.categoriaProducto = "";
        this.precioProducto = 0;
        this.pesoProducto = 0;
        this.dimensionesProducto = "";
        this.imagenesProducto = new ArrayList<String>();
        this.vendedor = new Vendedor();
        this.descripcion = null;
        this.inventarioDisponible = 0;
    }

    public Producto(String nombreProducto, String categoriaProducto, double precioProducto, double pesoProducto, String dimensionesProducto, ArrayList<String> imagenesProducto, Vendedor vendedor, File descripcion, int inventarioDisponible) {
        this.nombreProducto = nombreProducto;
        this.categoriaProducto = categoriaProducto;
        this.precioProducto = precioProducto;
        this.pesoProducto = pesoProducto;
        this.dimensionesProducto = dimensionesProducto;
        this.imagenesProducto = imagenesProducto;
        this.vendedor = vendedor;
        this.descripcion = descripcion;
        this.inventarioDisponible = inventarioDisponible;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public String getCategoriaProducto() {
        return categoriaProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public double getPesoProducto() {
        return pesoProducto;
    }

    public String getDimensionesProducto() {
        return dimensionesProducto;
    }

    public ArrayList<String> getImagenesProducto() {
        return imagenesProducto;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public File getDescripcion() {
        return descripcion;
    }

    public int getInventarioDisponible() {
        return inventarioDisponible;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setCategoriaProducto(String categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public void setPesoProducto(double pesoProducto) {
        this.pesoProducto = pesoProducto;
    }

    public void setDimensionesProducto(String dimensionesProducto) {
        this.dimensionesProducto = dimensionesProducto;
    }

    public void setImagenesProducto(ArrayList<String> imagenesProducto) {
        this.imagenesProducto = imagenesProducto;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void setDescripcion(File descripcion) {
        this.descripcion = descripcion;
    }

    public void setInventarioDisponible(int inventarioDisponible) {
        this.inventarioDisponible = inventarioDisponible;
    }

    @Override
    public String toString() {
        return "Producto{"
                + "nombreProducto='" + nombreProducto + '\''
                + ", categoriaProducto='" + categoriaProducto + '\''
                + ", precioProducto=" + precioProducto
                + ", pesoProducto=" + pesoProducto
                + ", dimensionesProducto='" + dimensionesProducto + '\''
                + ", imagenesProducto=" + imagenesProducto
                + ", vendedor=" + vendedor
                + ", descripcion=" + descripcion
                + ", inventarioDisponible=" + inventarioDisponible
                + '}';
    }
}
