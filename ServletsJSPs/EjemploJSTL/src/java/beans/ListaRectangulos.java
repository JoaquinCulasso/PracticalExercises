package beans;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Joaquin
 * @date 09-oct-2018
 * @time 22:00:22
 */
/**
 * Clase para generar un JavaBean de la lista rectangulo y que se pueda usar con
 * jsp:useBean desde un JSP
 */
public class ListaRectangulos {

    //Atributo que almacenara los objetos rectangulos
    private List<Rectangulo> lista = new ArrayList<>();

    /**
     * Este método nos permite simular una propiedad llamada "rectangulo" desde
     * la accion jsp:setPropery en un JSP
     *
     * @param r
     */
    public void setRectangulo(Rectangulo r) {
        this.lista.add(r);
    }

    public List<Rectangulo> getLista() {
        return lista;
    }

    public void setLista(List<Rectangulo> lista) {
        this.lista = lista; 
    }
}
