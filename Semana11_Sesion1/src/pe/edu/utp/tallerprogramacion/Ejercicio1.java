/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pe.edu.utp.tallerprogramacion;

/**
 *
 * @author Christiam Calero
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[2][3];
        /*
        0,0 0,1 0,2
        1,0 1,1 1,2
         */

        matriz[0][0] = 1;
        matriz[0][1] = 2;
//        matriz[0][2] = 3;
//        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;

        System.out.println("longitud matriz: " + matriz.length);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(matriz[i][j]);
            }
        }

        int[][] matriz3x3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(matriz3x3[i][j]);
            }
        }
    }

}
