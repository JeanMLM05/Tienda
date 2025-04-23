/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author cristina
 */
public class Servicio {
    protected Connection conexion = null;

    public Servicio() {
    }

    //Conectar a la DB
    protected void conectar() throws SQLException, ClassNotFoundException {
        Class.forName("oracle.jdbc.OracleDriver");

        // Conexión usando SYS como SYSDBA (obligatorio para SYS)
        conexion = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521/ORCLPDB1",
                "SYS as SYSDBA",
                "TuPassword123"
        );
    }

    //Desconectar a la DB
    protected void desconectar() throws SQLException {
        if (!conexion.isClosed()) {
            conexion.close();
        }
    }
}
