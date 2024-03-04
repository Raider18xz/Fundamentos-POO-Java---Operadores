import java.util.Scanner;

public class Ejercicio6 {
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        do {
        SolucionEjercicios ejercicios = new SolucionEjercicios();

        // entrada
        System.out.println("1. El Área de un cilindro y su volumen ");
        System.out.println("Ingrese el radio del Cilindro: ");

        Scanner src= new Scanner(System.in);
        double Num1 =src.nextDouble();
        System.out.println("Ingrese la altura del Cilindro");
        double Num2=src.nextDouble();
        //proceso
        double result = ejercicios.AreaCilindro(Num1,Num2);
        double result2 = ejercicios.VolumenCinlindro(Num1,Num2);

        System.out.println( "El Área es :" + result + " El volumen es " + result2 );
            System.out.println("¿Desea salir? Ingrese 99 para salir o cualquier otro número para continuar:");

            int opcion = scanner.nextInt();

            if (opcion == 99) {
                salir = true;
                System.out.println("Saliendo del programa...");
            }
        }while (!salir);

        scanner.close();

    }
}
