package manejogenericos;

/**
 *
 * @author Joaquin
 */
public class ManejoGenericos {

    public static void main(String[] args) {
       //Creamos una instancia de ClaseGenerica para Integer
       ClaseGenerica<Integer> objetoInt = new ClaseGenerica<Integer>(15);
       objetoInt.obtenerTipo();
       
       //Creamos una instancia de ClaseGenerica para String
       //Se puede utilizar la inferencia de tipo del lado derecho
       ClaseGenerica<String> objetoStr = new ClaseGenerica<>("Prueba");
       objetoStr.obtenerTipo();
       
       //Los genericos no pueden ser aplicados a tipos primitivos
       //ClaseGenerica<int> intPrimitivo = new ClaseGenerica<int>(5);
    }
    
}
