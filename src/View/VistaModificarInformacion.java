/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.time.LocalDate;

/**
 *
 * @author cristina
 */
public class VistaModificarInformacion {
    private String username;
    private String nombreCompleto;
    private String email;

    private VistaModificarInformacion() {
        this.username = "";
        this.nombreCompleto = "";
        this.email = "";
    }

    public VistaModificarInformacion(String username, String nombreCompleto, String email) {
        this.username = username;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
