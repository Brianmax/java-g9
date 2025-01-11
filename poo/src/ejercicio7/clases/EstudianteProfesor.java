package ejercicio7.clases;

import ejercicio7.interfaces.Estudiante;
import ejercicio7.interfaces.Profesor;

public class EstudianteProfesor extends Persona implements Estudiante, Profesor {

    // Persona (Usuario)
    @Override
    public void iniciarSesion() {
        System.out.println("Iniciando sesion como estudiante-profesor");
    }

    @Override
    public void cerrarSesion() {
        System.out.println("Cerrando sesion como estudiante-profesor");
    }

    // Estudiante
    @Override
    public void matricularCurso() {
        System.out.println("Matriculandome a un curso como estudiante-profesor");
    }

    @Override
    public void entregarTarea() {
        System.out.println("Entregando tarea como estudiante-profesor");
    }

    // Profesor

    @Override
    public void calificarExamen() {
        System.out.println("Calificando examen comom estudiante-profesor");
    }

    @Override
    public void asignarTarea() {
        System.out.println("Asignando tareas como estudiante-profesor");
    }
}
