package retosProgMoureDev;

import java.util.Scanner;

public class NumeroPrimo {

    public static boolean esPrimo(int numero){
        if(numero <= 1) return false;
        if(numero <= 3) return false;
        if(numero % 2 == 0 || numero % 3 == 0) return false;

        for(int i = 5; i * i <= numero; i += 2){
            if(numero % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = entrada.nextInt();

        System.out.println(numero + (esPrimo(numero) ? " es primo" : " no es primo"));
    }
}
