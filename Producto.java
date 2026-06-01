public class Producto {
    // 1. Atributos Privados (Encapsulamiento)
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;

    // 2. Constructor: Inicializa todos los atributos al crear el objeto
    public Producto(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        setPrecio(precio); // Se usa el setter para validar el precio inicial
        setStock(stock);   // Se usa el setter para validar el stock inicial
    }

    // 3. Métodos Públicos: Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    // Validación lógica: El precio no puede ser menor a cero
    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("Error: El precio no puede ser negativo.");
        }
    }

    public int getStock() {
        return stock;
    }

    // Validación lógica: El stock en bodega no puede ser negativo
    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Error: El stock disponible en bodega no puede ser negativo.");
        }
    }

    // 4. Método de Negocio: Reduce el precio según un porcentaje enviado
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 100) {
            double descuento = this.precio * (porcentaje / 100);
            this.precio -= descuento;
            System.out.println("-> Se ha aplicado un descuento del " + porcentaje + "% al producto " + this.nombre);
        } else {
            System.out.println("Error: Porcentaje de descuento inválido.");
        }
    }
}