import java.util.Arrays;

public class JefeZona extends Empleado {
    private static final int INCREMENTO = 20;
    private String despacho;
    private Secretario secretario;
    private Vendedor[] vendedor;
    private Coche coche;


    public JefeZona(String nombre, String apellidos, String dni, String direccion, String telefono, double salario, String despacho, Secretario secretario, Vendedor[] vendedor, Coche coche) {
        super(nombre, apellidos, dni, direccion, telefono, salario);
        this.despacho = despacho;
        this.secretario = secretario;
        this.vendedor = vendedor;
        this.coche = coche;
    }

    @Override
    public boolean cambiarSupervisor(Empleado supervisor) {
        return false;
    }

    @Override
    public void incrementarSalario() {

    }

    @Override
    public String toString() {
        return "JefeZona{" +
                "despacho='" + despacho + '\'' +
                ", secretario=" + secretario +
                ", vendedores=" + Arrays.toString(vendedor) +
                '}' + super.toString();
    }

    public void cambiarSecretario(Secretario newSecre) {
        this.secretario = newSecre;
    }

    public void cambiarCoche(Coche coche){
        this.coche = coche;
    }

    public void anadirVendedor(Vendedor vendedors){
        Vendedor[] aux = new Vendedor[vendedor.length+1];
        System.arraycopy(vendedor,0,aux,0,vendedor.length);
        aux[aux.length-1] = vendedors;
        vendedor = aux;
    }
    public boolean quitarVendedor(Vendedor vendedors){
        int pos = buscarVendedor(vendedors);
        if (pos<0) return false;
        Vendedor[] aux = new Vendedor[vendedor.length-1];
        System.arraycopy(vendedor,0,aux,0,pos-1);
        System.arraycopy(vendedor,pos+1,aux,pos+1,vendedor.length-pos);
        vendedor = aux;
        return true;
    }
    public int buscarVendedor(Vendedor vendedors){
        for (int i = vendedor.length; i >= 0; i--) {
            if(vendedor[i].equals(vendedors)) return i;
        }
        return -1;
    }
}
