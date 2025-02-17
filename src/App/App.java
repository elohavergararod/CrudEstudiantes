package App;

import Gestión.GestorAlumnos;
import Input.Input;
import Output.Output;

public class App {
    public static void main(String[] args) {
        GestorAlumnos gestor = new GestorAlumnos();
        Input input = new Input();
        Output output = new Output();
        int opcionEscogida;

        do {
            output.mostrarMenu();
            output.mostrarMensaje("Escoge una opción: ");
            opcionEscogida = input.obtenerEntero();

            switch (opcionEscogida) {
                case 1 -> gestor.agregarAlumno();
                case 2 -> gestor.eliminarAlumno();
                case 3 -> gestor.modificarNota();
                case 4 -> output.listarAlumnos(gestor.getAlumnos());
                case 5 -> output.mostrarMensaje("Saliendo...");
                default -> output.mostrarMensaje("Opción inválida");
            }

        } while (opcionEscogida != 5);
    }
}