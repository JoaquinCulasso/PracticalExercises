package cs;

import datos.Conexion;
import java.sql.*;

/**
 *
 * @author Joaquin
 */
public class TestFunciones {

    public static void main(String[] args) {
        int empleadoId = 100; // Identificador a recuperar salario;
        try {
            Connection conn = Conexion.getConnection();
            CallableStatement cstmt = null;
            double salarioMensual;

            cstmt = conn.prepareCall("{?= call get_employee_salary(?)}");
            //Una función regresa un valor
            //por lo que lo registramos como el parametro 1
            cstmt.registerOutParameter(1, java.sql.Types.INTEGER);
            //registramos el segundo parametro
            cstmt.setInt(2, empleadoId);
            cstmt.execute();
            salarioMensual = cstmt.getDouble(1);
            cstmt.close();
            System.out.println("Empleado con id:" + empleadoId);
            System.out.println("Salario $:" + salarioMensual);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
