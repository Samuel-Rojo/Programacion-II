//Implementar el algoritmo de ordenamiento Bubble Sort para ordenar un arreglo de
//números enteros de forma ascendente.
//◦ Utilizar el método Arrays.sort() de Java para ordenar el mismo arreglo.
//◦ Comparar el rendimiento de ambos métodos de ordenamiento midiendo el tiempo de
//ejecución para arreglos de diferentes tamaños (por ejemplo, 100, 1000, 10000
//elementos)
// Generar un informe que compare los tiempos de ejecución de ambos métodos y analice
//la eficiencia de cada uno.
//◦ Crear una clase Producto con atributos como nombre, precio y stock.
//◦ Implementar la interfaz Comparable en la clase Producto para ordenar los productos
//por precio de forma predeterminada.
//◦ Crear una clase que implemente la interfaz Comparator para ordenar los productos por
//nombre.
//◦ Crear un programa que genere un ArrayList de objetos Producto y demuestre el uso de
//Collections.sort() con Comparable para ordenar el ArrayList por nombre de forma
//predeterminada y Comparator para ordenar los productos por precio y stock.
import java.util.Arrays;
import java.util.Random;

public class SortComparacion {

    // Bubble Sort
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }


    public static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(10000);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] sizes = {100, 1000, 10000};

        for (int size : sizes) {
            int[] array1 = generateRandomArray(size);
            int[] array2 = Arrays.copyOf(array1, array1.length);

            long startTime = System.nanoTime();
            bubbleSort(array1);
            long bubbleTime = System.nanoTime() - startTime;

            startTime = System.nanoTime();
            Arrays.sort(array2);
            long arraysSortTime = System.nanoTime() - startTime;

            System.out.printf("Tamaño: %d | Bubble Sort: %.2f ms | Arrays.sort(): %.2f ms%n",
                    size, bubbleTime / 1e6, arraysSortTime / 1e6);
        }
    }
}
