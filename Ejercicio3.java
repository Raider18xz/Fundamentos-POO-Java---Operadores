import java.util.Scanner;

public class Ejercicio3 {
   public static void main( String[] args )
    {
        SolucionEjercicios ejercicios = new SolucionEjercicios();
        // entrada
        System.out.println("1. Calcular el valor de un numero al cuadrado");
        System.out.println("Ingrese el número que quiere elevar: ");

        Scanner src= new Scanner(System.in);
        double Num1 =src.nextDouble();


        //proceso
        double result = ejercicios.NumCuadrado(Num1);

        //salida
        System.out.println( "Su número elevado es :" + result);


    }
}
