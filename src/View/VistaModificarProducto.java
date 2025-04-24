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
    private String editarNombreProducto;
    private int editarPrecioProducto;
    private String editarDescripcionProducto;
    private int editarCantidadProducto;

    public VistaModificarProducto() {
        
    }

    public VistaModificarProducto(String editarNombreProducto, int editarPrecioProducto, String editarDescripcionProducto, int editarCantidadProducto) {
        this.editarNombreProducto = editarNombreProducto;
        this.editarPrecioProducto = editarPrecioProducto;
        this.editarDescripcionProducto = editarDescripcionProducto;
        this.editarCantidadProducto = editarCantidadProducto;
    }

    public String getEditarNombreProducto() {
        return editarNombreProducto;
    }

    public int getEditarPrecioProducto() {
        return editarPrecioProducto;
    }

    public String getEditarDescripcionProducto() {
        return editarDescripcionProducto;
    }

    public int getEditarCantidadProducto() {
        return editarCantidadProducto;
    }

    public void setEditarNombreProducto(String editarNombreProducto) {
        this.editarNombreProducto = editarNombreProducto;
    }

    public void setEditarPrecioProducto(int editarPrecioProducto) {
        this.editarPrecioProducto = editarPrecioProducto;
    }

    public void setEditarDescripcionProducto(String editarDescripcionProducto) {
        this.editarDescripcionProducto = editarDescripcionProducto;
    }

    public void setEditarCantidadProducto(int editarCantidadProducto) {
        this.editarCantidadProducto = editarCantidadProducto;
    }
}
