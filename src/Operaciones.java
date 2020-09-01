public class Operaciones {
    // Insertar N nodos
    public void  insertarN(Lista L) {
        System.out.println("No de nodos= ");
        int nn = Leer.datoInt();
        double d;
        for (int i = 1; i <= nn; i++) {
            System.out.print("Dato= ");
            d = Leer.datoDouble();
            L.insertar(d);
        }
    }

    // MOSTRAR
    public void mostrar(Lista L) {
        Nodo p = L.primero;
        while (p != null) {
            System.out.print(p.dato + "  ");
            p = p.sig;
        }
    }

    // ENCONTRAR EL PROMEDIO DE LOS POSITIVOS
    public void promedioMayor(Lista L) {
        if (!L.listaVacia()) {
            Nodo p = L.primero;
            double sum = 0.0 ;
            int contador = 0 ;
            while (p != null) {
                if (p.dato>0){
                    sum = sum + p.dato;
                    p = p.sig;
                    contador++;
                }
            }
            System.out.println("Promedio = " + sum/(contador*1.0));
        }
    }

    // ENCONTRAR EL MAYOR DE LOS NEGATIVOS
    public void encontrarMenorNegativos (Lista L) {
        if (!L.listaVacia()) {
            Nodo p = L.primero;
            double m = p.dato;
            while (p != null) {
                if((p.dato<m) && (p.dato<0.0)) {
                    m = p.dato;
                }
                p = p.sig;
            }
            System.out.println("Menor Negativo  = " + m);
        }
    }

    // ELIMINAR UN NODO DADO EL VALOR DE SU CAMPO DATO
    public void eliminaDado(Lista L, double d) {
        if(!L.listaVacia()) {  // LISTA NO VACIA
            if(L.primero.dato == d) { // ELIMINA EL PRIMER NODO
                L.eliminar(); }
            else { // ELIMINA UN NODO DISTINTO DEL PRIMERO
            Nodo p=L.primero;
            while(p!=null && p.dato != d) {p=p.sig;}
            if(p.dato == d ) {L.eliminar2(p);}
            else {System.out.println("Nodo no localizado");}
            }
        }
    }

    public void eliminarNnods(Lista L,int cantidadDeNodos) {
        double d;
        for (int i = 1; i <= cantidadDeNodos; i++) {
            L.eliminar();
        }
    }
}




