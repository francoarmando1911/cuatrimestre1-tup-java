package retosProgMoureDev;

/*
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */

import java.util.Scanner;

public class AreaPoligono {

    public static double areaPoligono(int tipo, double base, double altura){
        switch (tipo){
            case 1:
                return (base * altura) / 2;
            case 2:
                return (base * base);
            case 3:
                return (base * altura);
            default:
                throw new IllegalArgumentException("Tipo de poligono no valido. ");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el tipo de poligono que deasea obtener su Area: ");
        System.out.println("1- Triangulo 2- Cuadrado 3- Rectangulo");
        int tipo = entrada.nextInt();

        if(tipo == 1){
            System.out.println("Area del triangulo: " + areaPoligono(1, 6, 8));
        } else if (tipo == 2) {
            System.out.println("Area del cuadrado: " + areaPoligono(2, 4, 0));
        } else if (tipo == 3) {
            System.out.println("Area del rectangulo: " + areaPoligono(3, 6, 3));
        } else {
            System.out.println("Tipo de poligono invalido, intentelo otra vez");
        }

        entrada.close();
    }

}
