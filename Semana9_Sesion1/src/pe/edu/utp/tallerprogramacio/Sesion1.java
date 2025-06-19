/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pe.edu.utp.tallerprogramacio;

/**
 *
 * @author Christiam Calero
 */
public class Sesion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        char[] letras = new char[10];

        String[] nombres = new String[15];

        int[][] coordenadas = new int[2][2]; //{0-0, 0-1,                                            // {1-0, 1-1)

        int[][][] coordenadasTresDimension = new int[3][3][3]; //Matriz de 27 elementos

        /**/
        int[] edad = new int[5];//0 1 2 3 4        
        edad[0] = 16;
        edad[1] = 14;
        edad[2] = 13;
        edad[3] = 15;
        edad[4] = 10;        
        
        int indice = 0;
        while (indice < edad.length) {            
            System.out.printf("[%d]-%d \n", indice, edad[indice]);
        }
//        for (int i = 0; i < edad.length; i++) {
//            System.out.printf("[%d]-%d \n", i, edad[i]);
//        }

        int[] notas = {16, 14, 13, 15, 10, 18, 20};
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("[%d]-%d \n", i, notas[i]);
        }
        
        double[] salarioMensual = new double[12];
        
        boolean[] estados = new boolean[4];
        
        String nombre = null;//no exite
        String apellido ="";//no contiene datos
        
    }

}
