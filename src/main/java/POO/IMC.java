package POO;

public class IMC {
    public static void main(String[] args) {
        int masa = 91;
        double estatura = 1.77;
        double IMC = masa/Math.pow(estatura, 2);
        System.out.println("La persona tiene una masa = " + masa + " kilogramos, y estatura = " + estatura + " metros");
   
        if(IMC < 16){
            System.out.println("La persona tiene delgadez extrema.");
        } else if (IMC < 17){
            System.out.println("La persona tiene delgadez moderada.");
        } else if(IMC < 18.5){
            System.out.println("La persona tiene delgadez leve.");
        } else if(IMC < 25){
            System.out.println("La persona tiene peso normal.");
        } else if(IMC < 30){
            System.out.println("La persona tiene sobrepeso.");
        } else if(IMC < 35){
            System.out.println("La persona tiene obesidad leve.");
        } else if(IMC < 40){
            System.out.println("La persona tiene obesidad media.");
        } else {
            System.out.println("La persona tiene obesidad extrema.");
        }
    }   
}
