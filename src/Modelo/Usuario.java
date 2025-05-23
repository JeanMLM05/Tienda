/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;

/**
 *
 * @author cristina
 */
public class Usuario {

    protected String username;
    protected String nombreCompleto;
    protected String cedulaIdentidad;
    protected LocalDate fechaNacimiento;
    protected String email;
    protected String contrasena;
    protected String rol;

    public Usuario() {
        this.username = "";
        this.nombreCompleto = "";
        this.cedulaIdentidad = "";
        this.fechaNacimiento = LocalDate.now();
        this.email = "";
        this.contrasena = "";
        this.rol = "";
    }

    public Usuario(String username, String nombreCompleto, String cedulaIdentidad, LocalDate fechaNacimiento, String email, String contrasena, String rol) {
        this.username = username;
        this.nombreCompleto = nombreCompleto;
        this.cedulaIdentidad = cedulaIdentidad;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
        this.contrasena = contrasena;
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

    public String getContrasena() {
        return contrasena;
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

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Usuario{"
                + "username='" + username + '\''
                + ", nombreCompleto='" + nombreCompleto + '\''
                + ", cedulaIdentidad='" + cedulaIdentidad + '\''
                + ", fechaNacimiento=" + fechaNacimiento
                + ", email='" + email + '\''
                + ", contrasena='" + contrasena + '\''
                + ", rol='" + rol + '\''
                + '}';
    }

}
