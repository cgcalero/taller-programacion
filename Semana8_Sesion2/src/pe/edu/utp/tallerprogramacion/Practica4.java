/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogramacion;

import java.util.Scanner;

/**
 *
 * @author Christiam Calero
 */
public class Practica4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int votosCeleste=0, votosMorado=0, votosTurquesa=0, totalVotos = 4;
        
        for (int i = 0; i < totalVotos; i++) {
            System.out.print("Elector " + (i+1) + " elija su voto: (celeste, morado, turquesa):  ");            
            String colorElegido= scanner.nextLine().toLowerCase();
            
            switch (colorElegido) {
                case "celeste"-> votosCeleste++;
                case "morado"-> votosMorado++;
                case "turquesa"-> votosTurquesa++;                    
                default->{ System.out.println("voto ingresado no es valido"); i--;}
            }
        }
        
        double porcVotoCeleste = (double)votosCeleste/totalVotos*100;
        double porcVotoMorado = (double)votosMorado/totalVotos*100;
        double porcVotoTurquesa = (double)votosTurquesa/totalVotos*100;
        
        String colorGanador;
        if(votosCeleste>votosMorado && votosCeleste>votosTurquesa){
            colorGanador = "celeste";
        }else if(votosMorado>votosCeleste && votosMorado>votosTurquesa){
            colorGanador = "morado";
        }else if(votosTurquesa>votosCeleste && votosTurquesa>votosMorado){
            colorGanador="turquesa";
        }else{
            colorGanador = "Existe un empate";
        }
        String reporte = String.format("""
                                       ============================
                                       Resultados de la votacion
                                       ============================
                                       Celeste: %d votos (%.2f %%)
                                       Morado:  %d votos (%.2f %%)
                                       Turquesa: %d votos (%.2f %%)
                                       ============================
                                       El color ganador es %s
                                       """, 
                votosCeleste, porcVotoCeleste,
                votosMorado, porcVotoMorado,
                votosTurquesa, porcVotoTurquesa, colorGanador);
        
        System.out.println(reporte);
    }
    
}
