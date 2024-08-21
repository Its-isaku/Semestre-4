import java.util.Scanner;

public class EJ5 {
    public static void main (String[] args)
    {
        System.out.println("||--------------------Ejercicio 5---------------------||\n");

        Scanner leer = new  Scanner(System.in);
        Lista grupo = new Lista();
        String nombre;

        int opc = 0;
        
        do{
            menu();
            System.err.println("Elige: ");
            opc = Integer.parseInt(leer.nextLine());
            System.out.println("\n||-------------------------------------------------||\n");
            switch (opc)
            {
                case 1:
                System.out.print("Nombre para agragar: ");
                nombre = leer.nextLine();
                grupo.insertar(nombre);
                System.out.println("\n");
                break;

                case 2:
                System.err.println("Lista del grupo:\n");
                grupo.mostrar();
                System.out.println("\n");
                break;

                case 3:
                System.out.print("Nombre para insertar al inicio: ");
                nombre = leer.nextLine();
                grupo.InsertarInicio(nombre);
                System.out.println("\n");
                break;

            }
        }while(opc != 9);
        System.out.println("Saliendo....\n");
        //din del main
    } 

    public static void menu()
    {

        System.out.println("||-------------------Listas simples-------------------||\n");
        System.out.println("1 -> Insertar");
        System.out.println("2 -> Mostrar");
        System.out.println("3 -> Insertar inicio");
        System.out.println("4 -> Insertar  dentro de lista");
        System.out.println("9 -> Salir");
        System.out.println("\n||-------------------------------------------------||\n");

    }

}

