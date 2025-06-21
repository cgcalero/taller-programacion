/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogramacion;

/**
 *
 * @author Christiam Calero
 */
public class Alumno {
    private String foto;
    private String nombre;
    private int edad;
    private int pc1, pc2, pc3, ef;

    public Alumno(String foto, String nombre, int edad) {
        this.foto = foto;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public Alumno(String foto, String nombre, int edad, int pc1, int pc2, int pc3, int ef) {
        this.foto = foto;
        this.nombre = nombre;
        this.edad = edad;
        this.pc1 = pc1;
        this.pc2 = pc2;
        this.pc3 = pc3;
        this.ef = ef;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPc1() {
        return pc1;
    }

    public void setPc1(int pc1) {
        this.pc1 = pc1;
    }

    public int getPc2() {
        return pc2;
    }

    public void setPc2(int pc2) {
        this.pc2 = pc2;
    }

    public int getPc3() {
        return pc3;
    }

    public void setPc3(int pc3) {
        this.pc3 = pc3;
    }

    public int getEf() {
        return ef;
    }

    public void setEf(int ef) {
        this.ef = ef;
    }
    
    public void asignarNotas(int[] notas){
        pc1 = notas[0];
        pc2 = notas[1];
        pc3 = notas[2];
        ef = notas[3];        
    }
    
    public static void calcularPromedio(int[] notas){       
    }

    public double getPromedio(){
        
        return (double) pc1 + pc2 + pc3 + ef/4;
    }
    
    
//    @Override
//    public String toString(){
//        return this.nombre;
//    }

    @Override
    public String toString() {
        return "Alumno{" + "foto=" + foto + ", nombre=" + nombre + ", edad=" + edad + ", pc1=" + pc1 + ", pc2=" + pc2 + ", pc3=" + pc3 + ", ef=" + ef + '}';
    }
    
    
}
