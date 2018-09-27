package mysqltest;

import datos.PersonasJDBC;
import domain.Persona;
import java.util.List;

/**
 *
 * @author Joaquin
 */
public class MySqlTest {

    public static void main(String[] args) {
        PersonasJDBC personasJDBC = new PersonasJDBC();
        
        personasJDBC.insert("Steve", "Rich");
        
        personasJDBC.update(1, "jajaja", "holaMundo");
        
        personasJDBC.delete(2);
        
        List<Persona> personas = personasJDBC.select();
        for (Persona persona : personas) {
            System.out.println(persona);
            System.out.println("");
        }
                
    }
    
}
