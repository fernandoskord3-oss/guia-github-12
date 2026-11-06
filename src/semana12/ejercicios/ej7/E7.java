package semana12.ejercicios.ej7;

public class E7 {
    public static void main(String[] args) {
        Audiolibro a = new Audiolibro("Cuentos");
        System.out.println(a.describir());
        System.out.println(a.prestar("Luis"));
        System.out.println(a.multa(4));
    }
}
