public class Main {
    public static void main(String[] args) {
        CuentaBancaria miCuenta = new CuentaBancaria("45335486", "Rojo Gustavo Samuel", 274000);
        miCuenta.depositar(4500);               // Saldo: 278500
        miCuenta.retirar(20000);                // Saldo: 258500
        double saldoActual = miCuenta.consultarSaldo();
        System.out.println("Saldo actual: " + saldoActual);

        miCuenta.retirar(300000); // Muestra: Saldo insuficiente.
    }
}
