import java.util.Scanner;

public class Ejercicio8 {
    public static void main( String[] args )
    {
        // entrada
        System.out.println("1. Obtener el promedio de dos números ");
        System.out.println("Ingrese el primer número: ");

        Scanner src= new Scanner(System.in);
        double Num1 =src.nextDouble();
        System.out.println("Ingrese el segundo número");
        double Num2 =src.nextDouble();
        //proceso
        double result =(Num1*Num2)/2;


        System.out.println( "El promedio de sus dos números es :" + result  );


    }
}