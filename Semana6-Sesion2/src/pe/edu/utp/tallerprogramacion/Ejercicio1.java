/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pe.edu.utp.tallerprogramacion;

import java.util.Scanner;

/**
 *
 * @author Christiam Calero
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un número entre 1000 y 9999");
        int numero = lector.nextInt();
        int suma = 0;
        
        if(numero >= 1000 && numero <= 9999){
            
            while (numero > 0) {
                suma = suma + numero % 10;
                
                numero = numero/10;
            }
            System.out.printf("La suma de los digitos del numero ingresado es %d %n", suma);
        }else{
            System.out.println("No  ingreso un numero entre los rangos solicitados");
        }
    }
    
}
