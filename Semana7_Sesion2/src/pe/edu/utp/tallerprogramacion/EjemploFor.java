package pe.edu.utp.tallerprogramacion;

/**
 *
 * @author Christiam Calero
 */
public class EjemploFor {
    public static void main(String[] args) {
//        for (int i = 1, j=10; i < 10; i++, j--) {
//            System.out.printf("%d - %d = %d %n", i, j, i-j);
//        }
        
//        int suma = 0;        
//        for (int i = 0; i < 10; suma += i++);
//        System.out.println(suma);

        boolean seEncontroMultiplioDeCinco = false;
        int i = 1;
        
        for (; ;) {
            System.out.println("i->"+i);
            if (i % 5 == 0) {                
                break;
            }
            i++;
        }
        
        String cadena ="";
        
        String.format(cadena, args);
    }
    
}
