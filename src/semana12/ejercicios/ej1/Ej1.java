package semana12.ejercicios.ej1;

public class Ej1 {
    public static void main(String[] args) {
        Planta p = new Cactus();
        System.out.println(p.tipo + " " + p.regar());
        System.out.println(p.clima());

        Cactus c = (Cactus) p;
        System.out.println(c.tipo + " " + c.regar());
        System.out.println(c.clima());
    }
}
