package guia11DoWhile;

import java.util.ArrayList;
import java.util.Scanner;

// Crear un pseudocódigo que le permita ingresar todos los números que desee y calcular u sumatoria. Establezca una opción de salida.
public class ejercicio1 {
 public static void main(String[] args) {
  Scanner entrada = new Scanner(System.in);

  ArrayList<Integer> numeros = new ArrayList<>(); //Lista de numeros
  int sumaTotal = 0;
  char respuesta;

  System.out.println("Ingrese un numero para sumar o escriba 0 para salir: ");
  int numero = entrada.nextInt();

  if (numero == 0) break;

 }

}
