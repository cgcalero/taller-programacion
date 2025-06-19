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
public class Ejercicio5 {

    public static void main(String[] args) {
        
        int edad[] ={15, 20, 30, 18};
        int edad1[] = new int[4];
        
        System.arraycopy(edad, 0, edad1, 0, edad.length);                
        
        Arrays.sort(edad1);
        
        for (int i : edad1) {
            System.out.println(i);
        }
        
        boolean igual = Arrays.equals(edad, edad1);
        
        System.out.println(igual );
        
//        for (int i = 0; i < edad1.length; i++) {
//            System.out.println(edad1[i]);
//        }
        
//        int[] arreglo = new int[5];
//        
//        int contador = 0;
//        arreglo[contador++] = 15;
//        arreglo[contador++] = 22;
//        arreglo[contador++] = 31;
//
//        int resta = arreglo.length - contador;
//        System.out.printf("Cantidad de elementos ingresados: %d - %d = %d \n", arreglo.length, contador , resta);
//        // Publicamos el arreglo completo
//        for (int i = 0; i >= arreglo.length; i++) {
//            System.out.println(arreglo[i] + ",");
//        }
//        System.out.println(contador);
//        for (int i = 0; i < contador; i++) {
//            System.out.println(arreglo[contador] +",");
//        }
    }
}
