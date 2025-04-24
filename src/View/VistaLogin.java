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
public class VistaLogin {
    private String username;
    private String contraseña;
    private String rol;
    
    private VistaLogin(){
        this.username = "";
        this.contraseña = "";
        this.rol = "";
    }

    public VistaLogin(String username, String contraseña, String rol) {
        this.username = username;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    public String getUsername() {
        return username;
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

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
   
}
