/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author cristina
 */
public class Comprador extends Usuario {

    private ArrayList<Producto> carritoDeCompras;
    private ArrayList<Producto> listaDeFavoritos;

    public Comprador() {
        super();
        this.carritoDeCompras = new ArrayList<>();
        this.listaDeFavoritos = new ArrayList<>();
    }

    public Comprador(ArrayList<Producto> carritoDeCompras, ArrayList<Producto> listaDeFavoritos, String username, String nombreCompleto, String cedulaIdentidad, LocalDate fechaNacimiento, String email, String contraseña, String rol) {
        super(username, nombreCompleto, cedulaIdentidad, fechaNacimiento, email, contraseña, rol);
        this.carritoDeCompras = carritoDeCompras;
        this.listaDeFavoritos = listaDeFavoritos;
    }

    public ArrayList<Producto> getCarritoDeCompras() {
        return carritoDeCompras;
    }

    public void setCarritoDeCompras(ArrayList<Producto> carritoDeCompras) {
        this.carritoDeCompras = carritoDeCompras;
    }

    public ArrayList<Producto> getListaDeFavoritos() {
        return listaDeFavoritos;
    }

    public void setListaDeFavoritos(ArrayList<Producto> listaDeFavoritos) {
        this.listaDeFavoritos = listaDeFavoritos;
    }

    // *********************
    // Métodos de carrito
    // *********************
    public void agregarAlCarrito(Producto producto) {
        carritoDeCompras.add(producto);
    }

    public void eliminarDelCarrito(Producto producto) {
        carritoDeCompras.remove(producto);
    }

    public void vaciarCarrito() {
        carritoDeCompras.clear();
    }

    // *********************
    // Métodos de favoritos
    // *********************
    public void agregarAFavoritos(Producto producto) {
        listaDeFavoritos.add(producto);
    }

    public void eliminarDeFavoritos(Producto producto) {
        listaDeFavoritos.remove(producto);
    }

    public void vaciarFavoritos() {
        listaDeFavoritos.clear();
    }

    @Override
    public String toString() {
        return "Comprador{"
                + "carritoDeCompras=" + carritoDeCompras
                + ", listaDeFavoritos=" + listaDeFavoritos
                + '}';
    }
}
