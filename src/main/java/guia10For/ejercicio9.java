package guia10For;

/*
Crea un pseudocódigo que reciba una palabra ingresada por el usuario y cuente cuántas vocales
contiene. Considere que la palabra se ingresa en minúsculas completamente.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese una palabra en minuscula: ");
        String palabra = entrada.next();
        int contadorVocales;

        for(int i = 0; i < palabra.length(); i++){
            String letra = palabra[i];
            if(letra == 'a' or letra == 'e' or letra == "i" or letra == "o" or letra == "u"){
                contadorVocales++;
            }
        }

        System.out.println("La palabra tiene: " + contadorVocales + " vocales.");
    }
}
