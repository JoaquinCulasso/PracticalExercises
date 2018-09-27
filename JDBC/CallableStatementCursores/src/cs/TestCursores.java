package cs;

import datos.Conexion;
import java.sql.*;
import oracle.jdbc.*;

/**
 *
 * @author Joaquin
 * @date 06-sep-2018
 * @time 22:43:37
 */
public class TestCursores {

    public static void main(String[] args) {
        //Utilizamos una clase de oracle para poder procesar el 
        //el cursor que regresa la funcion de oracle
        OracleCallableStatement oraCallStmt = null;
        OracleResultSet deptResultSet = null;

        try {
            Connection conn = Conexion.geConnection();
            //Tiene 2 parametros que posteriormente se definiran
            oraCallStmt = (OracleCallableStatement) conn.prepareCall("{? = call ref_cursor_package.get_dept_ref_cursor(?)}");
            //indicamos el tipo de regreso, el cual es un cursor
            oraCallStmt.registerOutParameter(1, OracleTypes.CURSOR);//parametro 1
            oraCallStmt.setInt(2, 200);//Establecemos departamento_id, parametro 2
            oraCallStmt.execute();
            //Recuperamos el ResultSet y lo convertimos en un tipo de Oracle
            deptResultSet = (OracleResultSet) oraCallStmt.getCursor(1);
            while (deptResultSet.next()) {
                System.out.print(" Id_departamento: " + deptResultSet.getInt(1));
                System.out.print(", Nombre_departamento: " + deptResultSet.getString(2));
                System.out.print(", Ubicación_id " + deptResultSet.getString(3));
                System.out.println("");
            }
            oraCallStmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
