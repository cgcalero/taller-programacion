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
        System.out.println("**** Uso de do - while ****");
        int i = 10;
        
        do {
            System.out.println("i: " + i);
            i--;
        } while (i>0);
       
        System.out.println("**** Uso de while ****");
        int j = 10;
        
        while(j>0) {
            System.out.println("j: " + j);
            j--;
        
        }
        System.out.println("**** Uso de for ****");
        for (int k = 10; k > 0; k--) {
            System.out.println("k: " + k);
        }
    }    
}
