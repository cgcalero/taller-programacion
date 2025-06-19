/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pe.edu.utp.tallerprogramacion;

/**
 *
 * @author Christiam Calero
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        for (int i = 0; i < 10; i++) {
//            System.out.println("i: " + i);
//            if(i==5){
//                break;
//            }
//        }

//        for (int i = 5; i <= 10; i+=2) {//i=i+2
//            System.out.println("i: " + i);
//        } 
        //Numeros pares menores a 10
        System.out.println("Incrementando de 1 en 1");
        for (int i = 1; i < 10; i++) {
            if(i%2==0){//1/2, 2/2 0 3/2 4/2 0
                System.out.println(i);
            }
        }
        
        System.out.println("Incrementando de 2 en 2");
        for (int i = 2; i < 10; i+=2) {
            System.out.println(i);
        }
    }
    
}
