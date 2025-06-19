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
public class Ejemplo3 {
    public static void main(String[] args) {
        int[] fibonacci = {0, 1, 1, 2, 3, 5, 8};
        int[] copia = new int[7];
        
//        copia = Arrays.copyOf(fibonacci, fibonacci.length);
//        copia = Arrays.copyOfRange(fibonacci, 4, fibonacci.length);
        
        System.arraycopy(fibonacci, 0, copia, 0, fibonacci.length);
//        
        for (int i : copia) {
            System.out.println(i);
        }
    }
}
