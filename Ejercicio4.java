import java.util.Scanner;

public class Ejercicio4 {
    public static void main( String[] args )
    { Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        do {
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
