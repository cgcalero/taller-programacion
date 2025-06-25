/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.tallerprogramacion.reporte;

/**
 *
 * @author Christiam Calero
 */
public class Head {
    private String title;
    private String stylesheet;

    public Head(String title, String stylesheet) {
        this.title = title;
        this.stylesheet = stylesheet;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStylesheet() {
        return stylesheet;
    }

    public void setStylesheet(String stylesheet) {
        this.stylesheet = stylesheet;
    }
    
    @Override
    public String toString() {
        String header = """
               <header>
               <title>%s</title>
               <link rel="stylesheet" href="%s">
               </header>
               """;
        return String.format(header, title, stylesheet);
    }        
}