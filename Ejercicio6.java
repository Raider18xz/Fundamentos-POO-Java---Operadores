import java.util.Scanner;

public class Ejercicio6 {
    public static void main( String[] args )
    {
        // entrada
        System.out.println("1. El Área de un cilindro y su volumen ");
        System.out.println("Ingrese el radio del Cilindro: ");

        Scanner src= new Scanner(System.in);
        double Num1 =src.nextDouble();
        System.out.println("Ingrese la altura del Cilindro");
        double Num2=src.nextDouble();
        //proceso
        double result =Num1*Math.PI*Num1*(Num1 + Num2);
        double result2 =Math.PI*(Num1*Num1)*Num2;

        System.out.println( "El Área es :" + result + " El volumen es " + result2 );


    }
}
