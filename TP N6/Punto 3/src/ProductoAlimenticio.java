import java.time.LocalDate;

public class ProductoAlimenticio extends Producto{
    private LocalDate fechaVencimiento;

    public ProductoAlimenticio(String nombre, double precio, LocalDate fechaVencimiento) {
        super(nombre, precio);
        this.fechaVencimiento = fechaVencimiento;
    }

    public boolean estaPorVencer() {
        return fechaVencimiento.isBefore(LocalDate.now().plusDays(7));
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Producto Alimenticio: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Fecha de vencimiento: " + fechaVencimiento);
        System.out.println("Por vencer pronto: " + (estaPorVencer() ? "Sí" : "No"));
        System.out.println("---------------------------");
    }
}