package semana12.ejercicios.ej6;

public class Maquina implements Reservable {
    private String nombre;

    public Maquina(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String reservar(String hora) {
        return "Maquina " + nombre + " reservada a las " + hora;
    }
}
