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
public class Practica1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        String nombre ="";
        String apellido="";
        double sueldo =0;
        boolean validaOpcion1 = false, validaOpcio2 = false;
        String tipoEmpleado="";
        String menu = """
                      ###################################
                      # MENU DE OPCIONES                #
                      ###################################
                      # 1. Ingresar Empleado            #
                      # 2. Ingresar Salario Mensual     #
                      # 3. Emitir Boleta                #
                      # 4. Salir                        #
                      ###################################
                      """;
        do {            
            System.out.println(menu);
            opcion = scanner.nextInt();
            
            if(opcion == 1){
                System.out.println("Ingrese el nombre del empleado:");
                nombre = scanner.next();
                System.out.println("Ingrese el apellido del empleado:");
                apellido = scanner.next();
                
                System.out.println("Ingrese el tipo empleado N|C:");
                tipoEmpleado = scanner.next();
                
                validaOpcion1 = true;
            }else if(opcion ==2){
                System.out.println("Ingrese el sueldo mensual del empleado"); 
                sueldo = scanner.nextDouble();
                validaOpcio2 = true;
            }else if(opcion ==3){
                String tipContrato="";                
                if(validaOpcion1 && validaOpcio2){
                    
                    if(tipoEmpleado.equals("C")){
                        tipContrato = "[X] Contratado";
                    }else{
                        tipContrato = "[X] Nombrado";
                    }
                    String reporte = """
                      #######################################
                      # REPORTE DE BOLETA DE PAGOS          #
                      #######################################
                      # Nombre del Empleado: %-10s             #
                      # Apellido del Empleado: %-10s           #
                      # Tipo: %s                    #
                      # Salario Ener: %.2f                  #
                      #######################################                                                                          
                      """;
                    System.out.printf(reporte,nombre,apellido,tipContrato, sueldo);
                    break;
                }else{
                    System.out.println("No realizo los pasos 1 y 2");
                }
            }                                    
        } while (opcion != 4);
    }
}
