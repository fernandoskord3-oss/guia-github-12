package semana12.ejercicios.ej4;

public class E4 {
    public static void main(String[] args) {
        Calificable[] c = { new Tarea(65), new Proyecto(65), new Quiz() };
        for (Calificable x : c) {
            System.out.println(x.puntos() + " " + x.nivel());
        }
    }
}
