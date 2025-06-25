/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pe.edu.utp.tallerprogramacion;

/**
 *
 * @author Christiam Calero
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        sum(1, 2, 3);
        sum(1, 2, 3, 4);
        sum(1, 2, 3, 4, 5);
        sum(1, 2, 3, 4, 5, 6);
        sum(2, 5, 6, 8,7, 10 ,12);
    }
    
    static void sum(int... valor){
        int suma=0;
        for (int i : valor) {
            suma+=i;
        }
        
        System.out.println(suma);
    }
}
