package guia10For;

// Escriba un pseudocódigo que muestre por pantalla un árbol de caracteres asteriscos (*) .
// Permita ingresar la cantidad de niveles (profundidad) del árbol.

import java.util.Scanner;

public class ejercicio2 {
    public void arbol(int nivel){
        for(int i=1; i<= nivel; i++){
            String espacios = "".repeat(nivel-i);
            String asteriscos = "*".repeat(2 * i -1);
            System.out.println(espacios + asteriscos);
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de niveles que desea que tenga el arbol: ");
        int nivel = entrada.nextInt();

        ejercicio2 arbol = new ejercicio2(); //creo una instancia de la funcion (cosas de java....)
        arbol.arbol(nivel);

    }
}
