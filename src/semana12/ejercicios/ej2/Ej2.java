package semana12.ejercicios.ej2;

public class Ej2 {
    static String ver(int x) {
        return "int";
    }

    static String ver(double x) {
        return "double";
    }

    static String ver(Object x) {
        return "Object";
    }

    public static void main(String[] args) {
        System.out.println(ver(5));
        System.out.println(ver(5L));
        System.out.println(ver('a'));
        System.out.println(ver("hola"));
        System.out.println(ver(2.5f));
    }
}
