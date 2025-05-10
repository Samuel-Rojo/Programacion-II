//En el ámbito financiero, el interés compuesto se utiliza para calcular el valor futuro de una
//inversión o préstamo. Supongamos que deseas calcular el valor futuro de una inversión
//inicial de $10,000 después de 5 años, con una tasa de interés anual del 6%. Utiliza también
//los métodos de redondeo de la clase Math y especifica el comportamiento de la inversión
//después de aplicar los métodos.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double inversion = 10000.0;
        double interesAnual = 0.06;
        int años = 5;
        double resultadoInversion = inversion * Math.pow(1 + interesAnual, años); //formula del interes compuesto VP= P * (1 + r) ^ n
        long inversionRedondeada= Math.round(resultadoInversion);
        System.out.println("el resultado de la inversion sin redondear es:"+ resultadoInversion);
        System.out.println("el resultado de la inversion redondeada es:" + inversionRedondeada);



    }
}