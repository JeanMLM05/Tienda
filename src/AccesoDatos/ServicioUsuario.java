/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos;

import Modelo.Usuario;
import java.sql.*;
import java.util.ArrayList;
import oracle.jdbc.OracleTypes;
/**
 *
 * @author JeanLopez
 */
public class ServicioUsuario extends Servicio {

    private static final String LISTAR_USUARIOS = "{? = call obtenerUsuarios()}";
    private static final String ELIMINAR_USUARIO = "{call eliminarUsuario(?)}";
    private static final String BUSCAR_USUARIO_POR_NOMBRE = "{? = call buscarUsuarioPorNombre(?)}";

    public ServicioUsuario() {
        try {
            conectar();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Usuario> listarUsuarios() {
        ArrayList<Usuario> usuarios = new ArrayList<>();

        try (CallableStatement stmt = conexion.prepareCall(LISTAR_USUARIOS)) {
            stmt.registerOutParameter(1, OracleTypes.CURSOR);
            stmt.execute();

            ResultSet rs = (ResultSet) stmt.getObject(1);

            while (rs != null && rs.next()) {
                usuarios.add(new Usuario(
                        rs.getString("Usuario"),
                        rs.getString("NombreCompleto"),
                        rs.getString("ID / CedulaDeIdentidad"),
                        rs.getDate("FechaNacimiento").toLocalDate(),
                        rs.getString("email"),
                        rs.getString("contrasena"),
                        rs.getString("rol.")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuarios;
    }

    public boolean eliminarUsuario(String username) {
        try (CallableStatement stmt = conexion.prepareCall(ELIMINAR_USUARIO)) {
            stmt.setString(1, username);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public ArrayList<Usuario> buscarUsuarioPorNombre(String nombre) {
        ArrayList<Usuario> usuarios = new ArrayList<>();

        try (CallableStatement stmt = conexion.prepareCall(BUSCAR_USUARIO_POR_NOMBRE)) {
            stmt.setString(1, nombre);
            stmt.registerOutParameter(1, OracleTypes.CURSOR);
            stmt.execute();

            ResultSet rs = (ResultSet) stmt.getObject(1);

            while (rs != null && rs.next()) {
                usuarios.add(new Usuario(
                        rs.getString("username"),
                        rs.getString("nombreCompleto"),
                        rs.getString("cedulaIdentidad"),
                        rs.getDate("fechaNacimiento").toLocalDate(),
                        rs.getString("email"),
                        rs.getString("contrasena"),
                        rs.getString("rol")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuarios;
    }

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
