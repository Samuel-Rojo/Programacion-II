//Se debe ingresar la coordenada de un punto en el plano, es decir dos valores enteros x e y
//(distintos a cero). Posteriormente se debe imprimir en pantalla en que cuadrante se ubica
//dicho punto. (1º Cuadrante si x > 0 e y > 0 , 2º Cuadrante: x < 0 e y > 0, etc.)
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un valor para X:");
        int x= scanner.nextInt();
        System.out.println("Ingrese un valor para Y:");
        int y= scanner.nextInt();
        if (x!=0 && y!=0){
            if(x>0 && y>0){
                System.out.println("El punto se ubica en el 1º cuadrante");
            } else if (x<0 && y>0) {
                System.out.println("El punto se ubica en el 2º cuadrante");
            } else if (x<0 && y<0) {
                System.out.println("El punto se ubica en el 3º cuadrante");
            } else if (x>0 && y<0) {
                System.out.println("El punto se ubica en el 4º cuadrante");
            }
        } else{
            System.out.println("Por favor eliga valores distintos de 0");
        }
    }
}