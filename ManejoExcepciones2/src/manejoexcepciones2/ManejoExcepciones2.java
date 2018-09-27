package manejoexcepciones2;

import datos.*;
import excepciones.*;

/**
 *
 * @author JOAQUIN
 */
public class ManejoExcepciones2 {

    public static void main(String[] args) {
        AccesoDatos datos = new ImplemetacionMySql();

        //Cambiamos el estado de la bandera
        datos.simularError(true);
        ejecutar(datos, "listar");

        //Cambiamos el estado de la bandera
        datos.simularError(false);
        System.out.println("");
        ejecutar(datos, "insertar");
    }

    private static void ejecutar(AccesoDatos datos, String accion) {
        if ("listar".equals(accion)) {
            try {
                datos.listar();
            } catch (LecturaDatosEx ex) {
                System.out.println("Error lectura: Procesa la excepcion mas especifica de lectura de datos");
            } catch (AccesoDatosEx ex) {
                System.out.println("Error acceso datos: Procesa la excepcion mas generica de acceso de datos");
            } catch (Exception ex) {
                System.out.println("Error general");
            } finally {
                System.out.println("es opcional, siempre se ejecutara sin importar si hubo error");
            }
        } else {
            if ("insertar".equals(accion)) {
                try {
                    datos.insertar();
                } catch (AccesoDatosEx ex) {
                    System.out.println("Error acceso datos: podemos procesar solo la excepcion mas generica");
                } finally {
                    System.out.println("procesar finally: es opcional");
                }
            } else {
                System.out.println("No se proporciono ninguna accion reconocida");
            }
        }
    }

}
