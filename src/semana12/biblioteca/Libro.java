package semana12.biblioteca;

public class Libro extends Material implements Prestable {
    public Libro(String titulo) {
        super(titulo);
    }

    @Override
    public int diasPrestamo() {
        return 14;
    }

    @Override
    public String describir() {
        return "Libro: " + titulo;
    }

    @Override
    public String prestar(String socio) {
        return titulo + " -> " + socio + " (" + diasPrestamo() + " dias)";
    }

    // static: oculta (no sobrescribe) a Material.tipo()
    public static String tipo() {
        return "LIBRO";
    }
}
