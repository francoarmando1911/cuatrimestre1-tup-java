package guia15Arreglos;  

import java.util.Scanner;  

public class Ejercicio3 {  

    public static void main(String[] args) {  
        Scanner entrada = new Scanner(System.in);  
        String[] elementos = new String[5];  

        System.out.println("Introduzca 5 elementos:");  
        for (int i = 0; i < elementos.length; i++) {  
            System.out.print("Elemento " + (i + 1) + ": ");  
            elementos[i] = entrada.nextLine();  
        }  

        String[] elementosInvertidos = new String[elementos.length];  
        for (int i = 0; i < elementos.length; i++) {  
            elementosInvertidos[i] = elementos[elementos.length - 1 - i];  
        }  

        System.out.println("Contenido invertido:");  
        for (String elemento : elementosInvertidos) {  
            System.out.println(elemento);  
        }  
        entrada.close(); 
    }  
}