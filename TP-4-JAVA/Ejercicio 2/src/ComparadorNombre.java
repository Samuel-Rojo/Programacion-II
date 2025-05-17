import java.util.Comparator;

class ComparadorNombre implements Comparator<Producto> {
    @Override
    public int compare(Producto p1, Producto p2) {
        return p1.getNombre().compareToIgnoreCase(p2.getNombre());
    }
}

class ComparadorStock implements Comparator<Producto> {
    @Override
    public int compare(Producto p1, Producto p2) {
        return Integer.compare(p1.getStock(), p2.getStock());
    }
}
