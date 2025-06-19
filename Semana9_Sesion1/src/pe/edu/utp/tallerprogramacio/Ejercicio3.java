/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogramacio;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Christiam Calero
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tamanio de los elementos (N):");
        int tamanio = entrada.nextInt();
        
        StringBuilder cadena = new StringBuilder();
        
        int[] arreglo = new int[tamanio];
        Random random = new Random();
        
        for (int j = 0; j < tamanio; j++) {
            arreglo[j] = random.nextInt(10);
        }        
        //
        int indice = 0;
        while (indice < tamanio) {            
            cadena.append(arreglo[indice]);
            if(indice < tamanio - 1){
                cadena.append(", ");
            }
            indice++;
        }
        
        int sumaValor=0;
        int indice2 = 0;
        do {          
            sumaValor += arreglo[indice2];
            indice2++;
        } while (indice2<tamanio);
        
        System.out.printf("""
                          =========================
                          REPORTE
                          =========================
                          Los %d numeros aleatorios son:
                          %s
                          La suma de dichos numeros es: %d
                          """, tamanio, cadena, sumaValor);
        
    }
}
