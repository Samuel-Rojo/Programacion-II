import java.util.Scanner;

//Se carga una fecha (día, mes y año) por teclado. Mostrar un mensaje si corresponde al
//primer trimestre del año (enero, febrero o marzo), al segundo trimestre, al tercer trimestre
//o al cuarto trimestre. Cargar por teclado el valor numérico del día, mes y año.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un dia del año:");
        int dia = scanner.nextInt();
        System.out.println("ingrese un mes del año: ");
        int mes= scanner.nextInt();
        System.out.println("Ingrese el año:");
        int año = scanner.nextInt();
        if(mes>=1 && mes<=12){
            if(mes>=1 && mes<=3){
                System.out.println("La Fecha elegida corresponde al Primer Trimestre del año");
            } else if (mes>=4 && mes<=6) {
                System.out.println("La Fecha elegida corresponde al Segundo Trimestre del año");
            } else if (mes>=7 && mes<=9) {
                System.out.println("La Fecha elegida corresponde al Tercer Trimestre del año");
            } else if (mes>=10 && mes<=12) {
                System.out.println("La Fecha elegida corresponde al Cuarto Trimestre del año");
            }
        } else {
            System.out.println("Por Favor ingrese de forma correcta el mes, entre 1 y 12");
        }
    }
}