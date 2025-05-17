//Crear un programa que genere un arreglo de cadenas ordenado alfabéticamente.
//◦ Permitir al usuario ingresar una cadena para buscar en el arreglo.
//◦ Utilizar el método Arrays.binarySearch() para buscar la cadena ingresada en el arreglo.
//◦ Mostrar el resultado de la búsqueda, indicando si la cadena fue encontrada y, en caso
//afirmativo, su posición en el arreglo.
//◦ Probar el programa con diferentes cadenas y arreglos de diferentes tamaños.

import java.util.Scanner;

public class BusquedaCadenas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántas palabras quieres ingresar?: ");
        int tamanio = Integer.parseInt(scanner.nextLine());

        String[] entradas = new String[tamanio];

        System.out.println("Ingresa las palabras:");
        for (int i = 0; i < tamanio; i++) {
            System.out.print((i + 1) + ": ");
            entradas[i] = scanner.nextLine();
        }
        GeneradorArrays arreglo = new GeneradorArrays(entradas);
        arreglo.displayWords();

        // Búsqueda de palabra
        System.out.print("Ingresa la palabra que deseas buscar: ");
        String palabra = scanner.nextLine();
        int posicion = arreglo.searchWord(palabra);

        if (posicion >= 0) {
            System.out.println("La palabra '" + palabra + "' fue encontrada en la posición " + posicion + ".");
        } else {
            System.out.println("La palabra '" + palabra + "' no fue encontrada.");
        }

        scanner.close();
    }
}