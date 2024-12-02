package guia11DoWhile;

import java.util.Scanner;

/*
Escriba un pseudocódigo que permita el ingreso de una frase y que cuente la cantidad de palabras que el
usuario que ingreso. Establezca una opción para finalizar el ingreso de palabras.

---APUNTES---
- Ingreso de frase
- Dividir la frase en palabras, utilizando el espacio como delimitador
    -String[] palabras = frases.trim().split(\\s+)
- Contad la cantidad de palabras con cantPalabras = palabras.length()
*/
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (true){
            System.out.println("Ingrese una opcion: 1 - ingresar / 2 - salir");
            int opc = entrada.nextInt();
            entrada.nextLine();

            if(opc == 2){
                System.out.println("Saliendo...");
                break;

            } else if (opc == 1) {
                System.out.println("Ingrese una frase: ");
                String frase = entrada.nextLine();

                String[] palabras = frase.trim().split("\\s+");

                int contadorPalabras = palabras.length;

                System.out.println("La cantidad de palabras que ingreso en su frase es: " + contadorPalabras);
            } else {
                System.out.println("Opcion no valida, intente nuevamente");
            }
        }
    }
}
