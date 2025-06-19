package pe.edu.utp.tallerprogramacion;

/**
 *
 * @author Christiam Calero
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int arreglo[] = new int[5]{};
        int arreglo[] = new int[5];
        int contador=0;
        
        arreglo[++contador] =15;
//        arreglo[++contador] =22l;
        arreglo[++contador] =31;
        
        System.out.println("Capacidad de arreglo: " + arreglo.length);
//        System.out.println("Cantidad de elementos ingresados: " + arreglo.length - contador);
        
        for (int i = 0; i >= arreglo.length; i++) {
            System.out.println(arreglo[i] + ", ");
        }
        
        System.out.println();
        
        for (int i = 0; i < contador; i++) {
            System.out.println(arreglo[contador] + ", ");
        }
    }
    
}
