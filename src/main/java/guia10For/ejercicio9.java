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
        int contadorVocales = 0;

        for(int i = 0; i < palabra.length(); i++){
            char letra = palabra.charAt(i);
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                contadorVocales++;
            }
        }

        System.out.println("La palabra tiene: " + contadorVocales + " vocales.");
        entrada.close();
    }
}
