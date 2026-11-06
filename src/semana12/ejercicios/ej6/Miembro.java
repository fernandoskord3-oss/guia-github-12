package semana12.ejercicios.ej6;

public abstract class Miembro {
    protected String nombre;
    protected String carne;

    public Miembro(String nombre, String carne) {
        this.nombre = nombre;
        this.carne = carne;
    }

    public String datos() {
        return nombre + " (carne " + carne + ")";
    }
}
