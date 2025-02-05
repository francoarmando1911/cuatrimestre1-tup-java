package retosProgMoureDev;

import java.util.Scanner;

/*
 * Crea un programa que invierta el orden de una cadena de texto
 * sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */
public class invertirCadenas {

    public static String invertirCadena(String cadena){
        String invertida = "";
        for(int i = cadena.length() - 1; i>=0; i--){
            invertida += cadena.charAt(i);
        }
        return invertida;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese una cadena de texto: ");
        String cadena = entrada.next();

        System.out.println("La cadena: " + cadena + " invertida quedaria como: " + invertirCadena(cadena));
    }
}
