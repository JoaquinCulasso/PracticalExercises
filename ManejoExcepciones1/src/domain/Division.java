package domain;

/**
 *
 * @author JOAQUIN
 */
public class Division {

    private int numerador;
    private int denominador;

    public Division(int numerador, int denominador) throws OperationException {
        if (denominador == 0) {
            throw new OperationException("Denominador igual a 0");
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void visualizarOperacion() {
        System.out.println("El resultado de la división es: " + numerador / denominador);
    }
}
