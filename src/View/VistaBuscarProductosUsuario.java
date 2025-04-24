/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author Jeanm
 */
public class VistaBuscarProductosUsuario {
    private String nombreProductoUser;
    private String categoriaProductoUser;
    private String nombreVendedorUser;

    public VistaBuscarProductosUsuario() {
        
    }

    public VistaBuscarProductosUsuario(String nombreProductoUser, String categoriaProductoUser, String nombreVendedorUser) {
        this.nombreProductoUser = nombreProductoUser;
        this.categoriaProductoUser = categoriaProductoUser;
        this.nombreVendedorUser = nombreVendedorUser;
    }

    public String getNombreProductoUser() {
        return nombreProductoUser;
    }

    public String getCategoriaProductoUser() {
        return categoriaProductoUser;
    }

    public String getNombreVendedorUser() {
        return nombreVendedorUser;
    }

    public void setNombreProductoUser(String nombreProductoUser) {
        this.nombreProductoUser = nombreProductoUser;
    }

    public void setCategoriaProductoUser(String categoriaProductoUser) {
        this.categoriaProductoUser = categoriaProductoUser;
    }

    public void setNombreVendedorUser(String nombreVendedorUser) {
        this.nombreVendedorUser = nombreVendedorUser;
    }
}
