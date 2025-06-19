/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogramacion;

import java.util.Arrays;

/**
 *
 * @author Christiam Calero
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        int[][] matriz = {  {5, 4, 7},
                            {1, 3, 8},
                            {2, 9, 6}};
        
//        ordenarPorFilas(matriz);
        ordenarPorColumnas(matriz);
        
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("%2d ", matriz1[j]);
            }
            System.out.println("");
        }
    }
    
    static int[][] ordenarPorFilas(int[][] matriz){
        for (int[] matriz1 : matriz) {
            Arrays.sort(matriz1);
        }
        
        return matriz;
    }
    
    static int[][] ordenarPorColumnas(int[][] matriz){
        
        int tamCol = matriz[0].length;
        for (int col = 0; col < tamCol ; col++) {
            int[] columna = new int[tamCol];
            
            for (int fil = 0; fil < matriz.length; fil++) {
                columna[fil] = matriz[fil][col];
            }
            
            Arrays.sort(columna);
            
            for (int fila = 0; fila < tamCol; fila++) {
                matriz[fila][col] = columna[fila];
            }
        }
        
        return matriz;
    }
    
}
