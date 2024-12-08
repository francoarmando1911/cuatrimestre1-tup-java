package guia11Funciones;

import java.util.Scanner;

/*
Cree un pseudocódigo que permita el ingreso de números enteros y nos informe cuantos números pares y cuantos
impares  ingresó. Cree una función que determine si el número es par o impar y vaya acumulando las cantidades.
Establezca una opción para finalizar el ingreso de números. Intente validar que el número ingresado sea un entero.
Utilice parámetros por referencia si es necesario.

--APUNTES --

1- Funciones: Se define una función esParOImpar que recibe un número y dos variables por referencia
(para contar pares e impares). La función incrementa el contador correspondiente según la paridad del número.
2- Función Principal: En la función principal, se inicializan los contadores de pares e impares y se utiliza un bucle
HACER...HASTA para permitir el ingreso repetido de números.
3- Validación de Entrada: Se usa un bloque INTENTAR...CAPTURAR para manejar la conversión de la entrada a un entero
y manejar errores si la entrada no es válida.
4- Salida: Al finalizar, se muestran los totales de números pares e impares ingresados.
 */
public class Ejercicio10 {

    public static void contarParesEImpares(int numero, int[] contarPares, int[] contarImpares){
        if (numero % 2 == 0) {
            contarPares[0]++;
        } else {
            contarImpares[0]++;
        }
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] contarPares = {0};
        int[] contarImpares = {0};

        while (true){
            System.out.println("Ingrese un numero (o un numero negativo para salir): ");
            int numero = entrada.nextInt();

            if (numero < 0){
                break;
            }

            contarParesEImpares(numero, contarPares, contarImpares);
        }

        System.out.println("Cantidad de numeros pares: " + contarPares[0]);
        System.out.println("Cantidad de numeros impares: " + contarImpares[0]);

        entrada.close();
    }
}
