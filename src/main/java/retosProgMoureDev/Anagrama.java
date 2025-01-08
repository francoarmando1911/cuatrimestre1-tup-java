package retosProgMoureDev;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */

public class Anagrama {

    public static boolean  isAnagram(String palabraUno, String palabraDos){
        if(palabraUno.equalsIgnoreCase(palabraDos)){
            return false;
        }
        
        char[] charArrayUno = palabraUno.toLowerCase().toCharArray();  
        char[] charArrayDos = palabraDos.toLowerCase().toCharArray(); 

        Arrays.sort(charArrayUno);  
        Arrays.sort(charArrayDos); 

        return Arrays.equals(charArrayUno, charArrayDos);
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la primera palabra:");  
        String palabraUno = entrada.nextLine();

        System.out.println("Ingrese la segunda palabra:");  
        String palabraDos = entrada.nextLine(); 

        boolean resultado = isAnagram(palabraUno, palabraDos);  
        System.out.println("¿Son anagramas? " + resultado);  
        
        entrada.close();
    }
    
}
