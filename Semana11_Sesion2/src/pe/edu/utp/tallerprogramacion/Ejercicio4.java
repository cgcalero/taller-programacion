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
public class Ejercicio4 {

    public static void main(String[] args) {
        int[][] matriz = {{5, 4, 7},
        {1, 3, 8},
        {2, 9, 6},
        {10, 11, 12}
        };
        int[][] matrizCopia = {{5, 4, 7},
        {1, 3, 8},
        {2, 9, 6},
        {10, 11, 12}
        };

        System.out.println("Tamaño Filas:" + matriz.length);
        System.out.println("Tamaño Columas:" + matriz[0].length);
        
        boolean compara = Arrays.deepEquals(matriz, matrizCopia);
        System.out.println(compara?"Iguales":"diferentes");

    }

}
