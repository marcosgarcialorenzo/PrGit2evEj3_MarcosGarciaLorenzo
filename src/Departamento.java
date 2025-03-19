import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Departamento {
    private String nombre;
    private int numEmpleados;
    private Empleado[] empleados = new Empleado[2];

    void anadir(Empleado v) {
        empleados[0] = v;
    }
}
