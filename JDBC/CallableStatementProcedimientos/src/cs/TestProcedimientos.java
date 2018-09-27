package cs;

import java.sql.*;
import datos.Conexion;

/**
 *
 * @author Joaquin
 */
public class TestProcedimientos {

    public static void main(String[] args) {
        int empleado_id = 100;
        //la formula que aplica el store procedure es
        //salario = salario * incremento
        double incrementoSalario = 1.1; // incremento del 10%
        Connection conn;
        try {
            conn = Conexion.geConnection();
            Statement stmt = null;
            ResultSet rs = null;
            CallableStatement csstmt = null;

            stmt = conn.createStatement();

            //llamamos al SP para incrementar salario
            System.out.println("Aumento del 10% al empleado:" + empleado_id);
            csstmt = conn.prepareCall("{call set_employee_salary(?,?)}");
            csstmt.setInt(1, empleado_id);
            csstmt.setDouble(2, incrementoSalario);
            csstmt.execute();
            csstmt.close();

            //Obtenemos el nuevo valor del salario para el empleado seleccionado
            String query = "SELECT first_name, salary FROM employees WHERE employee_id = " + empleado_id;

            rs = stmt.executeQuery(query);
            rs.next();
            System.out.println("Nombre:" + rs.getString(1));
            System.out.println("Salario nuevo:" + rs.getFloat(2));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
