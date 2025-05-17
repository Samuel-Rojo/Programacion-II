public class AltavozInteligente extends Dispositivo{
    private int volumen;
  //  private int bateria;

    public AltavozInteligente(String nombre, int volumen) {
        super(nombre);
        this.volumen = volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    @Override
    public String toString(){

    return super.toString() + "volumen: "+volumen;
    }
}
