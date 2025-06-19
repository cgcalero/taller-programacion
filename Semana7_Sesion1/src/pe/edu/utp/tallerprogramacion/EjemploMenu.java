/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogramacion;

import java.util.Scanner;

/**
 *
 * @author Christiam Calero
 */
public class EjemploMenu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        
//        String menu = "asdasdas \n"+
//                "asdad"+
//                "asdasdasd";
        String menu = """
                      | Acciones disponibles:
                      | [1] Agregar notas
                      | [2] Ver promedio
                      | [3] Salir
                      Ingrese una opcion:
                      """;
        do {            
            System.out.print(menu);
            i= scan.nextInt();
            
            switch (i) {
                case 1:
                    System.out.println("ELigio la Opcion 1");
                    break;
                case 2:
                    System.out.println("ELigio la Opcion 2");
                    break;                
            }
        } while (i != 3);
    }
}
