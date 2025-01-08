package logica;

import java.util.Scanner;

/*
 * Escribir una funcion que calcule el area de un circulo y otra que calcule el volumen 
 * de un cilindro usando la primera funcion
 */
public class areaCirculo {

    public static Double calcAreaCirculo(Double radio){
        final Double pi = 3.14159; 
        Double area = pi * (radio * radio);
        return area;
    }

    public static Double volumenCilindro(Double radio, Double altura) {
        Double areaBase = calcAreaCirculo(radio);
        return areaBase * altura;
    }


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el radio del círculo: ");
        Double radio = entrada.nextDouble();
        System.out.print("Ingrese la altura del cilindro: ");
        Double altura = entrada.nextDouble();

        Double area = calcAreaCirculo(radio);
        Double volumen = volumenCilindro(radio, altura);

        System.out.println("El área del círculo es: " + area);
        System.out.println("El volumen del cilindro es: " + volumen);

        entrada.close();
        
    }
}
