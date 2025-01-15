package guia11DoWhile;
/*
Escriba un pseudocódigo que permita ingresar palabras y que nos informe cuantas
palabras ingreso y muestre cual de todas fue la más larga y cuantas letras tenía esa
palabra. Establezca una opción para finalizar el ingreso de palabras. No considere la
palabra que utiliza para finalizar para el conteo de palabras ni ningún otro requerimiento.
*/

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contadorPalabras = 0;
        String palabra = "";
        String palabraMasLarga = "";

        do {
            System.out.println("Ingrese una palabra o escriba FIN para finalizar: ");
            palabra = entrada.next();

            if(palabra.toLowerCase().equals("FIN")){
                contadorPalabras ++;
            }
            if(palabra.length() > palabraMasLarga.length()){
                palabraMasLarga.equals(palabra);
            }
        } while (palabra != "FIN");

        System.out.println("Cantidad de palabras ingresadas: " + contadorPalabras);
        System.out.println("La palabra mas larga es: " + palabraMasLarga);

        entrada.close();
    }
}
