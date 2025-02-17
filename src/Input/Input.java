package Input;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public int obtenerEntero() {
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Ingrese un número entero:");
            scanner.next();
        }
        int numero = scanner.nextInt();
        scanner.nextLine();
        return numero;
    }

    public double obtenerDouble() {
        while (!scanner.hasNextDouble()) {
            System.out.println("Entrada inválida. Ingrese un número decimal:");
            scanner.next();
        }
        double numero = scanner.nextDouble();
        scanner.nextLine();
        return numero;
    }

    public String obtenerTexto() {
        return scanner.nextLine();
    }
}
