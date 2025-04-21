/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;

/**
 * Clase para manejar al usuario administrador. (Por el momento no hemos
 * requerido atributos)
 */
public class Administrador extends Usuario {

    public Administrador() {
    }

    public Administrador(String username, String nombreCompleto, String cedulaIdentidad, LocalDate fechaNacimiento, String email, String contraseña, String rol) {
        super(username, nombreCompleto, cedulaIdentidad, fechaNacimiento, email, contraseña, rol);
    }

    @Override
    public String toString() {
        return "Administrador{" + super.toString() + '}';
    }

}
