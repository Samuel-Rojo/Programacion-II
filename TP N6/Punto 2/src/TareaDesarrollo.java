public class TareaDesarrollo extends TareaBase {

    private int modulosCompletos;
    private int modulosTotales;

    public TareaDesarrollo(String titulo, double estimacionHoras, String responsable, int modulosCompletos, int modulosTotales) {
        super(titulo, estimacionHoras, responsable);
        this.modulosCompletos = modulosCompletos;
        this.modulosTotales = modulosTotales;
    }

    public int getModulosTotales() {
        return modulosTotales;
    }

    public int getModulosCompletos() {
        return modulosCompletos;
    }

    @Override
    public double porcentajeAvance() {
        if (modulosTotales == 0) return 0; // evita división por 0
        return (modulosCompletos * 100.0) / modulosTotales;
    }
}



