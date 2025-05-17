public class Producto implements Comparable<Producto> {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }

    @Override
    public int compareTo(Producto otro) {
        return Double.compare(this.precio, otro.precio); // Por precio por defecto
    }

    @Override
    public String toString() {
        return String.format("Producto[nombre=%s, precio=%.2f, stock=%d]", nombre, precio, stock);
    }
}


