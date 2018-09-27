package poolconexiones;

import capadatos.pool.PoolConexionOracle;
import capadatos.pool.PoolConexionesMySql;
import java.sql.*;

/**
 *
 * @author Joaquin
 */
public class TestPoolConexiones {

    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            //probamos el pool de conexiones de mysql
            //y ejecutamos una consulta
            conn = PoolConexionesMySql.geConnection();
            System.out.println("Utilizamos el pool de conexiones de MySql");
            stmt = conn.prepareStatement("SELECT * FROM persona");
            rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.print(" " + rs.getInt(1)); //id_persona
                System.out.print(" " + rs.getString(2)); //nombre
                System.out.println(" " + rs.getString(3)); //apellido 
            }
            conn.close();

            //probamos la conexion de oracle
            //y ejecutamos una consulta
            conn = PoolConexionOracle.getConnection();
            System.out.println("Utilizamos el pool de conexiones de Oracle");
            stmt = conn.prepareStatement("SELECT * FROM employees WHERE employee_id in(100,101,102)");
            rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.print(" " + rs.getInt(1)); //empleado_id
                System.out.print(" " + rs.getString(2)); //Nombre
                System.out.println(" " + rs.getString(3)); //Apellido
            }
            //Cerramos la conexion para regresarla al pool
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
