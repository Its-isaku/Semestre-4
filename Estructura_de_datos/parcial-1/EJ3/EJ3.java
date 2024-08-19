public class EJ3
{
    public static void main(String[] args)
    {
        System.out.println("--------------------------\n");
        System.out.println("Bienvenido al ejercicio 3!\n");
        System.out.println("--------------------------\n");

        //probar clases externas
        Nodo Caja = new Nodo();
        Caja.Mascotas = "firulais";
        System.out.println(Caja.Mascotas);
        System.out.println(Caja.sig);

        System.out.println("segundo elemento");
        Nodo Cajota = new  Nodo();
        Cajota.Mascotas = "oso panda";
        Caja.sig = Cajota;
        System.out.println(Cajota.Mascotas);
        System.out.println(Cajota.sig);
        System.out.println(Caja.sig);
        System.out.println(Cajota);

        
        

    }    
}

