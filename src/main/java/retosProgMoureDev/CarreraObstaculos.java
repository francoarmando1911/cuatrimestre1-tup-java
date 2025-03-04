/*
 * Crea una función que evalúe si un/a atleta ha superado correctamente una
 * carrera de obstáculos.
 * - La función recibirá dos parámetros:
 *      - Un array que sólo puede contener String con las palabras
 *        "run" o "jump"
 *      - Un String que represente la pista y sólo puede contener "_" (suelo)
 *        o "|" (valla)
 * - La función imprimirá cómo ha finalizado la carrera:
 *      - Si el/a atleta hace "run" en "_" (suelo) y "jump" en "|" (valla)
 *        será correcto y no variará el símbolo de esa parte de la pista.
 *      - Si hace "jump" en "_" (suelo), se variará la pista por "x".
 *      - Si hace "run" en "|" (valla), se variará la pista por "/".
 * - La función retornará un Boolean que indique si ha superado la carrera.
 * Para ello tiene que realizar la opción correcta en cada tramo de la pista.
 */

package retosProgMoureDev;

public class CarreraObstaculos {

    public static Boolean evaluarCarrera(String[] acciones, String pista){
        StringBuilder estadoPista = new StringBuilder(pista);
        boolean superoCarrera = true;

        for(int i = 0; i < acciones.length; i++){
            char tramo = estadoPista.charAt(i);
            String accion = acciones[i];

            if(tramo == '_' && accion.equals("run")){
                //Correcto: no se hace nada
            } else if(tramo == '|' && accion.equals("jump")){
                //Correcto: no se hace nada
            } else if (tramo == '_' && accion.equals("jump")) {  
                estadoPista.setCharAt(i, 'x'); 
                superoCarrera = false;  
            } else if (tramo == '|' && accion.equals("run")) {  
                estadoPista.setCharAt(i, '/');  
                superoCarrera = false;  
            }  
        }

        System.out.println("Estado final de la pista: " + estadoPista.toString());

        return superoCarrera;
    }


    public static void main(String[] args) {
        String[] acciones = {"run", "jump", "jump"};
        String pista = "_|__|__";

        boolean resultado = evaluarCarrera(acciones, pista);
        System.out.println("El atleta supero la carrera? " + resultado);
    }
    
}
