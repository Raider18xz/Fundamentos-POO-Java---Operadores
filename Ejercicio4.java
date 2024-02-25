import java.util.Scanner;

public class Ejercicio4 {
    public static void main( String[] args )
    {
        // entrada
        System.out.println("1. Pasar de Euros a dolares");
        System.out.println("Ingrese el número que quiere convertir: ");

        Scanner src= new Scanner(System.in);
        double Num1 =src.nextDouble();


        //proceso
        double result =Num1 * 1.0825;

        //salida
        System.out.println( "Tiene :" + result + " Dólares");


    }
}
