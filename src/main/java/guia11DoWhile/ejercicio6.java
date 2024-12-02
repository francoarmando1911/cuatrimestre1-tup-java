package guia11DoWhile;

import java.util.Scanner;

/*
Escriba un pseudocódigo que permita el ingreso de una serie de números y que a su
sumatoria le calcule cuantas cifras tiene y que muestre cada una de sus cifras por
separado. Establezca una opción para la finalización del ingreso de la serie.
8- Escriba un pseudocódigo que permita el ingreso de una frase y que cuente la cantidad
de palabras que el usuario que ingreso. Establezca una opción para finalizar el ingreso de
palabras.
*/
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int suma = 0;
        int numero;

        System.out.println("Ingrese números para sumar, o escriba 'fin' para terminar:");
        while (true) {
            String input = entrada.nextLine();
            if (input.equalsIgnoreCase("fin")) {
                break;
            }
            try {
                numero = Integer.parseInt(input);
                suma += numero;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida, por favor ingrese un número o 'fin'.");
                continue;
            }
        }

        String sumaStr = Integer.toString(suma);
        System.out.println("La suma es: " + suma);
        System.out.println("La suma tiene " + sumaStr.length() + " cifras.");
        System.out.println("Las cifras son:");
        for (char cifra : sumaStr.toCharArray()) {
            System.out.println(cifra);
        }

        entrada.nextLine(); // Limpiar el buffer del scanner
        System.out.println("\nIngrese una frase para contar las palabras, o escriba 'fin' para terminar:");
        int contadorPalabras = 0;

        while (true) {
            String frase = entrada.nextLine();
            if (frase.equalsIgnoreCase("fin")) {
                break;
            }

            String[] palabras = frase.trim().split("\\s+");
            contadorPalabras += palabras.length; // Sumar el número de palabras
        }

        System.out.println("Número total de palabras ingresadas: " + contadorPalabras);
        entrada.close();
    }
}
