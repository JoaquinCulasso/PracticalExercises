package test;

import datos.Conexion;
import java.sql.*;
import oracle.jdbc.OracleResultSetMetaData;

/**
 *
 * @author Joaquin
 */
public class TestMetadatos {

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.geConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM employees");
            //Obtenmos un ubjeto de tipo metadatos de Oracle
            OracleResultSetMetaData rsOracle = (OracleResultSetMetaData) rs.getMetaData();
            if (rsOracle == null) {
                System.out.println("Metadatos no disponibles");
            } else {
                //Preguntamos cuantas columnas tiene la tabla empleados
                int columCount = rsOracle.getColumnCount();
                //Desplegamos el nro de columnas
                System.out.println("Nro de columnas: " + columCount);
                for (int i = 1; i < columCount; i++) {
                    //Desplegamos el nombre de la columna
                    System.out.print("Nombre columna: " + rsOracle.getColumnName(i));
                    //Desplegamos el tipo de columna
                    System.out.print(", Tipo columna: " + rsOracle.getColumnTypeName(i));
                    //Desplegamos si la columna puede almacenar valores nulos
                    switch (rsOracle.isNullable(i)) {
                        case OracleResultSetMetaData.columnNoNulls:
                            System.out.print(", No acepta nulos");
                            break;
                        case OracleResultSetMetaData.columnNullable:
                            System.out.print(", Si acepta nulos");
                            break;
                        case OracleResultSetMetaData.columnNullableUnknown:
                            System.out.print(", Valor nulo desconocido");
                    }
                    System.out.println("");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
