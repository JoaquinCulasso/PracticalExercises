package personas.jdbc;

import java.sql.SQLException;
import java.util.List;
import personas.dto.PersonaDTO;

/**
 *
 * @author Joaquin
 * @date 03-sep-2018
 * @time 17:54:52
 *
 * Esta interfaz contiene los metodos abstractos con las operaciones básicas
 * sobre la tabla persona (CREATE, READ, UPDATE, DELETE) Se debe crear una clase
 * concreta para implementar el código asociado a cada metodo
 */
public interface PersonaDao {

    public int insert(PersonaDTO persona) throws SQLException;

    public int update(PersonaDTO persona) throws SQLException;

    public int delete(PersonaDTO persona) throws SQLException;

    public List<PersonaDTO> select() throws SQLException;

}
