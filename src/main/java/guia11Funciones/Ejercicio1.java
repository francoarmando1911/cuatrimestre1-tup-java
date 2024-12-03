package guia11Funciones;

import java.util.Scanner;

/*
Escriba un menú que contenga las siguientes opciones y programe el pseudocódigo que efectué la acción indicada.
Utilice una función para cada ítem del menú.
1-Multiplicacion de dos números
2-Suma de dos números
3-Resta de dos numero
4-Salir

-- APUNTES --

- Hacer una funcion para cada operacion

 */
public class Ejercicio1 {

    public static double multiplicacion(double num1, double num2){
        return num1 * num2;
    }

    public static double suma(double num1, double num2){
        return num1 + num2;
    }

    public static double resta(double num1, double num2){
        return num1 - num2;
    }

    public static double division(double num1, double num2){
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        double num1 = entrada.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        double num2 = entrada.nextDouble();

        System.out.println("Seleccione la operacion que desea realizar: 1- Suma | 2- Resta | 3- Multiplicacion | 4- Division");
        int opc = entrada.nextInt();

        if (opc == 1) {
            double resultado = suma(num1, num2);
            System.out.println("El resultado de la suma es: " + resultado);
        } else if (opc == 2) {
            double resultado = resta(num1, num2);
            System.out.println("El resultado de la resta es: " + resultado);
        } else if (opc == 3) {
            double resultado = multiplicacion(num1, num2);
            System.out.println("El resultado de la multiplicacion es: " + resultado);
        } else if (opc == 4) {
            if (num2 == 0){
                System.out.println("Incorrecto");
            }
            double resultado = division(num1, num2);
            System.out.println("El resultado de la division es: " + resultado);
        }else {
            System.out.println("Numero incorrecto, intente nuevamente...");
            opc = entrada.nextInt();
        }
        entrada.close();
    }
}
