/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hernandez_fernando_variablesejercicio.java;

import java.util.Scanner;
/**
 *
 * @author fdhg0
 */
public class Clics_Fernando_Hernandez {
    public static void main(String []args){
       Scanner lea=new Scanner(System.in); 
        System.out.println("Ingresa cantidad de clics: ");
        int Totalclics= lea.nextInt();
        System.out.println("Ingrese primera cantidad de clics: ");
        int Clics1= lea.nextInt();
        System.out.println("Ingrese costo de Clics 1: ");
        double ClicsPrecio1=lea.nextDouble();
        System.out.println("Ingrese Segunda Cantidad de clics: ");
        int Clics2= lea.nextInt();
        System.out.println("Ingrese costo de Clics 2: ");
        double ClicsPrecio2=lea.nextDouble();
        System.out.println("Ingrese tercera cantidad de Clics 3: ");
        int Clics3= lea.nextInt();
        System.out.println("Ingrese costo de Clics 3: ");
        double ClicsPrecio3=lea.nextDouble();
        
        double TOTAL1=(Clics1 * ClicsPrecio1);
        
        double TOTAL2=(Clics2 * ClicsPrecio2);
        
        double TOTAL3=(Clics3 * ClicsPrecio3);
                
        double ClicsTotales=(TOTAL1+TOTAL2+TOTAL3);
        double ISV= (ClicsTotales *0.16);
        
        System.out.println("----TOTAL----"+
                "\n Tu Total es de: "+ClicsTotales+"");
                
        
    }
}
