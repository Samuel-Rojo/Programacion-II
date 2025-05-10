//Crea un programa que valide la fortaleza de las contraseñas ingresadas por los
//usuarios.
//Escribe un método que verifique si una contraseña tiene al menos 8 caracteres.
//Implementa un método que compruebe si una contraseña contiene al menos un
//dígito numérico.
// Crea un método que verifique si una contraseña contiene al menos un carácter
//especial (por ejemplo, !, @, #, $, %, ^, &, *).
// Utiliza StringBuffer o StringBuilder para construir una contraseña segura a partir de
//varios componentes.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Validador y Generador de Contraseñas ===");
        System.out.println("1. Ingresar una contraseña para validar");
        System.out.println("2. Generar una contraseña segura");
       // System.out.print("Elige una opción: ");
        //int opcion = scanner.nextInt();
        //scanner.nextLine();
//tuve que cambiar esto porque segun la IA tengo que agregar esto para que funcione:
        System.out.print("Elige una opción (1 o 2): ");
        String entrada = scanner.nextLine();

        int opcion;
        try {
            opcion = Integer.parseInt(entrada);
        } catch (NumberFormatException e) {
            System.out.println("Error: debes ingresar un número (1 o 2). Programa finalizado.");
            return;
        }
        if (opcion == 1) {
            System.out.print("Ingresa tu contraseña: ");
            String contraseña = scanner.nextLine();
            boolean longitudValida = Contraseña.verificarCaracter(contraseña);
            boolean contieneNumero = Contraseña.DigitoNumerico(contraseña);
            boolean contieneEspecial = Contraseña.caracterEspecial(contraseña);

            if (longitudValida && contieneNumero && contieneEspecial) {
                System.out.println("La contraseña es FUERTE.");
            } else {
                System.out.println("La contraseña es DÉBIL. Motivos:");
                if (!longitudValida)
                    System.out.println("- Debe tener al menos 8 caracteres.");
                if (!contieneNumero)
                    System.out.println("- Debe contener al menos un número.");
                if (!contieneEspecial)
                    System.out.println("- Debe contener al menos un carácter especial (@, %, $, &, *, ^).");
            }
        } else if (opcion == 2) {
            String generada = Contraseña.generarContraseñaSegura();
            System.out.println("Su Contraseña ha sido generada!: " + generada);
        } else {
            System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}