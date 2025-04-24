/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.time.LocalDate;
import View.Login;

/**
 *
 * @author cristina
 */
public class VistaRegistro {

    private String username;
    private String nombreCompleto;
    private String cedulaIdentidad;
    // Tipo de dato que permite calcular la edad
    private LocalDate fechaNacimiento;
    private String email;
    private String contraseña;
    // Este atributo puede ser util a la hora de otorgar permisos:
    private String rol;

    private VistaRegistro() {
        this.username = "";
        this.nombreCompleto = "";
        this.cedulaIdentidad = "";
        this.fechaNacimiento = LocalDate.now();
        this.email = "";
        this.contraseña = "";
        this.rol = "";
    }

    public VistaRegistro(String username, String nombreCompleto, String cedulaIdentidad, LocalDate fechaNacimiento, String email, String contraseña, String rol) {
        this.username = username;
        this.nombreCompleto = nombreCompleto;
        this.cedulaIdentidad = cedulaIdentidad;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    public String getUsername() {
        return username;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getCedulaIdentidad() {
        return cedulaIdentidad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getRol() {
        return rol;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setCedulaIdentidad(String cedulaIdentidad) {
        this.cedulaIdentidad = cedulaIdentidad;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
