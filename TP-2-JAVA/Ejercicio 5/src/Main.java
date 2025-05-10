public class Main {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Rojo Samuel", 5000000); //ojala gane esa plata jajajajaja
        Empleado emp2 = new Empleado("Rojo Gustavo", 6000000);

        emp1.mostrarInformacion();
        emp2.mostrarInformacion();

        emp1.aumentarSalarioPorcentaje(10, "Aumento anual");
        emp2.aumentarSalarioMonto(500000, "Bono de desempeño");

        emp1.mostrarInformacion();
        emp2.mostrarInformacion();

        System.out.println("Cantidad total de empleados: " + Empleado.obtenerCantidadEmpleados());
    }
}
