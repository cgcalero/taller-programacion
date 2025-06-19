/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pe.edu.utp.tallerprogramacio;

/**
 *
 * @author Christiam Calero
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 10;
        
        while (i>0) { //9>0
            //8
            //7
            //0
            System.out.println("i: " + i);
            i--; //i=i-1;
        }
        
        System.out.println("Fin del while");
        
        ///do-while
        int j = 10;        
        do{            
            System.out.println("j: " + j);
            j--; //i=i-1;
        }while (j>0);
        
        //for
        for (int k = 10; k > 0; k--) {
            System.out.println("k: " + k);
        }
    }
    
}
