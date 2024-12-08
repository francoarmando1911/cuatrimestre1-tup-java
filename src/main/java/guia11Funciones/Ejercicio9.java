package guia11Funciones;

import java.util.Scanner;

/*
En una caja de supermercado se ingresa una serie de productos escriba un pseudocódigo que calcule cuanto es el
total de la compra y cuantos productos Lácteos compró. Debido a que hay promociones se hace un descuento de 10 %
a los productos Lácteos y 5 % de descuento a los productos Cárnicos. Se debe ingresar cantidad, precio y tipo.
Utilice una función para calcular las compras individuales, acumular los totales de la compra y la cantidad de Lácteos.
La finalización del ingreso de productos se produce cuando se ingresa precio 0. Utilice parámetros por
referencia si es necesario.

--APUNTES--

1- Funciones: La función calcularCompra toma como parámetros la cantidad, el precio, y el tipo del producto,
junto con referencias para el total acumulado y la cantidad de lácteos.
2- Descuentos: Según el tipo del producto, se aplica el descuento correspondiente.
3- Ciclo de ingreso: Se repite la entrada de productos hasta que se ingrese una cantidad de 0. Al final, se muestra
el total de la compra y el número de productos lácteos.

 */
public class Ejercicio9 {

    public static double calcularCompra(double cantidad, double precio, double tipo){
        double descuento = 0;

        if (tipo == 1){
            descuento = 0.10f;
        } else if (tipo == 2) {
            descuento = 0.05f;

        }
        double totalCompra = cantidad * precio * (1 - descuento);
        return totalCompra;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double totalCompraGeneral = 0;
        int cantidadLacteos = 0;

        while (true) {
            System.out.println("--SUPERMERCADO--");

            System.out.println("Ingrese el tipo de producto: ");
            System.out.println("1- Lacteos");
            System.out.println("2- Carnicos");
            System.out.println("3- Otro");
            int tipo = entrada.nextInt();

            if(tipo == 0){
                break;
            }

            System.out.println("Ingrese cantidad: ");
            double cantidad = entrada.nextDouble();
            System.out.println("Ingrese precio: ");
            double precio = entrada.nextDouble();

            if (precio == 0) {
                break;
            }

            double totalProducto = calcularCompra(cantidad, precio, tipo);
            totalCompraGeneral += totalProducto;

            if (tipo == 1) {
                cantidadLacteos += cantidad;
            }

            System.out.println("Total para este producto: " + totalProducto);

        }

        System.out.println("Total de la compra: " + totalCompraGeneral);
        System.out.println("Cantidad total de Lácteos: " + cantidadLacteos);
        entrada.close();

    }
}
