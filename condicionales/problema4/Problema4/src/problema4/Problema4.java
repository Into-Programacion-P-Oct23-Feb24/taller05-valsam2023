/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

import java.util.Locale;
import java.util.Scanner;

public class Problema4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int dias_cliente;
        double descuento = 0;
        double precio_diario;
        double subtotal;
        double total;
        double descuentoAplicado;
        
        System.out.println("Ingrese el numero de dias en la habitacion");
        dias_cliente = entrada.nextInt();
        
        System.out.println("Ingrese el precio diario de la habitacion");
        precio_diario = entrada.nextDouble();
                
        subtotal = dias_cliente * precio_diario;
        
        if (dias_cliente >= 5){
            descuento = 0.10;
        } else {
            if (dias_cliente >= 10){
            descuento = 0.15;
            } else {
                if (dias_cliente >= 15){
                descuento = 0.20;
                }
            }        
        }
        descuentoAplicado = subtotal * descuento;
        total = subtotal - descuentoAplicado;
        System.out.printf("El subtotal por pagar es de %.2f. El descuento aplicado "
                + "es de %.2fEl total a pagar es de %.2f%n", subtotal, descuentoAplicado, total);
        
    }
}
