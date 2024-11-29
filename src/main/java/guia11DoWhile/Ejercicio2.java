package guia11DoWhile;

import java.util.Scanner;

// Codificar un algoritmo para calcular la suma (entera) de números comprendido entre
//dos números enteros ingresados por el usuario.
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el primer numero entero: ");
        int numero1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero entero: ");
        int numero2 = entrada.nextInt();

        int inicio = Math.min(numero1, numero2);
        int fin = Math.max(numero1, numero2);

        for(int i = inicio; i <= fin; i++){
            int suma = 0;
            suma += i;
        }
    }
}
