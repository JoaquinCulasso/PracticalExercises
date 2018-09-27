package entradadatos;

import java.io.*;

/**
 *
 * @author Joaquin
 */
public class EntradaDatos {

    public static void main(String[] args) {
        
        String captura;
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader bInput = new BufferedReader(input);

        try {
            System.out.println("Introduce dato: ");
            captura = bInput.readLine();
            while (captura != null) {
                System.out.println("dato introducido: " + captura);
                captura = bInput.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
