public class Secretario extends Empleado{
    private static final int INCREMENTO = 5;
    private String despacho;
    private String fax;

    public Secretario(String nombre, String apellidos, String dni, String direccion, String telefono, double salario, String despacho, String fax) {
        super(nombre, apellidos, dni, direccion, telefono, salario);
        this.despacho = despacho;
        this.fax = fax;
    }


    @Override
    public boolean cambiarSupervisor(Empleado supervisor) {
        if (!(supervisor instanceof Secretario)) return false;
        this.supervisor = supervisor;
        return true;
    }

    @Override
    public String toString() {
        return "Secretario{" +
                "despacho='" + despacho + '\'' +
                ", fax='" + fax + '\'' +
                super.toString();
    }

    @Override
    public void incrementarSalario() {
        salario = (salario*(1+(INCREMENTO/100)));
    }
}
