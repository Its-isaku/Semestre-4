//?Librerias
import java.util.Scanner;

public class Principal 
{
    public static void main(String[] args) throws Exception
{
        System.out.println("\n||-------------------Ejercicio 14--------------------||\n");

        //? Variables
        Scanner scanner = new  Scanner(System.in);
        HashArray alumnos = new HashArray(10);
        String dato = " ";
        int opc = 0;

        //? Ciclo para el menu 
        do
        {
            menu();
            System.out.print("Elige: ");
            opc = Integer.parseInt(scanner.nextLine());
            
            System.out.println("\n||-------------------------------------------------||\n");
            switch (opc)
            {
                case 1 -> 
                {
                    System.out.print("Ingresa el nombre del alumno: ");
                    dato = scanner.nextLine();
                    alumnos.AsignaHash(dato);
                }

                case 2 -> 
                {
                    System.out.println("Lista de alumnos:");
                    System.out.println();
                    alumnos.Mostrar();
                    System.out.println();
                }

                case 3 -> 
                {
                    System.out.print("Dame el nombre a buscar: ");
                    dato = scanner.nextLine();
                    alumnos.Buscar(dato);
                }

                case 9 -> System.out.println("Saliendo....\n");

                default -> System.out.println("Opcion no valida");

            }
        }while(opc != 9);
    }
    //? Metodos

    //* Menu
    public static void menu() 
    {

        System.out.println("\n||----------------------Arboles----------------------||");
        System.out.println("|| 1 -> Insertar                                     ||");
        System.out.println("|| 2 -> Mostrar Lista de alumnos                     ||");
        System.out.println("|| 3 -> Buscar                                       ||");
        System.out.println("|| 0 -> Salir                                        ||"); 
        System.out.println("||---------------------------------------------------||\n");

    } 
}
