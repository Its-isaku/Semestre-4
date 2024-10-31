import java.util.Scanner;

public class Principal 
{
    public static Scanner leer = new Scanner(System.in);
    public static int opc;

    public static void main(String[] args) 
    {
        Articulo juguete = new Articulo();

        juguete.Valida(500);
        juguete.Valida("Rompecabezas", 0);
        System.out.println();
        System.out.println(juguete.toString());
        System.out.println();

        juguete.Valida(1200);
        juguete.Valida("Lego", 1);
        System.out.println();
        System.out.println(juguete.toString());
        System.out.println();

        //Implementaciones
        Circulo Balon = new Circulo();
        System.out.println(Balon.toString());
        Balon.setBase(10);
        Balon.area();
        Balon.perimetro();
        System.out.println(Balon.toString());

        Cuadrado Mesa = new Cuadrado();
        System.out.println(Mesa.toString());
        Mesa.setBase(5);
        Mesa.area();
        Mesa.perimetro();
        System.out.println(Mesa.toString());

    }
}
