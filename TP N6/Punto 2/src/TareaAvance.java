public class TareaAvance extends TareaBase {
    private int avanceHecho;
    private int avanceTotal;

    public TareaAvance(String titulo, double estimacionHoras, String responsable, int avanceHecho, int avanceTotal) {
        super(titulo, estimacionHoras, responsable);
        this.avanceHecho = avanceHecho;
        this.avanceTotal = avanceTotal;
    }

    public int getAvanceTotal() {
        return avanceTotal;
    }

    public int getAvanceHecho() {
        return avanceHecho;
    }

    @Override
    public double porcentajeAvance() {
        if (avanceTotal == 0) return 0; // evita división por 0
        return (avanceHecho * 100.0) / avanceTotal;
    }
}

