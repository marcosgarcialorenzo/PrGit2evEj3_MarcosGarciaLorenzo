public class Departamento {
     //cosas modificadas no lo hago porque no tengo tiempo
    private String nombre;
    private int numEmpleados;
    private Empleado[] empleados = new Empleado[2];

    void anadir(Empleado v) {
        empleados[0] = v;
    }
}
