package guia12Funciones;
/*
Escriba un pseudocódigo que permita el ingreso de una fecha y determine si es válida o no. Se considera una
fecha valida si tiene el formato ddmmaaaa . Escriba una función para validad lo ingresado.
 */

import java.util.Scanner;

public class Ejercicio7 {

    public static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    public static boolean esFechaValida(String fecha) {
        if (fecha.length() != 8) {
            return false;
        }

        int dia = Integer.parseInt(fecha.substring(0, 2));
        int mes = Integer.parseInt(fecha.substring(2, 4));
        int anio = Integer.parseInt(fecha.substring(4, 8));

        if (mes < 1 || mes > 12) {
            return false;
        }

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if (dia < 1 || dia > 31) {
                    return false;
                }
                break;
            case 4: case 6: case 9: case 11:
                if (dia < 1 || dia > 30) {
                    return false;
                }
                break;
            case 2:
                if (esBisiesto(anio)) {
                    if (dia < 1 || dia > 29) {
                        return false;
                    }
                } else {
                    if (dia < 1 || dia > 28) {
                        return false;
                    }
                }
                break;
            default:
                return false;
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una fecha en formato ddmmaaaa: ");
        String fecha = scanner.nextLine();

        if (esFechaValida(fecha)) {
            System.out.println("Fecha válida");
        } else {
            System.out.println("Fecha no válida");
        }

        scanner.close();
    }
}

