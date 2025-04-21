/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author cristina
 */
public class Inventario {

    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<Producto>();
    }

    public Inventario(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    // Devolver los productos con inventario
    public ArrayList<Producto> obtenerProductosDisponibles() {
        ArrayList<Producto> disponibles = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getInventarioDisponible() > 0) {
                disponibles.add(p);
            }
        }
        return disponibles;
    }

    @Override
    public String toString() {
        return "Inventario{" + "productos=" + productos + '}';
    }
}
