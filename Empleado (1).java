package sistema.nomina;

public class Empleado extends Persona {
    protected String idEmpleado;
    protected double salarioBase;

    public Empleado(String nombre, int edad, String idEmpleado, double salarioBase) {
        super(nombre, edad); 
        this.idEmpleado = idEmpleado;
        this.salarioBase = salarioBase;
    }

    public double calcularSalarioNeto() {
        double retenciones = this.salarioBase * 0.10;
        return this.salarioBase - retenciones;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); 
        System.out.println("ID Empleado: " + this.idEmpleado);
        System.out.println("Salario Base: $" + this.salarioBase);
    }
}