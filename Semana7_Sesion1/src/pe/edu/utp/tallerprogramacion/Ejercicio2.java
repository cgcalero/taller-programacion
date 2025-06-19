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
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        int numero;
        
        System.out.println("Ingrese un numero entre 1 y 12");
        numero = scan.nextInt();
        
        do {
            
            System.out.printf("%d x %d = %d %n", numero, i, numero * i);
            i++;
            
        } while (i<=12);
    }
}
