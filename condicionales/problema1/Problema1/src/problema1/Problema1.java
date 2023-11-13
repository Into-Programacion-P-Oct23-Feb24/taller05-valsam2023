/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

public class Problema1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double costo_luz;
        double numero_kilo;
        int edad;
        double valor_cancelar;
        double descuento;
        
        System.out.println("Ingrese el valor de costo por kilovatio/hora de luz"
                + "consumidos en el mes");
        costo_luz = entrada.nextDouble();
        
        System.out.println("Ingrese el numero de kilovatios consumidos en el mes");
        numero_kilo = entrada.nextDouble();
        
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        
        valor_cancelar = costo_luz * numero_kilo;
        descuento = costo_luz * numero_kilo * 0.10; 
        
        if (edad > 65){
            System.out.println(descuento);
        } else {
            System.out.println(valor_cancelar);
        }
    }
    
}
