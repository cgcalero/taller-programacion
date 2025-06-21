/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogrmacion;

import java.util.Scanner;

/**
 *
 * @author Christiam Calero
 */
public class Programa {
    public static void main(String[] args) {
        
        Object o;
        int[] datos = {12, 16, 22, 5, 48, 31};
        
        OperadorArreglos arreglos = new OperadorArreglos(datos);
        
        arreglos.imprimirArreglo();
        
        Scanner intro = new Scanner(System.in);
        System.out.print("Ingrese el elemento a eliminar: ");
        int valorEliminar = intro.nextInt();        
        
        arreglos.eliminarValor(valorEliminar);
        
        OperadorArreglos.imprimirArreglo(datos);
        
        
//        arreglos.calcularPromedio();
//        
//        int[] datosOrdenado = arreglos.obtenerArregloOrder();
//        
//        for (int i : datosOrdenado) {
//            System.out.println(i);
//        }
//        
//        int max = arreglos.obtenerMaximo();
//        System.out.println("El maximo dato del arreglo es: " + max);        
//        System.out.println(arreglos.obtenerMaximo());
//        
//        
//        int x = 10;
//        
//        if(x ==10){
//            int y = 10 + 10;
//        }
//
//        
//        Rectangulo rectangulo = new Rectangulo(10, 5);        
//        rectangulo.calcularArea();
//        
//        double suma = rectangulo.sumaBaseAltura(100, 50);
//        System.out.println(suma);
//        
//        Persona p = new Persona();
//        
//        String[] nombres = {"Carlos", "Luis", "Sofia"};
//        p.comer(nombres);
//        
//        
//        Calculadora calculadora = new Calculadora();
//        
//        calculadora.sumar(23, 20);
//        calculadora.restar(23, 20);
//        
//        int operador = calculadora.producto(23, 20);
//        System.out.println(operador);
//
//        DemoPasoParametros demoPasoParametros = new DemoPasoParametros();
//        int unidades = 125;
//        double[] precios = {10.45, 15, 56, 23, 2.5};
//        
//        System.out.println("Antes del metodo");
//        System.out.printf("unidades: %d, precios %s\n", unidades, Arrays.toString(precios));
//        
//        demoPasoParametros.cambiarValores(unidades, precios);
//        
//        System.out.println("Despues del metodo");
//        System.out.printf("unidades: %d, precios %s\n", unidades, Arrays.toString(precios));
    }
}
