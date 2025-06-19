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
public class ValidarEmail {
    public static void main(String[] args) {
        String correo = "";
//        Pattern pattern =  Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        Pattern pattern =  Pattern.compile("^[No|no|NO|si|Si|sí|SÍ|Sí]+$");
        Matcher matcher = pattern.matcher(correo);
        
        boolean correoVal = matcher.matches();
        
        System.out.println(correoVal);
        
    }
}
