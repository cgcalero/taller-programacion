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
public class Ejemplo5 {

    public static void main(String[] args) {
        //F5U-597, AEF-717, W5A-879, FCE-309
        String placa = "F5U-597";
        
        Pattern patron = Pattern.compile("^[A-Z]([0-9A-Z])[A-Z]-\\d{3}");
        
        Matcher matcher =patron.matcher(placa);
        
        System.out.println("La placa es: " + matcher.matches());
        
    }
}
