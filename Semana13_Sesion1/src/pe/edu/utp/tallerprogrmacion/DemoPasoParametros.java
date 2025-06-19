/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogrmacion;

import java.util.Arrays;

/**
 *
 * @author Christiam Calero
 */
public class DemoPasoParametros {
    public void cambiarValores(int unidades, double[] precios){
        unidades += 10;
        precios[2]*=1.25;
                
        System.out.println("Dentro del metodo");
        System.out.printf("unidades: %d, precios %s\n", unidades, Arrays.toString(precios));
    }
}
