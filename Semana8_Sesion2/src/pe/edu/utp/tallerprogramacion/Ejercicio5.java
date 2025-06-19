/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogramacion;

/**
 *
 * @author Christiam Calero
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        
        int edad = 18;
        
        if(edad>=0 && edad<=5){
            System.out.println("Es menor de 5 anios");
        }else if(edad > 5 && edad <= 10){
            System.out.println("Es menor de 10 anios");
        }else if(edad >10 && edad<= 15){
            System.out.println("Es menor de 15 anios");
        }else{
            System.out.println("Es mayor de 15 anios");
        }
    }
}
