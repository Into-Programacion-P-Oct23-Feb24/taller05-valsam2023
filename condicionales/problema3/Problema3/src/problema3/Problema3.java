/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;

public class Problema3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String marca;
        String origen;
        double costo;
        double impuesto;
        double precio_venta;
        
        System.out.println("Ingrese la marca de su vehiculo");
        marca = entrada.nextLine();
        
        System.out.println("Ingrese el origen de su vehiculo");
        origen = entrada.nextLine();
                
        System.out.println("Ingrese el costo de su vehiculo");
        costo = entrada.nextDouble();
        
        System.out.println("Ingrese el precio de venta");
        precio_venta = entrada.nextDouble();
        
        System.out.println("Ingrese el impuesto de acuerdo al origen");
        impuesto = entrada.nextDouble();
        
        precio_venta = precio_venta * impuesto;
    
        if (origen .equals("Alemania")){
            System.out.println(impuesto * 0.20);
        } else {
            if (origen .equals("Japon")){
            System.out.println(impuesto * 0.30);
            } else {
                if (origen .equals("Italia")){
                System.out.println(impuesto * 0.15);
                } else {
                    if (origen .equals("USA")){
                    System.out.println(impuesto * 0.08);
                  
        System.out.printf("Los datos del automovil son %s/n,%s/n,%.2f, el impuesto"
                + " a pagar es de%.2f/n y el precio de venta es%.2f", marca, origen, costo, impuesto, precio_venta);
                    
                    }
                }
        }
    }
    } 
}
