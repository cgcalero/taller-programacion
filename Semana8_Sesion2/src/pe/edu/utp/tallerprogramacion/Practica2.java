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
public class Practica2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cuantos numeros fibonacci desea obtener");
        int numero = scanner.nextInt();

        int primero = 0;
        int segundo = 1;

        int suma = primero + segundo;

        String cadenaFib = String.format("%d, %d", primero, segundo);

        if (numero > 2) {
            for (int i = 3; i <= numero; i++) {

                int sigFib = primero + segundo;

                primero = segundo;
                segundo = sigFib;

                suma += sigFib;
                cadenaFib = cadenaFib + String.format(", %d", sigFib);;

            }

            System.out.println("##########################################");
            System.out.printf("Los primeros %d numeros fibonacci es: ", numero);
            System.out.println(cadenaFib);

            System.out.printf("Los suma %d numeros fibonacci es: %d \n", numero, suma);
        }else{
            System.out.println("Ingrese un numero mayor a 2");
        }
    }
}
