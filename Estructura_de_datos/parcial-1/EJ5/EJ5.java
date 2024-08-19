import java.util.Scanner;

public class EJ5 {
    public static void main (String[] args){
        System.out.println("ejercicio 5 list sencilla");
        Scanner leer = new  Scanner(System.in);
        Lista grupo = new Lista();
        String nombre;
        System.out.println(grupo.getInicio());
        System.out.println(grupo.getFin());
        grupo.direcciones();
        System.out.print("Nombre para agragar: ");
        nombre = leer.nextLine();
        grupo.insertar(nombre);

    }
}