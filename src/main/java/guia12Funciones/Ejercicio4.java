package guia12Funciones;

import java.util.Scanner;

/*
En una estación de servicio se aplica un 5% de descuento por litro si la compra de nafta Premium es de más de
100 litros, pero si la compra es de más de 1000 litros se le agrega un 3% de descuento adicional. Cree un algoritmo
que calcule el monto total de una compra ingresando la cantidad de litros y teniendo en cuenta que el precio original
de la nafta Premium es de $1500. Utilice una función para calcular el precio final por litro de la compra.

 ---APUNTES---
-Main:
    -Peedir ingreso de litros comprados
    -Precio por litro = precioFinal(litros_comprados)
    -Calcular monto total = precioxlitro * litrosComprdos
    -Mostrar monto total

-Funcion:
    - funcion boolean precioFinal(litros)
    - Si litros > 1000
        descuento += 5  # 5%
        descuento += 3   # 3% adicional
    sino litros > 100:
        descuento += 5   # solo 5%

    precio_final_por_litro = precio_original * (1 - (descuento / 100))
    return precio_final_por_litro
 */
public class Ejercicio4 {

    public static double precioFinal(double litros, double precio){
        double descuento = 0;

        if(litros > 1000){
            descuento += 5;
            descuento += 3;
        } else if (litros > 100) {
            descuento += 5;
        }

        double precioFinalPorLitro = precio * (1 - (descuento / 100));
        return precioFinalPorLitro;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el precio por litro: ");
        double precio = entrada.nextDouble();
        System.out.println("Ingrese la cantidad de litros comprados: ");
        double litros = entrada.nextDouble();

        double resultado = precioFinal(litros, precio);
        double montoTotal = resultado * litros;

        System.out.println("El precio final por litro es: $" + montoTotal);


    }
}
