/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogramacion.reporte;

/**
 *
 * @author Christiam Calero
 */
public class Table {
    
    private String[] cabecera;
    private String cuerpo;

    public Table(String[] cabecera, String cuerpo) {
        this.cabecera = cabecera;
        this.cuerpo = cuerpo;
    }

    public String[] getCabecera() {
        return cabecera;
    }

    public void setCabecera(String[] cabecera) {
        this.cabecera = cabecera;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<table><tr>");
        for (String cab : cabecera) {
            sb.append("<th>").append(cab).append("</th>");
        }
        sb.append("</tr>");
        sb.append(cuerpo);
        sb.append("</table>");
        
        return sb.toString();
    }    
}
