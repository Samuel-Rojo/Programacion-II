//Realizar un sistema que lea los lados de n triángulos, e informar:
//a) De cada uno de ellos, qué tipo de triángulo es: equilátero (tres lados iguales), isósceles
//(dos lados iguales), o escaleno (ningún lado igual)
//b) Cantidad de triángulos de cada tipo.
//c) Tipo de triángulo que posee menor cantidad
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cantidadEquilatero = 0;
        int cantidadIsosceles = 0;
        int cantidadEscaleno = 0;

        System.out.print("Ingrese la cantidad de triángulos: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nTriángulo " + i + ":");
            System.out.print("Ingrese el primer lado: ");
            int lado1 = scanner.nextInt();

            System.out.print("Ingrese el segundo lado: ");
            int lado2 = scanner.nextInt();

            System.out.print("Ingrese el tercer lado: ");
            int lado3 = scanner.nextInt();

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Es un triángulo equilátero");
                cantidadEquilatero++;
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Es un triángulo isósceles");
                cantidadIsosceles++;
            } else {
                System.out.println("Es un triángulo escaleno");
                cantidadEscaleno++;
            }
        }
        System.out.println("\nResumen:");
        System.out.println("Cantidad de triángulos equiláteros: " + cantidadEquilatero);
        System.out.println("Cantidad de triángulos isósceles: " + cantidadIsosceles);
        System.out.println("Cantidad de triángulos escalenos: " + cantidadEscaleno);
        if (cantidadEquilatero <= cantidadIsosceles && cantidadEquilatero <= cantidadEscaleno) {
            System.out.println("El tipo de triángulo con menor cantidad es: equilátero");
        } else if (cantidadIsosceles <= cantidadEquilatero && cantidadIsosceles <= cantidadEscaleno) {
            System.out.println("El tipo de triángulo con menor cantidad es: isósceles");
        } else {
            System.out.println("El tipo de triángulo con menor cantidad es: escaleno");
        }
    }
}
//le tuve que pedir a la ia profe que me ayude a hacer el punto b y c porque no sabia como plantear el problema, igual creo que tiene un error ya que al poner
//todos los lados de todos los triangulos iguales, me sale que el de menor cantidad es escaleno.
