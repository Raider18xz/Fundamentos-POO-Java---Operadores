import java.util.Scanner;

public class Ejercicio1 {
    public static void main( String[] args )
    {

        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        do {
        SolucionEjercicios ejercicios = new SolucionEjercicios();
        // entrada
        System.out.println("1. Calcular el área de un triángulo");
        System.out.println("Ingrese la base del triángulo: ");

        Scanner src= new Scanner(System.in);
        double base =src.nextDouble();

        System.out.println("Ingrese la altura del triángulo");
        double height = src.nextDouble();

        //proceso
        double result = ejercicios.areaTriangulo(base,height);

        //salida
        System.out.println( "El área del triangulo es:" + result);
        System.out.println("¿Desea salir? Ingrese 99 para salir o cualquier otro número para continuar:");
        int opcion = scanner.nextInt();

        if (opcion == 99) {
            salir = true;
            System.out.println("Saliendo del programa...");
         }
      }     while (!salir);

        scanner.close();
    }
}