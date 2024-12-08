package guia12Funciones;

import java.util.Scanner;

/*
En una estación de servicio deciden dar como premio un 5% de descuento a todas las compras que se realicen por monto
de dinero (no por litro) y que la cantidad de litros resultante de esa compra sea un número par. Por ejemplo si una
persona pide $12000 y el surtidor marca 8.33 litros se considera que es par (se desprecia la parte decimal).
Escriba un algoritmo que calcule el total de la compra utilizando una función que calcule si el número es par o impar.

---APUNTES---

- Definir una función que determine si un número es par o impar.
- La función debe aceptar un número como parámetro y devolver un valor booleano:
    - True si el número es par.
    - False si el número es impar.
- En la función principal, calcular el monto de la compra.
- Convertir el monto de compra a litros utilizando el precio por litro (por ejemplo, dividir el total por el precio por litro).
- Despreciar la parte decimal de los litros (puede utilizarse la función int() para esto).
- Si la cantidad de litros es par, calcular el 5% de descuento sobre la compra.
- Restar el descuento del monto total para obtener el total final a pagar.
- Imprimir el total de la compra después de aplicar el posible descuento.
 */

public class Ejercicio5 {

    public static boolean parOimpar(int numero){
        return numero % 2 == 0;
    }

    public static double montoCompra(double monto, double precioPorLitro) {
        int litros = (int) (monto / precioPorLitro);

        if (parOimpar(litros)) {
            double descuento = monto * 0.05;
            return monto - descuento;
        }
        return monto;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el monto de la compra: ");
        double monto = entrada.nextDouble();

        System.out.print("Ingrese el precio por litro: ");
        double precioPorLitro = entrada.nextDouble();

        double totalFinal = montoCompra(monto, precioPorLitro);

        System.out.printf("El total de la compra después de aplicar el descuento (si corresponde) es: $%.2f%n", totalFinal);

        entrada.close();
    }
}
