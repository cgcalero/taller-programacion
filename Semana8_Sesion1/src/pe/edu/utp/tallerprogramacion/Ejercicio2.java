/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogramacion;

/**
 *
 * @author Christiam Calero
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        for (int i = 10; i > 0; i--) {//i=i-1
            if (i%2 ==0 ) {
                System.out.println(i);
            }            
        }
        
        for (int i = 10; i > 0; i-=2) {//i=i-1            
                System.out.println(i);          
        }
    }
}
