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
public class Ejercicio3Validacion {
    public static void main(String[] args) {
        int numero;
        Scanner intro = new Scanner(System.in);
        
        do {            
            System.out.println("Ingrese un numero entre 0 y 10");
            numero = intro.nextInt();
            
        } while (numero<0 || numero>10); //validador
    }
}
