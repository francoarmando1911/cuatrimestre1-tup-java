package guia11Funciones;
/*
Escriba un pseudocódigo que nos de el monto final de una compra en pesos argentinos teniendo en cuenta que el
cliente me puede pagar en pesos Argentinos , pesos Uruguayos y Dolares. El precio de conversión determínelo en
un aproximado del valor actual de internet. Cree una función de conversión de los montos ingresados.

-- APUNTES --

1. Definir una función para pagar en pesos argentinos:
   - Entrada: monto (float)
   - Salida: monto en pesos argentinos (float)
   - Descripción: Retorna el monto ingresado sin cambios.

2. Definir una función para convertir pesos uruguayos a pesos argentinos:
   - Entrada: monto en pesos uruguayos (float)
   - Salida: monto en pesos argentinos (float)
   - Descripción: Multiplica el monto por la tasa de conversión.

3. Definir una función para convertir dólares a pesos argentinos:
   - Entrada: monto en dólares (float)
   - Salida: monto en pesos argentinos (float)
   - Descripción: Multiplica el monto por la tasa de conversión.

4. En el main:
   - Preguntar al usuario en qué moneda desea pagar (pesos argentinos, pesos uruguayos, dólares).
   - Usar una estructura `if` para implementar la llamada a las funciones correspondientes según la opción seleccionada.
   - Calcular y mostrar el monto final a pagar en pesos argentinos.

5. Incluir opción para continuar o finalizar el programa.

 */


import java.util.Scanner;

public class Ejercicio6 {

    public static float pagarPesosArgentinos(float monto){
        return monto;
    }

    public static float pagarUruguayos(float monto){
        float tasaConversion = 0.25f; //se usa el f al final para que lo lea como float al numero ya definido
        return monto * tasaConversion;
    }

    public static float pagarDolares(float monto){
        float tasaConversion = 1145;
        return monto * tasaConversion;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("En que moneda desea pagar: ");
        System.out.println("1- Pesos Argentinos 2- Pesos Uruguayos 3- Dolares");
        int respuesta = entrada.nextInt();

        switch (respuesta){
            case 1:
                System.out.println("Ingrese el monto en pesos: ");
                float montoUsuario = entrada.nextFloat();
                float montoFinal = pagarPesosArgentinos(montoUsuario);
                System.out.println("El monto a pagar es: " + montoFinal);
                break;

            case 2:
                System.out.println("Ingrese el monto en pesos: ");
                float montoUsuario1 = entrada.nextFloat();
                float montoFinal1 = pagarUruguayos(montoUsuario1);
                System.out.println("El monto a pagar es: " + montoFinal1);
                break;

            case 3:
                System.out.println("Ingrese el monto en pesos: ");
                float montoUsuario2 = entrada.nextFloat();
                float montoFinal2 = pagarDolares(montoUsuario2);
                System.out.println("El monto a pagar es: " + montoFinal2);
                break;

            default:
                System.out.println("Monto no valido...");
                break;
        }
    }
}
