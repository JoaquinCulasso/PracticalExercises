package personas.test;

import java.sql.SQLException;
import java.util.List;
import personas.dto.PersonaDTO;
import personas.jdbc.PersonaDao;
import personas.jdbc.PersonaDaoJDBC;

/**
 *
 * @author Joaquin
 */
public class TestPersonas {

    public static void main(String[] args) {
        //Utilizamos el tipo de interface como referencia a una clase concreta
        PersonaDao personaDao = new PersonaDaoJDBC();

        //Creamos un nuevo registro
        //Hacemos uso de la clase persona DTO la cual se usa para transferir la
        //información entre las capas, no es necesario especificar la llave primaria
        //ya que en este caso es de tipo autonumerico y la BD se encarga de asignar un nuevo valor
        PersonaDTO persona = new PersonaDTO();
        persona.setNombre("Mario");
        persona.setApellido("Lopez01");
        //Utilizamos la capa DAO para persistir el objeto DTO
        try {
            personaDao.insert(persona);
            //eliminamos un registro
            personaDao.delete(new PersonaDTO(9));
            //Actualizamos un registro
            PersonaDTO personaTmp = new PersonaDTO();
            personaTmp.setId_persona(6);
            personaTmp.setNombre("Mauricio");
            personaTmp.setApellido("Macri");
            personaDao.update(personaTmp);

            //Seleccionamos todos los registros
            List<PersonaDTO> personas = personaDao.select();
            for (PersonaDTO personaDTO : personas) {
                System.out.println(personaDTO);
                System.out.println("");
            }
        } catch (SQLException e) {
            System.out.println("Excepción en la capa de prueba");
            e.printStackTrace();
        }
    }

}
