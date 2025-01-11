package ejercicio7.clases;

import ejercicio7.interfaces.Estudiante;

import java.util.ArrayList;

public class SoloEstudiante extends Persona implements Estudiante {
    private ArrayList<Curso> cursos;
    @Override
    public void iniciarSesion() {
        System.out.println("Iniciando sesion como estudiante...");
    }

    @Override
    public void cerrarSesion() {
        System.out.println("Cerrando sesion como estudiante...");
    }

    @Override
    public void matricularCurso() {
        System.out.println("Matriculandome a un curso...");
    }

    @Override
    public void entregarTarea() {
        System.out.println("Entregando tarea...");
    }
}
