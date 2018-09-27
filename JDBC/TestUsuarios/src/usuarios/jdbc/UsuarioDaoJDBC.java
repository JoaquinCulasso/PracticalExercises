package usuarios.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import usuarios.dto.UsuarioDTO;

/**
 *
 * @author Joaquin
 * @date 04-sep-2018
 * @time 20:13:55
 */
public class UsuarioDaoJDBC implements UsuarioDao {

    public Connection userConn;

    private final String SQL_INSERT = "INSERT INTO usuario(usuario,password) VALUES(?,?)";

    private final String SQL_UPDATE = "UPDATE usuario SET usuario=?,password=? WHERE id_usuario=?";

    private final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario=?";

    private final String SQL_SELECT = "SELECT id_usuario,usuario,password FROM usuario";

    public UsuarioDaoJDBC() {
    }

    public UsuarioDaoJDBC(Connection userConn) {
        this.userConn = userConn;
    }

    @Override
    public int insert(UsuarioDTO usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int rows = 0;
        try {
            conn = (this.userConn != null) ? this.userConn : Conexion.geConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            System.out.println("Ejecutando query:" + SQL_INSERT);
            int index = 1;
            stmt.setString(index++, usuario.getUsuario());
            stmt.setString(index++, usuario.getPassword());
            rows = stmt.executeUpdate();
            System.out.println("Registro afectados:" + rows);
        } finally {
            Conexion.close(stmt);
            if (this.userConn == null) {
                Conexion.close(conn);
            }
        }
        return rows;
    }

    @Override
    public int update(UsuarioDTO usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = (this.userConn != null) ? this.userConn : Conexion.geConnection();
            stmt = conn.prepareCall(SQL_UPDATE);
            System.out.println("Ejecutando query:" + SQL_UPDATE);
            int index = 1;
            stmt.setString(index++, usuario.getUsuario());
            stmt.setString(index++, usuario.getPassword());
            stmt.setInt(index, usuario.getId_usuario());
            rows = stmt.executeUpdate();
            System.out.println("Registro actualizado:" + rows);
        } finally {
            Conexion.close(stmt);
            if (this.userConn == null) {
                Conexion.close(conn);
            }
        }
        return rows;
    }

    @Override
    public int delete(UsuarioDTO usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = (this.userConn != null) ? this.userConn : Conexion.geConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt.setInt(1, usuario.getId_usuario());
            rows = stmt.executeUpdate();
            System.out.println("Registro eliminado:" + rows);
        } finally {
            Conexion.close(stmt);
            if (this.userConn == null) {
                Conexion.close(conn);
            }
        }
        return rows;
    }

    @Override
    public List<UsuarioDTO> select() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        UsuarioDTO usuarioDTO = null;
        List<UsuarioDTO> usuarios = new ArrayList<UsuarioDTO>();
        try {
            conn = (this.userConn != null) ? this.userConn : Conexion.geConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            System.out.println("Ejecutando query:" + SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idUsuarioTmp = rs.getInt(1);
                String usuarioTmp = rs.getString(2);
                String passwordTmp = rs.getString(3);
                usuarioDTO = new UsuarioDTO(idUsuarioTmp, usuarioTmp, passwordTmp);
                usuarios.add(usuarioDTO);
            }
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            if (this.userConn == null) {
                Conexion.close(conn);
            }
        }
        return usuarios;
    }

}
