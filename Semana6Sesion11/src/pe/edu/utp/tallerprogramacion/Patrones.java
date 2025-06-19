/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogramacion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Christiam Calero
 */
public class Patrones {
    public static void main(String[] args) {
//        Pattern patron = Pattern.compile("^[A-Z0-9]*$"); //Alt + 94
//        
//        Matcher matcher = patron.matcher("CALE1212WEAA");        
//        boolean apellidoValido = matcher.matches();
//        
//        System.out.println("Apellido Valido: " + apellidoValido);
        
        Pattern p = Pattern.compile("[A-Z]\\w+");
        Matcher evaluadorNombre =  p.matcher("Chistiam calero Solano upeu Luis");         
        
        while (evaluadorNombre.find()) {
            System.out.println(evaluadorNombre.group());
            System.out.println(evaluadorNombre.start());
        }
        
        Pattern p2 =Pattern.compile("\\d+");
        Matcher evaluarNumeros = p2.matcher("Tengo 43 años y mi esposa 39");
        
        while (evaluarNumeros.find()) {
            System.out.println(evaluarNumeros.group());
        }
    }
    
}
