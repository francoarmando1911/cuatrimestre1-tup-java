package guia11DoWhile;

import java.util.Scanner;

/**
 Cree un pseudocódigo que registre los resultados de arrojar un dado y nos informe en que intento salió el 4.
 El pseudocódigo debe permitir repetir las partidas. (Se considera partida la secuencia de arrojar los
 dados hasta que salga el 4 o hasta que ingrese 0). La opción para terminar el juego  es la opción resultado 0.

 -- APUNTES --

 - Pedir al usuario que ingrese 1 si desea tirar el dado y 2 si desea salir en una variable opcion

 - Si el usuario ingresa 1:
     - Ejecutar la función random para que devuelva un número aleatorio entre 1 y 6.
     - Contar el número de intentos necesarios hasta que salga el 4.

     Inicializar intentos = 0
     Mientras el resultado del dado no sea 4:
     Incrementar intentos
     Lanzar el dado y obtener un número aleatorio entre 1 y 6
     Mostrar el número obtenido
     Mostrar mensaje con el número de intentos realizados

     - Mostrar el resultado del dado en cada intento.
     - Si el número obtenido es 4, informar en qué intento salió y terminar la partida.

 - Si el usuario ingresa 2:
     - Finalizar la partida actual y preguntar si desea iniciar una nueva.

 - Si el usuario ingresa 0:
     - Terminar el juego completamente.

 - Implementar un contador para los intentos en cada partida.
 - Asegurar que el programa permita al usuario reiniciar una nueva partida después de terminar una.
 - Verificar entradas inválidas y solicitar nuevamente una opción válida.
 - Proporcionar mensajes claros para que el usuario entienda el flujo del juego (por ejemplo, indicar que el 4 fue obtenido
 o mostrar el número obtenido en cada intento).


 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int intentos = 0;
        int resultado = 0;

        while (true){

            System.out.println("Ingrese una opcion: 1- Jugar | 2- Finalizar partida actual | 3- Terminar juego");
            int opc = entrada.nextInt();

            if(opc == 0){
                System.out.println("Terminando juego, saliendo...");
                break;
            } else if (opc == 2) {
                System.out.println("Finalizando partida actual.");
                System.out.println("Desea seguir jugando? (s/n): ");
                String opc2 = entrada.next();

                if(opc2.equals('n')){
                    System.out.println("Juego finalizado");
                }else {
                    //Inicializar la partida nueva
                }
                break;
            } else if (opc == 1) {
                System.out.println("Ingrese una opcion: 1 - TIRAR DADO | 2- SALIR");
                int opcionJuego = entrada.nextInt();

                while (opcionJuego == 1) {

                    int numeroDado = (int) (Math.random() * 6) + 1;
                    System.out.println("Resultado del dado: " + numeroDado);
                    intentos++;

                    if (resultado == 4) {
                        System.out.println("¡Salió el 4 después de " + intentos + " intentos!");
                        break;
                    }

                    System.out.println("Presione 1 para intentar de nuevo o 0 para salir: ");
                    opcionJuego = entrada.nextInt();
                }



            }
        }

    }
}
