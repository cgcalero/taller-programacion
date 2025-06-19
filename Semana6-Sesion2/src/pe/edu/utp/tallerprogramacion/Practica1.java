/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogramacion;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Christiam Calero
 */
public class Practica1 {
    public static void main(String[] args) {
        
        Scanner intro = new Scanner(System.in);
        int numero;
        boolean validador = true;

        while (validador) {          
            System.out.println("Ingrese un numero entre 1 y 100");
            numero = intro.nextInt();
            
            if(numero >=1 && numero <=100){
                System.out.println("Ingrese si desea continuar Si|No");
                
                String continuar = intro.next();
                Pattern pattern = Pattern.compile("^[SsIÍií]+$");
                Matcher matcher = pattern.matcher(continuar);
                
                if(matcher.matches()){
                    System.out.println("Continuar solicitando numero");
                }else{
                    validador = false;
                }
            }
        }
    }
}
