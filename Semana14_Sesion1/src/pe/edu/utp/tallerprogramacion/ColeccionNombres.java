/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogramacion;

/**
 *
 * @author Christiam Calero
 */
public class ColeccionNombres {
    private static final int FACTOR_CRECIMIENTO = 5; //CONSTANTE
    private static String[] nombres = new String[FACTOR_CRECIMIENTO];
    private static int contadorNombres = 0;
    
    public static void agregar(String nuevoNombre){
        if(contadorNombres == nombres.length){
            String[] listaAuxiliar = new String[nombres.length + FACTOR_CRECIMIENTO];
            System.arraycopy(nombres, 0, listaAuxiliar, 0, nombres.length);
            
            nombres = listaAuxiliar;
        }
        
        nombres[contadorNombres++] = nuevoNombre;
    }
    
    public static void agregar(String[] listadoNombres){
        String[] listaAux = new String[contadorNombres + listadoNombres.length];
        
        System.arraycopy(nombres, 0, listaAux, 0, nombres.length);
        System.arraycopy(listadoNombres, 0, listaAux, contadorNombres, listadoNombres.length);
        
        contadorNombres += listadoNombres.length;
        nombres = listaAux;
        
    }
    
    public static void mostrarNombres(){
        for (int i = 0; i < contadorNombres; i++) {
            System.out.print(nombres[i] + ", ");
        }
        System.out.println("");
    }
    
    public static void eliminar(String nombreBuscado, boolean ignorarMayusculaMinusculas, boolean eliminarTodasOcurrencias){
        for (int i = 0; i < contadorNombres; i++) {
            if(nombres[i].equals(nombreBuscado) ||
                    (nombres[i].equalsIgnoreCase(nombreBuscado) && ignorarMayusculaMinusculas)){
                for (int j = i; j < nombres.length - 1; j++) {
                    nombres[j] = nombres[j+1];
                }
                contadorNombres--;
                
                if(!eliminarTodasOcurrencias) return;
            }                        
        }
    }
    
    public static void main(String[] args) {
        agregar("Felipe");
        agregar("mario");
        agregar("jorge");
        agregar("Rosa");
        agregar(new String[]{"Miriam", "Mario", "Jorge"});
        agregar("mario");
        
        mostrarNombres();
        eliminar("mario", true, true);
        
        mostrarNombres();
//        agregar("Maria");
//        agregar("Luis");
//        agregar("Antonella");
    }
}
