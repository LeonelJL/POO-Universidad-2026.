package sistema.nomina;

public class Gerente extends Empleado {
    private String departamento;
    private double bonoEstrategico;

    public Gerente(String nombre, int edad, String idEmpleado, double salarioBase, String departamento, double bonoEstrategico) {
        super(nombre, edad, idEmpleado, salarioBase);
        this.departamento = departamento;
        this.bonoEstrategico = bonoEstrategico;
    }

    @Override
    public double calcularSalarioNeto() {
        double salarioBaseConRetencion = super.calcularSalarioNeto(); 
        return salarioBaseConRetencion + this.bonoEstrategico;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); 
        System.out.println("Departamento a Cargo: " + this.departamento);
        System.out.println("Bono de Alta Dirección: $" + this.bonoEstrategico);
        System.out.println("INGRESOS TOTALES NETOS: $" + this.calcularSalarioNeto());
    }
}