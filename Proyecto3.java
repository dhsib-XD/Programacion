/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.pkg3;

import java.util.Scanner;

/**
 *
 * @author CarlosXl
 */
public class Proyecto3 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double base, altura, perimetro, area;

        System.out.print("Introduce la base del rectangulo: ");
        base = scanner.nextDouble();

        System.out.print("Introduce la altura del rectangulo: ");
        altura = scanner.nextDouble();

        perimetro = 2 * (base + altura);
        area = base * altura;

        System.out.println("El perimetro del rectangulo es: " + perimetro);
        System.out.println("El area del rectangulo es: " + area);

        scanner.close();
    }
}
    

