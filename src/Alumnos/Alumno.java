package Alumnos;


public class Alumno {
    private int id;
    private String nombre;
    private int edad;
    private String fechaNacimiento;
    private String asignatura1;
    private double nota1;
    private String asignatura2;
    private double nota2;

    public Alumno(int id, String nombre, int edad, String fechaNacimiento, String asignatura1, double nota1, String asignatura2, double nota2) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.asignatura1 = asignatura1;
        this.nota1 = nota1;
        this.asignatura2 = asignatura2;
        this.nota2 = nota2;
    }
    public int getId() {
        return id;
    }
    public void setNota1(double nota) {
        this.nota1 = nota;
    }


    @Override
    public String toString() {
        return id + "\t" + nombre + "\t" + asignatura1 + " (" + nota1 + ")\t" + asignatura2 + " (" + nota2 + ")";
    }
}
