public class Main {
    public static void main(String[] args) {
        Reloj miReloj = new Reloj();
        miReloj.establecerHora(11, 38, 55);
        miReloj.mostrarHora(); // Muestra: 10:30:45
        miReloj.avanzarSegundo();
        miReloj.mostrarHora(); // Muestra: 10:30:46
    }
}
