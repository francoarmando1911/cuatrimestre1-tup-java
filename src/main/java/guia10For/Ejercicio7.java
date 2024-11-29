package guia10For;

/*
Cree un pseudocódigo que permita al usuario ingresar 6 números enteros, que pueden ser
positivos o negativos. Al finalizar, mostrar la sumatoria de los números negativos y el promedio de
los positivos.
*/

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        int sumaNegativos = 0;
        int sumaPositivos = 0;
        int contadorPositivos = 0;

        Scanner entrada = new Scanner(System.in);

        for(int i = 0; i <= 6; i++){
            System.out.println("Ingrese el numero: ");
            int numero = entrada.nextInt();

            if(numero<0){
                sumaNegativos += numero;
            } else{
                sumaPositivos += numero;
                contadorPositivos++;
            }
        }

        double promediosPositivos = (contadorPositivos > 0) ? (sumaPositivos / contadorPositivos) : 0;

        System.out.println("La sumatoria de los numeros negativos es: " + sumaNegativos);
        System.out.println("El promedio de los numeros positivos es: " + promediosPositivos);
    }

}
