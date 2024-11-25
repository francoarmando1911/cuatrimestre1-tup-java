package guia10For;

import java.util.Scanner;

/*Escribir un pseudocódigo que permita el ingreso de dos numero enteros (el primero debe ser
menor que el segundo) y que muestre la sumatoria de todos los números enteros entre los dos
numero ingresado(inclusive).*/
public class Ejercicio4 {
    public static int sumatoria(int num1, int num2){
        int suma = 0;
        for(int i = num1; i <= num2; i++){
            suma += i;
        }
        return suma;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer numero (menor): ");
        int num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero (mayor): ");
        int num2 = entrada.nextInt();

        if (num1 >= num2) {
            System.out.println("El primer número debe ser menor que el segundo.");
        } else {
            int resultado = sumatoria(num1, num2);
            System.out.println("La sumatoria de " + num1 + " y " + num2 + " es: " + resultado);
        }
        entrada.close();
    }
}
