package POO;

import java.util.Scanner;

/*
Se quiere desarrollar un programa que determine si un número es un nú-
mero de Amstrong. Un número de Amstrong es aquel que es igual a la suma
de sus dígitos elevados a la potencia de su número de cifras.
 */
public class NumAmstomg {
    public static boolean esNumeroArmstrong(int numero) {  
        int suma = 0;  
        int original = numero;  
        int cantidadCifras = String.valueOf(numero).length(); // Contar cifras  

        while (numero > 0) {  
            int digito = numero % 10;  
            suma += Math.pow(digito, cantidadCifras);   
            numero /= 10;   
        }  

        return suma == original; 
    }  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        
        System.out.print("Introduce un número para verificar si es un número de Armstrong: ");  
        int numero = scanner.nextInt();  
        
        if (esNumeroArmstrong(numero)) {  
            System.out.println(numero + " es un número de Armstrong.");  
        } else {  
            System.out.println(numero + " no es un número de Armstrong.");  
        }  

        scanner.close(); 
    }
    
}
