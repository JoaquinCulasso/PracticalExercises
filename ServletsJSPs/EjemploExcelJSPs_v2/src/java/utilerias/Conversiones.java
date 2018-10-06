package utilerias;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Joaquin
 * @date 06-oct-2018
 * @time 19:12:55
 */
public class Conversiones {

    private static final String FORMATO_FECHA = "dd-MM-yyyy";

    /*
    Metodo que permite convertir una fecha en una cadena con el formato especificado
    @param fecha
    @return
     */
    public static String format(Date fecha) {
        SimpleDateFormat formateador = new SimpleDateFormat(FORMATO_FECHA);
        return formateador.format(fecha);
    }

    public static String format(String fecha) {
        SimpleDateFormat formateador = new SimpleDateFormat(FORMATO_FECHA);
        return formateador.format(fecha);
    }
}
