package manejojavabeans;

import beans.PersonaBean;

/**
 *
 * @author JOAQUIN
 */
public class ManejoJavaBeans {

    public static void main(String[] args) {
      
        PersonaBean bean = new PersonaBean();
        bean.setNombre("Juan");
        bean.setEdad(49);
        
        System.out.println("Nombre: " + bean.getNombre());
        System.out.println("Edad: " + bean.getEdad());
    }
    
}
