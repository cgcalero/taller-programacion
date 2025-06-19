/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogramacion;

import java.util.Scanner;

/**
 *
 * @author Christiam Calero
 */
public class Practica1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tipoProgresion;
        double valorInicial;
        double razon;
        int nroTerminos;
        String progresion = "";

        String menu = """
                     ===================================
                     Elija el tipo de progresion:
                     1. Progresion Aritmetica
                     2. Progresion Geometrica
                     ===================================
                     """;
        System.out.println(menu);
        tipoProgresion = scanner.nextInt();

        System.out.println("Ingrese el valor inicial");
        valorInicial = scanner.nextDouble();

        System.out.println("Ingrese la razon");
        razon = scanner.nextDouble();

        System.out.println("Ingrese el numero de terminos a generar");
        nroTerminos = scanner.nextInt();

        for (int n = 1; n <= nroTerminos; n++) {
            double termino;
            switch (tipoProgresion) {
                case 1 ->
                    termino = valorInicial + (n - 1) * razon; //tn = t1 + (n-1)*r
                case 2 ->
                    termino = valorInicial * Math.pow(razon, (n - 1)); //tn = t1*r^(n-1)
                default -> {
                    System.out.println("Ingrese solo 1 (Progresion aritmentica) y 2 (Progresion Geometrica) ");
                    return;
                }
            }
            progresion = progresion + String.format("%.1f", termino);

            if (n < nroTerminos) {
                progresion = progresion + ", ";
            }
        }
        System.out.println("===== La progresion con esos datos es el siguiente:");
        System.out.println(progresion);
    }
}
