package sistema.nomina;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN DE TALENTO HUMANO V1.0 ===\n");

        Empleado desarrollador = new Empleado("Ana Mendoza", 24, "EMP-2026-004", 25000.0);
        System.out.println(">> EJECUTANDO FICHA DE EMPLEADO STANDARD:");
        desarrollador.mostrarInformacion();
        System.out.println("Depósito de Nómina Estimado: $" + desarrollador.calcularSalarioNeto());
        System.out.println("\n---------------------------------------------\n");

        Gerente directorTI = new Gerente(
            "Marco Mendoza", 54, "GER-1996-001", 55000.0, "Sistemas Computacionales", 15000.0
        );
        System.out.println(">> EJECUTANDO FICHA DE ALTA DIRECCIÓN (MULTINIVEL):");
        directorTI.mostrarInformacion();
    }
}