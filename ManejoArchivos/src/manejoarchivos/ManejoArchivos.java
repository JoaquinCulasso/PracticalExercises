package manejoarchivos;

import static utileria.Archivos.*;

/**
 *
 * @author Joaquin
 */
public class ManejoArchivos {

    private static final String NOMBRE_ARCHIVO = "C:\\Users\\JOAQU\\Documents\\NetBeansProjects\\ManejoArchivos\\pruebaJava\\pruebaJava.txt";

    public static void main(String[] args) {
        
        //Crear archivo
        crearArchivos(NOMBRE_ARCHIVO);

        //Escribir archivo
        escribirArchivos(NOMBRE_ARCHIVO);
        
        //Leer de un archivo
        leerArchivo(NOMBRE_ARCHIVO);
        
        //Anexar información a un archivo
        anexarArchivo(NOMBRE_ARCHIVO);
        
        //Leer archivo
        leerArchivo(NOMBRE_ARCHIVO);
    }

}
