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
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[5];
        int[] edades = new int[5];

        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("%d Persona \n ", i + 1); //"1° "

            System.out.printf("Ingrese Nombre: ");
            nombres[i] = scanner.nextLine();

            System.out.printf("Ingrese la edad: ");
            edades[i] = scanner.nextInt();

            scanner.nextLine();
        }
               
        int N, INT, aux;
        String auxNombre;
        boolean band;
        N = edades.length;
        INT = N + 1;
        
        while (INT > 1) {
            INT = INT / 2;
            band = true;
            
            while (band) {                
                band = false;
                for (int i = 0; i + INT < N; i++) {
                    if(edades[i] > edades[i + INT]){
                        aux = edades[i];
                        edades[i]  = edades[i + INT];
                        edades[i + INT] = aux;
                        
                        auxNombre = nombres[i];
                        nombres[i]  = nombres[i + INT];
                        nombres[i + INT] = auxNombre;
                        band = true;
                    }
                }
            }
        }
        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("%-16s %2d [%s] \n",nombres[i], edades[i],
                    edades[i] >= 18 ? "Mayor de edad": "Menor de edad");

        }
    }
}
