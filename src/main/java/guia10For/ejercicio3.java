package guia10For;

import java.util.Scanner;

// // Codificar un algoritmo que muestra una cuenta regresiva de 10 segundos.
public class ejercicio3 {

    public static void cuentaRegresiva(int segundos){
        for(int i = segundos; i>= 0; i--){
            System.out.println(i);
            try {
                Thread.sleep(1000); // Esperar 1 segundo (1000 milisegundos)
            } catch (InterruptedException e) {
                System.out.println("La cuenta regresiva fue interrumpida.");
                return;
            }
        }
        System.out.println("Cuenta regresiva terminada");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de segundos para la cuenta regresiva: ");
        int segundos = entrada.nextInt();
        cuentaRegresiva(segundos);
        entrada.close();
    }
}
