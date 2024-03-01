import java.util.Scanner;

public class Ejercicio8 {
    public static void main( String[] args )
    {
        SolucionEjercicios ejercicios = new SolucionEjercicios();
        // entrada
        System.out.println("1. Obtener el promedio de tres números ");
        System.out.println("Ingrese el primer número: ");

        Scanner src= new Scanner(System.in);
        double Num1 =src.nextDouble();
        System.out.println("Ingrese el segundo número");
        double Num2 =src.nextDouble();
        System.out.println("Ingrese el tercer número");
        double Num3 =src.nextDouble();
        //proceso
        double result =ejercicios.PromeNum(Num1,Num2,Num3);


        System.out.println( "El promedio de sus tres números es :" + result  );


    }
}
