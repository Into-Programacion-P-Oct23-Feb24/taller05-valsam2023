/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

public class Problema03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double costo_minutos;
        double numero_minutos;
        double valor_planilla_telefono;
        
        System.out.println("Ingrese el costo por minutos consumidos en el mes");
        costo_minutos = entrada.nextDouble();
        
        System.out.println("Ingrese el numero de minutos consumidos en el mes");
        numero_minutos = entrada.nextDouble();
        
        valor_planilla_telefono = costo_minutos * numero_minutos;
        
        System.out.printf("El valor de la planilla de teléfono es: "
        + valor_planilla_telefono);
    }
    
}
