public class Principal {
    public static void main(String[] args) {
        Operaciones op=new Operaciones();
        Lista lis=new Lista();
        op.insertarN(lis);
        op.mostrar(lis);
        op.promedioMayor(lis);
        op.encontrarMenorNegativos(lis);
        op.eliminarNnods(lis,3);
        System.out.println(" \n --- ");
        op.mostrar(lis);
    }
}
