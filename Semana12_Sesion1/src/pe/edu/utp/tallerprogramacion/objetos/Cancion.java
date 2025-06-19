/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogramacion.objetos;

/**
 *
 * @author Christiam Calero
 */
public class Cancion {
    private String nombre;
    private String cantante;
    private String genero;
    private double duracion;

    public Cancion() {        
    }
    
    public String getNombre() { //obtenemos
        return nombre;
    }

    public void setNombre(String nombre) {//asignamos
        this.nombre = nombre;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }        
}
