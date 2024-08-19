//!Ejercicio 4: nodos con metodos de proteccion

public class EJ4
{
    //main
    public static void main(String[] args)
    {
        System.out.println("--------------------------\n");
        System.out.println("Bienvenido al ejercicio 4!\n");
        System.out.println("--------------------------\n");

        //probar clases externas
        Nodo Caja = new Nodo();
        Caja.setMascota("firulais");
        System.out.println(Caja.getMascota());
        System.out.println(Caja.getNext());

        System.out.println("segundo elemento");
        Nodo Cajota = new  Nodo();
        Cajota.setMascota ("oso panda");
        Caja.setNext(Cajota);
        System.out.println(Cajota.getMascota());
        System.out.println(Cajota.getNext());
        System.out.println(Caja.getNext());
        System.out.println(Cajota);



    }    

    //funciones


}

