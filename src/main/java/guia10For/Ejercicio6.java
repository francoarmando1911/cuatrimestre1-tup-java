package guia10For;

//Cree un pseudocódigo que pida un número entero mayor que cero y que escriba sus divisores.

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contadorCategoria1 = 0;
        int contadorCategoria2 = 0;
        int contadorCategoria3 = 0;

        System.out.println("CATEGORIAS: 1- Muy malo, 2- Malo, 3- Bueno, 4- Muy bueno");
        System.out.println("Ingrese el número de la respuesta (0 para salir): ");

        while (true) {
            int categoria = scanner.nextInt();

            // Comprobamos si el usuario quiere salir
            if (categoria == 0) {
                break;
            }

            // Incrementar contadores basados en la categoria ingresada
            switch (categoria) {
                case 1:
                    contadorCategoria1++;
                    break;
                case 2:
                    contadorCategoria2++;
                    break;
                case 3:
                    contadorCategoria3++;
                    break;
                default:
                    System.out.println("Categoría no válida, por favor ingrese 1, 2, 3 o 0 para salir.");
                    break;
            }
        }

        // Salida de resultados
        System.out.println("Respuestas por categoría:");
        System.out.println("Categoría 1: " + contadorCategoria1);
        System.out.println("Categoría 2: " + contadorCategoria2);
        System.out.println("Categoría 3: " + contadorCategoria3);

        scanner.close();
    }
}
