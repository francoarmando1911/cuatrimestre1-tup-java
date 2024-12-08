package guia12Funciones;

import java.util.Scanner;

/*
Escriba un pseudocódigo que permita el ingreso de una serie de números que muestre cada una de sus cifras por separado.
Cree un función que separe y muestre las cifras. Establezca una opción para la finalización del ingreso de la serie.

 --APUNTES--

Propósito:

Ingresar una serie de números y mostrar cada cifra por separado.
Permitir al usuario finalizar la entrada de números.
Estructura Principal:

Un bucle que permite múltiples entradas hasta que el usuario decida salir.
Función SepararCifras(numero):

Toma un número como parámetro.
Convierte el número a una cadena de texto.
Itera sobre cada carácter en la cadena y lo imprime, mostrando cada cifra en una línea separada.
Entrada del Usuario:

Se solicita al usuario ingresar un número o escribir "salir" para finalizar.
Se valida la entrada para asegurarse de que sea un número.
Condicionales:

Si el usuario ingresa "salir", se termina el programa.
Si la entrada es un número, se llama a la función SepararCifras.
Si la entrada no es válida, se informa al usuario.
Flujo de Ejecución:

Comienza a solicitar números de manera continua.
Realiza la validación de la entrada.
Muestra las cifras de los números válidos.

 */
public class Ejercicio8 {

    public static void separarCifras(String numero) {
        for (char caracter : numero.toCharArray()) {
            System.out.println(caracter);
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String respuesta;

        do {
            System.out.print("Ingrese un número (o 'salir' para finalizar): ");
            respuesta = entrada.next();

            if (respuesta.equalsIgnoreCase("salir")) {
                System.out.println("Finalizando el ingreso de números...");
                break;
            }

            if (esNumero(respuesta)) {
                separarCifras(respuesta);
            } else {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
            }
        } while (true);
        entrada.close();
    }

    public static boolean esNumero(String entrada) {
        try {
            Integer.parseInt(entrada);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
