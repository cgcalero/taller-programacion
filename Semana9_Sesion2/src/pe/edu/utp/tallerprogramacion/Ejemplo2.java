/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogramacion;

/**
 *
 * @author Christiam Calero
 */
public class Ejemplo2 {

    public static void main(String[] args) {
        int[] puntajes = {20, 15, 19, 17};
        int total = 0;
        float promedio;
        for (int i = 0; i < puntajes.length; i++) {
            total += puntajes[i];
        }
        promedio = (float) total / puntajes.length;
        System.out.printf("Total: %d \nPromedio: %f %n", total, promedio);
        
        int min, max;
        min = max = puntajes[0];        
        for (int puntaje : puntajes) {
            if(puntaje>max){
                max = puntaje;
            }
            
            if(puntaje < min){
                min = puntaje;
            }
        }
        
        System.out.printf("Minimo: %d, Maximo: %d \n", min, max);
    }
}
