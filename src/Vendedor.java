import java.util.Arrays;

public class Vendedor extends Empleado{
    private static final int INCREMENTO = 10;
    private Coche coche;
    private String movil;
    private String areaVenta;
    private Cliente[] clientes;
    private double comision;

    public Vendedor(String nombre, String apellidos, String dni, String direccion, String telefono, double salario, Coche coche, String movil, String areaVenta, Cliente[] clientes, double comision) {
        super(nombre, apellidos, dni, direccion, telefono, salario);
        this.coche = coche;
        this.movil = movil;
        this.areaVenta = areaVenta;
        this.clientes = clientes;
        this.comision = comision;
    }

    @Override
    public boolean cambiarSupervisor(Empleado supervisor) {
        if (!(supervisor instanceof Vendedor)) return false;
        this.supervisor = supervisor;
        return true;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "coche=" + coche +
                ", movil='" + movil + '\'' +
                ", areaVenta='" + areaVenta + '\'' +
                ", clientes=" + Arrays.toString(clientes) +
                ", comision=" + comision +
                '}' + super.toString();
    }

    @Override
    public void incrementarSalario() {
        salario = (salario*(1+(INCREMENTO/100)));
    }

    public void anadirCliente(Cliente cliente){
        Cliente[] aux = new Cliente[clientes.length+1];
        System.arraycopy(clientes,0,aux,0,clientes.length);
        aux[aux.length-1] = cliente;
        clientes = aux;
    }

    public boolean borrarCliente(Cliente cliente){
        int pos = buscarCliente(cliente);
        if (pos<0) return false;
        Cliente[] aux = new Cliente[clientes.length-1];
        System.arraycopy(clientes,0,aux,0,pos-1);
        System.arraycopy(clientes,pos+1,aux,pos+1,clientes.length-pos);
        clientes = aux;
        return true;
    }

    public void cambiarCoche(Coche car){
        this.coche = car;
    }

    public int buscarCliente(Cliente cliente){
        for (int i = clientes.length; i >= 0; i--) {
            if(clientes[i].equals(cliente)) return i;
        }
        return -1;
    }
}
