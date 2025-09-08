//Validador de Contraseña: Crear un programa que valide una contraseña según ciertas
//reglas y maneje los errores con excepciones:
//• El programa debe tener una excepción personalizada .
//• Se debe controlar si la cadena que forma la contraseña es vacía o null. Se puede usar
//una Exception de Java.
//• Se debe controlar que la cadena ingresada tenga mas de 8 caracteres, si la misma tiene
//menos se debe mostrar un mensaje especifico.
//• La contraseña debe tener al menos un número.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Por favor ingrese una contraseña personalizada: ");
        String contraseña = scanner.nextLine();
        try{
            ValidacionContraseña.ValidarContraseña(contraseña);
        } catch (IllegalArgumentException e){
            System.out.println("¡Error! "+ e.getMessage());
        } catch (ExcepcionPersonalizada e){
            System.out.println("¡Error!" + e.getMessage());
        } finally {
            System.out.println("El Proceso finalizo... ¡hasta pronto!");
        }
 scanner.close();

    }
}