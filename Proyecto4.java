/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto4;

import java.util.Scanner;

/**
 *
 * @author CarlosXl
 */
public class Proyecto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( // Crear un objeto Scanner para recibir la entrada del usuario
                Scanner scanner = new Scanner(System.in)) {
            // Solicitar el numero de partidos ganados, empatados y perdidos
            System.out.print("Ingrese el numero de partidos ganados: ");
            int ganados = scanner.nextInt();
            System.out.print("Ingrese el numero de partidos empatados: ");
            int empatados = scanner.nextInt();
            System.out.print("Ingrese el numero de partidos perdidos: ");
            int perdidos = scanner.nextInt();
            // Calcular el puntaje total
            int puntajeTotal = (ganados * 3) + (empatados * 1) + (perdidos * 0);
            // Mostrar el puntaje total
            System.out.println("El puntaje total del equipo es: " + puntajeTotal);
            // Cerrar el scanner
        }
    }
}
        // TODO code application logic here
    
    

