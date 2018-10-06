package utilerias;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author Joaquin
 * @date 06-oct-2018
 * @time 1:40:00
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
}
