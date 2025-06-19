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

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%d * %d = %d \n", i, j, i*j);
            }
        }

        final int NUMERO_LINEA = 8;
        int valor = 1;
        
        for (int i = 0; i < NUMERO_LINEA; i++) {
            System.out.printf("%"+NUMERO_LINEA+"d\n", valor);
            valor = valor*10 + 1;
        }
        
        
    }

}
