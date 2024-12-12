public class EmpleadoTemporario extends Empleado {
    private String nombre;
    private String genero;
    private double salarioBase;
    private int horasTrabajadas;
    private String departamento;
    private int mesesContrato;

    public EmpleadoTemporario(String nombre, double salarioBase, int horasTrabajadas, String departamento, int mesesContrato, String genero) {
        super(nombre, salarioBase, horasTrabajadas, 0, departamento); // Tarifa hora no aplica
        validarDatos(mesesContrato, genero);
        this.mesesContrato = mesesContrato;
        this.genero = genero;
    }

    private void validarDatos(int mesesContrato, String genero) {
        if (mesesContrato <= 0) {
            throw new IllegalArgumentException("Los meses de contrato deben ser mayores a 0.");
        }
        if (genero == null || genero.isEmpty()) {
            throw new IllegalArgumentException("El género no puede ser nulo o vacío.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + String.format(
            "\nGénero: %s\nMeses de Contrato: %d", 
            genero, 
            mesesContrato
        );
    }

    // Más metodos
}
