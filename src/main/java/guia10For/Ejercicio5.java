package guia10For;

/*Escriba un programa que pida un número entero mayor que cero y calcule su factorial. */

import java.util.Scanner;

public class Ejercicio5 {
    public static String factorial(int numero) {
        if (numero < 0) {
            return "El factorial no está definido.";
        }

        long resultado = 1; // Usamos long para manejar números grandes
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return String.valueOf(resultado);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero mayor que 0: ");
        int numero = scanner.nextInt();

        String resultado = factorial(numero);
        System.out.println("El factorial de " + numero + " es " + resultado);
    }

}
