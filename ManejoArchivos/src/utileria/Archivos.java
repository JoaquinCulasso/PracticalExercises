package utileria;

import java.io.*;

/**
 *
 * @author Joaquin
 */
public class Archivos {

    public static void crearArchivos(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            String contenido = "Contenido a escribir en el archivo";
            salida.println(salida);
            salida.close();
            System.out.println("El archivo se ha creado correctamente \n");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void escribirArchivos(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            String contenido = "Contenido a escribir en el archivo";
            salida.println(salida);
            System.out.println();
            System.out.println("Fin de escritura");
            salida.close();
            System.out.println("Se ha escrito correctamente al archivo \n");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void leerArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            while (lectura != null) {
                System.out.println("lectura: " + lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void anexarArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            String contenido = "Anexando informacion al archivo";
            salida.println(contenido);
            System.out.println();
            salida.println("Fin de anexar");
            salida.close();
            System.out.println("Se ha anexado la informacion correctamente \n");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
