public class Tareadepruebas extends TareaBase {
    private int casosHechos;
    private int casosTotales;

    public Tareadepruebas(String titulo, double estimacionHoras, String responsable, int casosHechos, int casosTotales) {
        super(titulo, estimacionHoras, responsable);
        this.casosHechos = casosHechos;
        this.casosTotales = casosTotales;
    }

    public int getCasosTotales() {
        return casosTotales;
    }

    public int getCasosHechos() {
        return casosHechos;
    }

    @Override
    public double porcentajeAvance() {
        if (casosTotales == 0) return 0; // evita división por 0
        return (casosHechos * 100.0) / casosTotales;
    }
}


