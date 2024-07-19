/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hernandez_fernando_variablesejercicio.java;

import java.util.Scanner;

/**
 *
 * @author fdhg0
 */
public class Hernandez_Fernando_VariablesEjercicioJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Conseguir informacion del empleado
        Scanner lea=new Scanner(System.in);
        lea.useDelimiter("\n");
        System.out.println("Ingresar Nombre del Empleado: ");
        String nombreEmpleado= lea.next();
        System.out.println("Hora de Trabajo Mensual: ");
        int horaM =lea.nextInt();
        System.out.println("Tarifa por Hora: ");
        double Thora=lea.nextDouble();
        System.out.println("Ingrese Salario del Empleado Semanal: ");
     
        double Salaempleado =(horaM * Thora)/4;
        
        System.out.println("----Boleta Del Empleado----"+
                "\n Nombre del Empleado: "+nombreEmpleado+
                "\n Hora de trabajo Mensual: "+horaM+ 
                "\n Tarifa por Hora: "+Thora+
                "\n Salario del empleado semanal: "+Salaempleado+"");
        
        }
}
