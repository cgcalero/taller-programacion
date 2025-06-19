/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogramacion;

/**
 *
 * @author Christiam Calero
 */
public class Ejemplo1 {

    public static void main(String[] args) {
        int[][] matriz = new int[2][2];

        matriz[0][0] = 1;
//        matriz[0][1] = 2;
        matriz[1][0] = 3;
        matriz[1][1] = 4;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("Matriz[%d][%d] = %d \n",i,j, matriz[i][j]);
            }
        }
        System.out.println("====================");
        int[][] matriz2 = { {1, 2, 5},
                            {3, 4, 6}
        };  

        for (int i = 0; i < matriz2[0].length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                System.out.printf("Matriz2[%d][%d] = %d \n",i,j, matriz2[j][i]);
            }
        }
        
//        for (int[] is : matriz2) {
//            for (int valor : is) {
//                System.out.printf("%2d ", valor);
//            }
//            System.out.println("");
//        }
        
//        for (int i = 0; i < matriz2.length; i++) {
//            for (int j = 0; j < matriz2[0].length; j++) {
//                System.out.printf("Matriz2[%d][%d] = %d \n",i,j, matriz2[i][j]);
//            }
//        }
        
    }
}
