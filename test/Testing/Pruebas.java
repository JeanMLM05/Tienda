package Testing;

import Modelo.Usuario;
import AccesoDatos.ServicioAutenticacion;
import java.time.LocalDate;

public class Pruebas {

    public static void main(String[] args) {
        ServicioAutenticacion servicio = new ServicioAutenticacion();

        // Test de Inserción de Usuario
        testInsertarUsuario(servicio);

        // Test de Autenticación de Usuario
        testLogin(servicio);

        // Test de Modificación de Contraseña
        testModificarContraseña(servicio);

        // Test de Modificación de Datos de Cuenta
        testModificarDatosCuenta(servicio);
    }

    public static void testInsertarUsuario(ServicioAutenticacion servicio) {
        try {
            // Crear el nuevo usuario
            Usuario nuevoUsuario = new Usuario("jdoe2", "John Doe", "123456789", LocalDate.of(1990, 1, 1), "jdoe2@email.com", "password123", "Comprador");
            
            // Insertar el usuario usando el servicio
            boolean resultado = servicio.registrarUsuario(nuevoUsuario);
            
            if (resultado) {
                System.out.println("Usuario insertado correctamente.");
            } else {
                System.out.println("No se pudo insertar el usuario.");
            }
        } catch (Exception e) {
            System.out.println("Error al insertar usuario: " + e.getMessage());
        }
    }

    public static void testLogin(ServicioAutenticacion servicio) {
        try {
            // Intento de login
            Usuario usuario = servicio.loguearUsuario("jdoe2", "password123");
            if (usuario != null) {
                System.out.println("Usuario autenticado: " + usuario.getUsername());
            } else {
                System.out.println("Credenciales incorrectas.");
            }
        } catch (Exception e) {
            System.out.println("Error en la autenticación: " + e.getMessage());
        }
    }

    public static void testModificarContraseña(ServicioAutenticacion servicio) {
        try {
            // Intento de cambio de contraseña
            boolean resultado = servicio.cambiarContrasena("jdoe2", "nuevaContraseña123");
            if (resultado) {
                System.out.println("Contraseña cambiada correctamente.");
            } else {
                System.out.println("No se pudo cambiar la contraseña.");
            }
        } catch (Exception e) {
            System.out.println("Error al cambiar contraseña: " + e.getMessage());
        }
    }

    public static void testModificarDatosCuenta(ServicioAutenticacion servicio) {
        try {
            // Modificación de datos del usuario
            Usuario usuarioModificado = new Usuario("jdoe2", "John Doe", "123456789", LocalDate.of(1990, 1, 1), "jdoe_new@email.com", "newpassword123", "Comprador");
            boolean resultado = servicio.modificarDatosCuenta(usuarioModificado);
            if (resultado) {
                System.out.println("Datos de cuenta modificados correctamente.");
            } else {
                System.out.println("No se pudieron modificar los datos.");
            }
        } catch (Exception e) {
            System.out.println("Error al modificar los datos: " + e.getMessage());
        }
    }
}
