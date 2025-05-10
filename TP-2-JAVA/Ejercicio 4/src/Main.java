public class Main {
    public static void main(String[] args) {
        Libro miLibro = new Libro("A Dos Metros De Ti", "Rachael Lippincott", "9789871997381");

        miLibro.mostrarInformacion();

        miLibro.prestar();
        miLibro.mostrarInformacion();

        miLibro.devolver();
        miLibro.mostrarInformacion();
    }
}

