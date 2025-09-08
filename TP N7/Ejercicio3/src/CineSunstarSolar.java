import java.util.ArrayList;
import java.util.List;

public class CineSunstarSolar {
    private List<Asiento> asientos;
    private int capacidad;

    public CineSunstarSolar(int capacidad) {
        this.capacidad = capacidad;
        asientos = new ArrayList<>();
        for (int i = 1; i <= capacidad; i++) {
            boolean ocupado = (i % 2 != 0); // los impares ocupados, pares libres
            asientos.add(new Asiento(i, ocupado));
        }
    }


    public void mostrarEstado() {
        System.out.println("Estado de los asientos: ");
        for (Asiento a : asientos) {
            System.out.print("[" + a.getNumero() + (a.estaOcupado() ? "X" : " ") + "] ");
            if (a.getNumero() % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println("(X = ocupado, espacio = disponible)");
    }

    public void asientosinvalidos(int numero) throws AsientoInvalido {
        if (numero < 1 || numero > asientos.size()) {
            throw new AsientoInvalido("¡¡Error!! el asiento " + numero + " no existe en esta sala.");
        }
        Asiento a = asientos.get(numero - 1); //esto lo agrego para determinar si el asiento esta libre o ocupado
        if (a.estaOcupado()) {
            System.out.println(" El asiento " + numero + " está OCUPADO.");
        } else {
            System.out.println(" El asiento " + numero + " está LIBRE.");
        }
    }

    public void reservarAsiento(int numero) throws AsientoInvalido, AsientosOcupados {
        if (numero < 1 || numero > asientos.size()) {
            throw new AsientoInvalido(" ¡Ups! el asiento " + numero + " no existe en esta sala.");
        }
        Asiento a = asientos.get(numero - 1); //reservo mi asiento
        a.guardarLugar();
        System.out.println("Felicidades!! el asiento " + numero + " fue reservado con éxito.");
    }

    public void cineLLeno() throws Cinelleno {
        boolean lleno = true;
        for (Asiento a : asientos) {
            if (!a.estaOcupado()) {
                lleno = false;
                break;
            }
        }
        if (lleno) {
            throw new Cinelleno(" La sala está llena, no se pueden vender más entradas.");
        }
    }
}

