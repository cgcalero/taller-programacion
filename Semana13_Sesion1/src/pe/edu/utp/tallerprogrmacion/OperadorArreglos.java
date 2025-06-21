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
public class OperadorArreglos {
    
    private int[] datos;    
    
    
    public OperadorArreglos(int[] datos) {        
        this.datos = datos;
    }
    
    //Metodo de tipo procedimiento void
    public void calcularPromedio(){
        double suma = 0;
        
        for (int dato : datos) {
            suma += dato;
        }
        
        System.out.printf("El promedio de los datos es %.2f \n", (double)suma/datos.length);
    }
    
    //Metodo de tipo funcion return
    public int[] obtenerArregloOrder(){
        Arrays.sort(datos);
        return datos;
    }
    
    public int obtenerMaximo(){
        
        int maximo = datos[0];
        
        for (int i = 0; i < datos.length; i++) {
            if(datos[i] > maximo){
                maximo = datos[i];
            }
        }
        
        return maximo;
    }
    
    public void eliminarValor(int valor){
    
        int indValor = -1;
        
        for (int i = 0; i < datos.length; i++) {
            if(datos[i] == valor){
                indValor = i;
            }
        }
        
        if(indValor != -1){
            
            for (int i = indValor; i < datos.length; i++) {                
                if(i < datos.length - 1){
                   datos[i] = datos[i+1]; 
                }else{
                    datos[i] = 0;
                }
                
            }
            
        }else{
            System.out.printf("El elemento ingresado %d no se encuentra en el arreglo", valor);
        }
    }

    void imprimirArreglo() {
        for (int dato : datos) {
            System.out.printf("%d ", dato);
        }
        System.out.println("");
    }
    
    static void imprimirArreglo(int[] arreglo){
        for (int dato : arreglo) {
            System.out.printf("%d ", dato);
        }
        System.out.println("");
    }
}
