/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogramacion;

/**
 *
 * @author Christiam Calero
 */
public class EjemploDoWhile {
    public static void main(String[] args) {
        
        boolean validador = false;
        while (validador) {            
            System.out.println("Siempre ingresa al menos una vez WHILE");
        }
        
        int i = 0;
        do{
//            System.out.println("Siempre ingresa al menos una vez DO - WHILE");
            System.out.println("i: " + i);
            i++;
        }while (i<=10);
        
        
    }
}
