public class Asiento {
    private int numero;
    private boolean ocupado;

    public Asiento(int numero, boolean ocupado) {
        this.numero = numero;
        this.ocupado = ocupado; // respeta el estado inicial
    }
    public boolean estaOcupado() {
        return ocupado;
    }
    public int getNumero() {
        return numero;
    }
    public void guardarLugar() throws AsientosOcupados {
        if (ocupado) {
            throw new AsientosOcupados("¡Error! El asiento número " + numero + " ya está ocupado.");
        }
        ocupado = true; //reservo el asiento
    }
}