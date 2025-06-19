/*Escribir un
programa que
muestre los
números pares
menores a 20.
• Contar cuántos
números se
mostraron y
calcular la suma
de todos ellos.*/
package pe.edu.utp.tallerprogramacio;

/**
 *
 * @author Christiam Calero
 */
public class Ejemplo4 {
    public static void main(String[] args) {
          
        int i=0;
        int contador=1;
        int acumulador = 0;
        
        while (contador <= 20) { 
            
            if( contador%2 == 0){
                System.out.println(contador);
                i++;
                acumulador = acumulador + contador;
            }
            
            contador++;
        }
        
        System.out.println("La cantidad de numero pares entre 1 y 20 es: " + i);
        System.out.println("La suma de numero pares entre 1 y 20 es: " + acumulador);
    }
}
