/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogramacion.objetos;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + Objects.hashCode(this.cantante);
        hash = 59 * hash + Objects.hashCode(this.genero);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.duracion) ^ (Double.doubleToLongBits(this.duracion) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cancion other = (Cancion) obj;
        if (Double.doubleToLongBits(this.duracion) != Double.doubleToLongBits(other.duracion)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.cantante, other.cantante)) {
            return false;
        }
        return Objects.equals(this.genero, other.genero);
    }

    
}
