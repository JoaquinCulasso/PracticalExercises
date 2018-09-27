package calculadoraentradadatos;

import java.util.*;
import static calculadora.Operaciones.*;

/**
 *
 * @author Joaquin
 */
public class CalculadoraEntradaDatos {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Proporciona el primer valor: ");
        int a = scan.nextInt();
        System.out.println("Introduce el segundo valor: ");
        int b = scan.nextInt();

        System.out.println("Suma: " + sumar(a, b));
        System.out.println("Resta: " + resta(a, b));
        System.out.println("Division: " + division(a, b));
        System.out.println("Multiplicación: " + multiplicacion(a, b));
    }

}
