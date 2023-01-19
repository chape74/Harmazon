import java.time.LocalDate;

public abstract class Empleado {
    private String nombre;
    private String apellidos;
    private String dni;
    private String direccion;
    private LocalDate antiguedad;
    private String telefono;
    protected double salario;
    Empleado supervisor;

    public Empleado(String nombre, String apellidos, String dni, String direccion, String telefono, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.salario = salario;
        this.antiguedad = LocalDate.now();
    }

    public abstract boolean cambiarSupervisor(Empleado supervisor);

    public abstract void incrementarSalario();

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", direccion='" + direccion + '\'' +
                ", antiguedad=" + antiguedad +
                ", telefono='" + telefono + '\'' +
                ", salario=" + salario +
                ", supervisor=" + supervisor +
                '}';
    }
}
