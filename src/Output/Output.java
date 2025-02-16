package Output;

import Alumnos.Alumno;

import java.util.List;

public class Output {
    public static void listarAlumnos(List<Alumno> alumnos) {
        System.out.println("id\tnombre completo\tasignatura 1 (nota)\tasignatura 2 (nota)");
        for (Alumno a : alumnos) {
            System.out.println(a);
        }
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public static void mostrarMenu() {
        System.out.println("Seleccione una opción:");
        System.out.println("1. Alta");
        System.out.println("2. Baja");
        System.out.println("3. Modificación");
        System.out.println("4. Listado");
        System.out.println("5. Salir");
    }

}
