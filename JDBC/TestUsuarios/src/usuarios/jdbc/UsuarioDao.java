package usuarios.jdbc;

import java.sql.SQLException;
import java.util.List;
import usuarios.dto.UsuarioDTO;

/**
 *
 * @author Joaquin
 */
public interface UsuarioDao {
    
    public int insert(UsuarioDTO usuario) throws SQLException;
    
    public int update(UsuarioDTO usuario) throws SQLException;
    
    public int delete(UsuarioDTO usuario) throws SQLException;
    
    public List<UsuarioDTO> select() throws SQLException;
}
