/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogramacion;

/**
 *
 * @author Christiam Calero
 */
public class Practica2 {

    public static void main(String[] args) {
        int[][] matriz = {{15, 10, 28}, {7, 3, 16}, {9, 20, 8}};

        int[] suma = new int[matriz.length];
        double[] promedio = new double[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            int sumafila = 0;
            for (int j = 0; j < matriz[0].length; j++) {
                sumafila += matriz[i][j];
            }
            suma[i] = sumafila;
            promedio[i] = (double) sumafila / matriz.length;
        }

        for (int i = 0; i < suma.length; i++) {
            System.out.printf("%-3d %7.2f\n", suma[i], promedio[i]);
        }
    }
}
