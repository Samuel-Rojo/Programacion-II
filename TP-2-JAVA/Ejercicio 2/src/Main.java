public class Main {
    public static void main(String[] args) {
        Reloj miReloj = new Reloj();
        miReloj.establecerHora(11, 38, 55);
        miReloj.mostrarHora(); 
        miReloj.avanzarSegundo();
        miReloj.mostrarHora(); 
    }
}
