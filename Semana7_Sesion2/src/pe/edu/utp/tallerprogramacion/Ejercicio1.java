/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pe.edu.utp.tallerprogramacion;

import java.util.Scanner;

/**
 *
 * @author Christiam Calero
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char opcion = '0';
        boolean opcionEsValida;
        
        String menu = """
                      [n] Nuevo 
                      [a] Abrir 
                      [i] Imprimir
                      [g] Guardar 
                      [s] Salir 
                      Ingrese opción:
                      """;
        
        while (opcion != 's') {            
             System.out.println(menu);            
            opcion = scanner.next().toLowerCase().charAt(0);
            
            opcionEsValida = "naigs".indexOf(opcion)>=0;
            
            if(opcionEsValida && opcion != 's'){
                //
            }
        }

        do {            
            System.out.println(menu);            
            opcion = scanner.next().toLowerCase().charAt(0);
            
            opcionEsValida = "naigs".indexOf(opcion)>=0;
            
            if(opcionEsValida && opcion != 's'){
                //
            }
        } while ( opcion != 's');
        
    }
    
}
