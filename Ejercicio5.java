import java.util.Scanner;

public class Ejercicio5 {
    public static void main( String[] args )
    {
        // entrada
        System.out.println("1. El Área de un cuadrado y su perímetro ");
        System.out.println("Ingrese el lado del cuadrado: ");

        Scanner src= new Scanner(System.in);
        double Num1 =src.nextDouble();
        //proceso
        double result =Num1 * Num1;
        double result2 =Num1 + Num1 + Num1 +Num1;
        //salida
        System.out.println( "El Área es :" + result + " y el perímetro es " + result2);


    }
}
