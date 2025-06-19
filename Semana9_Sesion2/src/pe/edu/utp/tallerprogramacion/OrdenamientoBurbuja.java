package pe.edu.utp.tallerprogramacion;

public class OrdenamientoBurbuja {

    public static void main(String[] args) {
        int[] notas = {18, 16, 11, 58, 13, 15, 5, 23};
        boolean noCambios;
        
        do{
            noCambios = false;
            
            for (int i = 0; i < notas.length - 1; i++) {
                if (notas[i] > notas[i + 1]) {
                    int aux = notas[i];
                    notas[i] = notas[i + 1];
                    notas[i + 1] = aux;
                    noCambios = true;
                }
            }
        }while (noCambios);
        
        for (int nota : notas) {
            System.out.println(nota);
        }
    }
}
