public abstract class TareaBase implements Calculable, Progresable, informable {
  //  protected int id;
    protected String titulo;
    protected double estimacionhoras;
    protected String responsable;

    public TareaBase(String titulo, double estimacionhoras, String responsable) {

        this.titulo = titulo;
        this.estimacionhoras = estimacionhoras;
        this.responsable = responsable;
       // this.id = id;
    }

    public String getResponsable() {
       return responsable;
    }

    public double getEstimacionhoras() {
       return estimacionhoras;
    }

   public String getTitulo() {
       return titulo;
    }

    @Override
    public double calcularTiempoTotalInvertido() {
        return estimacionhoras;
    }
    public abstract double porcentajeAvance();

@Override
    public String GenerarInforme() {
    return "Tarea: " + titulo +
            "\nResponsable: " + responsable +
            "\nHoras: " + estimacionhoras +
            "\nAvance: " + porcentajeAvance() + "%" +
            "\n-------------------------";
}
    }

