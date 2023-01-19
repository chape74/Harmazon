import java.time.LocalDate;

public class Cliente {
    private String nombre;
    private String apellidos;
    private String dni;
    private String direccion;
    private LocalDate antiguedad;
    private String telefono;

    public Empleado(String nombre, String apellidos, String dni, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.antiguedad = LocalDate.now();
    }


    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", direccion='" + direccion + '\'' +
                ", antiguedad=" + antiguedad +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
