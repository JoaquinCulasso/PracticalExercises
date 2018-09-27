package manejopersonas;

import datos.PersonasJDBC;
import domain.Persona;
import java.util.List;

public class ManejoPersonas {

    public static void main(String[] args) {
        PersonasJDBC personasJDBC = new PersonasJDBC();
        //Prueba del metodo insert
        //personasJDBC.insert("Steve", "Johson");

        //Prueba del metodo update
        //personasJDBC.update(5, "Joaquin", "Culasso");
        //Prueba del metodo delete
        //personasJDBC.delete(5);
        //Prueba del metodo select
        //Uso de un objeto persona para encapsular la informacion
        //de un registro de base de datos
        List<Persona> personas = personasJDBC.select();
        for (Persona persona : personas) {
            System.out.print(persona);
            System.out.println("");
        }
    }
}
