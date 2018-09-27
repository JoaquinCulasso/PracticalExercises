package introduccionjdbc;

import java.sql.*;

/**
 *
 * @author Joaquin
 */
public class IntroduccionJDBC {

    public static void main(String[] args) {
        //cadena de conexion de MySql, el parametro useSSL es opcional
        String url = "jdbc:mysql://localhost:3306/sga?useSSL=false";

        //Cargamos el driver MySql
        try {
            Class.forName("com.mysql.jdbc.Driver"); // carga en memoria el driver mysql para poder interactuar con la bd
            //Creamos el objeto conexion
            Connection conexion = (Connection) DriverManager.getConnection(url, "root", "admin");
            //Creamos un objeto Statement
            Statement instruccion = conexion.createStatement();
            //Creamos query
            String sql = "select id_persona, nombre, apellido from persona";
            ResultSet result = instruccion.executeQuery(sql);
            while (result.next()) {
                System.out.print(" Id: " + result.getInt(1));
                System.out.print(" Nombre: " + result.getString(2));
                System.out.println(" Apellido: " + result.getString(3));
            }
            //cerramos cada uno de los objetos utilizados
            result.close();
            instruccion.close();
            conexion.close();
            
        } catch (ClassNotFoundException | SQLException e) { // error que ocurrir (ClassNotFoundException cuando se cargo el driver de mysql | SQLException cuando se ejecuta la setencia sql)
            e.printStackTrace();
        }
    }

}
