import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Dispositivo {
   protected String nombre;
   protected boolean estado;    //si es verdadedo, mi dispositivo se encendera, en cambio, si es falso, estara apagado
   protected List<String> historial;

   public Dispositivo(String nombre){
       this.nombre=nombre;
       this.estado=false; //por defecto mi dispositivo estara apagado
       this.historial= new ArrayList<>();
   }
 public void encender(){
       this.estado=true;
     String hora= LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
       historial.add("Endendido en: "+ hora);
 }
public void apagado(){
       this.estado= false;
    String hora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
       historial.add("Apagado en: " + hora);
}

    public boolean getEstado() {
        return estado;
    }

    public List<String> getHistorial() {
        return historial;
    }

    public String getNombre() {
        return nombre;
    }
    @Override
    public String toString(){
       return nombre + "estado: "+ estado;
    }
}
