package herencia;

public class Alumno extends Persona {
    private float promedio;

    public Alumno(String nombre, String apellido, int edad, float promedio) {
        super(nombre, apellido, edad);
        this.promedio = promedio;
    }
}
