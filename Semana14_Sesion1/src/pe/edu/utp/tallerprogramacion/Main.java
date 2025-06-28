/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogramacion;

import java.util.Random;

/**
 *
 * @author Christiam Calero
 */
public class Main {
    
    //VARIABLE GLOBAL    
    static Random generador = new Random();
    
    private void generarArreglos(int[] arrNotas, String[] arrNombres){
        
        for (int i = 0; i < arrNotas.length; i++) {
            arrNotas[i] = generador.nextInt(19)+1;
            arrNombres[i] = "Alumno"+(generador.nextInt(200)+1);
        }
    }
    
    private void imprimirArreglos(int[] arrNotas, String[] arrNombres){
        for (int i = 0; i < arrNotas.length; i++) {
            System.out.print("Nombre " + (i+1)+": "+ arrNombres[i] +" -> ");
            System.out.println(arrNotas[i]);
        }
    }
    
    private void imprimirNotaMayor(int[] arrNotas, String[] arrNombres){
        int notaMayor = arrNotas[0];
        String alumno = arrNombres[0];
        
        for (int i = 0; i < arrNotas.length; i++) {
            if(arrNotas[i]>notaMayor){
                notaMayor = arrNotas[i];
                alumno = arrNombres[i];
            }
        }
        System.out.println("Alumno con Mayor Nota: " + alumno + "->"+notaMayor);
        
    }
    private void imprimirNotaMenor(int[] arrNotas, String[] arrNombres){
        int notaMenor = arrNotas[0];
        String alumno = arrNombres[0];
        
        for (int i = 0; i < arrNotas.length; i++) {
            if(arrNotas[i] < notaMenor){
                notaMenor = arrNotas[i];
                alumno = arrNombres[i];
            }
        }
        System.out.println("Alumno con Menor Nota: " + alumno + "->"+notaMenor);
    }
   
    public static void main(String[] args) {
        
        Main main = new Main();
        
        int[] notas = new int[10];
        String[] nombre = new String[10];                
         
        main.generarArreglos(notas, nombre);
        main.imprimirArreglos(notas, nombre);
        main.imprimirNotaMayor(notas, nombre);
        main.imprimirNotaMenor(notas, nombre);
        
        System.out.println("########################################");
        int[] notas1 = new int[20];
        String[] nombre1 = new String[20];
                        
        main.generarArreglos(notas1, nombre1);
        main.imprimirArreglos(notas1, nombre1);
        main.imprimirNotaMayor(notas1, nombre1);
        main.imprimirNotaMenor(notas1, nombre1);
    }
    
}
