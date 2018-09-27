package usuarios.test;

import java.sql.SQLException;
import java.util.List;
import usuarios.dto.UsuarioDTO;
import usuarios.jdbc.UsuarioDao;
import usuarios.jdbc.UsuarioDaoJDBC;

/**
 *
 * @author Joaquin
 */
public class TestUsuarios {

    public static void main(String[] args) {

        UsuarioDao usuarioDao = new UsuarioDaoJDBC();

        UsuarioDTO usuarioDTO = new UsuarioDTO("nom4", "pass4");

        try {
            //agregamos una persona creada anteriormente
            usuarioDao.insert(usuarioDTO);

            //elminamos un registro
            usuarioDao.delete(new UsuarioDTO(4));

            //actualizamos registro
            usuarioDTO = new UsuarioDTO(1, "joa", "alberto");
            usuarioDao.update(usuarioDTO);

            //seleccionamos todos los registros
            List<UsuarioDTO> usuarios = usuarioDao.select();
            for (UsuarioDTO usuario : usuarios) {
                System.out.println(usuario);
                System.out.println("");
            }
        } catch (SQLException e) {
            System.out.println("Excepcion en la capa de prueba");
            e.printStackTrace();
        }

    }

}
