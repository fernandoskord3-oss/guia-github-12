package semana12.ejercicios.ej6;

public class Socio extends Miembro implements Reservable {
    public Socio(String nombre, String carne) {
        super(nombre, carne);
    }

    @Override
    public String reservar(String hora) {
        return "Socio " + datos() + " reservo a las " + hora;
    }
}
