package pe.edu.utp.tallerprogramacion;

import java.util.Arrays;

/**
 *
 * @author Christiam Calero
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        int[] fibonacci = {0, 1, 1, 2, 3, 5, 8, 13};
        int[] copyFibonacci = new int[8];
        
        System.arraycopy(fibonacci, 0, copyFibonacci, 0, fibonacci.length);
        
        for (int i = 0; i < copyFibonacci.length; i++) {
            System.out.printf("copyFibonacci[%d]->%d \n", i, copyFibonacci[i]);
        }
        
        StringBuilder sb = new StringBuilder();
        int[] notas = {15, 28, 11, 5, 9, 3, 2, 17, 8};
        Arrays.sort(notas);
        
        for (int i = 0; i < notas.length; i++) {
            sb.append(notas[i]);
            if(i < notas.length - 1){
                sb.append(", ");
            }
        }
        System.out.printf("\nOrdenamiento de la lista\n%s\n",sb.toString());
        
        char[] frase = {'J', 'a', 'v', 'a', ' ', 'L', 'o', 'v', 'e'};
        char[] frase1 = {74, 97, 118, 97, 32, 76, 111, 118, 101};
        
        boolean comparacion = Arrays.equals(frase, frase1);
        System.out.println("\nComparacion de arreglos");
        System.out.println(comparacion ? "Son iguales" : "Arreglos distintos");
        
        for (int i = 0; i < frase.length; i++) {
            System.out.println((char)frase1[i]);
        }
    }
    
}
