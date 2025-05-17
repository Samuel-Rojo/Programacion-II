import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static jdk.internal.net.http.common.Utils.close;

// Una empresa tiene un sistema de gestión de productos en su almacén que maneja
//diferentes tipos de productos, como productos alimenticios, electrónicos y ropa. Cada tipo
//de producto tiene características y comportamientos únicos que deben ser gestionados de
//manera adecuada. Se requiere que los productos compartan algunas funcionalidades
//comunes, pero también que tengan funcionalidades específicas según su tipo.
// • Todos los productos tienen un nombre y un precio. Estas propiedades deben estar
//presentes en todos los tipos de productos.
// • Se espera que todos los productos puedan calcular su precio y mostrar sus detalles
//(nombre, precio y características específicas).
//• Se debe implementar un mecanismo para verificar si un producto alimenticio está
//próximo a vencer.
// Los productos electrónicos tienen un período de garantía que debe ser mostrado junto
//con los detalles del producto.
//• La ropa tiene un talle que debe ser mostrado junto con los detalles del producto.
public class SistemaAlmacen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Producto> productos = new ArrayList<>();
        productos.add(new ProductoAlimenticio("Leche entera", 1200, LocalDate.of(2025, 8, 30)));
        productos.add(new ProductoAlimenticio("Chocolate Block 1kg", 8000, LocalDate.now().plusDays(3)));
        productos.add(new ProductoElectronico("SAMSUNG S25 ULTRA 256 GB", 1250000, 24));
        productos.add(new ProductoElectronico("Macbook PRO 2025 Chip M4", 1750000, 12));
        productos.add(new ProductoRopa("Camiseta de River Plate Version Hincha", 150000, "M"));
        productos.add(new ProductoRopa("Pantalón bermuda de jean marca MISTRAL", 55000, "L"));
        int opcion;
        do {
            System.out.println(" MENÚ DEL ALMACÉN");
            System.out.println("1. Mostrar todos los productos");
            System.out.println("2. Mostrar productos alimenticios próximos a vencer");
            System.out.println("3. Mostrar productos electrónicos");
            System.out.println("4. Mostrar productos de ropa");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch(opcion) {
                case 1:
                    for (Producto p : productos) {
                        p.mostrarDetalles();
                    }
                    break;
                case 2:
                    for (Producto p : productos) {
                        if (p instanceof ProductoAlimenticio) {
                            ProductoAlimenticio pa = (ProductoAlimenticio) p;
                            if (pa.estaPorVencer()) {
                                pa.mostrarDetalles();
                            }
                        }
                    }
                    break;
                case 3:
                    for (Producto p : productos) {
                        if (p instanceof ProductoElectronico) {
                            ((ProductoElectronico)p).mostrarDetalles();
                        }
                    }
                    break;
                case 4:
                    for (Producto p : productos) {
                        if (p instanceof ProductoRopa) {
                            ((ProductoRopa)p).mostrarDetalles();
                        }
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while(opcion != 0);

        scanner.close();
    }
}