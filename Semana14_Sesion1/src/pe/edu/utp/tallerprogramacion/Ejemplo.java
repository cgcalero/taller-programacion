/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogramacion;

/**
 *
 * @author Christiam Calero
 */
public class Ejemplo {
    static class Persona{
        String nombre;    
    }
    
    static void modificar(Persona p){
        p = new Persona();
        p.nombre = "Juan";
    }
    
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Pedro";
        System.out.println(persona.nombre);
        
        modificar(persona); //Argumento es un objeto, esta copia es la referencia al mismo objeto en memoria
        System.out.println(persona.nombre);
        
        modificar(persona.nombre);
        System.out.println(persona.nombre);
    }
    
    public static void modificar(String nombre){
        nombre = "Luis";
        nombre.toUpperCase();
    }
}
