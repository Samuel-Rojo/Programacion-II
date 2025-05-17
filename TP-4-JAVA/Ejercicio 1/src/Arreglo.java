import java.util.Arrays;
import java.util.Scanner;

class Arreglo {
    private int[] numeros;
    private int suma;
    private int mayor;
    private int menor;

    public Arreglo(int tamanio) {
        numeros = new int[tamanio];
        suma = 0;
    }

    public void llenarDesdeConsola() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite los elementos del arreglo: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print((i + 1) + " Digite un número: ");
            numeros[i] = entrada.nextInt();
        }
    }

    public void mostrar() {
        System.out.println("\nLos números del arreglo son:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }

    public void calcularEstadisticas() {
        if (numeros.length == 0) return;

        mayor = numeros[0];
        menor = numeros[0];
        suma = 0;

        for (int num : numeros) {
            suma += num;
            if (num > mayor) mayor = num;
            if (num < menor) menor = num;
        }
    }

    public void ordenar() {
        Arrays.sort(numeros);
    }

    public void mostrarResultados() {
        System.out.println("\nLa suma de los elementos del arreglo es: " + suma);
        System.out.println("El número mayor del arreglo es: " + mayor);
        System.out.println("El número menor del arreglo es: " + menor);
        System.out.println("El arreglo ordenado es: " + Arrays.toString(numeros));
    }
}