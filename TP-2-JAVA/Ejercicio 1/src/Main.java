
//: Crea una clase Calculadora que tenga métodos para realizar operaciones
//aritméticas básicas: sumar(), restar(), multiplicar() y dividir(). Cada método debe tomar dos
//números como parámetros y devolver el resultado de la operación.
public class Main {
    public static void main(String[] args) {


        Calculadora calculadora = new Calculadora(9, 5);
        int suma = calculadora.sumar();
        System.out.println("La suma es:" + suma);
        System.out.println("la resta es:"+ calculadora.restar());
        System.out.println("la multiplicacion es:"+ calculadora.multiplicar());
        System.out.println("la division es:"+ calculadora.dividir());
        // lo hago de esta forma sin necesidad de poner mas variables para que sea mas corta y menos largo el codigo.
    }
}