package semana12.ejercicios.ej5;

import semana12.biblioteca.Material;
import semana12.biblioteca.Prestable;

/*
 * VERSION CON ERRORES (para estudiar; no compila):
 *
 *   @Override
 *   String describir() { ... }                 // error: weaker access privileges; was public
 *
 *   @Override
 *   public String presta(String socio) { ... } // error: method does not override or implement
 *                                              // y ademas: Tablet is not abstract and does not
 *                                              // override abstract method prestar(String)
 *
 * VERSION CORREGIDA (la de abajo):
 */
public class Tablet extends Material implements Prestable {
    public Tablet(String titulo) {
        super(titulo);
    }

    @Override
    public int diasPrestamo() {
        return 3;
    }

    @Override
    public String describir() {          // correccion 1: public
        return "Tablet: " + titulo;
    }

    @Override
    public String prestar(String socio) { // correccion 2: nombre correcto (prestar)
        return titulo + " -> " + socio;
    }
}
