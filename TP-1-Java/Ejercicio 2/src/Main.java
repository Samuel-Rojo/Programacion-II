//Un alumno rinde tres parciales de una determinada materia. Hacer un sistema que diga si
//el alumno esta promocionado o no. Para promocionar el alumno debe tener un promedio
//de 8.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la nota del Primer Parcial:");
        int notaParcial1 = scanner.nextInt();
        System.out.println("Ingrese la nota del Segundo Parcial:");
        int notaParcial2 = scanner.nextInt();
        System.out.println("Ingrese la nota del Tercer Parcial:");
        int notaParcial3 = scanner.nextInt();
        int Promedio = (notaParcial1+notaParcial2+notaParcial3) /3;
        if (notaParcial1 < 0 || notaParcial1 > 10) {
            System.out.println("No existe esa nota, por favor ingrese una nota entre 0 y 10");
        }else{
            if (notaParcial2<0 || notaParcial2>10){
                System.out.println("No existe esa nota, por favor ingrese una nota entre 0 y 10");
            } else {
                if (notaParcial3<0 || notaParcial3>10){
                    System.out.println("No existe esa nota, por favor ingrese una nota entre 0 y 10");
                } if (Promedio>=8) {
                    System.out.println("El alumno esta Promocionado");

                }else {
                    System.out.println("El Alumno no Promociono");
                }
            }
        }
    }
}