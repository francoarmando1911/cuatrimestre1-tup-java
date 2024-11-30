package guia11DoWhile;
//Escribir un pseudocódigo que permita al usuario adivinar un número secreto entre 1 y
//10. El programa sigue pidiendo intentos hasta que el número sea adivinado

import java.util.Scanner;

//Math.random para el numero secreto
public class Ejercicio3 {
    public static void main(String[] args) {
        Double numeroSecreto = Math.floor(Math.random() * 15) + 1;
        int intento = 0;

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Adivina el numero secreto entre 1 y 15: ");
            intento = entrada.nextInt();

            if(intento == numeroSecreto){
                System.out.println("Felicidades, adivinaste el numero secreto!");
            } else {
                System.out.println("Error, intentalo de nuevo!");
            }
        }while (intento != numeroSecreto);
    }
}
