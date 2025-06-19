/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogramacion;

/**
 *
 * @author Christiam Calero
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        
//        int suma = 0;
//        
//        for (int i = 0; i < 20; suma+=i++);
//        System.out.println(suma);
        
//        for (; ; );

        boolean multiploTres = false;
        int i = 1;
        for (; !multiploTres; ){
            System.out.println(i);
            if(i%3 ==0){
                multiploTres=true;
            }
            i++;
        }
        
    }
}
