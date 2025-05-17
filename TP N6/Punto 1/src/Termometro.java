public class Termometro extends Dispositivo {
    private double temperatura;

    public Termometro(String nombre, double temperatura) {
        super(nombre);
        this.temperatura = temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
    @Override
    public String toString(){

return super.toString()+ "la temperatura en es: "+temperatura +"°C";

    }
}
