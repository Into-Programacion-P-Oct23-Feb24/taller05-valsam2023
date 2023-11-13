/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

public class Problema01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double base;
        double altura;
        double area_triangulo;
        
        System.out.println("Ingrese la base del triangulo");
        base = entrada.nextDouble();
        
        System.out.println("Ingrese la altura del triangulo");
        altura = entrada.nextDouble();
        
        area_triangulo = base * altura;
        
        System.out.printf("El area del triangulo es " + area_triangulo);
    }
    
}
