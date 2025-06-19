/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogramacion;

/**
 *
 * @author Christiam Calero
 */
public class Practica2 {
    public static void main(String[] args) {
        int numeroDecimal = 150;
        String binario="";
        
        do {
            int digBinario = numeroDecimal % 2;
            binario = digBinario + binario;
            
            numeroDecimal = numeroDecimal/2;
            
        } while (numeroDecimal > 0);
        
        System.out.println(binario);
    }
    
}
