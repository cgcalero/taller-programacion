/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogramacion;

/**
 *
 * @author Christiam Calero
 */
public class PruebaAlumno {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("ana.jpg", "Ana Patricia", 18, 15, 16, 17, 18);
        Alumno alumno2 = new Alumno("juan.png", "Juan Carlos", 20, 19, 18, 19, 20);
        
        
        String html ="""
                     <tr>
                     			<td>
                     			<figure class="image is-64x64">
                     			  <img class="is-rounded" src="%s">
                     			</figure>
                     			</td>
                     			<td valign="center">%s</td>
                     			<td>%d</td>
                     			<td>%d</td>
                     			<td>%d</td>
                     			<td>%d</td>
                     			<td>%d</td>                     			
                     		</tr>
                     """;
        
//        double promedio =(double)(alumno1.getPractica1()+ 
//                alumno1.getPractica2()+ alumno1.getPractica3()+alumno1.getExamenfinal())/4;
        
        System.out.printf(html,alumno1.getFoto(), alumno1.getNombres(), alumno1.getPractica1(), 
                alumno1.getPractica2(), alumno1.getPractica3(),alumno1.getExamenfinal(), 18);
        System.out.printf(html,alumno2.getFoto(), alumno2.getNombres(), alumno2.getPractica1(), 
                alumno2.getPractica2(), alumno2.getPractica3(),alumno2.getExamenfinal(), 18);
    }
}
