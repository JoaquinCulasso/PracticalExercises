package mx.com.gm.peliculas.excepciones;

/**
 *
 * @author Joaquin
 */
public class AccesoDatosEx extends Exception{
    String mensaje;
    
    public AccesoDatosEx(String mensaje){
        this.mensaje = mensaje;
    }
}
