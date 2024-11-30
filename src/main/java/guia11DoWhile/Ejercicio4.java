package guia11DoWhile;

import java.util.ArrayList;
import java.util.Scanner;

/*
En una caja de supermercado se ingresa una serie de productos escriba un
pseudocódigo que calcule cuanto es el total de la compra. Debido a que hay promociones
se hace un descuento de 10 % a los productos Lácteos y 5 % de descuento a los
productos Cárnicos. Se debe ingresar cantidad, precio y tipo. La finalización del ingreso de
productos se produce cuando se ingresa precio 0.
*/
class Producto {
    double precio;
    int cantidad;
    String tipo;

    public Producto(double precio, int cantidad, String tipo) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }
}
public class Ejercicio4 {

    public static double calcularTotalConDescuento(ArrayList<Producto> productos){
        double total = 0;

        for(Producto producto : productos){
            double subtotal = producto.precio * producto.cantidad;

            if(producto.tipo.equals("lacteo")){
                subtotal *= 0.90;
            } else if (producto.tipo.equals("carne")) {
                subtotal *= 0.95;
            }
            total += subtotal;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Producto> productos = new ArrayList<>(); //lista de productos

        while (true){
            System.out.println("Ingrese el precio del producto o ingrese 0 para finalizar: : ");
            int precio = entrada.nextInt();

            if(precio == 0) break;

            System.out.println("Ingrese la cantidad del producto: ");
            int cantidad = entrada.nextInt();
            System.out.println("Ingrese el tipo de producto (carne, lacteo, otro): ");
            String tipo = entrada.next();

            productos.add(new Producto(precio, cantidad, tipo));
        }

        double totalCompra = calcularTotalConDescuento(productos);
        System.out.println("El total del precio a pagar por los productos es: $" + totalCompra);
    }
}
