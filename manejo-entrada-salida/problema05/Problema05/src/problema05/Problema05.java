/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

import java.util.Locale;
import java.util.Scanner;

public class Problema05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double valor_netflix;
        double valor_youtube;
        double valor_dropbox;
        double valor_spotify;
        double total_pagar;
        int edad;
        double descuento;
        
        System.out.println("Ingrese el valor de Netflix");
        valor_netflix = entrada.nextDouble();
        
        System.out.println("Ingrese el valor de Youtube Premium");
        valor_youtube = entrada.nextDouble();
        
        System.out.println("Ingrese el valor de Dropbox");
        valor_dropbox = entrada.nextDouble();
        
        System.out.println("Ingrese el valor de Spotify");
        valor_spotify = entrada.nextDouble();
        
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        
        total_pagar = valor_netflix + valor_youtube + valor_dropbox + valor_spotify;
        descuento = 0.20;
        
        if ( edad < 30){
            descuento = 0.20;
        } else {
            System.out.println(total_pagar);
        
        System.out.printf("El valor total a pagar es de: " + total_pagar);
        }
    }
    
}
