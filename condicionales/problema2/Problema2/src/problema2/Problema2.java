/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;

public class Problema2 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double costo_articulo;
        int cantidad;
        double precio_unitario;
        String descripcion;
        
        System.out.println("Ingrese el costo del articulo");
        costo_articulo = entrada.nextDouble();
        entrada.nextLine();
        
        System.out.println("Ingrese la descripcion del articulo pedido");
        descripcion = entrada.nextLine();
                
        System.out.println("Ingrese la cantidad requerida");
        cantidad = entrada.nextInt();
        
        System.out.println("Ingrese el precio unitario");
        precio_unitario = entrada.nextDouble();
        
        costo_articulo = cantidad * precio_unitario;
        
        if (cantidad > 50){
            System.out.println(costo_articulo * 0.15);
        } else {
            System.out.println(costo_articulo);
        }
        
    }
    
}
