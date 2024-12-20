import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraCientifica {
    private static final int MAX_HISTORIAL = 10;

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      String[] historial = new String[MAX_HISTORIAL];
      int contadorHistorial = 0;
      boolean continuar = true;

    System.out.println("=== calculadora Cientifica ===");

    while (continuar) {
        System.out.println("\nSelecona una operacion: ");
        System.out.println("1. Sumar");
        System.out.println("2. Multiplicar");
        System.out.println("3. Restar");
        System.out.println("4. Division");
        System.out.println("5. Potencia");
        System.out.println("6. Raiz Cuadrada");
        System.out.println("7. Ver Historial");
        System.out.println("8. Salir");
        System.out.println("Opcion: ");
        int opcion = 0;
        try {
            opcion = entrada.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("ERR:Opcion invalida. Intente de nuevo.");
            entrada.nextLine();
            continue;
        }

        switch (opcion) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            case 6:
                System.out.println("6");
                break;
            case 7:
                System.out.println("7");
                break;
            case 8:
                System.out.println("8");
                break;
            default:
                System.out.println("Opcion invalida. Intente de nuevo.");

        }
        if (contadorHistorial >= MAX_HISTORIAL) {
            System.out.println("Historial lleno. No almacenar mas operaciones.");
            contadorHistorial = MAX_HISTORIAL;

        }
    }
    System.out.println("Hasta luego");
    entrada.close();
  }

  private static double[] obtenerDosnumero(Scanner entrada) {
        double num1 = 0, num2 = 0;
        boolean entradavalida = false;


        while (entradavalida == false) {
            try {
                System.out.println("Ingrese el numero: ");
                num1 = entrada.nextDouble();


            }
        }
  }
}
