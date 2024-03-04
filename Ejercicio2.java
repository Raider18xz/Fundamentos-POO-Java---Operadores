import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        do {
        SolucionEjercicios ejercicios= new SolucionEjercicios();
        // entrada
        System.out.println("1. Aplicación de Suma");
        System.out.println("Ingrese el primer número: ");

        Scanner src = new Scanner(System.in);
        double Num1 = src.nextDouble();

        System.out.println("Ingrese el Segundo número:");
        double Num2 = src.nextDouble();

        //proceso
        double result = ejercicios.SumaNum(Num1,Num2);

        //salida
        System.out.println("La suma de sus dos números es :" + result);

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