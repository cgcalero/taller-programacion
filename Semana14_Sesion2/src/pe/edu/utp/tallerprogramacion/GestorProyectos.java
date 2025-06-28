/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogramacion;

/**
 *
 * @author Christiam Calero
 */
public class GestorProyectos {
    
    private static final int MAXIMO_PROYECTOS = 10;
    private static Proyecto[] proyectos = new Proyecto[MAXIMO_PROYECTOS];
    private static int numeroProyecto = 0;
    
    void agregar(Proyecto proyecto){
        if(numeroProyecto < proyectos.length){
            proyectos[numeroProyecto++] = proyecto;
        }
    }
    
    void insertar(Proyecto proyecto, int posicion){
        if(posicion < numeroProyecto && numeroProyecto < proyectos.length){
            if(posicion == numeroProyecto - 1){
                proyectos[numeroProyecto++] = proyecto;
            }else{
                for (int i = numeroProyecto; i > posicion; i--) {
                    proyectos[i] = proyectos[i-1];
                }
                proyectos[posicion] = proyecto;
                numeroProyecto++;
            }
        }
    }
    
    static Proyecto buscar(int codigo){
        for (int i = 0; i < numeroProyecto; i++) {
            if(proyectos[i].getCodigo() == codigo){
                return proyectos[i];
            }
        }
        return null;
    }
    
    static Proyecto buscar(String nombre){
        for (int i = 0; i < numeroProyecto; i++) {
            if(proyectos[i].getNombre().equalsIgnoreCase(nombre)){
                return proyectos[i];
            }
        }
        return null;
    }
    
    public static void main(String[] args) {
        GestorProyectos gestorProyectos = new GestorProyectos();
        
        gestorProyectos.agregar(new Proyecto(23, "Consola juegos", 25800, 16));//0
        gestorProyectos.agregar(new Proyecto(19, "Redes Cableado", 38500, 16));//1
        gestorProyectos.insertar(new Proyecto(84, "Procesar Encuesta", 1900, 5), 1);
        
        Proyecto pCodigo = gestorProyectos.buscar(23);
        Proyecto pNombre = gestorProyectos.buscar("Procesar Encuesta");
        
        System.out.println(pCodigo);
        System.out.println(pNombre);
    }
}
