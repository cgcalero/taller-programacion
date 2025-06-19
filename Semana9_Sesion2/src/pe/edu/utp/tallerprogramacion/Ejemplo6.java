/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogramacion;

/**
 *
 * @author Christiam Calero
 */
public class Ejemplo6 {
    public static void main(String[] args) {
        String[] codigos = {"AAAAA","BBBBBB", "CCCCCCC", "DDDDDd"};
        String[] producto = {"Teclado", "Mouse", "Tarjeta Video", "Hub"};
        double[] precio = {12.3, 53.2, 500.3, 15.20};
        
        String separator = String.format("%44s"," ").replace(" ","-");
        
        System.out.printf("\n%1$s\nCatalogo de Productos\n%1$s\n", separator);
        
        for (int i = 0 ; i < codigos.length ; i++){
            System.out.printf("%-10s %-22s %9.2f\n", codigos[i], producto[i], precio[i]);

        }
        System.out.println(separator);
    }
    
}
