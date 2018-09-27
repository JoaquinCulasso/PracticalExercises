package capadatos.pool;

import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author Joaquin
 * @date 07-sep-2018
 * @time 21:29:53
 */
public class PoolConexionesMySql {

    public static DataSource getDataSource() {
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUsername("root");
        ds.setPassword("admin");
        ds.setUrl("jdbc:mysql://localhost/sga?useSSL=false");
        //Definimos el tamaño de pool de conexiones
        ds.setInitialSize(5); // 5 conexiones iniciales
        return ds;
    }

    public static Connection geConnection() throws SQLException {
        return getDataSource().getConnection();
    }
}
