package semana12.ejercicios.ej4;

public interface Calificable {
    int puntos();

    default String nivel() {
        return puntos() >= 70 ? "APROBADO" : "REFUERZO";
    }
}
