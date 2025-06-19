/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogramacion;

import java.util.Scanner;

/**
 *
 * @author Christiam Calero
 */
public class BucleInfinito {

    public static void main(String[] args) {
        try (Scanner lector = new Scanner(System.in)) {
            boolean esDiaInvalido = true;
            int dia = 0;
            
            while (esDiaInvalido) {
                System.out.print("Ingrese dia de la semana (1-7): ");
                dia = lector.nextInt();
                lector.nextLine();
                esDiaInvalido = (dia <= 0 || dia > 7);
            }
            
            System.out.println("Dia ingresado: " + dia);
        }
    }
}
