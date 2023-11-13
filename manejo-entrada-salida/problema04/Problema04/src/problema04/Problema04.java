/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Locale;
import java.util.Scanner;

public class Problema04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double costo_CPU;
        double costo_teclado;
        double costo_pantalla;
        double costo_raton;
        double costos_computadora;
        
        System.out.println("Ingrese el costo del CPU");
        costo_CPU = entrada.nextDouble();
        
        System.out.println("Ingrese el costo del teclado");
        costo_teclado = entrada.nextDouble();
        
        System.out.println("Ingrese el costo de la pantalla");
        costo_pantalla = entrada.nextDouble();
        
        System.out.println("Ingrese el costo del raton");
        costo_raton = entrada.nextDouble();
        
        costos_computadora = costo_CPU + costo_teclado + costo_pantalla + costo_raton;
        
        System.out.printf("Los costos de una computadora de escritorio es: "
                + costos_computadora);
    }
    
}
