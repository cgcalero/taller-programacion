/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogramacion;

/**
 *
 * @author Christiam Calero
 */
public class Reporte {
    
    public static void mostrarNotas(Alumno a){
        System.out.printf("%2d -%2d-%2d-%2d -> %.2f %n",
                a.getPc1(),
                a.getPc2(),
                a.getPc3(),
                a.getEf(),
                a.getPromedio());
        
    }    
    public static void mostrarNotas(int pc1, int pc2, int pc3){
        System.out.printf("%2d -%2d-%2d %n",
                pc1,
                pc2,
                pc3
                );
        
    }    
    public static void mostrarNotas(int pc1, int pc2){
        System.out.printf("%2d -%2d-%2d %n",
                pc1,
                pc2               
                );
        
    }    
}
