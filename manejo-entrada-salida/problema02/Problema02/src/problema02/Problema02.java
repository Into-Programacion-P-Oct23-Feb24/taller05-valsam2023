/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

public class Problema02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double gastos_hijo1;
        double gastos_hijo2;
        double gastos_hijo3;
        double total_gastos;
        
        System.out.println("Ingrese los gatsos del hijo 1");
        gastos_hijo1 = entrada.nextDouble();
        
        System.out.println("Ingrese los gatsos del hijo 2");
        gastos_hijo2 = entrada.nextDouble();
        
        System.out.println("Ingrese los gatsos del hijo 3");
        gastos_hijo3 = entrada.nextDouble();
        
        total_gastos = gastos_hijo1 + gastos_hijo2 + gastos_hijo3;
        
        System.out.printf("El total de gastos de los hijos del padre de familia " 
                + total_gastos);
    }
    
}
