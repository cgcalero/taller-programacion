/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogramacion;

/**
 *
 * @author Christiam Calero
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        int[][] notas = {   {12, 15, 13},
                            {11, 18, 12},
                            {5, 10, 11}};
        
        int[][] copia = new int[3][3];
        
        System.arraycopy(notas, 0, copia, 0, notas.length);
        
        for (int i = 0; i < copia.length; i++) {
            for (int j = 0; j < copia[0].length; j++) {
                System.out.printf("%2d ", copia[i][j]);
            }
            System.out.println("");
        }
    }
}
