package Input;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public int obtenerEntero() {
        return scanner.nextInt();
    }

    public double obtenerDouble() {
        return scanner.nextDouble();
    }

    public String obtenerTexto() {
        scanner.nextLine();
        return scanner.nextLine();
    }
}