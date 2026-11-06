package semana12.ejercicios.ej6;

public class ClaseGrupal implements Calificable {
    private String nombre;

    public ClaseGrupal(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String calificar(int estrellas) {
        return "Clase " + nombre + ": " + estrellas + " estrellas";
    }
}
