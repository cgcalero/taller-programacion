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
public class DeterminaPrimo {

    /*
    •
Escribir un programa que lea una expresión y que:
•
Determine si un número es o no primo, para lo cual
se debe ingresar el número con el prefijo “P”
(ejemplo:
•
Halle el factorial de un número, para lo cual se debe
ingresar el número con el sufijo “!” (ejemplo: 8!).
•
Luego de mostrar el resultado de la expresión
ingresada, el programa termina si usuario responde
“no” a la pregunta “¿Desea continuar (si/
•
Usar do while para validaciones y Pattern & Matcher
para evaluar el formato de la expresión ingresada.
     */

    public static void main(String[] args) {
        final String EXP_REG_PRIMO = "^P\\d+$";
        final String EXP_REG_FACTORIAL = "^\\d+\\!$";
        String numeroEvaluar;
        boolean checkEval = true;

        Scanner intro = new Scanner(System.in);
        Pattern patron_primo = Pattern.compile(EXP_REG_PRIMO);
        Pattern patron_factorial = Pattern.compile(EXP_REG_FACTORIAL);
        do {
            System.out.print("""
                               Ingrese el numero con el prefijo 'P' (ejemplo P13) para evaluar si es primo o no. 
                               Caso contrario ingrese el numero con el sufijo '!' (ejemplo: 8!):
                               """);

            numeroEvaluar = intro.next();
            Matcher matcherPrimo = patron_primo.matcher(numeroEvaluar);
            Matcher matcherFactorial = patron_factorial.matcher(numeroEvaluar);

            if (matcherPrimo.matches()) {
                int argEntrada = Integer.parseInt(numeroEvaluar.substring(1)); //P34               
                verificarPrimo(argEntrada);
                
            } else if (matcherFactorial.matches()) {//88!
                int argEntrada = Integer.parseInt(numeroEvaluar.substring(0, numeroEvaluar.indexOf("!")));
                calcularFactorial(argEntrada); 
            } else {
                System.out.println("Formato desconocido");
            }
            
            System.out.println("Desea continuar (si/no)?");
            String pregunta = intro.next();
            if(pregunta.equalsIgnoreCase("no")){
                checkEval = false; 
            }
            
        } while (checkEval);
    }
    
    static void verificarPrimo(int numero){
                        
        if(numero >= 2){
            int i = 2;
            while (numero % i != 0) {//5%2, 5%3, 5%4, 5%5
                i++;
            }
            
            if(i == numero){
                System.out.println("El numero ingresado es primo");
            }else{
                System.out.println("El numero ingresado no es primo");
            }
        }else{
            System.out.println("El numero ingresado no es primo");
        }
        
    }
    
    static void calcularFactorial(int numero){
        int factorial = 1;
        
        while (numero >= 1) {            
            factorial  *= numero;
            numero--;
        }
        
        System.out.printf("El factorial del numero ingresado es: %d %n", factorial);
    }
}
