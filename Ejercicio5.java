import java.util.Scanner;

public class Ejercicio5 {
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        do {
        SolucionEjercicios ejercicios = new SolucionEjercicios();
        // entrada
        System.out.println("1. El Área de un cuadrado y su perímetro ");
        System.out.println("Ingrese el lado del cuadrado: ");

        Scanner src= new Scanner(System.in);
        double Num1 =src.nextDouble();
        //proceso
        double result = ejercicios.AreaCuadrado(Num1);
        double result2 = ejercicios.PerimetroCuadrado(Num1);
        //salida
        System.out.println( "El Área es :" + result + " y el perímetro es " + result2);
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
