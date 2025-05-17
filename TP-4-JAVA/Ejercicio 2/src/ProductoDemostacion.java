import java.util.ArrayList;
import java.util.Collections;

public class ProductoDemostacion {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Chorizo", 8890.2, 50));   //x kg
        productos.add(new Producto("Costilla", 10234.6, 30)); //x kg
        productos.add(new Producto("Entrania", 9045.9, 100)); // x kg

        System.out.println("Original:");
        productos.forEach(System.out::println);

        Collections.sort(productos);
        System.out.println("\nOrdenado por precio:");
        productos.forEach(System.out::println);

        productos.sort(new ComparadorNombre());
        System.out.println("\nOrdenado por nombre:");
        productos.forEach(System.out::println);

        productos.sort(new ComparadorStock());
        System.out.println("\nOrdenado por stock:");
        productos.forEach(System.out::println);
    }
}
