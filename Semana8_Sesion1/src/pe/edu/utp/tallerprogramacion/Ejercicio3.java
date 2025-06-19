/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogramacion;

/**
 *
 * @author Christiam Calero
 */
public class Ejercicio3 {
    public static void main(String[] args) {
//        int z = 10;
//        for (int i = 0; i < 10; i++) {
//            System.out.printf("%d - %d = %d %n", i, z, i-z);
//            z--;
//        }
        
//        for (int i = 0, j=10; i < 10; i++, j--) {
//            System.out.printf("%d - %d = %d %n", i, j, i-j);
//        }

        boolean esMultiploCinco = false;
        
        for (int i = 1; !esMultiploCinco; i++) {
            
            System.out.println(i);
            if(i % 5 == 0){
                esMultiploCinco = true;
            }
        }
        
    }
}
