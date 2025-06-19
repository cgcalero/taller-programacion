package pe.edu.utp.tallerprogramacion;

/**
 *
 * @author Christiam Calero
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        int[] datos = {16, 25, 34, 11, 2, 8, 78, 6};

        int N = datos.length;

        int interval, aux;
        boolean band;
        interval = N + 1;

        while (interval > 1) {

            interval = interval / 2; //4, 2, 1
            System.out.println("interval: " + interval);
            band = true;

            while (band) {
                band = false;
                for (int i = 0; i + interval < N; i++) {
                    if (datos[i] > datos[i + interval]) {

                        aux = datos[i];
                        datos[i] = datos[i + interval];
                        datos[i + interval] = aux;
                        band = true;
                    }
                }
            }
        }

        for (int j = 0; j < N; j++) {
            System.out.println(datos[j]);
        }
    }
}
