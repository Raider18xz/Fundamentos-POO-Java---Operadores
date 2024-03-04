import java.util.Scanner;

public class Ejercicio3 {
   public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        do {
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

