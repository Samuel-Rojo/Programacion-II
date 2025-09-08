//Crear un sistema que valide las calificaciones de un estudiante y
//utilice excepciones para indicar errores:
//• Las calificaciones deben ser del tipo numérico y deben ir desde 0 a 10.
//• Si el valor de la calificación es menor que 0 o mayor que 10 el sistema debe mostrar al
//usuario que ingreso un valor inválido.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
      //  double n= scanner.nextDouble(); intente poner el double aqui pero no me salia en el terminal para que yo ingrese el valor
        try{
            System.out.println("ingrese la nota del estudiante: " );
            double n= scanner.nextDouble();
            calificacionestudiante.NotaEstudiante(n);
            System.out.println("La nota es valida :D");
        }catch (Calificacion e){
            System.out.println("¡Algo salio mal!" + e.getMessage());
        }catch (RuntimeException e){
            System.out.println("Ups... ¡el valor debe ser numerico!");
        }
        scanner.close();
    }
}