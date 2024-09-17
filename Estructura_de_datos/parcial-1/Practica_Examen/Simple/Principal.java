//Librerias
import java.util.Scanner;

public class Principal 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Lista OpLista = new Lista();
        String Dato;
        String Colado;
        int opc = 0;

        System.out.println("\n||-------------------Lista Simple------------------||\n");

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
                    OpLista.Insertar(Dato);
                    System.out.println("\n");
                }

                case 2 -> 
                {
                    System.out.println("Lista de datos:\n");
                    OpLista.mostrar();
                    System.out.println("\n");
                }

                case 3 -> 
                {
                    System.out.println("Nombre para agregar al inicio: ");
                    Dato = scanner.nextLine();
                    OpLista.InsertarInicio(Dato);
                    System.out.println("\n");
                }

                case 4 -> 
                {
                    System.out.println("nombre para  buscar: ");
                    Dato = scanner.nextLine();
                    System.out.println("\n");
                    OpLista.Buscar(Dato);
                    System.out.println("\n");
                }

                case 5 -> 
                {
                    System.out.println("nombre para agregar: ");
                    Colado = scanner.nextLine();
                    System.out.println("despues de quien: ");
                    Dato = scanner.nextLine();
                    OpLista.InsertarEnMedio(Dato, Colado);
                    System.out.println("\n");
                }

                case 6 -> 
                {
                    System.out.println("Nombre para borrar: ");
                    Dato = scanner.nextLine();
                    OpLista.Borrar(Dato);
                }

                case 9 -> System.out.println("Saliendo...\n");

                default -> System.out.println("Debes elegir una opcion del menu!");
                
            }

        }while(opc != 9);
        // se cierrra el scanner
        scanner.close();
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
        System.out.println("||  9 -> Salir                                     ||");
        System.out.println("||                                                 ||");
        System.out.println("||-------------------------------------------------||\n");
        
    }
}
