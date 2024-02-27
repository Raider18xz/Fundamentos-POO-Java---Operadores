import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        SolucionEjercicios ejercicios= new SolucionEjercicios();
        // entrada
        System.out.println("1. Aplicación de Suma");
        System.out.println("Ingrese el primer número: ");

        Scanner src = new Scanner(System.in);
        double Num1 = src.nextDouble();

        System.out.println("Ingrese el Segundo número:");
        double Num2 = src.nextDouble();

        //proceso
        double result = ejercicios.SumaNum(Num1,Num2);

        //salida
        System.out.println("La suma de sus dos números es :" + result);


    }
}