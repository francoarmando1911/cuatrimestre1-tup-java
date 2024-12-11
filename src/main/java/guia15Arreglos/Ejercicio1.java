package guia15Arreglos;

import java.util.Scanner;

/*
Escriba un algoritmo que permita la lectura de 5 números y que muestre los números ingresados en orden inverso al
que se los ingreso. Utilice un arreglo para la solución del algoritmo.

--APUNTES--

-Inicializar arreglo de numeros
-Hacer una funcion para ordenar los numeros de manera inversa
-En el main pedirle al usuario que ingrese numeros
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese un numero (" + (i + 1) + "/5): ");
            numeros[i] = entrada.nextInt();
        }

        System.out.println("Los numeros en orden inverso son: ");
        for (int i = 4; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        entrada.close();

    }

}
