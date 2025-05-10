//1. Ingresar la nota de una determinada materia. El sistema debe decir que si el alumno tiene
//una nota menor a cuatro desaprobó la materia, si el alumno tiene una nota mayor a 4
//aprobó y si aprueba con 10 el alumno es sobresaliente.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("ingrese la nota del Alumno:");
        Scanner scanner = new Scanner(System.in);
        int nota = scanner.nextInt();
        {
            if (nota < 0 || nota > 10) {
                System.out.println("No existen notas mas altas que 10, por favor ingrese una nota entre 0 y 10");
            } else {
                if (nota < 4) {
                    System.out.println("El Alumno Desaprobo");
                } else if (nota == 10) {
                    System.out.println("El Alumno Aprobo y es Sobresaliente");
                } else {
                    System.out.println("El Alumno Aprobo");
                }
            }
        }
    }
}