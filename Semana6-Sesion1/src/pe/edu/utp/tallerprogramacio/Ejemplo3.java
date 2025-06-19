/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogramacio;

import java.util.Scanner;

/**
 *
 * @author Christiam Calero
 */
public class Ejemplo3 {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        boolean esDiaInvalido = true;
        int dia = 0;
        
        while (esDiaInvalido) {//centinela
            System.out.print("Ingrese día de la semana (1-7): ");
            dia = lector.nextInt();
            lector.nextLine();
            esDiaInvalido = (dia < 1 || dia > 7);
        }
        System.out.println("Día ingresado: " + dia);
        
    }
}
