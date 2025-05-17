public class ProductoElectronico extends Producto {

    private int garantiaMeses;

    public ProductoElectronico(String nombre, double precio, int garantiaMeses) {
        super(nombre, precio);
        this.garantiaMeses = garantiaMeses;
    }
    @Override
    public void mostrarDetalles() {
        System.out.println("Producto Electrónico: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Garantía: " + garantiaMeses + " meses");
        System.out.println("---------------------------");
    }
}