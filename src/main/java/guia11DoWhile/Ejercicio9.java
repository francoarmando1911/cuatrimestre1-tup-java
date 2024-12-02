package guia11DoWhile;

import java.util.Locale;
import java.util.Scanner;

/*
Escriba un pseudocódigo que permita al usuario ingresar un conjunto de palabras. Para cada palabra ingresada, el
programa debe informar cuántas letras vocales contiene. Al final, también debe mostrar el número total de palabras ingresadas.
Considere que las palabras pueden contener letras en mayúsculas y minúsculas. Si necesita usar estructuras cíclicas, utilice
únicamente el ciclo Repetir...Hasta.

--- APUNTES ---

- Inicializar las variables:
  - contadorPalabras = 0 (para llevar la cuenta de las palabras ingresadas).
  - contadorVocales = 0 (para contar las vocales de cada palabra).

- Utilizar un bucle `do-while` para pedir palabras al usuario hasta que ingrese la palabra "FIN".
  - Dentro del bucle:
    - Incrementar `contadorPalabras` por cada palabra ingresada, excepto "FIN".
    - Convertir la palabra ingresada a minúsculas utilizando `.toLowerCase()` para facilitar la búsqueda de vocales.
    - Iterar sobre cada carácter de la palabra utilizando un bucle.
      - Comprobar si el carácter es una vocal (a, e, i, o, u).
      - Incrementar `contadorVocales` por cada vocal encontrada.
    - Mostrar cuántas vocales tiene la palabra.

- Al salir del bucle:
  - Mostrar el número total de palabras ingresadas (excluyendo "FIN").
- Considerar validaciones para entradas vacías o caracteres no válidos.

 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contadorPalabras = 0;
        int contadorVocales = 0;

        do {
            System.out.println("Ingrese una palabra o FIN para finalizar: ");
            String palabra = entrada.next();
            contadorPalabras++;
            palabra.toLowerCase(Locale.ROOT);

            for(int i = 0; i < palabra.length(); i++){
                char caracter = palabra.charAt(i);

                if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'){
                    System.out.println("Es una vocal.");
                    contadorVocales ++;
                }
            }


        } while (!palabra.equalsIgnoreCase("FIN"));
    }
}
