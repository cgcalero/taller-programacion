package pe.edu.utp.tallerprogramacion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Christiam Calero
 */
public class ExpresionRegular {
    //F5U-597, AEF-717, W5A-879, FCE-309
    public static void main(String[] args) {
        Pattern patron = Pattern.compile("^[A-Z][A-Z0-9][A-Z]-\\d{3}$"); //Alt + 94
//        Pattern patron = Pattern.compile("^[A-Z][0-9A-Z][A-Z]-\\d{3}$"); //Alt + 94
        String placa ="W5A-8719";
        Matcher matcher = patron.matcher(placa);        
        boolean placaValido = matcher.matches();
        
        System.out.println("Placa "+placa+" Valido: " + placaValido);
    }
}
