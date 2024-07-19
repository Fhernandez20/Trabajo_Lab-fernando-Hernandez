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
public class Cuotas_lab_Fernando_Hernandez {
     public static void main(String []args){
       Scanner lea=new Scanner(System.in);
         System.out.println("Ingrese cantidad de prestamo: ");
         double prestaCliente= lea.nextDouble();
         System.out.println("Ingrese cantidad de meses: ");
         int mesesPrestamos= lea.nextInt();
         System.out.println("Ingrese tasa de interes: ");
         double tasaInte= lea.nextDouble()/100;
         System.out.println("Ingrese la comision por cuota: ");
         double ComiCuota= lea.nextDouble()/100;
         System.out.println("Ingrese el seguro mensual a la cuota: ");
         double SegurMcuota= lea.nextDouble()/100;
         
         double Cuotamen= (prestaCliente/mesesPrestamos);
         double InteresMen= (Cuotamen * tasaInte);
         double Comision= (Cuotamen * ComiCuota);
         double Seguro=(Cuotamen * SegurMcuota);
         
         double TotalCuota=(Cuotamen +(InteresMen+Comision+Seguro));
         
         System.out.println("----CUOTAS MENSUALES----"+
                "\n Cuota de Pago Mensual: HNL "+Cuotamen+
                "\n Total a Pagar: HNL "+TotalCuota+"");
         }
}
