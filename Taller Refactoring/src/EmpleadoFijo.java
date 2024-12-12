public class EmpleadoFijo extends Empleado {
    private double bonoAnual;
    private String genero;

    public EmpleadoFijo(String nombre, double salarioBase, int horasTrabajadas, String departamento, double bonoAnual, String genero) {
        super(nombre, salarioBase, horasTrabajadas, 0, departamento);
        this.bonoAnual = bonoAnual;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nGénero: %s\nBono Anual: %.2f", genero, bonoAnual);
    }

    // Más metodos
}
