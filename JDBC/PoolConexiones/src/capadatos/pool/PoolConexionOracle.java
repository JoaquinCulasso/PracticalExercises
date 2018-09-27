package capadatos.pool;

import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author Joaquin
 * @date 07-sep-2018
 * @time 21:36:38
 */
public class PoolConexionOracle {

    public static DataSource getDataSource() {
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        ds.setUsername("hr");
        ds.setPassword("hr");
        ds.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
        //definimos el tamaño de conexion
        ds.setInitialSize(5); // 5 conexiones iniciales
        return ds;
    }

    public static Connection getConnection() throws SQLException {
        return getDataSource().getConnection();
    }
}
