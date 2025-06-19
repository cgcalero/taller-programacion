/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogramacion;

/**
 *
 * @author Christiam Calero
 */
public class Departamento {
    private String nombre;
    private String gerente;
    private int numeroEmpleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
    }
    
    public Departamento(String nombre, String gerente) {
        this.nombre = nombre;
        this.gerente = gerente;
    }

    public Departamento(String nombre, String gerente, int numeroEmpleados) {
        this.nombre = nombre;
        this.gerente = gerente;
        this.numeroEmpleados = numeroEmpleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }
        
    
}
