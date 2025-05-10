public class Calculadora {
    //atributos de mi calculadora
    private int valor1;
    private int valor2;

    // metodos que usare
    public Calculadora() {

    }

    public Calculadora(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public int sumar() {
        int suma = this.valor1 + this.valor2;
        return suma;
    }

    public int restar() {
        int resta = this.valor1 - this.valor2;
        return resta;
    }

    public int multiplicar() {
        int multiplicacion = this.valor1 * this.valor2;
        return multiplicacion;
    }

    public double dividir() {
        double division = (double) this.valor1 / (double) this.valor2;
        return division;
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }
}