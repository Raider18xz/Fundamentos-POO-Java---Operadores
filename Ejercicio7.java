import java.util.Scanner;

public class Ejercicio7 {
    public static void main( String[] args )
    {

        SolucionEjercicios ejercicios = new SolucionEjercicios();
        // entrada
        System.out.println("1. El Área de un círculo y su longitud ");
        System.out.println("Ingrese el radio del Círculo: ");

        Scanner src= new Scanner(System.in);
        double Num1 =src.nextDouble();
        //proceso
        double result = ejercicios.AreaCirculo(Num1);
        double result2 = ejercicios.LongitudCirculo(Num1);

        System.out.println( "El Área es :" + result + " y la longitud es " + result2 );


    }
}
