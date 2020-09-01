public class Nodo { // Campos
    double dato;
    Nodo ant, sig;

    // Constructor por defecto
    public Nodo() {
        dato = 0.0;
        sig = null;
        ant = null;
    }

    // Constructor ordinario
    public Nodo(double vd) {
        dato = vd;
        sig = null;
        ant = null;
    }
}