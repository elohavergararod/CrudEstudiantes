package Gestión;

import Alumnos.Alumno;
import Input.Input;
import Output.Output;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GestorAlumnos {
    private List<Alumno> alumnos = new ArrayList<>();
    private Input input = new Input();
    private Output output = new Output();

    public void agregarAlumno() {
        output.mostrarMensaje("¿Cuántos alumnos desea agregar?");
        int cantidad = input.obtenerEntero();

        for (int i = 0; i < cantidad; i++) {
            output.mostrarMensaje("Ingrese ID único del alumno:");
            int id = input.obtenerEntero();
            output.mostrarMensaje("Ingrese nombre completo:");
            String nombre = input.obtenerTexto();
            output.mostrarMensaje("Ingrese edad:");
            int edad = input.obtenerEntero();
            output.mostrarMensaje("Ingrese fecha de nacimiento (dd/mm/aaaa):");
            Output.mostrarMensaje("Ingrese fecha de nacimiento (dd/mm/aaaa):");
            String fechaNacimiento = input.obtenerTexto();
            output.mostrarMensaje("Ingrese primera asignatura:");
            String asignatura1 = input.obtenerTexto();
            output.mostrarMensaje("Ingrese nota de la primera evaluación:");
            double nota1 = input.obtenerDouble();
            output.mostrarMensaje("Ingrese segunda asignatura:");
            String asignatura2 = input.obtenerTexto();
            output.mostrarMensaje("Ingrese nota de la segunda evaluación:");
            double nota2 = input.obtenerDouble();

            alumnos.add(new Alumno(id, nombre, edad, fechaNacimiento, asignatura1, nota1, asignatura2, nota2));
        }
    }
    public void eliminarAlumno() {
        output.listarAlumnos(alumnos);
        output.mostrarMensaje("Ingrese el ID del alumno a eliminar:");
        int id = input.obtenerEntero();
        boolean found = false;
        Iterator<Alumno> iter = alumnos.iterator();
        while (iter.hasNext()) {
            if (iter.next().getId() == id) {
                iter.remove();
                found = true;
                break;
            }
        }
        if (!found) {
            output.mostrarMensaje("Alumno no encontrado.");
        }
    }

    public void modificarNota() {
        output.listarAlumnos(alumnos);
        output.mostrarMensaje("Ingrese el ID del alumno al que quiere modificar la nota de la primera asignatura:");
        int id = input.obtenerEntero();
        output.mostrarMensaje("Ingrese la nueva nota:");
        double nuevaNota = input.obtenerDouble();

        for (Alumno a : alumnos) {
            if (a.getId() == id) {
                a.setNota1(nuevaNota);
                break;
            }
        }
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }
}
