import java.util.ArrayList;

public class Gerente extends Empleado {

    public ArrayList<Empleado> empleados = new ArrayList<Empleado>();

    public Gerente(int id, String nombre, String posicion) {
        super(id, nombre, posicion);
    }

}
