package herencia;

public class Profesor extends Persona {
    private float salario;

    public Profesor(String nombre, String apellido, int edad, float salario) {
        super(nombre, apellido, edad);
        this.salario = salario;
    }
}
