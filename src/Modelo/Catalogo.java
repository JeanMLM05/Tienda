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
public class Catalogo {

    private ArrayList<Producto> productosDisponibles;

    public Catalogo() {
        this.productosDisponibles = new ArrayList<>();
    }

//     Nota: productosDisponibles se inicializa de una vez con los productos que tienen
//     inventario, la condición se encuentra en la función obtenerProductosDisponibles
//     del inventario. 
    
    public Catalogo(Inventario inventario) {
        this.productosDisponibles = inventario.obtenerProductosDisponibles();
    }

    public ArrayList<Producto> getProductosDisponibles() {
        return productosDisponibles;
    }

    public void setProductosDisponibles(ArrayList<Producto> productosDisponibles) {
        this.productosDisponibles = productosDisponibles;
    }

    @Override
    public String toString() {
        return "Catalogo{" + "productosDisponibles=" + productosDisponibles + '}';
    }
}
