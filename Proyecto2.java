/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto2;

import java.util.Scanner;

/**
 *
 * @author CarlosXl
 */
public class Proyecto2 {
    public static void main(String[] args) {
        
        try ( Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese la calificacion del primer parcial: ");
            double parcial1 = scanner.nextDouble();
            
            System.out.print("Ingrese la calificacion del segundo parcial: ");
            double parcial2 = scanner.nextDouble();
            
            System.out.print("Ingrese la calificacion del tercer parcial: ");
            double parcial3 = scanner.nextDouble();
            
            double promedioParciales = (parcial1 + parcial2 + parcial3) / 3;
            System.out.print("Ingrese la calificacion del examen final: ");
            double examenFinal = scanner.nextDouble();
            
            
            System.out.print("Ingrese la calificacion del trabajo final: ");
            double trabajoFinal = scanner.nextDouble();
            
            double calificacionFinal = (promedioParciales * 0.55) + (examenFinal * 0.30) + (trabajoFinal * 0.15);
            System.out.println("La calificación final es: " + calificacionFinal);
   
        }
    }
}


 
    

