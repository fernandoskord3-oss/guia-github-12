package semana12.ejercicios.ej6;

public class MainGimnasio {
    public static void main(String[] args) {
        Reservable[] reservables = {
            new Socio("Ana", "S-001"),
            new Entrenador("Luis", "E-010"),
            new Maquina("Caminadora 1")
        };
        System.out.println("--- Reservas ---");
        for (Reservable r : reservables) {
            System.out.println(r.reservar("6:00 PM"));
        }

        Calificable[] calificables = { new Entrenador("Luis", "E-010"), new ClaseGrupal("Zumba") };
        System.out.println("--- Calificaciones ---");
        for (Calificable c : calificables) {
            System.out.println(c.calificar(5));
        }
    }
}
