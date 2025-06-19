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
public class Ejercicio2 {
    public static void main(String[] args) {
        String[] nombres = {"ROSA INONAN FARRO", "GABRIELA ROCIO ALVITES CH", "CARLOS ALRBERTO ROJAS CHAN",
                            "JUAN CARLOS GARCIA RODRIGUEZ","ANA MARIELA TORRES LAZO",};
        int[] edad = {25, 24, 25, 19, 22};
        int[] grado = {5, 5, 5, 5, 4};
        
        int[][] notas = {   {20, 17, 18, 16}, //PC1, PC2, PC3, EF
                            {16, 18, 15, 12},
                            {20, 20, 14, 15},
                            {20, 19, 15, 17},
                            {20, 18, 12, 13}
                        };
        
        /******/
        String[] nombresOriginal = new String[nombres.length];
        int[] indices = new int[nombres.length];
        
        System.arraycopy(nombres, 0, nombresOriginal, 0, nombres.length);
        Arrays.sort(nombres);
        
        int indAux = 0;
        for (int i = 0; i < nombresOriginal.length; i++) {
            for (int j = 0; j < nombres.length; j++) {
                if(nombres[i].equals(nombresOriginal[j])){
                    
                    indices[indAux]=j;
                    indAux++;
                    break;
                }
            }
        }

        double sumaPromedios = 0;
        String separator = String.format("%70s", "").replace(" ", "#");                           
         System.out.printf("%1$s\n%2$-30s EDAD GRADO  PC1 PC2 PC3 EF  PROMEDIO\n%1$s\n", separator, "NOMBRE");
         
         for (int i = 0; i < indices.length; i++) {
             System.out.printf("%-30s%5d%6d",nombres[i], edad[indices[i]], grado[indices[i]]);
             double sumaNotas = 0;
             
             for (int j = 0; j < notas[0].length; j++) {
                 System.out.printf("%4d", notas[indices[i]][j]);
                 sumaNotas+=notas[indices[i]][j];
             }
             double promedio = (double)sumaNotas/notas[0].length;
             sumaPromedios += promedio;
             
             System.out.printf("%8.2f", promedio);
             System.out.println("");
        }         
        System.out.printf("%1$s\nPROMEDIO TOTAL%2$51s\n%1$s\n", separator, sumaPromedios/nombres.length);         
    }
    
}
