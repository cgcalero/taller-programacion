/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogramacion;

/**
 *
 * @author Christiam Calero
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        int[] arregloA = {1, 2, 3, 4, 5};
        int[] arregloB = {4, 5, 6, 7, 8};
        
        for (int i : arregloA) {
            for (int j : arregloB) {
                if(i == j){
                    System.out.println(i);
                }
            }
        }
    }        
}
