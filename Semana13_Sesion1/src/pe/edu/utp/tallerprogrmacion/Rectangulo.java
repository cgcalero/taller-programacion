/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogrmacion;

/**
 *
 * @author Christiam Calero
 */
public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public void calcularArea(){
        System.out.println(base * altura);
    }
    
    public double sumaBaseAltura(double base, double altura){
        return base + altura;
    }
}
