package guia11Funciones;
/*
Crear  un pseudocódigo que  permita que, ingresando el nombre y el sexo de una persona nos muestre un saludo de
buenos días personalizado con ese nombre. Cree una función para que si es mujer agregue “Sra” y si es hombre “Sr.”
delante del nombre ingresado.

- Funcion sexo (masculino o femenino)
- En el main pedir que se ingrese el nombre y el sexo
- Saludo
 */

import java.util.Scanner;

public class Ejercicio2 {
    public static String saludoMasculino(){
        return "Sr. ";
    }
    public static String saludoFemenino(){
        return "Sra. ";
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = entrada.next();
        System.out.println("Ingrese su sexo: ");
        String sexo = entrada.next().toLowerCase();

        String saludo = "";

        if (sexo.equals("masculino") || sexo.equals("hombre")) {
            saludo = saludoMasculino();
        } else if (sexo.equals("femenino") || sexo.equals("mujer")) {
            saludo = saludoFemenino();
        } else {
            System.out.println("Sexo no reconocido. Por favor, ingrese 'masculino' o 'femenino'.");
            entrada.close();
            return;
        }
        System.out.println("Buenos días, " + saludo + nombre + "!");
        entrada.close();
    }
}
