/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogramacion;

import java.util.Scanner;

/**
 *
 * @author Christiam Calero
 */
public class EjercicioBinario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        
        String binario ="";
        
        while (numero > 0) {            
            int residuo = numero % 2;
            
            binario = residuo + binario;
            numero = numero/2;
        }
        System.out.println(binario);
    }
}
