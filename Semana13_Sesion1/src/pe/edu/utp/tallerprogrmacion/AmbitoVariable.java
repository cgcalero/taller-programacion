/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogrmacion;

/**
 *
 * @author Christiam Calero
 */
public class AmbitoVariable {
    public static void main(String[] args) {
        int valor = 10;
        int[] datosValor = {12, 15, 20, 45};
        
        proceso(valor, datosValor);
        System.out.println("valor:" + valor);
        
        for (int i : datosValor) {
            System.out.printf("%d \n", i);
        }
    }

    private static void proceso(int n, int[] arreglo) {
        int valor = n * 2;
        System.out.println("valor proceso: " + valor);
        
        n+=50;
        
        arreglo[2] = 80;
    }
}
