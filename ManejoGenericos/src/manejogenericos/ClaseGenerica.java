package manejogenericos;

/**
 *
 * @author Joaquin
 */
public class ClaseGenerica<T> {

    //variable de tipo generico
    T objeto;

    public ClaseGenerica(T objeto) {
        this.objeto = objeto;
    }

    public void obtenerTipo() {
        System.out.println("El tipo T es: " + objeto.getClass().getName());
    }
}
