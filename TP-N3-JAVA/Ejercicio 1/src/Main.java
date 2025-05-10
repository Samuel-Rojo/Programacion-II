//• Calcula el ahorro de energía anual en una casa inteligente utilizando el método
// sqrt() en función de la reducción de consumo de electricidad.
// Determina el máximo y el mínimo consumo de energía entre varios
// electrodomésticos inteligentes.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuántos electrodomésticos inteligentes hay en su hogar?:");
        int cifra = scanner.nextInt();
        double[] consumo = new double[cifra];

        for (int i = 0; i < cifra; i++) {
            System.out.print("Consumo anual (kWh) del electrodoméstico " + (i + 1) + ": ");
            consumo[i] = scanner.nextDouble();
        }
        double min = consumo[0];
        double max = consumo[0];
        double totalOriginal = 0;

        for (double c : consumo) {
            min = Math.min(min, c);
            max = Math.max(max, c);
            totalOriginal += c;
        }
        double reduccionConsumo = 0.40;
        double totalReducido = totalOriginal * (1 - reduccionConsumo);
        double ahorroEstimado = Math.sqrt(totalOriginal - totalReducido);

        System.out.println("Consumo total original es: " + totalOriginal + " kWh");
        System.out.println("Consumo total tras reducción es: " + totalReducido + " kWh");
        System.out.println("Ahorro estimado del hogar es: " + ahorroEstimado + " unidades");
        System.out.println("Consumo mínimo es: " + min + " kWh");
        System.out.println("Consumo máximo es: " + max + " kWh");
    }
}
