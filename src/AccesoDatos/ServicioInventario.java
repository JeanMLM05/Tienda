package AccesoDatos;

import Modelo.Producto;
import Modelo.Vendedor;
import oracle.jdbc.OracleTypes;

import java.io.File;
import java.sql.*;
import java.util.ArrayList;

public class ServicioInventario extends Servicio {

    private static final String OBTENER_PRODUCTOS = "{? = call obtenerProductos()}";

    public ServicioInventario() {
        try {
            conectar(); 
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Producto> obtenerProductos() {
        ArrayList<Producto> listaProductos = new ArrayList<>();

        try (CallableStatement stmt = conexion.prepareCall(OBTENER_PRODUCTOS)) {
            stmt.registerOutParameter(1, OracleTypes.CURSOR);
            stmt.execute();

            ResultSet rs = (ResultSet) stmt.getObject(1);

            while (rs != null && rs.next()) {
                String nombre = rs.getString("nombreProducto");
                String categoria = rs.getString("categoriaProducto");
                double precio = rs.getDouble("precioProducto");
                int cantidad = rs.getInt("inventarioDisponible");

                // Parámetros no disponibles en la base de datos → valores por defecto
                double peso = 0.0;
                String dimensiones = "";
                ArrayList<String> imagenes = new ArrayList<>();
                Vendedor vendedor = new Vendedor(); // Constructor por defecto
                File descripcion = null; // Archivo nulo

                Producto producto = new Producto(
                        nombre,
                        categoria,
                        precio,
                        peso,
                        dimensiones,
                        imagenes,
                        vendedor,
                        descripcion,
                        cantidad
                );

                listaProductos.add(producto);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaProductos;
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