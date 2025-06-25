/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pe.edu.utp.tallerprogramacion;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import pe.edu.utp.tallerprogramacion.reporte.Body;
import pe.edu.utp.tallerprogramacion.reporte.DocumentoHtml;
import pe.edu.utp.tallerprogramacion.reporte.Head;
import pe.edu.utp.tallerprogramacion.reporte.Table;

/**
 *
 * @author Christiam Calero
 */
public class ReporteHtml {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            File archivo = new File("C:\\Users\\Christiam Calero\\Desktop\\UTP\\TALLER DE PROGRAMACIÓN\\Semana 13\\S13_Recursos_ZRAJWJ\\recursos\\productos.txt");
            Scanner lector = new Scanner(archivo);

            StringBuilder cuerpoTabla = new StringBuilder();
            while (lector.hasNext()) {
                String linea = lector.nextLine();//NNW25|26075-9.jpg|Laptop Dell Inspiron 15 3501 Intel Core i3-1005G1 4GB/1TB/15.6″/Ubuntu|1996.00|8
                String[] arrProd = linea.split("\\|");
                
                Producto p = new Producto(arrProd[0], 
                        arrProd[1], arrProd[2], Double.parseDouble(arrProd[3]), Integer.parseInt(arrProd[4]));
                
                cuerpoTabla.append(p);
            }

            Head head = new Head("Reporte HTML de productos", "productos.css");
            
            String[] cabeceraTabla = {"Código", "Descripción", "Precio", "Unidades", "Imagen"};
            Table table = new Table(cabeceraTabla, cuerpoTabla.toString());
            
            Body body = new Body("Catálogo de Productos", table);
            
            DocumentoHtml documentoHtml = new DocumentoHtml(head, body);
            
            System.out.println(documentoHtml);
            
            FileWriter escribirArchivo = new FileWriter("C:\\Users\\Christiam Calero\\Desktop\\UTP\\TALLER DE PROGRAMACIÓN\\Semana 13\\S13_Recursos_ZRAJWJ\\recursos\\reporteprueba.html");
            escribirArchivo.write(documentoHtml.toString());
            escribirArchivo.close();
            
        } catch (Exception e) {
        }
        
    }
    
    
    
}
