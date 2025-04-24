/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author Jeanm
 */
public class VistarIngresarVendedor {
    private String nombreVendedor;
    private String idVendedor;

    public VistarIngresarVendedor() {
        
    }

    public VistarIngresarVendedor(String nombreVendedor, String idVendedor) {
        this.nombreVendedor = nombreVendedor;
        this.idVendedor = idVendedor;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public String getIdVendedor() {
        return idVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public void setIdVendedor(String idVendedor) {
        this.idVendedor = idVendedor;
    }
}
