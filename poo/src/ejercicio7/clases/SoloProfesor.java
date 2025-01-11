package ejercicio7.clases;

import ejercicio7.interfaces.Profesor;

public class SoloProfesor extends Persona implements Profesor {

    // Persona (Usuario)

    @Override
    public void iniciarSesion() {
        System.out.println("Iniciando sesion como solo profesor...");
    }

    @Override
    public void cerrarSesion() {
        System.out.println("Cerrando sesion como solo profesor...");
    }

    @Override
    public void asignarTarea() {
        System.out.println("Asignando tarea como solo profesor...");
    }

    @Override
    public void calificarExamen() {
        System.out.println("Calificando examen como solo profesor...");
    }
}
