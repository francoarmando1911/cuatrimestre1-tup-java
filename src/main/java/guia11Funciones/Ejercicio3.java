package guia11Funciones;

import java.util.Scanner;

/*
Escribir  un algoritmo que nos informe si el año ingresado es un año bisiesto.
Utilice una función para determinarlo.

--APUNTES--

- Crear funcion boolean anioBisiesto que tome como parametro la variable anio
- si ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0))
        return True
    else:
        return False
 */
public class Ejercicio3 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un año: ");
        int anio = entrada.nextInt();

    }

}
