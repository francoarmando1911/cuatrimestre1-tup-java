/*
 * Crea una función que reciba días, horas, minutos y segundos (como enteros)
 * y retorne su resultado en milisegundos.
 */

package retosProgMoureDev;  

public class ConversorTiempo {  

    public static Integer conversionTiempo(int dias, int horas, int minutos, int segundos) {  
        long milisegundos = dias * 24 * 60 * 60 * 1000; // días a milisegundos  
        milisegundos += horas * 60 * 60 * 1000; // horas a milisegundos  
        milisegundos += minutos * 60 * 1000; // minutos a milisegundos  
        milisegundos += segundos * 1000; // segundos a milisegundos  

        return (int) milisegundos; 
    }  

    public static void main(String[] args) {   
        int dias = 1;       
        int horas = 2;  
        int minutos = 3;  
        int segundos = 4;  

        int resultado = conversionTiempo(dias, horas, minutos, segundos);  
        System.out.println("El resultado en milisegundos es: " + resultado);  
    }  
}  
