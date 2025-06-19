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
        int semana =3, nroDias=7;
        
//        String matriz[][] = new String[3][7];
        
        for (int i = 1; i <= semana; i++) {
            System.out.printf("Semana %d: \n", i);
            
            for (int j = 1; j <= nroDias; j++) {
                String expresion2 = String.format("\t Dia %d\n ", j);
                System.out.printf(expresion2);
                
//                matriz[i][j]=expresion2;
            }
        }
        
        
    }
   
}
