package datos;

import java.sql.*;
import java.util.*;

/**
 *
 * @author Joaquin
 * @date 07-sep-2018
 * @time 17:24:47
 */
public class Conexion {

    private static String JDBC_DRIVER;
    private static String JDBC_URL;
    private static String JDBC_USER;
    private static String JDBC_PASS;
    private static String JDBC_FILE_NAME = "jdbc";
    private static Driver driver = null;

    public static Properties loaProperties(String file) {
        Properties prop = new Properties();
        ResourceBundle bundle = ResourceBundle.getBundle(file);
        Enumeration e = bundle.getKeys();
        String key = null;
        while (e.hasMoreElements()) {
            key = (String) e.nextElement();
            prop.put(key, bundle.getObject(key));
        }

        JDBC_DRIVER = prop.getProperty("driver");
        JDBC_URL = prop.getProperty("url");
        JDBC_USER = prop.getProperty("user");
        JDBC_PASS = prop.getProperty("pass");

        return prop;
    }

    public static synchronized Connection geConnection() throws SQLException {
        if (driver == null) {
            try {
                loaProperties(JDBC_FILE_NAME);
                Class jdbcDriverClass = Class.forName(JDBC_DRIVER);
                driver = (Driver) jdbcDriverClass.newInstance();
                DriverManager.registerDriver(driver);
            } catch (Exception e) {
                System.out.println("Fallo en cargar el driver JDBC");
                e.printStackTrace();
            }
        }
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
    }

    public static void close(ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }

    public static void close(PreparedStatement stmt) {
        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }

    public static void close(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
}
