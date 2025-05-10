//Se ingresa por teclado un número positivo de uno o dos dígitos (1..99). Se debe mostrar un
//mensaje indicando si el número tiene uno o dos dígitos.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero positivo desde el 1 al 99:");
        int Numero = scanner.nextInt();
        if (Numero >= 1 && Numero <= 99) {
            if (Numero < 10) {
                System.out.println("El numero tiene 1 digito");
            } else {
                System.out.println("El numero tiene 2 digitos ");
            }

            } else {
            System.out.println("Por Favor ingrese el numero dentro del rango solicitado, entre 1 y 99");
        }
        }
    }
