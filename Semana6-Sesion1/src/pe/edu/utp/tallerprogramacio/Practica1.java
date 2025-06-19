/*Escribir un programa en Java que solicite al usuario el ingreso de un código universitario y valide su formato. Mostrar el mensaje adecuado en caso no se cumpla dicho formato y volver a solicitar el código, usando la estructura while.

• Ejemplo de código universitario: U23205077*/
package pe.edu.utp.tallerprogramacio;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Christiam Calero
 */
public class Practica1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    
        Pattern patron = Pattern.compile("");
        boolean carnetVal = true;
        String carnetLeido = "";
        
        while (carnetVal) {            
            System.out.println("Ingrese su carnet universitario: ");
            carnetLeido = entrada.next();
        }
    }
    
}
