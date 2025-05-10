public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible; // true = disponible, false = prestado

    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true; // Cuando se crea el libro, está disponible por defecto
    }
    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro ha sido prestado.");
        } else {
            System.out.println("El libro ya está prestado.");
        }
    }
    public void devolver() {
        if (!disponible) {
            disponible = true;
            System.out.println("El libro ha sido devuelto.");
        } else {
            System.out.println("El libro ya estaba disponible.");
        }
    }
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Estado: " + (disponible ? "Disponible" : "Prestado"));
        System.out.println();
    }
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isDisponible() {
        return disponible;
    }
}
