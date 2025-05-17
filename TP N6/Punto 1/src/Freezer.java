public class Freezer extends Dispositivo{
    private boolean congelar;

    public Freezer(String nombre, boolean congelar) {
        super(nombre);
        this.congelar = congelar;
    }

    public void setCongelar(boolean congelar) {
        this.congelar = congelar;
    }
    @Override
    public String toString(){
        return super.toString()+"Congelar: "+congelar;
    }
}
