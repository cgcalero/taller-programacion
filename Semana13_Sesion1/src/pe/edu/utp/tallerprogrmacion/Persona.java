/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogrmacion;

/**
 *
 * @author Christiam Calero
 */
public class Persona {
    private String nombre;
    
    public void comer(String[] nombre){
        
        for (int i = 0; i < nombre.length; i++) {
            System.out.println(nombre[i]);
        }
        
    }
}
