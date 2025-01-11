package ejercicio7;

import ejercicio7.clases.Curso;
import ejercicio7.clases.EstudianteProfesor;
import ejercicio7.clases.SoloEstudiante;
import ejercicio7.interfaces.Estudiante;

public class App {
    public static void main(String[] args) {
        Estudiante e1 = new EstudianteProfesor();
        Estudiante e2 = new SoloEstudiante();
    }
}
