package guia15Arreglos;

import java.util.Scanner;

/*
Escriba un algoritmo que cargue 5 números en un arreglo y que encuentre el mayor de ellos.

-- APUINTES --

Crear un arreglo que podrá contener 5 números.
Cargar Números en el Arreglo:

Implementa un bucle que permita al usuario ingresar 5 números.
Asegúrate de almacenar cada número en el arreglo.
Inicializar la Variable para el Mayor:

Crear una variable para almacenar el mayor número encontrado. 
Buscar el Mayor Número:

Implementa un bucle que recorra el arreglo y compare cada número.
Si un número es mayor que el almacenado en la variable del mayor, actualiza esa variable.
Mostrar el Resultado:

Finalmente, imprimir el mayor número encontrado.
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[5];

        //Cargo los numeros en el array
        for(int i = 0; i < 5; i++){
            System.out.println("Ingrese el numero " + (i + 1) + ":");
            numeros[i] = entrada.nextInt();
        }

        //Encontrar el mayot
        int mayor = numeros[0];
        for(int i = 1; i < numeros.length; i++){
            if(numeros[i] > mayor){
                mayor = numeros[i];
            }
        }

        System.out.println("El mayor numero es: " + mayor);
        entrada.close();
    }
}
