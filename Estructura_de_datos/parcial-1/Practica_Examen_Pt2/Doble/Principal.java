// Librerias
import java.util.Scanner;

public class Principal 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        ListaDoble opListaDoble = new ListaDoble();
        String Dato;
        String Colado;
        int opc = 0;

        System.out.println("\n||---------------Lista Doble---------------||\n");

        do
        {
            Menu();
            System.out.println("Elige una opcion: ");
            opc = Integer.parseInt(scanner.nextLine());
            System.out.println("\n||-------------------------------------------------||\n");

            switch(opc)
            {
                case 1 ->
                {
                    System.out.println("Nombre para agregar: ");
                    Dato = scanner.nextLine();
                    opListaDoble.Insertar(Dato);
                    System.out.println("\n");
                }

                case 2 ->
                {
                    if(opListaDoble.Vacio())
                    {
                        System.out.println("Lista vacia!");
                    }
                    else 
                    {
                        System.out.println("Lista de elemetos: ");
                        opListaDoble.mostrar();
                        System.out.println("\n");
                    }
                }

                case 3 ->
                {
                    System.out.println("Nombre para agregar al inicio: ");
                    Dato = scanner.nextLine();

                    if(opListaDoble.Vacio())
                    {
                        opListaDoble.Insertar(Dato);
                    }
                    else
                    {
                        opListaDoble.InsertarInicio(Dato);
                        System.out.println("\n");
                    }
                }

                case 4 ->
                {
                    System.out.println("Nombre de elemeto a buscar: ");
                    Dato = scanner.nextLine();
                    boolean encontrado = opListaDoble.Buscar(Dato);
                    if(encontrado)
                    {
                        System.out.println("Elemeto encontrado\n");
                    }
                    else
                    {
                        System.out.println("Elemeto no encontrado\n");
                    }
                }

                case 5 ->
                {
                    System.out.println("Nombre para agregar: ");
                    Dato = scanner.nextLine();
                    System.out.println("posicion: ");
                    int pos = Integer.parseInt(scanner.nextLine());
                    opListaDoble.InsertarEnMedio(Dato, pos);
                    System.out.println("\n");
                }

                case 6 ->
                {
                    System.out.println("Nombre oara borrar: ");
                    Dato = scanner.nextLine();
                    boolean borrado = opListaDoble.Borrar(Dato);
                    if(borrado)
                    {
                        System.out.println("Elemento borrado\n");
                    }
                    else
                    {
                        System.out.println("Elemento no encontrado\n");
                    }
                }

                case 7 ->
                {
                    if(opListaDoble.Vacio())
                    {
                        System.out.println("Lista Vacia!\n");
                    }
                    else
                    {
                        System.out.println("Lista en orden inverso: ");
                        opListaDoble.MoostrarInverso();
                        System.out.println("\n");
                    }
                }

                case 9 ->
                {
                    System.out.println("Saliendo...\n");
                }

                default -> System.out.println("Debes elegir una opcion!\n");
            }
        }while(opc != 9);

        

    }
    //Metodos 
    public static void Menu()
    {
        System.out.println("||---------------Menu de operaciones---------------||");
        System.out.println("||                                                 ||");
        System.out.println("||  1 -> Insertar                                  ||");
        System.out.println("||  2 -> Mostrar                                   ||");
        System.out.println("||  3 -> Insertar inicio                           ||");
        System.out.println("||  4 -> buscar                                    ||");
        System.out.println("||  5 -> Insertar dentro de Lista                  ||");
        System.out.println("||  6 -> Borrar                                    ||");
        System.out.println("||  7 -> Mostrar inverso                           ||");
        System.out.println("||  9 -> Salir                                     ||");
        System.out.println("||                                                 ||");
        System.out.println("||-------------------------------------------------||\n");
    }
}
