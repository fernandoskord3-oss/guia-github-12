package semana12.ejercicios.ej3;

import semana12.biblioteca.*;

public class E3 {
    public static void main(String[] args) {
        Material m = new Libro("X");
        Prestable p = new Revista("Y");

        // Para ver los errores reales del compilador, quita el // de UNA linea a la vez:
        // m.prestar("Ana");                // error: cannot find symbol (Material no declara prestar)
        // p.diasPrestamo();                // error: cannot find symbol (Prestable no declara diasPrestamo)
        // Prestable q = new Mapa("Z");     // error: incompatible types: Mapa cannot be converted to Prestable
        // Material n = new Material("W");  // error: Material is abstract; cannot be instantiated

        // Versiones corregidas que SI compilan:
        ((Prestable) m).prestar("Ana");     // cast a la interfaz (m es un Libro real)
        ((Material) p).diasPrestamo();      // cast a la clase (p es una Revista real)
        Material n = new Mapa("W");         // instanciar una subclase concreta

        System.out.println(((Prestable) m).prestar("Ana"));
        System.out.println(((Material) p).diasPrestamo());
        System.out.println(n.describir());
    }
}
