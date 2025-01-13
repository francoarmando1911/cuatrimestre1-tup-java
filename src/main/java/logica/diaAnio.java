package logica;

import java.util.Scanner;

/*
 * Haga una funcion que reciba como entrada un mes del año y determine el numero de
 * dias transcurridos desde el comienzo del año hasta el primer dia del mes
 */

public class diaAnio {

    public static int diasAnio(int respMes){
        int dias = 0;
        switch (respMes) {
            case 1 :
                System.out.println("Enero");
                dias = 0;
                break;

            case 2 :
                System.out.println("Febrero");
                dias = 31; //Porque enero tiene 31 dias
                break;
            
            case 3: 
                System.out.println("Marzo");
                dias = 31 + 28;
                break;

            case 4:
                System.out.println("Abril");
                dias = 31 + 28 + 31;
                break;

            case 5:
                System.out.println("Mayo");
                dias = 31 + 28 + 31 + 30;
                break;

            case 6:
                System.out.println("Junio");
                dias = 31 + 28 + 31 + 30 + 31;
                break;

            case 7:
                System.out.println("Julio");
                dias = 31 + 28 + 31 + 30 + 31 + 30;
                break;

            case 8:
                System.out.println("Agosto");
                dias = 31 + 28 + 31 + 30 + 31 + 30 + 31;
                break;

            case 9:
                System.out.println("Septiembre");
                dias = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
                break;

            case 10:
                System.out.println("Octubre");
                dias = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
                break;

            case 11:
                System.out.println("Noviembre");
                dias = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
                break;

            case 12:
                System.out.println("Diciembre");
                dias = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 31;
                break;

            default:  
                throw new IllegalArgumentException("Número de mes no válido. Debe ser entre 1 y 12.");  
        }  
        return dias;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un numero (del 1 al 12), indicando el mes que desee.");
        int respMes = entrada.nextInt();

        if (respMes < 1 || respMes > 12) {  
            System.out.println("Error: El número ingresado debe estar entre 1 y 12.");  
        } else {  
            int diasTranscurridos = diasAnio(respMes);  
            System.out.println("Días transcurridos hasta el primer día del mes: " + diasTranscurridos);  
        }   
    }
}
