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
public class Practica3 {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("^(?!([a-z])\\1).{2}=\\d{1}+$");//ab=9
        boolean valPatron;
        char a;
        char b;
        int cantidadDig;
        do {
            String cadena = "km=8";
            Matcher matcher = pattern.matcher(cadena);
            valPatron = matcher.matches();

            if (valPatron) {
                a = cadena.charAt(0);
                b = cadena.charAt(1);
                cantidadDig = Integer.parseInt(cadena.substring(3));
                int fila = 1;
                do {
                    int j = 1;
                    String cadenaFila = "";
                    do {
                        if(j%2 == 0){
                            cadenaFila+=Character.toString(b);
                        }else{
                            cadenaFila+=Character.toString(a);
                        }                        
                        j++;
                    } while (j<=fila);
                        System.out.println(cadenaFila);
                    fila++;
                } while (fila <= cantidadDig);
            }
        } while (!valPatron);
    }

}
