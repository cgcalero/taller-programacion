/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogramacion;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Christiam Calero
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Integer[] edades = {5, 6, 8, 9, 20, 23, 18, 6, 3};
        
        Arrays.sort(edades, Collections.reverseOrder());
        
        for (int i = 0; i < edades.length; i++) {
            System.out.printf("%d ",edades[i]);
        }
        System.out.println("");
    }
    
}
