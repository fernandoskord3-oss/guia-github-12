package semana12.ejercicios.ej5;

public class E5 {
    public static void main(String[] args) {
        Tablet t = new Tablet("iPad Aula");
        System.out.println(t.describir());
        System.out.println(t.prestar("Marta") + " | " + t.diasPrestamo() + " dias");
        System.out.println("Multa 3 dias: " + t.multa(3));
    }
}
