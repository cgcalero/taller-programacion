/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pe.edu.utp.tallerprogramacion;

/**
 *
 * @author Christiam Calero
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Box myBox = new Box();
        
        System.out.printf("Volume = %9.2f \n",myBox.width * myBox.height * myBox.depth);
        
        Box box = new Box(15, 5, 20);
        System.out.printf("Volume = %9.2f \n",box.width * box.height * box.depth);
        
        Departamento d = new Departamento("Contabilidad", "Pedro Torres", 100);
        Departamento d1 = new Departamento("Tesoreria");
        Departamento d2 = new Departamento("Contabilidad", "Pedro Torres");
    }
    
}
