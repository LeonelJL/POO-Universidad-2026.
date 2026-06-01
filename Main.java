public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE ENCAPSULAMIENTO Y SEGURIDAD DE DATOS ===\n");

        // A. Creación (instanciación) de un objeto Producto con valores válidos
        Producto laptop = new Producto("LAP-001", "Laptop ASUS Core i7", 18500.0, 15);

        // B. Lectura inicial de datos a través de métodos Get
        System.out.println("--- Datos iniciales del producto ---");
        System.out.println("Código: " + laptop.getCodigo());
        System.out.println("Producto: " + laptop.getNombre());
        System.out.println("Precio: $" + laptop.getPrecio());
        System.out.println("Stock en Bodega: " + laptop.getStock() + " unidades\n");

        System.out.println("--- Prueba de Inyección de Datos Erróneos ---");
        // C. Intento de asignar un precio negativo (El sistema debe rechazarlo)
        System.out.print("[Intentando setear precio a -$500.0]: ");
        laptop.setPrecio(-500.0);
        
        // D. Intento de asignar un stock negativo (El sistema debe rechazarlo)
        System.out.print("[Intentando setear stock a -5 unidades]: ");
        laptop.setStock(-5);
        System.out.println();

        // E. Comprobación de integridad: Los datos no cambiaron a pesar de los intentos maliciosos
        System.out.println("--- Comprobación de integridad del objeto ---");
        System.out.println("Precio actual verificado: $" + laptop.getPrecio());
        System.out.println("Stock actual verificado: " + laptop.getStock() + " unidades\n");

        // F. Ejecución del método de negocio
        System.out.println("--- Ejecución de Operación Comercial ---");
        laptop.aplicarDescuento(10.0); // Aplicamos un 10% de descuento
        System.out.println("Nuevo precio al público: $" + laptop.getPrecio());
    }
}
