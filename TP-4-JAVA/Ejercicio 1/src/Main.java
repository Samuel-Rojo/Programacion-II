//Crear un programa que permita al usuario ingresar una serie de números enteros y los
//almacene en un arreglo.
//◦ Implementar métodos para:
//▪ Calcular la suma de los elementos del arreglo.
//▪ Encontrar el número mayor y el número menor del arreglo.
//▪ Invertir el orden de los elementos del arreglo.
//▪ Probar los métodos implementados con diferentes arreglos ingresados por el
//usuario.


import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo: "));
        Arreglo arreglo = new Arreglo(nElementos);

        arreglo.llenarDesdeConsola();
        arreglo.mostrar();
        arreglo.ordenar();
        arreglo.calcularEstadisticas();
        arreglo.mostrarResultados();
    }
}