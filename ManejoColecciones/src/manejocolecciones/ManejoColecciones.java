package manejocolecciones;

import java.util.*;

/**
 *
 * @author JOAQUIN
 */
public class ManejoColecciones {

    public static void main(String[] args) {

        List miLista = new ArrayList();

        miLista.add("1");
        miLista.add("2");
        miLista.add("3");
        miLista.add("4");
        //elemento repetido
        miLista.add("4");
        imprimir(miLista);

        Set miSet = new HashSet();
        miSet.add("100");
        miSet.add("200");
        miSet.add("300");
        //elemento repetido
        miSet.add("300");
        imprimir(miSet);

        Map miMapa = new HashMap();
        //(Llave,Valor)
        miMapa.put("1", "Juan");
        miMapa.put("2", "Rosario");
        miMapa.put("3", "Bren");
        miMapa.put("4", "Joa");
        //imprimi todas las llaves
        imprimir(miMapa.keySet());
        //imprimi todos los valores
        imprimir(miMapa.values());
    }

    private static void imprimir(Collection collection) {
        for (Object elemento : collection) {
            System.out.print(elemento + " ");
        }
        System.out.println("");
    }
}
