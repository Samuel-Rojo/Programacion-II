public class CuentaBancaria {
    private String numeroCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            System.out.println("La cantidad a depositar debe ser mayor que cero.");
        }
    }
    public void retirar(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("Saldo insuficiente.");
        } else if (cantidad <= 0) {
            System.out.println("La cantidad a retirar debe ser mayor que cero.");
        } else {
            saldo -= cantidad;
        }
    }
    public double consultarSaldo() {
        return saldo;
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public String getTitular() {
        return titular;
    }
}
