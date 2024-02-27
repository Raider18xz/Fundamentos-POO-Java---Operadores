import java.util.Scanner;

public class Ejercicio4 {
    public static void main( String[] args )
    {
        SolucionEjercicios ejercicios = new SolucionEjercicios();
        // entrada
        System.out.println("1. Pasar de Euros a dolares");
        System.out.println("Ingrese el número que quiere convertir: ");

        Scanner src= new Scanner(System.in);
        double Num1 =src.nextDouble();


        //proceso
        double result = ejercicios.EurosaDolar(Num1);

        //salida
        System.out.println( "Tiene :" + result + " Dólares");


    }
}
