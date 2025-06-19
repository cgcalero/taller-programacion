/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogramacio;

/**
 *
 * @author Christiam Calero
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        int[] edad = new int[5];//0 1 2 3 4        
        edad[0] = 16;
        edad[1] = 14;
        edad[2] = 13;
        edad[3] = 15;
        edad[4] = 10;        
        
        int indice = 0;
        while (indice < edad.length) {            
//            System.out.printf("[%d]-%d \n", indice, edad[indice]);
            indice++;
        }
        
        int[] notas = new int[20];        
        notas = new int[]{15, 10, 12, 18, 19};
        
        System.out.println(notas.length);
    }
}
