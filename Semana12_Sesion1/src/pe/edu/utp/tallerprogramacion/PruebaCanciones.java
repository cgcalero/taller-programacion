package pe.edu.utp.tallerprogramacion;

import pe.edu.utp.tallerprogramacion.objetos.Cancion;

/**
 *
 * @author Christiam Calero
 */
public class PruebaCanciones {
    public static void main(String[] args) {
        Cancion cancion = new Cancion();
        cancion.setCantante("Jon Bon Jovi");
        cancion.setNombre("Always");
        cancion.setGenero("Rock");
        cancion.setDuracion(6.05);
        
        Cancion cancion1 = new Cancion();
        cancion1.setCantante("Jon Bon Jovi");
        cancion1.setNombre("Always");
        cancion1.setGenero("Rock");
        cancion1.setDuracion(6.05);
        
        if(cancion.equals(cancion1)){
            System.out.println("Ambos Objetos son iguales");
        }else{
            System.out.println("Objetos distintos");
        }
    }
}
