package manejoexcepciones1;

import domain.*;

/**
 *
 * @author JOAQUIN
 */
public class ManejoExcepcionesArg {

    public static void main(String[] args) throws OperationException {
        try {
            int op1 = Integer.parseInt(args[0]);
            int op2 = Integer.parseInt(args[1]);
            Division div = new Division(op1, op2);
            div.visualizarOperacion();
        } catch (ArrayIndexOutOfBoundsException aie) {
            System.out.println("Ocurrio una excepion: ");
            System.out.println("Hubo un error al acceder un elemento fuera del rango");
            aie.printStackTrace();
        } catch (NumberFormatException nfe) {
            System.out.println("Ocurrio una excepcion: ");
            System.out.println("Uno de los elementos no es entero");
            nfe.printStackTrace();
        } catch (OperationException oe) {
            System.out.println("Ocurrio una excepcion: ");
            System.out.println("Se trato de realizar una operacion erronea");
            oe.printStackTrace();
        } finally {
            System.out.println("Se terminaron de revisar las excepciones");
        }
    }
}
