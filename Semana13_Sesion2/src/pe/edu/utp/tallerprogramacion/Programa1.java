/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pe.edu.utp.tallerprogramacion;

import java.util.Arrays;

/**
 *
 * @author Christiam Calero
 */
public class Programa1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {                
        Math.sqrt(25);
        int[] arreglo = {5, 4, 3, 2, 1};
        
        Arrays.sort(arreglo);
        
        Calculadora.sumar(5, 10);
        
        Persona[] arregloPersona = new Persona[5];
        
        Persona p1 = new Persona("Juan", "Tapia Paredes", 34);
        Persona p2 = new Persona("Pedro", "Tapia Paredes", 25);
        
        arregloPersona[0] = p1;
        arregloPersona[1] = p2;
        
        System.out.println("<th>" + p1.getNombre());
        
        
        
    }
    
}
