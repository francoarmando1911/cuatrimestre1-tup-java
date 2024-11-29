package guia11DoWhile;

import java.util.ArrayList;
import java.util.Scanner;

// Crear un pseudocódigo que le permita ingresar todos los números que desee y calcular u sumatoria. Establezca una opción de salida.
public class Ejercicio1 {

 public static int calcularSuma(ArrayList<Integer> numeros){
  int suma = 0;

  for(int numero : numeros){
   suma += numero;
  }
  return suma;
 }
 public static void main(String[] args) {
  Scanner entrada = new Scanner(System.in);

  ArrayList<Integer> numeros = new ArrayList<>(); //Lista de numeros
  int sumaTotal = 0;
  String respuesta;

  do{
   System.out.println("Ingrese un numero para sumar o escriba 0 para salir: ");
   int numero = entrada.nextInt();
   if (numero == 0) break; //salgo si se ingresa 0
   numeros.add(numero); // agrego numero a la lista
   System.out.println("Desea ingresar otro numero? (s/n) ");
   respuesta = entrada.next().toLowerCase();

  } while(respuesta.equals("s"));

  sumaTotal = calcularSuma(numeros);
  System.out.println("La sumatoria total de los numeros ingresados es: " + sumaTotal);
  entrada.close();
 }

}
