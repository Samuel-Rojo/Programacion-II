public class ProductoRopa extends Producto{
    private String talle;

    public ProductoRopa(String nombre, double precio, String talle) {
        super(nombre, precio);
        this.talle = talle;
    }
    @Override
    public void mostrarDetalles() {
        System.out.println("Producto de Ropa: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Talle: " + talle);
        System.out.println("---------------------------");
    }
}