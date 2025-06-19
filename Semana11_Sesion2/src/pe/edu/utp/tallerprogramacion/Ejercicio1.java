/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pe.edu.utp.tallerprogramacion;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Christiam Calero
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = {  {5, 4, 7},
                            {1, 3, 8}, 
                            {2, 9, 6} };
        int[] vector = new int[9];
        
        int indice = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                vector[indice] = matriz[i][j];
                indice++;
            }
        }        
        for (int valor : vector) {
            System.out.printf("%2d", valor);
        }
        System.out.println("");
        Arrays.sort(vector);
        for (int valor : vector) {
            System.out.printf("%2d", valor);
        }
        System.out.println("");
        
        indice = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = vector[indice++];
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("%-2d ", matriz[i][j]);
            }
            System.out.println();
        }
    }

}
