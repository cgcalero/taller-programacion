/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogramacion;

import java.util.Arrays;

/**
 *
 * @author Christiam Calero
 */
public class Ejemplo5 {
    public static void main(String[] args) {
        int[] notas = {18, 16, 11, 58, 13, 15, 5, 23};
        Arrays.sort(notas);
        
        for (int nota : notas) {
//            System.out.println(nota);
        }
        
        String[] apellidos = {"Torres", "Tapía", "Paredes", "Amaro", "Benito"};
        Arrays.sort(apellidos);
        
        for (String apellido : apellidos) {
            System.out.println(apellido);
        }
        
        StringBuilder sb = new StringBuilder();
        char[] frases = {'Y','o',' ','A','m','o',' ','J','a','v','a'};    
        Arrays.sort (frases);
        
        for (char frase : frases) {
            sb.append(frase);
        }
        System.out.println(sb);
        
        
        char[] frase1 = {'Y','o',' ','A','m','o',' ','J','a','v','a'}; 
        char[] frase2 = {'Y','o',' ','A','m','o',' ','j','a','v','a'}; 
        
        boolean compara = Arrays.equals(frase1, frase2);
        
        System.out.println(compara ? "Son iguales" : "Son distintos");
    }
}
