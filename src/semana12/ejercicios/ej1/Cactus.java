package semana12.ejercicios.ej1;

public class Cactus extends Planta {
    String tipo = "CACTUS";

    static String clima() {
        return "desertico";
    }

    @Override
    String regar() {
        return "cada 15 dias";
    }
}
