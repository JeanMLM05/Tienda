/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author Jeanm
 */
public class VistaEliminarProducto {
    private String nombreProductoElim;
    private String idAdmin;

    public VistaEliminarProducto() {
        
    }

    public VistaEliminarProducto(String nombreProductoElim, String idAdmin) {
        this.nombreProductoElim = nombreProductoElim;
        this.idAdmin = idAdmin;
    }

    public String getNombreProductoElim() {
        return nombreProductoElim;
    }

    public String getIdAdmin() {
        return idAdmin;
    }

    public void setNombreProductoElim(String nombreProductoElim) {
        this.nombreProductoElim = nombreProductoElim;
    }

    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }
}
