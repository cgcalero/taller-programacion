package pe.edu.utp.tallerprogramacion;

/**
 *
 * @author Christiam Calero
 */
public class OrdenamientoShell {
    public static void main(String[] args) {
        int[] datos = {16, 25, 34, 11, 2, 8, 78, 6};
        
        int N, INT, aux;
        boolean band;
        N = datos.length;
        INT = N + 1;
        
        while (INT > 1) {
            INT = INT / 2;
            band = true;
            
            while (band) {                
                band = false;
                for (int i = 0; i + INT < N; i++) {
                    //Parte donde se intercambian los datos
                    if(datos[i] > datos[i + INT]){
                        aux = datos[i];
                        datos[i]  = datos[i + INT];
                        datos[i + INT] = aux;
                        
                        band = true;
                    }
                }
            }
        }
        
        for (int dato : datos) {
            System.out.println(dato);
        }
    }
   
}
