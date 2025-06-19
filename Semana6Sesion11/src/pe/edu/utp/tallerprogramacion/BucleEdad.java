package pe.edu.utp.tallerprogramacion;

import java.util.Scanner;

/**
 *
 * @author Christiam Calero
 */
public class BucleEdad {
    public static void main(String[] args) {
        int edad = -1;        
        Scanner scanner = new Scanner(System.in);
                    
        while (edad<0) {                        
        
            System.out.print("Ingrese su edad: ");
            edad = scanner.nextInt();
            
//            scanner.nextLine();
            
        }
        System.out.println("Su edad es: " + edad);
        
    }
}
