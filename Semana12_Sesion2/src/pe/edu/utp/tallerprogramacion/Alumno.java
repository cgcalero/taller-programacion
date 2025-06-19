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
    private String nombres;
    
    private int edad;
    private int practica1;
    private int practica2;
    private int practica3;
    private int examenfinal;

    public Alumno(String foto, String nombres, int edad, int practica1, int practica2, int practica3, int examenfinal) {
        this.foto = foto;
        this.nombres = nombres;
        this.edad = edad;
        this.practica1 = practica1;
        this.practica2 = practica2;
        this.practica3 = practica3;
        this.examenfinal = examenfinal;
    }

    
    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPractica1() {
        return practica1;
    }

    public void setPractica1(int practica1) {
        this.practica1 = practica1;
    }

    public int getPractica2() {
        return practica2;
    }

    public void setPractica2(int practica2) {
        this.practica2 = practica2;
    }

    public int getPractica3() {
        return practica3;
    }

    public void setPractica3(int practica3) {
        this.practica3 = practica3;
    }

    public int getExamenfinal() {
        return examenfinal;
    }

    public void setExamenfinal(int examenfinal) {
        this.examenfinal = examenfinal;
    }
    
    
    
}
