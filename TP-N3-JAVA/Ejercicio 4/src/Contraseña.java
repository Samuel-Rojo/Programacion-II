import java.util.Random;

public class Contraseña {
    public static boolean verificarCaracter(String contraseña) {
 int longitud = contraseña.length();
        System.out.println("los caracteres de la contraseña es:" + longitud);
        return longitud >=8;
    }
    public static boolean DigitoNumerico(String contraseña){
        for (int i = 0; i < contraseña.length(); i++) {
            if (Character.isDigit(contraseña.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    public static boolean caracterEspecial(String contraseña){
        String especial= "@%$&*^";
        for (int i = 0; i < contraseña.length(); i++) {
            if (especial.contains(String.valueOf(contraseña.charAt(i)))) {
                return true;
            }
        }
        return false;
    }
    public static String generarContraseñaSegura() {
        String letrasMayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String letrasMinus = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        String especiales = "@%$&*^";
        String todos = letrasMayus + letrasMinus + numeros + especiales;

        StringBuilder contraseña = new StringBuilder();
        Random random = new Random();
        contraseña.append(letrasMayus.charAt(random.nextInt(letrasMayus.length())));
        contraseña.append(letrasMinus.charAt(random.nextInt(letrasMinus.length())));
        contraseña.append(numeros.charAt(random.nextInt(numeros.length())));
        contraseña.append(especiales.charAt(random.nextInt(especiales.length())));


        for (int i = 8; i <15; i++) {
            contraseña.append(todos.charAt(random.nextInt(todos.length())));
        }

        return contraseña.toString();
    }
}




