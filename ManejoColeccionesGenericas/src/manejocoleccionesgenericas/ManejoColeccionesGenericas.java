package manejocoleccionesgenericas;

import java.util.*;

/**
 *
 * @author Joaquin
 */
public class ManejoColeccionesGenericas {

    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();

        miLista.add("1");
        miLista.add("2");
        miLista.add("3");
        miLista.add("4");
        miLista.add("4");
        imprimir(miLista);

        Set<String> miSet = new HashSet<>();
        miSet.add("1");
        miSet.add("2");
        miSet.add("3");
        miSet.add("4");
        miSet.add("4");
        imprimir(miSet);

        Map<String, String> miMapa = new HashMap<>();

        miMapa.put("1", "Carlos");
        miMapa.put("2", "Vale");
        miMapa.put("3", "Joa");
        miMapa.put("4", "Cs");
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }

    public static void imprimir(Collection<String> col) {
        for (String elemento : col) {
            System.out.print(elemento + " ");
        }
        System.out.println("");
    }

}
