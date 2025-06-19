/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogramacio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Christiam Calero
 */
public class Patrones {

    public static void main(String[] args) {//51234567

        /*Pattern patron = Pattern.compile("^[0-9]{10}$");
        
        Matcher comparaDNI = patron.matcher("0404932152");
        
        boolean dniValido = comparaDNI.matches();
        
        System.out.println("El DNI es: " + dniValido);*/
        
        
        
        Pattern patronNombre = Pattern.compile("[A-Z]\\w+");// Buscar palabras que inicien con Mayúscula

        Matcher evaluadorNombre = patronNombre.matcher("Juan llego a clase antes que Luis.");
        
        while (evaluadorNombre.find()) {// / mientras se encuentre alguna ocurrencia
            System.out.println(evaluadorNombre.group());// muestra la ocurrencia
            System.out.println(evaluadorNombre.start());// indica la posición de inicio
        }
    }
}
