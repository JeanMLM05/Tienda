package AccesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Servicio {

    protected Connection conexion = null;

    public Servicio() {
    }

    //Conectar a la DB
    protected void conectar() throws SQLException, ClassNotFoundException {
        Class.forName("oracle.jdbc.OracleDriver");

        // Conexión usando proyecto_tienda como usuario
        conexion = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521/ORCLPDB1",
                "proyecto_tienda", // Este debe ser el usuario correcto
                "cenfo22" // Este debe ser la contraseña correcta
        );
    }

    public Connection getConexion() {
        return conexion;
    }

    //Desconectar a la DB
    protected void desconectar() throws SQLException {
        if (conexion != null && !conexion.isClosed()) {
            conexion.close();
        }
    }
}
