/*
 * Crea una función que reciba un String de cualquier tipo y se encargue de
 * poner en mayúscula la primera letra de cada palabra.
 * - No se pueden utilizar operaciones del lenguaje que
 *   lo resuelvan directamente.
 */

package retosProgMoureDev;  

import java.util.Scanner;  

public class EnMayuscula {  

    public static String mayuscula(String palabra) {  
        char[] caracteres = palabra.toCharArray();  
        StringBuilder resultado = new StringBuilder(); 

        for (int i = 0; i < caracteres.length; i++) {  
            // Comprobar si es la primera letra de una palabra o si el índice es 0  
            if (i == 0 || caracteres[i - 1] == ' ') {   
                if (caracteres[i] >= 'a' && caracteres[i] <= 'z') {  
                    caracteres[i] = (char) (caracteres[i] - ('a' - 'A'));  
                }  
            }  
            // Añadir el carácter procesado al resultado  
            resultado.append(caracteres[i]);  
        }  

        return resultado.toString(); 
    }  

    public static void main(String[] args) {  
        Scanner entrada = new Scanner(System.in);  

        System.out.println("Ingrese una frase en minúscula: ");  
        String palabra = entrada.nextLine();  

        String resultado = mayuscula(palabra);  
        System.out.println("Frase con primera letra de cada palabra en mayúscula: " + resultado);  

        entrada.close(); 
    }  
}  