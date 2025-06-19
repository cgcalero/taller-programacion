/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogramacio;

/**
 *
 * @author Christiam Calero
 */
public class Ejercicio22 {
    public static void main(String[] args) {
        int suma=0, i = 0;
        
        while (++i<=10) {
            System.out.println("i: " + i);
            suma+=i;
        }
        System.out.println("suma: " + suma);
        
        int x=5;
        int k=x++;
        
        System.out.println("x:"+x +" k:"+k);
    }
}
