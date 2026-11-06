package semana12.ejercicios.ej6;

public class Entrenador extends Miembro implements Reservable, Calificable {
    public Entrenador(String nombre, String carne) {
        super(nombre, carne);
    }

    @Override
    public String reservar(String hora) {
        return "Entrenador " + datos() + " disponible a las " + hora;
    }

    @Override
    public String calificar(int estrellas) {
        return "Entrenador " + nombre + ": " + estrellas + " estrellas";
    }
}
