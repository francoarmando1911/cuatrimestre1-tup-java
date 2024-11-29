package guia10For;

import java.util.ArrayList;
import java.util.Scanner;

//Cree un pseudocódigo que pida un número entero mayor que cero y que escriba sus divisores.
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un numero mayor que 0: ");
        int numero = entrada.nextInt();

        if (numero > 0) {
            ArrayList<Integer> divisores = new ArrayList<>();

            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    divisores.add(i);
                }
            }

            System.out.println("Los divisores de " + numero + " son: " + divisores);

        } else {
            System.out.println("Por favor, ingrese un número mayor que 0.");
        }

        entrada.close();
    }
}
