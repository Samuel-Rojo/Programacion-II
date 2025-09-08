import java.util.Scanner;

//Simular un sistema de reservas de asientos de cine y
//manejar una excepción cuando un asiento ya está ocupado:
// • Se debe tener una entidad que conozca el asiento y si el mismo esta ocupado o no.
// • El sistema debe verificar que el asiento sea un asiento válido.
// • Si un asiento está ocupado el sistema debe informar al usuario.
// • No se pueden vender mas asientos que la capacidad que tiene tiene la Sala de Cine. El
//sistema debe validar esta regla de negocio.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CineSunstarSolar sala = new CineSunstarSolar(14); // sala con 14 asientos
        System.out.println("¡Bienvenido al sistema de reservas CineSunstarSolar!");
        while (true) {
            sala.mostrarEstado();
            System.out.print("Ingrese el número de asiento a reservar (0 para salir): ");
            int num = sc.nextInt();
            if (num == 0) {
                System.out.println("Saliendo del sistema...");
                break;
            }
            try {
                sala.asientosinvalidos(num);
                sala.reservarAsiento(num);
                sala.cineLLeno();
            } catch (AsientoInvalido e) {
                System.out.println(e.getMessage());
            } catch (AsientosOcupados e) {
                System.out.println(e.getMessage());
            } catch (Cinelleno e) {
                System.out.println(e.getMessage());
                break;
            }
        }
        sc.close();
    }
}
