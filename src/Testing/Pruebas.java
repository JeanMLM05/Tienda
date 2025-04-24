package Testing;

import AccesoDatos.ServicioAutenticacion;
import Modelo.Usuario;
import java.time.LocalDate;

public class Pruebas {

    public static void main(String[] args) {
    ServicioAutenticacion servicio = new ServicioAutenticacion();

    Usuario nuevo = new Usuario(
        "prueba123",
        "Cristina Soto",
        "789456123",
        LocalDate.of(1998, 3, 15),
        "cristina@email.com",
        "password321",
        "Comprador"
    );

    boolean exito = servicio.registrarUsuario(nuevo);

    if (exito) {
        System.out.println("✅ Usuario registrado correctamente.");
    } else {
        System.out.println("❌ Falló el registro.");
    }

    servicio.cerrarConexion();
}

}
