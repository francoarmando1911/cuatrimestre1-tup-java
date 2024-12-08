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

    public static double calcularCompra(double cantidad, double precio, int tipo){
        if (tipo == 1){
            double descuentoLacteo = (precio * 0.5f);
            double descuentoTotalCompra = (descuentoLacteo * cantidad);
        }

        return descuentoTotalCompra;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("--SUPERMERCADO--");

            System.out.println("Ingrese el tipo de producto: ");
            System.out.println("1- Lacteos");
            System.out.println("2- Carnicos");
            System.out.println("3- Otro");
            int tipo = entrada.nextInt();

            System.out.println("Ingrese cantidad: ");
            double cantidad = entrada.nextInt();
            System.out.println("Ingrese precio: ");
            double precio = entrada.nextInt();

            switch (tipo){
                case 1:
                    System.out.println("Lacteo 5%");
                case 2:
                    System.out.println("Carnico 10%");
                case 3:
                    System.out.println("Otro nada");
            }

        }while (true);
    }
}
