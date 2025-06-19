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
public class Patrones2 {
    //U12345678
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);        
        Pattern patron = Pattern.compile("^[U]\\d{8}$");
        String carnetUniversitario="";
        boolean carnetInvalido = true;
        
        while (carnetInvalido) {
            System.out.println("=======================================");
            System.out.println("Ingrese el codigo universitario: ");
            String carnet =  entrada.nextLine();
            
            Matcher matcher = patron.matcher(carnet);
            boolean vaidCarnet = matcher.matches();
            
            if(vaidCarnet){
                carnetInvalido = false;
                carnetUniversitario = carnet;
            }else{
                System.out.println("Formato de Carnet Universitario incorrecto. Vuelva a ingresar ");
            }            
        }
        System.out.println("=======================================");
        System.out.printf("El carnet ingresado %s es %b %n" , carnetUniversitario, !carnetInvalido);
    }
}
