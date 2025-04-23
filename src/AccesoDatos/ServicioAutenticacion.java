package AccesoDatos;

import java.sql.*;
import Modelo.Usuario;
import oracle.jdbc.OracleTypes;

public class ServicioAutenticacion extends Servicio {

    // Consultas para interactuar con la base de datos (procedimientos almacenados)
    private static final String INSERTAR_USUARIO = "{call insertarUsuario(?, ?, ?, ?, ?, ?, ?)}";
    private static final String LOGUEAR_USUARIO = "{? = call loguearUsuario(?, ?)}";
    private static final String MODIFICAR_DATOS_CUENTA = "{call modificarDatosCuenta(?, ?, ?, ?, ?, ?, ?)}";
    private static final String CAMBIAR_CONTRASENA = "{call cambiarContrasena(?, ?)}";
    private static final String VERIFICAR_ADMINISTRADOR = "{? = call verificarAdministrador(?)}";

    public ServicioAutenticacion() {
        try {
            conectar(); // Conexión a la base de datos
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Método para registrar un usuario
    public boolean registrarUsuario(Usuario usuario) {
        try (CallableStatement stmt = conexion.prepareCall(INSERTAR_USUARIO)) {
            stmt.setString(1, usuario.getUsername());
            stmt.setString(2, usuario.getNombreCompleto());
            stmt.setString(3, usuario.getCedulaIdentidad());
            stmt.setDate(4, java.sql.Date.valueOf(usuario.getFechaNacimiento()));
            stmt.setString(5, usuario.getEmail());
            stmt.setString(6, usuario.getContraseña());
            stmt.setString(7, usuario.getRol());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Método para loguear un usuario (verificar credenciales)
    public Usuario loguearUsuario(String username, String contrasena) {
        try (CallableStatement stmt = conexion.prepareCall(LOGUEAR_USUARIO)) {
            stmt.setString(1, username);
            stmt.setString(2, contrasena);
            stmt.registerOutParameter(1, OracleTypes.CURSOR);
            stmt.execute();
            ResultSet rs = (ResultSet) stmt.getObject(1);
            if (rs != null && rs.next()) {
                return new Usuario(rs.getString("username"), rs.getString("nombreCompleto"),
                        rs.getString("cedulaIdentidad"), rs.getDate("fechaNacimiento").toLocalDate(),
                        rs.getString("email"), rs.getString("contrasena"), rs.getString("rol"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Método para modificar los datos de un usuario
    public boolean modificarDatosCuenta(Usuario usuarioModificado) {
        try (CallableStatement stmt = conexion.prepareCall(MODIFICAR_DATOS_CUENTA)) {
            stmt.setString(1, usuarioModificado.getUsername());
            stmt.setString(2, usuarioModificado.getNombreCompleto());
            stmt.setString(3, usuarioModificado.getCedulaIdentidad());
            stmt.setDate(4, java.sql.Date.valueOf(usuarioModificado.getFechaNacimiento()));
            stmt.setString(5, usuarioModificado.getEmail());
            stmt.setString(6, usuarioModificado.getContraseña());
            stmt.setString(7, usuarioModificado.getRol());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Método para cambiar la contraseña de un usuario
    public boolean cambiarContrasena(String username, String nuevaContrasena) {
        try (CallableStatement stmt = conexion.prepareCall(CAMBIAR_CONTRASENA)) {
            stmt.setString(1, username);
            stmt.setString(2, nuevaContrasena);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Método para verificar si un usuario es administrador
    public boolean verificarAdministrador(String username) {
        try (CallableStatement stmt = conexion.prepareCall(VERIFICAR_ADMINISTRADOR)) {
            stmt.setString(1, username);
            stmt.registerOutParameter(1, OracleTypes.INTEGER);
            stmt.execute();
            return stmt.getInt(1) == 1; // Retorna true si es administrador
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Cerrar la conexión al finalizar
    public void cerrarConexion() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
